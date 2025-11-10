package org.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.util.Locale;
import java.util.SplittableRandom;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class Main {

    /**
     * Поскольку алгоритму хэширования без разницы какой именно контент, но важно сколько байт,
     * то сгенерируем количество байт, которое указано в параметрах
     */
    @Param({"64K", "512K", "4M", "20M"})
    public String size;

    byte[] payload;

    @Setup(Level.Trial)
    public void setup() {
        int n = parseSizeToBytes(size);
        payload = new byte[n];

        // Детерминированное наполнение, чтобы результаты были воспроизводимыми
        SplittableRandom rnd = new SplittableRandom(42);
        rnd.nextBytes(payload);

        assert payload.length == parseSizeToBytes(size) : "payload size mismatch";
    }

    private static int parseSizeToBytes(String s) {
        String t = s.trim().toUpperCase(Locale.ROOT);
        long mul = 1L;

        if (t.endsWith("KB") || t.endsWith("K")) {
            mul = 1024L;                     t = t.replaceAll("(KB|K)$", "");
        } else if (t.endsWith("MB") || t.endsWith("M")) {
            mul = 1024L * 1024;              t = t.replaceAll("(MB|M)$", "");
        } else if (t.endsWith("GB") || t.endsWith("G")) {
            mul = 1024L * 1024 * 1024;       t = t.replaceAll("(GB|G)$", "");
        } // иначе — считаем, что просто байты (например "65536")

        long v = Long.parseLong(t.trim());
        long bytes = v * mul;
        if (bytes > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Size too big for byte[]: " + bytes);
        }
        return (int) bytes;
    }

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void crc32(Blackhole blackhole) {
        blackhole.consume(Hashers.crc32(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void crc64_ecma(Blackhole blackhole) {
        blackhole.consume(Hashers.crc64_ecma(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void xxhash64(Blackhole blackhole) {
        blackhole.consume(Hashers.xxhash64(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void murmur64(Blackhole blackhole) {
        blackhole.consume(Hashers.murmur64(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void sha256(Blackhole blackhole) {
        blackhole.consume(Hashers.sha256(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void blake2b_256(Blackhole blackhole) {
        blackhole.consume(Hashers.blake2b_256(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void blake2b_128(Blackhole blackhole) {
        blackhole.consume(Hashers.blake2b_128(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void kangaroo12_256(Blackhole blackhole) {
        blackhole.consume(Hashers.kangaroo12_256(payload));
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    @Fork(value = 2, warmups = 3)
    @Measurement(iterations=5)
    public void kangaroo12_128(Blackhole blackhole) {
        blackhole.consume(Hashers.kangaroo12_128(payload));
    }

}