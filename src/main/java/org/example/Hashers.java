package org.example;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import net.jpountz.xxhash.StreamingXXHash64;
import net.jpountz.xxhash.XXHashFactory;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.digests.Kangaroo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;

/**
 * Утилиты для потокового вычисления хэшей/чексумм файлов.
 * Кандидаты:
 *  - CRC32(JDK)
 *  - xxHash64 (lz4-java)
 *  - Murmur3_128
 *  - SHA-256(JDK)
 *  - BLAKE2b-128 / BLAKE2b-256 (BouncyCastle)
 *  - KangarooTwelve-128 / -256 (BouncyCastle)
 */
public final class Hashers {

    private Hashers() {}

    private static final int SEED = 0x9E3779B1;

    private static final long CRC64_ECMA_POLY_REFLECTED = 0xC96C5795D7870F42L;
    private static final long[] CRC64_ECMA_TABLE = new long[256];
    static {
        for (int i = 0; i < 256; i++) {
            long crc = i;
            for (int j = 0; j < 8; j++) {
                crc = ((crc & 1L) != 0)
                        ? (crc >>> 1) ^ CRC64_ECMA_POLY_REFLECTED
                        : (crc >>> 1);
            }
            CRC64_ECMA_TABLE[i] = crc;
        }
    }

    /** CRC32 (32-bit). */
    public static long crc32(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data, 0, data.length);
        return crc.getValue();
    }

    /** CRC-64/ECMA-182*/
    public static long crc64_ecma(byte[] data) {
        long crc = ~0L; // init = 0xFFFFFFFFFFFFFFFF
        for (byte datum : data) {
            int idx = (int) ((crc ^ (datum & 0xFF)) & 0xFF);
            crc = (crc >>> 8) ^ CRC64_ECMA_TABLE[idx];
        }
        return ~crc; // xorout
    }


    /** xxHash64 (lz4-java). Очень быстрый 64-битный хэш. */
    public static long xxhash64(byte[] data) {
        StreamingXXHash64 hasher = XXHashFactory.fastestInstance().newStreamingHash64(SEED);
        hasher.update(data, 0, data.length);
        return hasher.getValue();
    }

    /** Murmur3_128 (Guava), усечённый до 64 бит (asLong()). */
    public static long murmur64(byte[] data) {
        HashFunction f = Hashing.murmur3_128(SEED);
        com.google.common.hash.Hasher h = f.newHasher();
        h.putBytes(data);
        return h.hash().asLong(); // берём 64 бита из Murmur3_128
    }

    /** SHA-256 (32 байта). */
    public static byte[] sha256(byte[] data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(data, 0, data.length);
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("MessageDigest SHA-256 not available", e);
        }

    }

    /** BLAKE2b-256 (32 байта). */
    public static byte[] blake2b_256(byte[] data) {
        Blake2bDigest d = new Blake2bDigest(256);
        d.update(data, 0, data.length);
        byte[] out = new byte[32];
        d.doFinal(out, 0);
        return out;
    }

    /** BLAKE2b-128 (16 байт). */
    public static byte[] blake2b_128(byte[] data) {
        Blake2bDigest d = new Blake2bDigest(128);
        d.update(data, 0, data.length);
        byte[] out = new byte[16]; // 128 бит
        d.doFinal(out, 0);
        return out;
    }

    /** KangarooTwelve-256 (32 байта). */
    public static byte[] kangaroo12_256(byte[] data) {
        Kangaroo.KangarooTwelve k12 = new Kangaroo.KangarooTwelve();
        k12.update(data, 0, data.length);
        byte[] out = new byte[32]; // 256 бит
        k12.doFinal(out, 0, out.length);
        return out;
    }

    /** KangarooTwelve-128 (16 байт). */
    public static byte[] kangaroo12_128(byte[] data) {
        Kangaroo.KangarooTwelve k12 = new Kangaroo.KangarooTwelve();
        k12.update(data, 0, data.length);
        byte[] out = new byte[16]; // 128 бит
        k12.doFinal(out, 0, out.length);
        return out;
    }

}
