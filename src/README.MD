1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 56,83% complete, ETA 06:47:16
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 57,00% complete, ETA 06:44:31
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 57,17% complete, ETA 06:41:46
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 57,33% complete, ETA 06:39:03
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha128
# Parameters: (size = 512K)

# Run progress: 57,50% complete, ETA 06:36:21
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 57,67% complete, ETA 06:33:39
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 57,83% complete, ETA 06:30:59
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 58,00% complete, ETA 06:28:19
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 58,17% complete, ETA 06:25:41
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha128
# Parameters: (size = 4M)

# Run progress: 58,33% complete, ETA 06:23:03
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 58,50% complete, ETA 06:20:26
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 58,67% complete, ETA 06:17:50
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 58,83% complete, ETA 06:15:15
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 59,00% complete, ETA 06:12:41
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha128
# Parameters: (size = 20M)

# Run progress: 59,17% complete, ETA 06:10:08
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 59,33% complete, ETA 06:07:35
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 59,50% complete, ETA 06:05:04
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 59,67% complete, ETA 06:02:33
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 59,83% complete, ETA 06:00:03
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_avgt_jmhStub(Main_sha128_jmhTest.java:232)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_AverageTime(Main_sha128_jmhTest.java:173)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha256
# Parameters: (size = 64K)

# Run progress: 60,00% complete, ETA 05:57:34
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23567,885 ns/op
# Warmup Iteration   2: 23463,931 ns/op
# Warmup Iteration   3: 23459,565 ns/op
# Warmup Iteration   4: 23470,717 ns/op
# Warmup Iteration   5: 23537,083 ns/op
Iteration   1: 23433,056 ns/op
Iteration   2: 23400,134 ns/op
Iteration   3: 23413,369 ns/op
Iteration   4: 23450,236 ns/op
Iteration   5: 23391,511 ns/op

# Run progress: 60,17% complete, ETA 05:56:12
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23507,246 ns/op
# Warmup Iteration   2: 23475,378 ns/op
# Warmup Iteration   3: 23541,481 ns/op
# Warmup Iteration   4: 23466,400 ns/op
# Warmup Iteration   5: 23463,870 ns/op
Iteration   1: 23468,497 ns/op
Iteration   2: 23493,400 ns/op
Iteration   3: 23393,160 ns/op
Iteration   4: 23391,278 ns/op
Iteration   5: 23391,281 ns/op

# Run progress: 60,33% complete, ETA 05:54:50
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23597,543 ns/op
# Warmup Iteration   2: 23470,269 ns/op
# Warmup Iteration   3: 23467,167 ns/op
# Warmup Iteration   4: 23471,759 ns/op
# Warmup Iteration   5: 23533,322 ns/op
Iteration   1: 23460,210 ns/op
Iteration   2: 23419,296 ns/op
Iteration   3: 23392,099 ns/op
Iteration   4: 23481,164 ns/op
Iteration   5: 23396,966 ns/op

# Run progress: 60,50% complete, ETA 05:53:27
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23500,045 ns/op
# Warmup Iteration   2: 23460,632 ns/op
# Warmup Iteration   3: 23543,733 ns/op
# Warmup Iteration   4: 23459,564 ns/op
# Warmup Iteration   5: 23451,604 ns/op
Iteration   1: 23454,745 ns/op
Iteration   2: 23492,207 ns/op
Iteration   3: 23453,005 ns/op
Iteration   4: 23380,906 ns/op
Iteration   5: 23383,793 ns/op

# Run progress: 60,67% complete, ETA 05:52:05
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23525,043 ns/op
# Warmup Iteration   2: 23539,266 ns/op
# Warmup Iteration   3: 23461,225 ns/op
# Warmup Iteration   4: 23463,360 ns/op
# Warmup Iteration   5: 23459,658 ns/op
Iteration   1: 23555,310 ns/op
Iteration   2: 23415,722 ns/op
Iteration   3: 23383,939 ns/op
Iteration   4: 23382,936 ns/op
Iteration   5: 23451,358 ns/op


Result "org.example.Main.sha256":
23435,392 ±(99.9%) 87,236 ns/op [Average]
(min, avg, max) = (23380,906, 23435,392, 23555,310), stdev = 57,701
CI (99.9%): [23348,156, 23522,628] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha256
# Parameters: (size = 512K)

# Run progress: 60,83% complete, ETA 05:50:43
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188441,021 ns/op
# Warmup Iteration   2: 186795,437 ns/op
# Warmup Iteration   3: 186795,073 ns/op
# Warmup Iteration   4: 187292,154 ns/op
# Warmup Iteration   5: 186666,775 ns/op
Iteration   1: 186620,611 ns/op
Iteration   2: 186574,815 ns/op
Iteration   3: 187068,038 ns/op
Iteration   4: 186677,754 ns/op
Iteration   5: 186717,451 ns/op

# Run progress: 61,00% complete, ETA 05:49:20
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188561,061 ns/op
# Warmup Iteration   2: 187451,264 ns/op
# Warmup Iteration   3: 186673,074 ns/op
# Warmup Iteration   4: 186897,497 ns/op
# Warmup Iteration   5: 186651,386 ns/op
Iteration   1: 187231,241 ns/op
Iteration   2: 186745,070 ns/op
Iteration   3: 186869,000 ns/op
Iteration   4: 186659,418 ns/op
Iteration   5: 187430,450 ns/op

# Run progress: 61,17% complete, ETA 05:47:57
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188402,366 ns/op
# Warmup Iteration   2: 186767,264 ns/op
# Warmup Iteration   3: 186675,410 ns/op
# Warmup Iteration   4: 187367,012 ns/op
# Warmup Iteration   5: 186666,782 ns/op
Iteration   1: 186580,613 ns/op
Iteration   2: 186669,067 ns/op
Iteration   3: 187210,223 ns/op
Iteration   4: 186684,130 ns/op
Iteration   5: 186678,296 ns/op

# Run progress: 61,33% complete, ETA 05:46:35
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188501,811 ns/op
# Warmup Iteration   2: 187270,137 ns/op
# Warmup Iteration   3: 186742,248 ns/op
# Warmup Iteration   4: 186761,665 ns/op
# Warmup Iteration   5: 186685,333 ns/op
Iteration   1: 187384,571 ns/op
Iteration   2: 186631,174 ns/op
Iteration   3: 186612,894 ns/op
Iteration   4: 186794,402 ns/op
Iteration   5: 187167,683 ns/op

# Run progress: 61,50% complete, ETA 05:45:12
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188496,851 ns/op
# Warmup Iteration   2: 186715,529 ns/op
# Warmup Iteration   3: 186724,555 ns/op
# Warmup Iteration   4: 186979,282 ns/op
# Warmup Iteration   5: 187018,387 ns/op
Iteration   1: 186842,798 ns/op
Iteration   2: 186876,304 ns/op
Iteration   3: 186591,603 ns/op
Iteration   4: 187404,191 ns/op
Iteration   5: 186724,575 ns/op


Result "org.example.Main.sha256":
186903,019 ±(99.9%) 466,298 ns/op [Average]
(min, avg, max) = (186591,603, 186903,019, 187404,191), stdev = 308,427
CI (99.9%): [186436,722, 187369,317] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha256
# Parameters: (size = 4M)

# Run progress: 61,67% complete, ETA 05:43:49
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1582622,487 ns/op
# Warmup Iteration   2: 1494406,014 ns/op
# Warmup Iteration   3: 1499237,844 ns/op
# Warmup Iteration   4: 1494114,974 ns/op
# Warmup Iteration   5: 1494366,910 ns/op
Iteration   1: 1494108,236 ns/op
Iteration   2: 1500848,888 ns/op
Iteration   3: 1494300,126 ns/op
Iteration   4: 1494272,557 ns/op
Iteration   5: 1494099,935 ns/op

# Run progress: 61,83% complete, ETA 05:42:26
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1591711,984 ns/op
# Warmup Iteration   2: 1494839,930 ns/op
# Warmup Iteration   3: 1494608,625 ns/op
# Warmup Iteration   4: 1495115,788 ns/op
# Warmup Iteration   5: 1500969,940 ns/op
Iteration   1: 1494247,437 ns/op
Iteration   2: 1494429,091 ns/op
Iteration   3: 1495644,807 ns/op
Iteration   4: 1499067,471 ns/op
Iteration   5: 1495561,968 ns/op

# Run progress: 62,00% complete, ETA 05:41:03
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1584615,843 ns/op
# Warmup Iteration   2: 1494876,142 ns/op
# Warmup Iteration   3: 1498749,336 ns/op
# Warmup Iteration   4: 1494311,358 ns/op
# Warmup Iteration   5: 1494465,966 ns/op
Iteration   1: 1495563,518 ns/op
Iteration   2: 1501035,668 ns/op
Iteration   3: 1494714,845 ns/op
Iteration   4: 1494869,982 ns/op
Iteration   5: 1495415,434 ns/op

# Run progress: 62,17% complete, ETA 05:39:39
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1589918,941 ns/op
# Warmup Iteration   2: 1495284,511 ns/op
# Warmup Iteration   3: 1494855,119 ns/op
# Warmup Iteration   4: 1494984,533 ns/op
# Warmup Iteration   5: 1499584,002 ns/op
Iteration   1: 1494737,471 ns/op
Iteration   2: 1494526,424 ns/op
Iteration   3: 1494876,834 ns/op
Iteration   4: 1499586,259 ns/op
Iteration   5: 1495013,359 ns/op

# Run progress: 62,33% complete, ETA 05:38:16
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1582992,215 ns/op
# Warmup Iteration   2: 1494636,592 ns/op
# Warmup Iteration   3: 1499237,201 ns/op
# Warmup Iteration   4: 1494358,815 ns/op
# Warmup Iteration   5: 1494584,470 ns/op
Iteration   1: 1494229,919 ns/op
Iteration   2: 1496018,267 ns/op
Iteration   3: 1498417,807 ns/op
Iteration   4: 1494804,787 ns/op
Iteration   5: 1494303,636 ns/op


Result "org.example.Main.sha256":
1495651,476 ±(99.9%) 2802,829 ns/op [Average]
(min, avg, max) = (1494229,919, 1495651,476, 1499586,259), stdev = 1853,898
CI (99.9%): [1492848,648, 1498454,305] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.sha256
# Parameters: (size = 20M)

# Run progress: 62,50% complete, ETA 05:36:53
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8509664,414 ns/op
# Warmup Iteration   2: 8525522,665 ns/op
# Warmup Iteration   3: 7734792,485 ns/op
# Warmup Iteration   4: 7472548,748 ns/op
# Warmup Iteration   5: 7473819,763 ns/op
Iteration   1: 7505856,057 ns/op
Iteration   2: 7481052,399 ns/op
Iteration   3: 7471564,886 ns/op
Iteration   4: 7471497,630 ns/op
Iteration   5: 7503424,537 ns/op

# Run progress: 62,67% complete, ETA 05:35:29
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8490198,756 ns/op
# Warmup Iteration   2: 8483078,465 ns/op
# Warmup Iteration   3: 7732555,891 ns/op
# Warmup Iteration   4: 7502772,115 ns/op
# Warmup Iteration   5: 7472786,698 ns/op
Iteration   1: 7469747,681 ns/op
Iteration   2: 7470918,647 ns/op
Iteration   3: 7503700,521 ns/op
Iteration   4: 7469547,763 ns/op
Iteration   5: 7469880,693 ns/op

# Run progress: 62,83% complete, ETA 05:34:06
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8497859,909 ns/op
# Warmup Iteration   2: 8519958,549 ns/op
# Warmup Iteration   3: 7738013,023 ns/op
# Warmup Iteration   4: 7476219,795 ns/op
# Warmup Iteration   5: 7472873,819 ns/op
Iteration   1: 7510174,499 ns/op
Iteration   2: 7471323,416 ns/op
Iteration   3: 7474805,312 ns/op
Iteration   4: 7472607,014 ns/op
Iteration   5: 7492436,641 ns/op

# Run progress: 63,00% complete, ETA 05:32:42
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8504695,408 ns/op
# Warmup Iteration   2: 8487548,822 ns/op
# Warmup Iteration   3: 7735204,369 ns/op
# Warmup Iteration   4: 7496740,831 ns/op
# Warmup Iteration   5: 7473390,775 ns/op
Iteration   1: 7476365,501 ns/op
Iteration   2: 7481555,232 ns/op
Iteration   3: 7496303,889 ns/op
Iteration   4: 7472805,437 ns/op
Iteration   5: 7473075,013 ns/op

# Run progress: 63,17% complete, ETA 05:31:18
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8490038,076 ns/op
# Warmup Iteration   2: 8505505,347 ns/op
# Warmup Iteration   3: 7739785,952 ns/op
# Warmup Iteration   4: 7471573,199 ns/op
# Warmup Iteration   5: 7473462,491 ns/op
Iteration   1: 7499494,233 ns/op
Iteration   2: 7473987,720 ns/op
Iteration   3: 7474726,484 ns/op
Iteration   4: 7474405,079 ns/op
Iteration   5: 7489907,785 ns/op


Result "org.example.Main.sha256":
7481262,637 ±(99.9%) 15439,953 ns/op [Average]
(min, avg, max) = (7472805,437, 7481262,637, 7499494,233), stdev = 10212,573
CI (99.9%): [7465822,685, 7496702,590] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 64K)

# Run progress: 63,33% complete, ETA 05:29:54
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4287,930 ns/op
# Warmup Iteration   2: 4471,577 ns/op
# Warmup Iteration   3: 4351,222 ns/op
# Warmup Iteration   4: 4334,285 ns/op
# Warmup Iteration   5: 4403,140 ns/op
Iteration   1: 4228,513 ns/op
Iteration   2: 4406,250 ns/op
Iteration   3: 4386,980 ns/op
Iteration   4: 4239,708 ns/op
Iteration   5: 4617,617 ns/op

# Run progress: 63,50% complete, ETA 05:28:31
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4298,546 ns/op
# Warmup Iteration   2: 4433,699 ns/op
# Warmup Iteration   3: 4320,744 ns/op
# Warmup Iteration   4: 4298,720 ns/op
# Warmup Iteration   5: 4374,154 ns/op
Iteration   1: 4204,337 ns/op
Iteration   2: 4421,502 ns/op
Iteration   3: 4400,539 ns/op
Iteration   4: 4214,827 ns/op
Iteration   5: 4641,814 ns/op

# Run progress: 63,67% complete, ETA 05:27:07
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4291,716 ns/op
# Warmup Iteration   2: 4496,642 ns/op
# Warmup Iteration   3: 4342,447 ns/op
# Warmup Iteration   4: 4338,273 ns/op
# Warmup Iteration   5: 4218,367 ns/op
Iteration   1: 4404,786 ns/op
Iteration   2: 4428,112 ns/op
Iteration   3: 4207,523 ns/op
Iteration   4: 4615,280 ns/op
Iteration   5: 4191,915 ns/op

# Run progress: 63,83% complete, ETA 05:25:43
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4301,005 ns/op
# Warmup Iteration   2: 4449,141 ns/op
# Warmup Iteration   3: 4313,236 ns/op
# Warmup Iteration   4: 4314,907 ns/op
# Warmup Iteration   5: 4370,283 ns/op
Iteration   1: 4204,346 ns/op
Iteration   2: 4424,217 ns/op
Iteration   3: 4285,306 ns/op
Iteration   4: 4555,330 ns/op
Iteration   5: 4716,206 ns/op

# Run progress: 64,00% complete, ETA 05:24:19
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4309,646 ns/op
# Warmup Iteration   2: 4469,157 ns/op
# Warmup Iteration   3: 4326,891 ns/op
# Warmup Iteration   4: 4319,589 ns/op
# Warmup Iteration   5: 4388,424 ns/op
Iteration   1: 4226,172 ns/op
Iteration   2: 4419,408 ns/op
Iteration   3: 4203,197 ns/op
Iteration   4: 4449,871 ns/op
Iteration   5: 4617,931 ns/op


Result "org.example.Main.xxhash64":
4410,198 ±(99.9%) 273,438 ns/op [Average]
(min, avg, max) = (4203,197, 4410,198, 4716,206), stdev = 180,862
CI (99.9%): [4136,760, 4683,636] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 512K)

# Run progress: 64,17% complete, ETA 05:22:55
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32541,878 ns/op
# Warmup Iteration   2: 32475,557 ns/op
# Warmup Iteration   3: 33021,077 ns/op
# Warmup Iteration   4: 32308,818 ns/op
# Warmup Iteration   5: 32298,177 ns/op
Iteration   1: 32292,195 ns/op
Iteration   2: 32421,797 ns/op
Iteration   3: 32298,739 ns/op
Iteration   4: 32289,819 ns/op
Iteration   5: 32358,087 ns/op

# Run progress: 64,33% complete, ETA 05:21:31
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32648,859 ns/op
# Warmup Iteration   2: 32503,734 ns/op
# Warmup Iteration   3: 32831,445 ns/op
# Warmup Iteration   4: 32418,424 ns/op
# Warmup Iteration   5: 32489,667 ns/op
Iteration   1: 32294,281 ns/op
Iteration   2: 32291,632 ns/op
Iteration   3: 32288,519 ns/op
Iteration   4: 32466,250 ns/op
Iteration   5: 32331,902 ns/op

# Run progress: 64,50% complete, ETA 05:20:06
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32494,314 ns/op
# Warmup Iteration   2: 32457,926 ns/op
# Warmup Iteration   3: 33000,481 ns/op
# Warmup Iteration   4: 32354,846 ns/op
# Warmup Iteration   5: 32290,134 ns/op
Iteration   1: 32340,840 ns/op
Iteration   2: 32296,996 ns/op
Iteration   3: 32413,408 ns/op
Iteration   4: 32364,882 ns/op
Iteration   5: 32289,584 ns/op

# Run progress: 64,67% complete, ETA 05:18:42
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32336,963 ns/op
# Warmup Iteration   2: 32442,844 ns/op
# Warmup Iteration   3: 32757,175 ns/op
# Warmup Iteration   4: 32277,130 ns/op
# Warmup Iteration   5: 32270,594 ns/op
Iteration   1: 32479,359 ns/op
Iteration   2: 32373,390 ns/op
Iteration   3: 32410,306 ns/op
Iteration   4: 32452,119 ns/op
Iteration   5: 32495,032 ns/op

# Run progress: 64,83% complete, ETA 05:17:17
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32418,090 ns/op
# Warmup Iteration   2: 32533,524 ns/op
# Warmup Iteration   3: 33016,259 ns/op
# Warmup Iteration   4: 32568,841 ns/op
# Warmup Iteration   5: 32443,946 ns/op
Iteration   1: 32448,023 ns/op
Iteration   2: 32464,407 ns/op
Iteration   3: 32569,160 ns/op
Iteration   4: 32449,725 ns/op
Iteration   5: 32446,339 ns/op


Result "org.example.Main.xxhash64":
32458,786 ±(99.9%) 78,058 ns/op [Average]
(min, avg, max) = (32373,390, 32458,786, 32569,160), stdev = 51,630
CI (99.9%): [32380,728, 32536,844] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 4M)

# Run progress: 65,00% complete, ETA 05:15:53
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

259486,850 ns/op
# Warmup Iteration   2: 259001,114 ns/op
# Warmup Iteration   3: 257827,125 ns/op
# Warmup Iteration   4: 257836,197 ns/op
# Warmup Iteration   5: 257977,871 ns/op
Iteration   1: 259342,781 ns/op
Iteration   2: 257877,822 ns/op
Iteration   3: 257737,742 ns/op
Iteration   4: 257875,435 ns/op
Iteration   5: 258659,268 ns/op

# Run progress: 65,17% complete, ETA 05:14:28
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

258536,357 ns/op
# Warmup Iteration   2: 257717,822 ns/op
# Warmup Iteration   3: 257906,705 ns/op
# Warmup Iteration   4: 258896,329 ns/op
# Warmup Iteration   5: 259319,501 ns/op
Iteration   1: 259222,308 ns/op
Iteration   2: 259287,566 ns/op
Iteration   3: 259958,619 ns/op
Iteration   4: 259337,942 ns/op
Iteration   5: 259208,207 ns/op

# Run progress: 65,33% complete, ETA 05:13:03
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

259450,212 ns/op
# Warmup Iteration   2: 260343,787 ns/op
# Warmup Iteration   3: 258297,565 ns/op
# Warmup Iteration   4: 258060,976 ns/op
# Warmup Iteration   5: 258181,960 ns/op
Iteration   1: 258326,802 ns/op
Iteration   2: 260022,540 ns/op
Iteration   3: 259318,036 ns/op
Iteration   4: 259603,870 ns/op
Iteration   5: 259475,520 ns/op

# Run progress: 65,50% complete, ETA 05:11:38
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

259735,978 ns/op
# Warmup Iteration   2: 259225,747 ns/op
# Warmup Iteration   3: 259285,895 ns/op
# Warmup Iteration   4: 259359,868 ns/op
# Warmup Iteration   5: 259136,601 ns/op
Iteration   1: 258287,678 ns/op
Iteration   2: 257985,584 ns/op
Iteration   3: 258041,889 ns/op
Iteration   4: 259775,306 ns/op
Iteration   5: 259184,836 ns/op

# Run progress: 65,67% complete, ETA 05:10:13
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

258318,112 ns/op
# Warmup Iteration   2: 259292,220 ns/op
# Warmup Iteration   3: 259348,919 ns/op
# Warmup Iteration   4: 258016,573 ns/op
# Warmup Iteration   5: 257913,608 ns/op
Iteration   1: 259042,635 ns/op
Iteration   2: 259752,137 ns/op
Iteration   3: 257849,033 ns/op
Iteration   4: 257897,460 ns/op
Iteration   5: 257848,176 ns/op


Result "org.example.Main.xxhash64":
258566,473 ±(99.9%) 1197,327 ns/op [Average]
(min, avg, max) = (257848,176, 258566,473, 259775,306), stdev = 791,958
CI (99.9%): [257369,146, 259763,801] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 20M)

# Run progress: 65,83% complete, ETA 05:08:48
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1296699,185 ns/op
# Warmup Iteration   2: 1289843,839 ns/op
# Warmup Iteration   3: 1289499,231 ns/op
# Warmup Iteration   4: 1290377,311 ns/op
# Warmup Iteration   5: 1297395,961 ns/op
Iteration   1: 1290041,926 ns/op
Iteration   2: 1290367,492 ns/op
Iteration   3: 1296309,245 ns/op
Iteration   4: 1300652,029 ns/op
Iteration   5: 1294516,547 ns/op

# Run progress: 66,00% complete, ETA 05:07:23
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1293421,259 ns/op
# Warmup Iteration   2: 1296333,076 ns/op
# Warmup Iteration   3: 1300724,377 ns/op
# Warmup Iteration   4: 1293437,654 ns/op
# Warmup Iteration   5: 1294020,888 ns/op
Iteration   1: 1296873,614 ns/op
Iteration   2: 1302850,649 ns/op
Iteration   3: 1296103,579 ns/op
Iteration   4: 1295575,949 ns/op
Iteration   5: 1296404,859 ns/op

# Run progress: 66,17% complete, ETA 05:05:57
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1300456,371 ns/op
# Warmup Iteration   2: 1296800,369 ns/op
# Warmup Iteration   3: 1296490,236 ns/op
# Warmup Iteration   4: 1297060,073 ns/op
# Warmup Iteration   5: 1301919,020 ns/op
Iteration   1: 1297737,784 ns/op
Iteration   2: 1296532,680 ns/op
Iteration   3: 1292785,360 ns/op
Iteration   4: 1297467,078 ns/op
Iteration   5: 1298453,847 ns/op

# Run progress: 66,33% complete, ETA 05:04:32
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1291967,990 ns/op
# Warmup Iteration   2: 1291053,491 ns/op
# Warmup Iteration   3: 1292934,043 ns/op
# Warmup Iteration   4: 1293174,264 ns/op
# Warmup Iteration   5: 1290607,047 ns/op
Iteration   1: 1290304,910 ns/op
Iteration   2: 1290815,327 ns/op
Iteration   3: 1300608,635 ns/op
Iteration   4: 1292041,877 ns/op
Iteration   5: 1296087,673 ns/op

# Run progress: 66,50% complete, ETA 05:03:07
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1296722,232 ns/op
# Warmup Iteration   2: 1300133,171 ns/op
# Warmup Iteration   3: 1290260,378 ns/op
# Warmup Iteration   4: 1290809,075 ns/op
# Warmup Iteration   5: 1291559,929 ns/op
Iteration   1: 1297444,038 ns/op
Iteration   2: 1292344,830 ns/op
Iteration   3: 1291007,708 ns/op
Iteration   4: 1290705,466 ns/op
Iteration   5: 1297193,163 ns/op


Result "org.example.Main.xxhash64":
1293855,363 ±(99.9%) 5521,864 ns/op [Average]
(min, avg, max) = (1290304,910, 1293855,363, 1300608,635), stdev = 3652,371
CI (99.9%): [1288333,498, 1299377,227] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 64K)

# Run progress: 66,67% complete, ETA 05:01:41
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128295,833 ±(99.9%) 3292,617 ns/op
# Warmup Iteration   2: 124234,687 ±(99.9%) 158,706 ns/op
# Warmup Iteration   3: 124094,434 ±(99.9%) 107,169 ns/op
# Warmup Iteration   4: 124272,782 ±(99.9%) 80,490 ns/op
# Warmup Iteration   5: 123842,296 ±(99.9%) 60,792 ns/op
Iteration   1: 123848,523 ±(99.9%) 65,670 ns/op
blake2b_128·p0.00:   119552,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   130816,000 ns/op
blake2b_128·p0.999:  144719,872 ns/op
blake2b_128·p0.9999: 514088,960 ns/op
blake2b_128·p1.00:   760832,000 ns/op

Iteration   2: 123962,947 ±(99.9%) 95,933 ns/op
blake2b_128·p0.00:   119168,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127488,000 ns/op
blake2b_128·p0.99:   130304,000 ns/op
blake2b_128·p0.999:  159331,072 ns/op
blake2b_128·p0.9999: 620355,686 ns/op
blake2b_128·p1.00:   891904,000 ns/op

Iteration   3: 124173,825 ±(99.9%) 83,914 ns/op
blake2b_128·p0.00:   119552,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126720,000 ns/op
blake2b_128·p0.95:   128256,000 ns/op
blake2b_128·p0.99:   135424,000 ns/op
blake2b_128·p0.999:  166534,400 ns/op
blake2b_128·p0.9999: 513332,480 ns/op
blake2b_128·p1.00:   834560,000 ns/op

Iteration   4: 124011,097 ±(99.9%) 104,621 ns/op
blake2b_128·p0.00:   117888,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127744,000 ns/op
blake2b_128·p0.99:   131584,000 ns/op
blake2b_128·p0.999:  157803,008 ns/op
blake2b_128·p0.9999: 645130,854 ns/op
blake2b_128·p1.00:   765952,000 ns/op

Iteration   5: 123928,776 ±(99.9%) 78,705 ns/op
blake2b_128·p0.00:   118528,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   130432,000 ns/op
blake2b_128·p0.999:  148061,440 ns/op
blake2b_128·p0.9999: 632083,968 ns/op
blake2b_128·p1.00:   738304,000 ns/op


# Run progress: 66,83% complete, ETA 05:00:16
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128950,241 ±(99.9%) 3281,987 ns/op
# Warmup Iteration   2: 124370,421 ±(99.9%) 164,726 ns/op
# Warmup Iteration   3: 124035,127 ±(99.9%) 110,715 ns/op
# Warmup Iteration   4: 124024,365 ±(99.9%) 92,835 ns/op
# Warmup Iteration   5: 124012,331 ±(99.9%) 83,161 ns/op
Iteration   1: 124348,947 ±(99.9%) 97,093 ns/op
blake2b_128·p0.00:   119552,000 ns/op
blake2b_128·p0.50:   123264,000 ns/op
blake2b_128·p0.90:   126848,000 ns/op
blake2b_128·p0.95:   128256,000 ns/op
blake2b_128·p0.99:   133632,000 ns/op
blake2b_128·p0.999:  178153,216 ns/op
blake2b_128·p0.9999: 657184,973 ns/op
blake2b_128·p1.00:   806912,000 ns/op

Iteration   2: 124029,380 ±(99.9%) 77,607 ns/op
blake2b_128·p0.00:   118528,000 ns/op
blake2b_128·p0.50:   123008,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   130432,000 ns/op
blake2b_128·p0.999:  152174,080 ns/op
blake2b_128·p0.9999: 602552,320 ns/op
blake2b_128·p1.00:   764928,000 ns/op

Iteration   3: 123984,478 ±(99.9%) 89,030 ns/op
blake2b_128·p0.00:   120064,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126592,000 ns/op
blake2b_128·p0.95:   127872,000 ns/op
blake2b_128·p0.99:   131072,000 ns/op
blake2b_128·p0.999:  146176,000 ns/op
blake2b_128·p0.9999: 619255,910 ns/op
blake2b_128·p1.00:   866304,000 ns/op

Iteration   4: 124045,350 ±(99.9%) 78,713 ns/op
blake2b_128·p0.00:   118912,000 ns/op
blake2b_128·p0.50:   123008,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   130048,000 ns/op
blake2b_128·p0.999:  145520,896 ns/op
blake2b_128·p0.9999: 612708,250 ns/op
blake2b_128·p1.00:   776192,000 ns/op

Iteration   5: 124437,598 ±(99.9%) 89,212 ns/op
blake2b_128·p0.00:   117760,000 ns/op
blake2b_128·p0.50:   123136,000 ns/op
blake2b_128·p0.90:   126976,000 ns/op
blake2b_128·p0.95:   128384,000 ns/op
blake2b_128·p0.99:   135424,000 ns/op
blake2b_128·p0.999:  181760,000 ns/op
blake2b_128·p0.9999: 599564,288 ns/op
blake2b_128·p1.00:   814080,000 ns/op


# Run progress: 67,00% complete, ETA 04:58:50
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128376,582 ±(99.9%) 3256,762 ns/op
# Warmup Iteration   2: 124049,641 ±(99.9%) 164,933 ns/op
# Warmup Iteration   3: 124167,291 ±(99.9%) 110,658 ns/op
# Warmup Iteration   4: 124064,835 ±(99.9%) 85,580 ns/op
# Warmup Iteration   5: 123877,447 ±(99.9%) 72,654 ns/op
Iteration   1: 123798,055 ±(99.9%) 89,569 ns/op
blake2b_128·p0.00:   118784,000 ns/op
blake2b_128·p0.50:   122624,000 ns/op
blake2b_128·p0.90:   126336,000 ns/op
blake2b_128·p0.95:   127488,000 ns/op
blake2b_128·p0.99:   130944,000 ns/op
blake2b_128·p0.999:  155463,680 ns/op
blake2b_128·p0.9999: 639041,536 ns/op
blake2b_128·p1.00:   797696,000 ns/op

Iteration   2: 123812,511 ±(99.9%) 93,260 ns/op
blake2b_128·p0.00:   118784,000 ns/op
blake2b_128·p0.50:   122624,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   131072,000 ns/op
blake2b_128·p0.999:  157769,984 ns/op
blake2b_128·p0.9999: 631735,194 ns/op
blake2b_128·p1.00:   817152,000 ns/op

Iteration   3: 123967,124 ±(99.9%) 96,328 ns/op
blake2b_128·p0.00:   118912,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   130560,000 ns/op
blake2b_128·p0.999:  155392,000 ns/op
blake2b_128·p0.9999: 538273,792 ns/op
blake2b_128·p1.00:   945152,000 ns/op

Iteration   4: 123889,245 ±(99.9%) 87,435 ns/op
blake2b_128·p0.00:   120960,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127360,000 ns/op
blake2b_128·p0.99:   129920,000 ns/op
blake2b_128·p0.999:  151126,528 ns/op
blake2b_128·p0.9999: 542313,267 ns/op
blake2b_128·p1.00:   874496,000 ns/op

Iteration   5: 123890,510 ±(99.9%) 98,961 ns/op
blake2b_128·p0.00:   117376,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   131328,000 ns/op
blake2b_128·p0.999:  170327,040 ns/op
blake2b_128·p0.9999: 624572,416 ns/op
blake2b_128·p1.00:   912384,000 ns/op


# Run progress: 67,17% complete, ETA 04:57:24
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128488,564 ±(99.9%) 3292,443 ns/op
# Warmup Iteration   2: 124384,873 ±(99.9%) 169,272 ns/op
# Warmup Iteration   3: 124080,954 ±(99.9%) 105,825 ns/op
# Warmup Iteration   4: 123913,507 ±(99.9%) 75,229 ns/op
# Warmup Iteration   5: 123885,681 ±(99.9%) 67,606 ns/op
Iteration   1: 124047,405 ±(99.9%) 86,979 ns/op
blake2b_128·p0.00:   121088,000 ns/op
blake2b_128·p0.50:   123008,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127488,000 ns/op
blake2b_128·p0.99:   129920,000 ns/op
blake2b_128·p0.999:  149218,304 ns/op
blake2b_128·p0.9999: 609051,443 ns/op
blake2b_128·p1.00:   715776,000 ns/op

Iteration   2: 124110,715 ±(99.9%) 98,783 ns/op
blake2b_128·p0.00:   119936,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126720,000 ns/op
blake2b_128·p0.95:   128128,000 ns/op
blake2b_128·p0.99:   133632,000 ns/op
blake2b_128·p0.999:  159991,296 ns/op
blake2b_128·p0.9999: 639947,059 ns/op
blake2b_128·p1.00:   961536,000 ns/op

Iteration   3: 123961,279 ±(99.9%) 98,111 ns/op
blake2b_128·p0.00:   118528,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126592,000 ns/op
blake2b_128·p0.95:   128000,000 ns/op
blake2b_128·p0.99:   131328,000 ns/op
blake2b_128·p0.999:  145506,816 ns/op
blake2b_128·p0.9999: 706838,733 ns/op
blake2b_128·p1.00:   872448,000 ns/op

Iteration   4: 123840,123 ±(99.9%) 80,772 ns/op
blake2b_128·p0.00:   118912,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127616,000 ns/op
blake2b_128·p0.99:   130432,000 ns/op
blake2b_128·p0.999:  144462,848 ns/op
blake2b_128·p0.9999: 622159,872 ns/op
blake2b_128·p1.00:   775168,000 ns/op

Iteration   5: 124007,182 ±(99.9%) 82,928 ns/op
blake2b_128·p0.00:   118272,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127744,000 ns/op
blake2b_128·p0.99:   131328,000 ns/op
blake2b_128·p0.999:  153600,000 ns/op
blake2b_128·p0.9999: 610213,888 ns/op
blake2b_128·p1.00:   698368,000 ns/op


# Run progress: 67,33% complete, ETA 04:55:59
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128559,344 ±(99.9%) 3278,655 ns/op
# Warmup Iteration   2: 123888,559 ±(99.9%) 154,459 ns/op
# Warmup Iteration   3: 123848,883 ±(99.9%) 114,409 ns/op
# Warmup Iteration   4: 123814,713 ±(99.9%) 93,541 ns/op
# Warmup Iteration   5: 124333,141 ±(99.9%) 94,380 ns/op
Iteration   1: 123866,616 ±(99.9%) 83,928 ns/op
blake2b_128·p0.00:   119424,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127488,000 ns/op
blake2b_128·p0.99:   130304,000 ns/op
blake2b_128·p0.999:  154195,200 ns/op
blake2b_128·p0.9999: 610152,960 ns/op
blake2b_128·p1.00:   727040,000 ns/op

Iteration   2: 123816,038 ±(99.9%) 76,748 ns/op
blake2b_128·p0.00:   118912,000 ns/op
blake2b_128·p0.50:   122752,000 ns/op
blake2b_128·p0.90:   126336,000 ns/op
blake2b_128·p0.95:   127360,000 ns/op
blake2b_128·p0.99:   129536,000 ns/op
blake2b_128·p0.999:  143839,488 ns/op
blake2b_128·p0.9999: 531515,034 ns/op
blake2b_128·p1.00:   802816,000 ns/op

Iteration   3: 123886,400 ±(99.9%) 93,883 ns/op
blake2b_128·p0.00:   119552,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126464,000 ns/op
blake2b_128·p0.95:   127360,000 ns/op
blake2b_128·p0.99:   129664,000 ns/op
blake2b_128·p0.999:  146006,272 ns/op
blake2b_128·p0.9999: 621369,958 ns/op
blake2b_128·p1.00:   786432,000 ns/op

Iteration   4: 124252,319 ±(99.9%) 82,583 ns/op
blake2b_128·p0.00:   119424,000 ns/op
blake2b_128·p0.50:   123136,000 ns/op
blake2b_128·p0.90:   126848,000 ns/op
blake2b_128·p0.95:   128128,000 ns/op
blake2b_128·p0.99:   132864,000 ns/op
blake2b_128·p0.999:  165779,200 ns/op
blake2b_128·p0.9999: 602068,480 ns/op
blake2b_128·p1.00:   773120,000 ns/op

Iteration   5: 123855,041 ±(99.9%) 84,663 ns/op
blake2b_128·p0.00:   121088,000 ns/op
blake2b_128·p0.50:   122880,000 ns/op
blake2b_128·p0.90:   126336,000 ns/op
blake2b_128·p0.95:   127360,000 ns/op
blake2b_128·p0.99:   129664,000 ns/op
blake2b_128·p0.999:  140625,152 ns/op
blake2b_128·p0.9999: 620334,182 ns/op
blake2b_128·p1.00:   721920,000 ns/op



Result "org.example.Main.blake2b_128":
N = 806110
mean = 123964,168 ±(99.9%) 27,586 ns/op

Histogram, ns/op:
[ 100000,000,  150000,000) = 805159
[ 150000,000,  200000,000) = 696
[ 200000,000,  250000,000) = 19
[ 250000,000,  300000,000) = 37
[ 300000,000,  350000,000) = 20
[ 350000,000,  400000,000) = 21
[ 400000,000,  450000,000) = 21
[ 450000,000,  500000,000) = 17
[ 500000,000,  550000,000) = 20
[ 550000,000,  600000,000) = 13
[ 600000,000,  650000,000) = 30
[ 650000,000,  700000,000) = 23
[ 700000,000,  750000,000) = 20
[ 750000,000,  800000,000) = 9
[ 800000,000,  850000,000) = 3
[ 850000,000,  900000,000) = 1
[ 900000,000,  950000,000) = 0

Percentiles, ns/op:
p(0,0000) = 118272,000 ns/op
p(50,0000) = 122880,000 ns/op
p(90,0000) = 126464,000 ns/op
p(95,0000) = 127616,000 ns/op
p(99,0000) = 130816,000 ns/op
p(99,9000) = 152576,000 ns/op
p(99,9900) = 610702,234 ns/op
p(99,9990) = 785806,234 ns/op
p(99,9999) = 961536,000 ns/op
p(100,0000) = 961536,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 512K)

# Run progress: 67,50% complete, ETA 04:54:33
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1029839,006 ±(99.9%) 26813,075 ns/op
# Warmup Iteration   2: 997317,652 ±(99.9%) 2398,394 ns/op
# Warmup Iteration   3: 999503,675 ±(99.9%) 1712,729 ns/op
# Warmup Iteration   4: 997004,296 ±(99.9%) 1458,497 ns/op
# Warmup Iteration   5: 996262,890 ±(99.9%) 1085,098 ns/op
Iteration   1: 996896,785 ±(99.9%) 1957,670 ns/op
blake2b_128·p0.00:   961536,000 ns/op
blake2b_128·p0.50:   994304,000 ns/op
blake2b_128·p0.90:   1005568,000 ns/op
blake2b_128·p0.95:   1010688,000 ns/op
blake2b_128·p0.99:   1030144,000 ns/op
blake2b_128·p0.999:  1397069,824 ns/op
blake2b_128·p0.9999: 5157376,819 ns/op
blake2b_128·p1.00:   5160960,000 ns/op

Iteration   2: 998098,751 ±(99.9%) 985,001 ns/op
blake2b_128·p0.00:   969728,000 ns/op
blake2b_128·p0.50:   995328,000 ns/op
blake2b_128·p0.90:   1008640,000 ns/op
blake2b_128·p0.95:   1014784,000 ns/op
blake2b_128·p0.99:   1040384,000 ns/op
blake2b_128·p0.999:  1359656,960 ns/op
blake2b_128·p0.9999: 2971889,664 ns/op
blake2b_128·p1.00:   2973696,000 ns/op

Iteration   3: 996341,486 ±(99.9%) 1132,743 ns/op
blake2b_128·p0.00:   969728,000 ns/op
blake2b_128·p0.50:   994304,000 ns/op
blake2b_128·p0.90:   1005568,000 ns/op
blake2b_128·p0.95:   1009664,000 ns/op
blake2b_128·p0.99:   1028096,000 ns/op
blake2b_128·p0.999:  1215045,632 ns/op
blake2b_128·p0.9999: 3916628,378 ns/op
blake2b_128·p1.00:   3923968,000 ns/op

Iteration   4: 996553,431 ±(99.9%) 892,648 ns/op
blake2b_128·p0.00:   976896,000 ns/op
blake2b_128·p0.50:   994304,000 ns/op
blake2b_128·p0.90:   1006592,000 ns/op
blake2b_128·p0.95:   1010688,000 ns/op
blake2b_128·p0.99:   1026048,000 ns/op
blake2b_128·p0.999:  1287843,840 ns/op
blake2b_128·p0.9999: 3018784,768 ns/op
blake2b_128·p1.00:   3022848,000 ns/op

Iteration   5: 998284,324 ±(99.9%) 2214,941 ns/op
blake2b_128·p0.00:   965632,000 ns/op
blake2b_128·p0.50:   994304,000 ns/op
blake2b_128·p0.90:   1006592,000 ns/op
blake2b_128·p0.95:   1010688,000 ns/op
blake2b_128·p0.99:   1033216,000 ns/op
blake2b_128·p0.999:  1523472,384 ns/op
blake2b_128·p0.9999: 4923360,051 ns/op
blake2b_128·p1.00:   4923392,000 ns/op


# Run progress: 67,67% complete, ETA 04:53:07
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1029848,398 ±(99.9%) 28017,986 ns/op
# Warmup Iteration   2: 992289,347 ±(99.9%) 1243,157 ns/op
# Warmup Iteration   3: 993634,806 ±(99.9%) 1334,552 ns/op
# Warmup Iteration   4: 993350,933 ±(99.9%) 1223,968 ns/op
# Warmup Iteration   5: 996013,626 ±(99.9%) 1648,713 ns/op
Iteration   1: 992349,840 ±(99.9%) 674,083 ns/op
blake2b_128·p0.00:   960512,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1001472,000 ns/op
blake2b_128·p0.95:   1006592,000 ns/op
blake2b_128·p0.99:   1022228,480 ns/op
blake2b_128·p0.999:  1261821,952 ns/op
blake2b_128·p0.9999: 1936705,126 ns/op
blake2b_128·p1.00:   1939456,000 ns/op

Iteration   2: 992127,111 ±(99.9%) 601,252 ns/op
blake2b_128·p0.00:   963584,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1000448,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1017856,000 ns/op
blake2b_128·p0.999:  1197772,800 ns/op
blake2b_128·p0.9999: 1681254,400 ns/op
blake2b_128·p1.00:   1681408,000 ns/op

Iteration   3: 993190,563 ±(99.9%) 1189,929 ns/op
blake2b_128·p0.00:   964608,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1002496,000 ns/op
blake2b_128·p0.95:   1006592,000 ns/op
blake2b_128·p0.99:   1028096,000 ns/op
blake2b_128·p0.999:  1303111,680 ns/op
blake2b_128·p0.9999: 3673118,720 ns/op
blake2b_128·p1.00:   3682304,000 ns/op

Iteration   4: 995037,671 ±(99.9%) 1169,366 ns/op
blake2b_128·p0.00:   966656,000 ns/op
blake2b_128·p0.50:   991232,000 ns/op
blake2b_128·p0.90:   1005568,000 ns/op
blake2b_128·p0.95:   1011712,000 ns/op
blake2b_128·p0.99:   1047080,960 ns/op
blake2b_128·p0.999:  1361825,792 ns/op
blake2b_128·p0.9999: 3635943,834 ns/op
blake2b_128·p1.00:   3645440,000 ns/op

Iteration   5: 993513,606 ±(99.9%) 1767,686 ns/op
blake2b_128·p0.00:   961536,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1001472,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1021952,000 ns/op
blake2b_128·p0.999:  1498761,216 ns/op
blake2b_128·p0.9999: 4911973,581 ns/op
blake2b_128·p1.00:   4923392,000 ns/op


# Run progress: 67,83% complete, ETA 04:51:41
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1029452,929 ±(99.9%) 26589,726 ns/op
# Warmup Iteration   2: 994135,727 ±(99.9%) 1546,810 ns/op
# Warmup Iteration   3: 996272,485 ±(99.9%) 1520,190 ns/op
# Warmup Iteration   4: 993259,445 ±(99.9%) 1246,611 ns/op
# Warmup Iteration   5: 992650,589 ±(99.9%) 1216,509 ns/op
Iteration   1: 993123,612 ±(99.9%) 1278,068 ns/op
blake2b_128·p0.00:   953344,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1003520,000 ns/op
blake2b_128·p0.95:   1008640,000 ns/op
blake2b_128·p0.99:   1027072,000 ns/op
blake2b_128·p0.999:  1278003,200 ns/op
blake2b_128·p0.9999: 3594557,440 ns/op
blake2b_128·p1.00:   3596288,000 ns/op

Iteration   2: 994615,001 ±(99.9%) 1718,087 ns/op
blake2b_128·p0.00:   961536,000 ns/op
blake2b_128·p0.50:   991232,000 ns/op
blake2b_128·p0.90:   1004544,000 ns/op
blake2b_128·p0.95:   1010688,000 ns/op
blake2b_128·p0.99:   1039872,000 ns/op
blake2b_128·p0.999:  1403084,800 ns/op
blake2b_128·p0.9999: 4755578,880 ns/op
blake2b_128·p1.00:   4759552,000 ns/op

Iteration   3: 993020,566 ±(99.9%) 1121,659 ns/op
blake2b_128·p0.00:   973824,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1002496,000 ns/op
blake2b_128·p0.95:   1007616,000 ns/op
blake2b_128·p0.99:   1024000,000 ns/op
blake2b_128·p0.999:  1181155,328 ns/op
blake2b_128·p0.9999: 3896460,083 ns/op
blake2b_128·p1.00:   3911680,000 ns/op

Iteration   4: 992650,894 ±(99.9%) 1366,196 ns/op
blake2b_128·p0.00:   964608,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1002496,000 ns/op
blake2b_128·p0.95:   1007616,000 ns/op
blake2b_128·p0.99:   1021952,000 ns/op
blake2b_128·p0.999:  1164308,480 ns/op
blake2b_128·p0.9999: 4746110,976 ns/op
blake2b_128·p1.00:   4767744,000 ns/op

Iteration   5: 993259,445 ±(99.9%) 1910,483 ns/op
blake2b_128·p0.00:   963584,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1002496,000 ns/op
blake2b_128·p0.95:   1006592,000 ns/op
blake2b_128·p0.99:   1019904,000 ns/op
blake2b_128·p0.999:  1229668,352 ns/op
blake2b_128·p0.9999: 4930430,566 ns/op
blake2b_128·p1.00:   4931584,000 ns/op


# Run progress: 68,00% complete, ETA 04:50:15
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1030393,612 ±(99.9%) 26887,004 ns/op
# Warmup Iteration   2: 994499,140 ±(99.9%) 2034,270 ns/op
# Warmup Iteration   3: 993110,775 ±(99.9%) 1832,837 ns/op
# Warmup Iteration   4: 991604,862 ±(99.9%) 1215,499 ns/op
# Warmup Iteration   5: 993189,231 ±(99.9%) 1725,506 ns/op
Iteration   1: 991277,091 ±(99.9%) 1409,380 ns/op
blake2b_128·p0.00:   959488,000 ns/op
blake2b_128·p0.50:   988160,000 ns/op
blake2b_128·p0.90:   999424,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1029120,000 ns/op
blake2b_128·p0.999:  1496580,096 ns/op
blake2b_128·p0.9999: 4208282,829 ns/op
blake2b_128·p1.00:   4218880,000 ns/op

Iteration   2: 991785,253 ±(99.9%) 2294,265 ns/op
blake2b_128·p0.00:   961536,000 ns/op
blake2b_128·p0.50:   989184,000 ns/op
blake2b_128·p0.90:   999424,000 ns/op
blake2b_128·p0.95:   1004544,000 ns/op
blake2b_128·p0.99:   1017856,000 ns/op
blake2b_128·p0.999:  1314922,496 ns/op
blake2b_128·p0.9999: 6395271,578 ns/op
blake2b_128·p1.00:   6406144,000 ns/op

Iteration   3: 992059,636 ±(99.9%) 1702,624 ns/op
blake2b_128·p0.00:   967680,000 ns/op
blake2b_128·p0.50:   989184,000 ns/op
blake2b_128·p0.90:   1000448,000 ns/op
blake2b_128·p0.95:   1004544,000 ns/op
blake2b_128·p0.99:   1017856,000 ns/op
blake2b_128·p0.999:  1374281,728 ns/op
blake2b_128·p0.9999: 5649693,082 ns/op
blake2b_128·p1.00:   5677056,000 ns/op

Iteration   4: 993122,798 ±(99.9%) 957,066 ns/op
blake2b_128·p0.00:   961536,000 ns/op
blake2b_128·p0.50:   989184,000 ns/op
blake2b_128·p0.90:   1002496,000 ns/op
blake2b_128·p0.95:   1007616,000 ns/op
blake2b_128·p0.99:   1065676,800 ns/op
blake2b_128·p0.999:  1473495,040 ns/op
blake2b_128·p0.9999: 2023621,632 ns/op
blake2b_128·p1.00:   2025472,000 ns/op

Iteration   5: 993964,296 ±(99.9%) 1185,708 ns/op
blake2b_128·p0.00:   977920,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1002496,000 ns/op
blake2b_128·p0.95:   1007616,000 ns/op
blake2b_128·p0.99:   1037312,000 ns/op
blake2b_128·p0.999:  1498435,584 ns/op
blake2b_128·p0.9999: 2993018,880 ns/op
blake2b_128·p1.00:   2998272,000 ns/op


# Run progress: 68,17% complete, ETA 04:48:49
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1028745,356 ±(99.9%) 27612,568 ns/op
# Warmup Iteration   2: 993841,286 ±(99.9%) 1502,788 ns/op
# Warmup Iteration   3: 994941,643 ±(99.9%) 1386,310 ns/op
# Warmup Iteration   4: 993650,244 ±(99.9%) 1211,591 ns/op
# Warmup Iteration   5: 992013,187 ±(99.9%) 943,872 ns/op
Iteration   1: 992549,981 ±(99.9%) 1109,199 ns/op
blake2b_128·p0.00:   967680,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1001472,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1017856,000 ns/op
blake2b_128·p0.999:  1497088,000 ns/op
blake2b_128·p0.9999: 3201497,088 ns/op
blake2b_128·p1.00:   3207168,000 ns/op

Iteration   2: 992839,457 ±(99.9%) 1414,860 ns/op
blake2b_128·p0.00:   967680,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1001472,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1018880,000 ns/op
blake2b_128·p0.999:  1549688,832 ns/op
blake2b_128·p0.9999: 3592639,283 ns/op
blake2b_128·p1.00:   3596288,000 ns/op

Iteration   3: 993483,965 ±(99.9%) 686,962 ns/op
blake2b_128·p0.00:   965632,000 ns/op
blake2b_128·p0.50:   991232,000 ns/op
blake2b_128·p0.90:   1003520,000 ns/op
blake2b_128·p0.95:   1008640,000 ns/op
blake2b_128·p0.99:   1027072,000 ns/op
blake2b_128·p0.999:  1337995,264 ns/op
blake2b_128·p0.9999: 1671041,024 ns/op
blake2b_128·p1.00:   1671168,000 ns/op

Iteration   4: 993323,048 ±(99.9%) 1934,561 ns/op
blake2b_128·p0.00:   963584,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1001472,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1019904,000 ns/op
blake2b_128·p0.999:  1574782,976 ns/op
blake2b_128·p0.9999: 4257749,811 ns/op
blake2b_128·p1.00:   4259840,000 ns/op

Iteration   5: 992573,064 ±(99.9%) 1132,164 ns/op
blake2b_128·p0.00:   972800,000 ns/op
blake2b_128·p0.50:   990208,000 ns/op
blake2b_128·p0.90:   1001472,000 ns/op
blake2b_128·p0.95:   1005568,000 ns/op
blake2b_128·p0.99:   1017856,000 ns/op
blake2b_128·p0.999:  1237004,288 ns/op
blake2b_128·p0.9999: 3035019,674 ns/op
blake2b_128·p1.00:   3035136,000 ns/op



Result "org.example.Main.blake2b_128":
N = 100686
mean = 992697,246 ±(99.9%) 460,456 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 0
[ 500000,000, 1000000,000) = 88342
[1000000,000, 1500000,000) = 12257
[1500000,000, 2000000,000) = 62
[2000000,000, 2500000,000) = 9
[2500000,000, 3000000,000) = 2
[3000000,000, 3500000,000) = 7
[3500000,000, 4000000,000) = 2
[4000000,000, 4500000,000) = 2
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 1
[5500000,000, 6000000,000) = 1
[6000000,000, 6500000,000) = 1

Percentiles, ns/op:
p(0,0000) = 959488,000 ns/op
p(50,0000) = 989184,000 ns/op
p(90,0000) = 1001472,000 ns/op
p(95,0000) = 1006592,000 ns/op
p(99,0000) = 1026048,000 ns/op
p(99,9000) = 1454721,024 ns/op
p(99,9900) = 3058023,629 ns/op
p(99,9990) = 6401135,165 ns/op
p(99,9999) = 6406144,000 ns/op
p(100,0000) = 6406144,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 4M)

# Run progress: 68,33% complete, ETA 04:47:22
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8227963,891 ±(99.9%) 241794,948 ns/op
# Warmup Iteration   2: 7973729,582 ±(99.9%) 56100,170 ns/op
# Warmup Iteration   3: 7937222,298 ±(99.9%) 11452,432 ns/op
# Warmup Iteration   4: 7931207,258 ±(99.9%) 6550,125 ns/op
# Warmup Iteration   5: 7925396,488 ±(99.9%) 6490,560 ns/op
Iteration   1: 7954744,821 ±(99.9%) 10350,843 ns/op
blake2b_128·p0.00:   7766016,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   8036352,000 ns/op
blake2b_128·p0.95:   8093696,000 ns/op
blake2b_128·p0.99:   8477409,280 ns/op
blake2b_128·p0.999:  9714696,192 ns/op
blake2b_128·p0.9999: 9879552,000 ns/op
blake2b_128·p1.00:   9879552,000 ns/op

Iteration   2: 7955911,383 ±(99.9%) 48336,045 ns/op
blake2b_128·p0.00:   7806976,000 ns/op
blake2b_128·p0.50:   7913472,000 ns/op
blake2b_128·p0.90:   7995392,000 ns/op
blake2b_128·p0.95:   8036352,000 ns/op
blake2b_128·p0.99:   8470528,000 ns/op
blake2b_128·p0.999:  21930639,360 ns/op
blake2b_128·p0.9999: 23494656,000 ns/op
blake2b_128·p1.00:   23494656,000 ns/op

Iteration   3: 7937729,422 ±(99.9%) 8218,948 ns/op
blake2b_128·p0.00:   7856128,000 ns/op
blake2b_128·p0.50:   7913472,000 ns/op
blake2b_128·p0.90:   8003584,000 ns/op
blake2b_128·p0.95:   8044544,000 ns/op
blake2b_128·p0.99:   8346419,200 ns/op
blake2b_128·p0.999:  9402875,904 ns/op
blake2b_128·p0.9999: 9633792,000 ns/op
blake2b_128·p1.00:   9633792,000 ns/op

Iteration   4: 7932391,619 ±(99.9%) 30523,522 ns/op
blake2b_128·p0.00:   7757824,000 ns/op
blake2b_128·p0.50:   7905280,000 ns/op
blake2b_128·p0.90:   7979008,000 ns/op
blake2b_128·p0.95:   8019968,000 ns/op
blake2b_128·p0.99:   8203386,880 ns/op
blake2b_128·p0.999:  16543580,160 ns/op
blake2b_128·p0.9999: 19365888,000 ns/op
blake2b_128·p1.00:   19365888,000 ns/op

Iteration   5: 7950596,477 ±(99.9%) 8430,660 ns/op
blake2b_128·p0.00:   7806976,000 ns/op
blake2b_128·p0.50:   7921664,000 ns/op
blake2b_128·p0.90:   8028160,000 ns/op
blake2b_128·p0.95:   8077312,000 ns/op
blake2b_128·p0.99:   8428093,440 ns/op
blake2b_128·p0.999:  8747876,352 ns/op
blake2b_128·p0.9999: 8781824,000 ns/op
blake2b_128·p1.00:   8781824,000 ns/op


# Run progress: 68,50% complete, ETA 04:45:56
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8224592,842 ±(99.9%) 245492,382 ns/op
# Warmup Iteration   2: 7956752,089 ±(99.9%) 11572,015 ns/op
# Warmup Iteration   3: 7955539,908 ±(99.9%) 8823,789 ns/op
# Warmup Iteration   4: 7967486,980 ±(99.9%) 9068,658 ns/op
# Warmup Iteration   5: 7963276,229 ±(99.9%) 9145,397 ns/op
Iteration   1: 7956250,272 ±(99.9%) 8921,199 ns/op
blake2b_128·p0.00:   7880704,000 ns/op
blake2b_128·p0.50:   7938048,000 ns/op
blake2b_128·p0.90:   8011776,000 ns/op
blake2b_128·p0.95:   8052736,000 ns/op
blake2b_128·p0.99:   8219525,120 ns/op
blake2b_128·p0.999:  9947250,688 ns/op
blake2b_128·p0.9999: 10141696,000 ns/op
blake2b_128·p1.00:   10141696,000 ns/op

Iteration   2: 7961110,828 ±(99.9%) 20721,819 ns/op
blake2b_128·p0.00:   7864320,000 ns/op
blake2b_128·p0.50:   7938048,000 ns/op
blake2b_128·p0.90:   8019968,000 ns/op
blake2b_128·p0.95:   8060928,000 ns/op
blake2b_128·p0.99:   8190853,120 ns/op
blake2b_128·p0.999:  13913587,712 ns/op
blake2b_128·p0.9999: 15286272,000 ns/op
blake2b_128·p1.00:   15286272,000 ns/op

Iteration   3: 7984779,042 ±(99.9%) 14354,922 ns/op
blake2b_128·p0.00:   7856128,000 ns/op
blake2b_128·p0.50:   7946240,000 ns/op
blake2b_128·p0.90:   8069120,000 ns/op
blake2b_128·p0.95:   8134656,000 ns/op
blake2b_128·p0.99:   8617984,000 ns/op
blake2b_128·p0.999:  10124918,784 ns/op
blake2b_128·p0.9999: 10158080,000 ns/op
blake2b_128·p1.00:   10158080,000 ns/op

Iteration   4: 7958899,771 ±(99.9%) 8312,783 ns/op
blake2b_128·p0.00:   7888896,000 ns/op
blake2b_128·p0.50:   7938048,000 ns/op
blake2b_128·p0.90:   8011776,000 ns/op
blake2b_128·p0.95:   8062156,800 ns/op
blake2b_128·p0.99:   8333721,600 ns/op
blake2b_128·p0.999:  9575923,712 ns/op
blake2b_128·p0.9999: 9895936,000 ns/op
blake2b_128·p1.00:   9895936,000 ns/op

Iteration   5: 7955311,809 ±(99.9%) 6594,868 ns/op
blake2b_128·p0.00:   7888896,000 ns/op
blake2b_128·p0.50:   7938048,000 ns/op
blake2b_128·p0.90:   8011776,000 ns/op
blake2b_128·p0.95:   8069120,000 ns/op
blake2b_128·p0.99:   8256225,280 ns/op
blake2b_128·p0.999:  8825176,064 ns/op
blake2b_128·p0.9999: 8880128,000 ns/op
blake2b_128·p1.00:   8880128,000 ns/op


# Run progress: 68,67% complete, ETA 04:44:30
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8215916,332 ±(99.9%) 245854,894 ns/op
# Warmup Iteration   2: 7973050,182 ±(99.9%) 14040,367 ns/op
# Warmup Iteration   3: 7949066,175 ±(99.9%) 9057,007 ns/op
# Warmup Iteration   4: 7946982,359 ±(99.9%) 6199,417 ns/op
# Warmup Iteration   5: 7944944,127 ±(99.9%) 6099,787 ns/op
Iteration   1: 7966488,274 ±(99.9%) 11359,869 ns/op
blake2b_128·p0.00:   7872512,000 ns/op
blake2b_128·p0.50:   7938048,000 ns/op
blake2b_128·p0.90:   8052736,000 ns/op
blake2b_128·p0.95:   8101888,000 ns/op
blake2b_128·p0.99:   8433827,840 ns/op
blake2b_128·p0.999:  9985851,392 ns/op
blake2b_128·p0.9999: 9994240,000 ns/op
blake2b_128·p1.00:   9994240,000 ns/op

Iteration   2: 7942401,017 ±(99.9%) 6449,016 ns/op
blake2b_128·p0.00:   7864320,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   8003584,000 ns/op
blake2b_128·p0.95:   8044544,000 ns/op
blake2b_128·p0.99:   8275558,400 ns/op
blake2b_128·p0.999:  8625192,960 ns/op
blake2b_128·p0.9999: 8650752,000 ns/op
blake2b_128·p1.00:   8650752,000 ns/op

Iteration   3: 7937813,943 ±(99.9%) 12507,073 ns/op
blake2b_128·p0.00:   7864320,000 ns/op
blake2b_128·p0.50:   7921664,000 ns/op
blake2b_128·p0.90:   7979008,000 ns/op
blake2b_128·p0.95:   8019968,000 ns/op
blake2b_128·p0.99:   8190197,760 ns/op
blake2b_128·p0.999:  11309514,752 ns/op
blake2b_128·p0.9999: 12173312,000 ns/op
blake2b_128·p1.00:   12173312,000 ns/op

Iteration   4: 7944118,799 ±(99.9%) 8190,352 ns/op
blake2b_128·p0.00:   7798784,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   7995392,000 ns/op
blake2b_128·p0.95:   8028160,000 ns/op
blake2b_128·p0.99:   8309964,800 ns/op
blake2b_128·p0.999:  9736028,160 ns/op
blake2b_128·p0.9999: 10059776,000 ns/op
blake2b_128·p1.00:   10059776,000 ns/op

Iteration   5: 7964177,543 ±(99.9%) 12051,184 ns/op
blake2b_128·p0.00:   7806976,000 ns/op
blake2b_128·p0.50:   7938048,000 ns/op
blake2b_128·p0.90:   8044544,000 ns/op
blake2b_128·p0.95:   8110080,000 ns/op
blake2b_128·p0.99:   8454144,000 ns/op
blake2b_128·p0.999:  10087825,408 ns/op
blake2b_128·p0.9999: 10289152,000 ns/op
blake2b_128·p1.00:   10289152,000 ns/op


# Run progress: 68,83% complete, ETA 04:43:03
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8213277,660 ±(99.9%) 241027,124 ns/op
# Warmup Iteration   2: 7942674,300 ±(99.9%) 11638,256 ns/op
# Warmup Iteration   3: 7931239,740 ±(99.9%) 12041,900 ns/op
# Warmup Iteration   4: 7964869,457 ±(99.9%) 21307,032 ns/op
# Warmup Iteration   5: 7934355,098 ±(99.9%) 6699,231 ns/op
Iteration   1: 7931960,844 ±(99.9%) 6508,926 ns/op
blake2b_128·p0.00:   7823360,000 ns/op
blake2b_128·p0.50:   7913472,000 ns/op
blake2b_128·p0.90:   7993753,600 ns/op
blake2b_128·p0.95:   8028160,000 ns/op
blake2b_128·p0.99:   8178728,960 ns/op
blake2b_128·p0.999:  8926494,720 ns/op
blake2b_128·p0.9999: 9076736,000 ns/op
blake2b_128·p1.00:   9076736,000 ns/op

Iteration   2: 7943676,340 ±(99.9%) 54786,351 ns/op
blake2b_128·p0.00:   7757824,000 ns/op
blake2b_128·p0.50:   7913472,000 ns/op
blake2b_128·p0.90:   7979008,000 ns/op
blake2b_128·p0.95:   8019968,000 ns/op
blake2b_128·p0.99:   8321433,600 ns/op
blake2b_128·p0.999:  23469424,640 ns/op
blake2b_128·p0.9999: 28704768,000 ns/op
blake2b_128·p1.00:   28704768,000 ns/op

Iteration   3: 7942192,801 ±(99.9%) 9146,823 ns/op
blake2b_128·p0.00:   7847936,000 ns/op
blake2b_128·p0.50:   7921664,000 ns/op
blake2b_128·p0.90:   8019968,000 ns/op
blake2b_128·p0.95:   8044544,000 ns/op
blake2b_128·p0.99:   8380416,000 ns/op
blake2b_128·p0.999:  9354608,640 ns/op
blake2b_128·p0.9999: 9371648,000 ns/op
blake2b_128·p1.00:   9371648,000 ns/op

Iteration   4: 7928667,153 ±(99.9%) 5637,665 ns/op
blake2b_128·p0.00:   7823360,000 ns/op
blake2b_128·p0.50:   7913472,000 ns/op
blake2b_128·p0.90:   7979008,000 ns/op
blake2b_128·p0.95:   8028160,000 ns/op
blake2b_128·p0.99:   8151040,000 ns/op
blake2b_128·p0.999:  8494710,784 ns/op
blake2b_128·p0.9999: 8503296,000 ns/op
blake2b_128·p1.00:   8503296,000 ns/op

Iteration   5: 7936123,530 ±(99.9%) 23218,444 ns/op
blake2b_128·p0.00:   7766016,000 ns/op
blake2b_128·p0.50:   7913472,000 ns/op
blake2b_128·p0.90:   7987200,000 ns/op
blake2b_128·p0.95:   8028160,000 ns/op
blake2b_128·p0.99:   8231157,760 ns/op
blake2b_128·p0.999:  14508851,200 ns/op
blake2b_128·p0.9999: 16433152,000 ns/op
blake2b_128·p1.00:   16433152,000 ns/op


# Run progress: 69,00% complete, ETA 04:41:37
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8230654,104 ±(99.9%) 245774,550 ns/op
# Warmup Iteration   2: 7975179,841 ±(99.9%) 14317,554 ns/op
# Warmup Iteration   3: 7957732,280 ±(99.9%) 9615,494 ns/op
# Warmup Iteration   4: 7947470,754 ±(99.9%) 7634,064 ns/op
# Warmup Iteration   5: 7996938,650 ±(99.9%) 114386,877 ns/op
Iteration   1: 7957869,248 ±(99.9%) 8404,721 ns/op
blake2b_128·p0.00:   7880704,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   8028160,000 ns/op
blake2b_128·p0.95:   8069120,000 ns/op
blake2b_128·p0.99:   8412037,120 ns/op
blake2b_128·p0.999:  9147023,360 ns/op
blake2b_128·p0.9999: 9273344,000 ns/op
blake2b_128·p1.00:   9273344,000 ns/op

Iteration   2: 7955670,250 ±(99.9%) 23429,032 ns/op
blake2b_128·p0.00:   7872512,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   8019968,000 ns/op
blake2b_128·p0.95:   8052736,000 ns/op
blake2b_128·p0.99:   8380416,000 ns/op
blake2b_128·p0.999:  14424244,224 ns/op
blake2b_128·p0.9999: 16465920,000 ns/op
blake2b_128·p1.00:   16465920,000 ns/op

Iteration   3: 7948629,876 ±(99.9%) 8889,787 ns/op
blake2b_128·p0.00:   7831552,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   8003584,000 ns/op
blake2b_128·p0.95:   8044544,000 ns/op
blake2b_128·p0.99:   8375992,320 ns/op
blake2b_128·p0.999:  9576267,776 ns/op
blake2b_128·p0.9999: 9699328,000 ns/op
blake2b_128·p1.00:   9699328,000 ns/op

Iteration   4: 7951694,816 ±(99.9%) 24398,411 ns/op
blake2b_128·p0.00:   7847936,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   7995392,000 ns/op
blake2b_128·p0.95:   8037171,200 ns/op
blake2b_128·p0.99:   8378613,760 ns/op
blake2b_128·p0.999:  14807891,968 ns/op
blake2b_128·p0.9999: 16629760,000 ns/op
blake2b_128·p1.00:   16629760,000 ns/op

Iteration   5: 7976603,968 ±(99.9%) 89371,725 ns/op
blake2b_128·p0.00:   7790592,000 ns/op
blake2b_128·p0.50:   7929856,000 ns/op
blake2b_128·p0.90:   8011776,000 ns/op
blake2b_128·p0.95:   8052736,000 ns/op
blake2b_128·p0.99:   8412364,800 ns/op
blake2b_128·p0.999:  33561886,720 ns/op
blake2b_128·p0.9999: 41746432,000 ns/op
blake2b_128·p1.00:   41746432,000 ns/op



Result "org.example.Main.blake2b_128":
N = 12582
mean = 7947286,300 ±(99.9%) 11349,564 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 0
[ 5000000,000, 10000000,000) = 12577
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 3
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 1
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 7757824,000 ns/op
p(50,0000) = 7921664,000 ns/op
p(90,0000) = 8003584,000 ns/op
p(95,0000) = 8044544,000 ns/op
p(99,0000) = 8347648,000 ns/op
p(99,9000) = 9287008,256 ns/op
p(99,9900) = 38377770,189 ns/op
p(99,9990) = 41746432,000 ns/op
p(99,9999) = 41746432,000 ns/op
p(100,0000) = 41746432,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 20M)

# Run progress: 69,17% complete, ETA 04:40:11
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41172789,728 ±(99.9%) 1485355,211 ns/op
# Warmup Iteration   2: 39841449,307 ±(99.9%) 413491,833 ns/op
# Warmup Iteration   3: 39788674,032 ±(99.9%) 133156,497 ns/op
# Warmup Iteration   4: 39734840,889 ±(99.9%) 42430,849 ns/op
# Warmup Iteration   5: 39835444,016 ±(99.9%) 118406,637 ns/op
Iteration   1: 39713255,619 ±(99.9%) 53442,841 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39891763,200 ns/op
blake2b_128·p0.95:   40088371,200 ns/op
blake2b_128·p0.99:   40370176,000 ns/op
blake2b_128·p0.999:  42860544,000 ns/op
blake2b_128·p0.9999: 42860544,000 ns/op
blake2b_128·p1.00:   42860544,000 ns/op

Iteration   2: 39766048,508 ±(99.9%) 54219,980 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   40956067,840 ns/op
blake2b_128·p0.999:  42074112,000 ns/op
blake2b_128·p0.9999: 42074112,000 ns/op
blake2b_128·p1.00:   42074112,000 ns/op

Iteration   3: 39719237,079 ±(99.9%) 93279,807 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39583744,000 ns/op
blake2b_128·p0.90:   39976960,000 ns/op
blake2b_128·p0.95:   40173568,000 ns/op
blake2b_128·p0.99:   41718906,880 ns/op
blake2b_128·p0.999:  44892160,000 ns/op
blake2b_128·p0.9999: 44892160,000 ns/op
blake2b_128·p1.00:   44892160,000 ns/op

Iteration   4: 39764748,190 ±(99.9%) 81752,235 ns/op
blake2b_128·p0.00:   39387136,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   40173568,000 ns/op
blake2b_128·p0.95:   40393113,600 ns/op
blake2b_128·p0.99:   40855797,760 ns/op
blake2b_128·p0.999:  44105728,000 ns/op
blake2b_128·p0.9999: 44105728,000 ns/op
blake2b_128·p1.00:   44105728,000 ns/op

Iteration   5: 39675286,349 ±(99.9%) 41578,136 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39583744,000 ns/op
blake2b_128·p0.90:   40022835,200 ns/op
blake2b_128·p0.95:   40108032,000 ns/op
blake2b_128·p0.99:   40400977,920 ns/op
blake2b_128·p0.999:  40435712,000 ns/op
blake2b_128·p0.9999: 40435712,000 ns/op
blake2b_128·p1.00:   40435712,000 ns/op


# Run progress: 69,33% complete, ETA 04:38:44
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41075762,361 ±(99.9%) 1458919,355 ns/op
# Warmup Iteration   2: 39704413,460 ±(99.9%) 65089,753 ns/op
# Warmup Iteration   3: 39826044,430 ±(99.9%) 85653,590 ns/op
# Warmup Iteration   4: 39701032,635 ±(99.9%) 34224,204 ns/op
# Warmup Iteration   5: 39741602,540 ±(99.9%) 54840,581 ns/op
Iteration   1: 39707794,286 ±(99.9%) 40974,335 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39911424,000 ns/op
blake2b_128·p0.95:   40173568,000 ns/op
blake2b_128·p0.99:   40532049,920 ns/op
blake2b_128·p0.999:  40763392,000 ns/op
blake2b_128·p0.9999: 40763392,000 ns/op
blake2b_128·p1.00:   40763392,000 ns/op

Iteration   2: 39759806,984 ±(99.9%) 51112,655 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40262041,600 ns/op
blake2b_128·p0.99:   40890531,840 ns/op
blake2b_128·p0.999:  41025536,000 ns/op
blake2b_128·p0.9999: 41025536,000 ns/op
blake2b_128·p1.00:   41025536,000 ns/op

Iteration   3: 39741082,413 ±(99.9%) 58671,454 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39911424,000 ns/op
blake2b_128·p0.95:   40173568,000 ns/op
blake2b_128·p0.99:   40863006,720 ns/op
blake2b_128·p0.999:  42926080,000 ns/op
blake2b_128·p0.9999: 42926080,000 ns/op
blake2b_128·p1.00:   42926080,000 ns/op

Iteration   4: 39742902,857 ±(99.9%) 44069,168 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   40431779,840 ns/op
blake2b_128·p0.999:  41418752,000 ns/op
blake2b_128·p0.9999: 41418752,000 ns/op
blake2b_128·p1.00:   41418752,000 ns/op

Iteration   5: 39775150,730 ±(99.9%) 121150,833 ns/op
blake2b_128·p0.00:   39583744,000 ns/op
blake2b_128·p0.50:   39682048,000 ns/op
blake2b_128·p0.90:   39957299,200 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   40859729,920 ns/op
blake2b_128·p0.999:  48365568,000 ns/op
blake2b_128·p0.9999: 48365568,000 ns/op
blake2b_128·p1.00:   48365568,000 ns/op


# Run progress: 69,50% complete, ETA 04:37:17
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41217289,481 ±(99.9%) 1443050,599 ns/op
# Warmup Iteration   2: 39743683,048 ±(99.9%) 78847,751 ns/op
# Warmup Iteration   3: 39770209,524 ±(99.9%) 51689,207 ns/op
# Warmup Iteration   4: 39776190,984 ±(99.9%) 64819,316 ns/op
# Warmup Iteration   5: 39816644,845 ±(99.9%) 115881,280 ns/op
Iteration   1: 39800376,889 ±(99.9%) 93721,113 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   42188800,000 ns/op
blake2b_128·p0.999:  44826624,000 ns/op
blake2b_128·p0.9999: 44826624,000 ns/op
blake2b_128·p1.00:   44826624,000 ns/op

Iteration   2: 39692450,540 ±(99.9%) 37426,696 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39911424,000 ns/op
blake2b_128·p0.95:   40108032,000 ns/op
blake2b_128·p0.99:   40435712,000 ns/op
blake2b_128·p0.999:  40566784,000 ns/op
blake2b_128·p0.9999: 40566784,000 ns/op
blake2b_128·p1.00:   40566784,000 ns/op

Iteration   3: 39717156,571 ±(99.9%) 50059,324 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39976960,000 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   40562851,840 ns/op
blake2b_128·p0.999:  41615360,000 ns/op
blake2b_128·p0.9999: 41615360,000 ns/op
blake2b_128·p1.00:   41615360,000 ns/op

Iteration   4: 39831005,323 ±(99.9%) 106203,645 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   40239104,000 ns/op
blake2b_128·p0.95:   41091072,000 ns/op
blake2b_128·p0.99:   42388684,800 ns/op
blake2b_128·p0.999:  43057152,000 ns/op
blake2b_128·p0.9999: 43057152,000 ns/op
blake2b_128·p1.00:   43057152,000 ns/op

Iteration   5: 39707794,286 ±(99.9%) 48341,197 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39911424,000 ns/op
blake2b_128·p0.95:   40108032,000 ns/op
blake2b_128·p0.99:   40886599,680 ns/op
blake2b_128·p0.999:  41222144,000 ns/op
blake2b_128·p0.9999: 41222144,000 ns/op
blake2b_128·p1.00:   41222144,000 ns/op


# Run progress: 69,67% complete, ETA 04:35:51
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41128020,280 ±(99.9%) 1459904,844 ns/op
# Warmup Iteration   2: 39771509,841 ±(99.9%) 131785,407 ns/op
# Warmup Iteration   3: 39859204,080 ±(99.9%) 154583,495 ns/op
# Warmup Iteration   4: 39748884,317 ±(99.9%) 43581,195 ns/op
# Warmup Iteration   5: 39747844,063 ±(99.9%) 47021,960 ns/op
Iteration   1: 39751224,889 ±(99.9%) 40046,218 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   39976960,000 ns/op
blake2b_128·p0.95:   40173568,000 ns/op
blake2b_128·p0.99:   40532049,920 ns/op
blake2b_128·p0.999:  40763392,000 ns/op
blake2b_128·p0.9999: 40763392,000 ns/op
blake2b_128·p1.00:   40763392,000 ns/op

Iteration   2: 39859465,179 ±(99.9%) 105274,794 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   40173568,000 ns/op
blake2b_128·p0.95:   40422604,800 ns/op
blake2b_128·p0.99:   42792386,560 ns/op
blake2b_128·p0.999:  42860544,000 ns/op
blake2b_128·p0.9999: 42860544,000 ns/op
blake2b_128·p1.00:   42860544,000 ns/op

Iteration   3: 39755906,032 ±(99.9%) 103469,691 ns/op
blake2b_128·p0.00:   39387136,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   39976960,000 ns/op
blake2b_128·p0.95:   40130969,600 ns/op
blake2b_128·p0.99:   40901672,960 ns/op
blake2b_128·p0.999:  46858240,000 ns/op
blake2b_128·p0.9999: 46858240,000 ns/op
blake2b_128·p1.00:   46858240,000 ns/op

Iteration   4: 39734580,825 ±(99.9%) 44976,877 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40196505,600 ns/op
blake2b_128·p0.99:   40528117,760 ns/op
blake2b_128·p0.999:  41091072,000 ns/op
blake2b_128·p0.9999: 41091072,000 ns/op
blake2b_128·p1.00:   41091072,000 ns/op

Iteration   5: 39727299,048 ±(99.9%) 53082,415 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39649280,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   40859729,920 ns/op
blake2b_128·p0.999:  41615360,000 ns/op
blake2b_128·p0.9999: 41615360,000 ns/op
blake2b_128·p1.00:   41615360,000 ns/op


# Run progress: 69,83% complete, ETA 04:34:24
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41296075,107 ±(99.9%) 1445399,753 ns/op
# Warmup Iteration   2: 39809856,255 ±(99.9%) 95662,101 ns/op
# Warmup Iteration   3: 39780872,127 ±(99.9%) 45268,056 ns/op
# Warmup Iteration   4: 39749924,571 ±(99.9%) 83081,136 ns/op
# Warmup Iteration   5: 39911946,199 ±(99.9%) 151512,407 ns/op
Iteration   1: 39795435,683 ±(99.9%) 55194,641 ns/op
blake2b_128·p0.00:   39583744,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   39976960,000 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   40689991,680 ns/op
blake2b_128·p0.999:  42795008,000 ns/op
blake2b_128·p0.9999: 42795008,000 ns/op
blake2b_128·p1.00:   42795008,000 ns/op

Iteration   2: 39845365,801 ±(99.9%) 133438,868 ns/op
blake2b_128·p0.00:   39583744,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   40094924,800 ns/op
blake2b_128·p0.95:   40239104,000 ns/op
blake2b_128·p0.99:   42047897,600 ns/op
blake2b_128·p0.999:  48889856,000 ns/op
blake2b_128·p0.9999: 48889856,000 ns/op
blake2b_128·p1.00:   48889856,000 ns/op

Iteration   3: 39801157,079 ±(99.9%) 42723,752 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   40042496,000 ns/op
blake2b_128·p0.95:   40262041,600 ns/op
blake2b_128·p0.99:   40628387,840 ns/op
blake2b_128·p0.999:  40828928,000 ns/op
blake2b_128·p0.9999: 40828928,000 ns/op
blake2b_128·p1.00:   40828928,000 ns/op

Iteration   4: 39936489,562 ±(99.9%) 136679,190 ns/op
blake2b_128·p0.00:   39518208,000 ns/op
blake2b_128·p0.50:   39780352,000 ns/op
blake2b_128·p0.90:   40435712,000 ns/op
blake2b_128·p0.95:   40815820,800 ns/op
blake2b_128·p0.99:   42695393,280 ns/op
blake2b_128·p0.999:  47251456,000 ns/op
blake2b_128·p0.9999: 47251456,000 ns/op
blake2b_128·p1.00:   47251456,000 ns/op

Iteration   5: 39761367,365 ±(99.9%) 38975,692 ns/op
blake2b_128·p0.00:   39452672,000 ns/op
blake2b_128·p0.50:   39714816,000 ns/op
blake2b_128·p0.90:   39976960,000 ns/op
blake2b_128·p0.95:   40173568,000 ns/op
blake2b_128·p0.99:   40558919,680 ns/op
blake2b_128·p0.999:  40894464,000 ns/op
blake2b_128·p0.9999: 40894464,000 ns/op
blake2b_128·p1.00:   40894464,000 ns/op



Result "org.example.Main.blake2b_128":
N = 2517
mean = 39796729,491 ±(99.9%) 26618,930 ns/op

Histogram, ns/op:
[39000000,000, 40000000,000) = 2236
[40000000,000, 41000000,000) = 256
[41000000,000, 42000000,000) = 11
[42000000,000, 43000000,000) = 11
[43000000,000, 44000000,000) = 0
[44000000,000, 45000000,000) = 0
[45000000,000, 46000000,000) = 0
[46000000,000, 47000000,000) = 1
[47000000,000, 48000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 39387136,000 ns/op
p(50,0000) = 39714816,000 ns/op
p(90,0000) = 40042496,000 ns/op
p(95,0000) = 40304640,000 ns/op
p(99,0000) = 41067479,040 ns/op
p(99,9000) = 47047770,112 ns/op
p(99,9900) = 48889856,000 ns/op
p(99,9990) = 48889856,000 ns/op
p(99,9999) = 48889856,000 ns/op
p(100,0000) = 48889856,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 64K)

# Run progress: 70,00% complete, ETA 04:32:57
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128540,340 ±(99.9%) 3277,940 ns/op
# Warmup Iteration   2: 124139,166 ±(99.9%) 168,563 ns/op
# Warmup Iteration   3: 124381,053 ±(99.9%) 119,528 ns/op
# Warmup Iteration   4: 124094,376 ±(99.9%) 85,653 ns/op
# Warmup Iteration   5: 124052,463 ±(99.9%) 76,900 ns/op
Iteration   1: 124043,108 ±(99.9%) 81,240 ns/op
blake2b_256·p0.00:   119936,000 ns/op
blake2b_256·p0.50:   123008,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127488,000 ns/op
blake2b_256·p0.99:   129536,000 ns/op
blake2b_256·p0.999:  140400,384 ns/op
blake2b_256·p0.9999: 619854,643 ns/op
blake2b_256·p1.00:   735232,000 ns/op

Iteration   2: 124217,749 ±(99.9%) 86,512 ns/op
blake2b_256·p0.00:   120576,000 ns/op
blake2b_256·p0.50:   123264,000 ns/op
blake2b_256·p0.90:   126720,000 ns/op
blake2b_256·p0.95:   127872,000 ns/op
blake2b_256·p0.99:   130754,560 ns/op
blake2b_256·p0.999:  156928,000 ns/op
blake2b_256·p0.9999: 610836,480 ns/op
blake2b_256·p1.00:   855040,000 ns/op

Iteration   3: 124106,623 ±(99.9%) 93,352 ns/op
blake2b_256·p0.00:   117888,000 ns/op
blake2b_256·p0.50:   123008,000 ns/op
blake2b_256·p0.90:   126592,000 ns/op
blake2b_256·p0.95:   127872,000 ns/op
blake2b_256·p0.99:   130944,000 ns/op
blake2b_256·p0.999:  154490,880 ns/op
blake2b_256·p0.9999: 605941,760 ns/op
blake2b_256·p1.00:   855040,000 ns/op

Iteration   4: 123999,430 ±(99.9%) 89,212 ns/op
blake2b_256·p0.00:   119424,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126592,000 ns/op
blake2b_256·p0.95:   128000,000 ns/op
blake2b_256·p0.99:   131328,000 ns/op
blake2b_256·p0.999:  152064,000 ns/op
blake2b_256·p0.9999: 623915,008 ns/op
blake2b_256·p1.00:   819200,000 ns/op

Iteration   5: 124031,906 ±(99.9%) 89,010 ns/op
blake2b_256·p0.00:   120192,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126720,000 ns/op
blake2b_256·p0.95:   128128,000 ns/op
blake2b_256·p0.99:   132096,000 ns/op
blake2b_256·p0.999:  152029,184 ns/op
blake2b_256·p0.9999: 637987,226 ns/op
blake2b_256·p1.00:   766976,000 ns/op


# Run progress: 70,17% complete, ETA 04:31:30
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128690,549 ±(99.9%) 3320,002 ns/op
# Warmup Iteration   2: 124224,359 ±(99.9%) 170,597 ns/op
# Warmup Iteration   3: 124008,693 ±(99.9%) 116,624 ns/op
# Warmup Iteration   4: 124025,204 ±(99.9%) 83,767 ns/op
# Warmup Iteration   5: 124030,030 ±(99.9%) 96,677 ns/op
Iteration   1: 124226,474 ±(99.9%) 93,752 ns/op
blake2b_256·p0.00:   118656,000 ns/op
blake2b_256·p0.50:   123136,000 ns/op
blake2b_256·p0.90:   126848,000 ns/op
blake2b_256·p0.95:   128384,000 ns/op
blake2b_256·p0.99:   133376,000 ns/op
blake2b_256·p0.999:  153743,104 ns/op
blake2b_256·p0.9999: 622622,515 ns/op
blake2b_256·p1.00:   891904,000 ns/op

Iteration   2: 123928,902 ±(99.9%) 84,330 ns/op
blake2b_256·p0.00:   119808,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126592,000 ns/op
blake2b_256·p0.95:   127872,000 ns/op
blake2b_256·p0.99:   130688,000 ns/op
blake2b_256·p0.999:  144733,440 ns/op
blake2b_256·p0.9999: 601916,416 ns/op
blake2b_256·p1.00:   807936,000 ns/op

Iteration   3: 123972,851 ±(99.9%) 91,505 ns/op
blake2b_256·p0.00:   118272,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126592,000 ns/op
blake2b_256·p0.95:   128000,000 ns/op
blake2b_256·p0.99:   131840,000 ns/op
blake2b_256·p0.999:  143104,000 ns/op
blake2b_256·p0.9999: 699237,376 ns/op
blake2b_256·p1.00:   875520,000 ns/op

Iteration   4: 124096,003 ±(99.9%) 88,275 ns/op
blake2b_256·p0.00:   119296,000 ns/op
blake2b_256·p0.50:   123136,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127488,000 ns/op
blake2b_256·p0.99:   129664,000 ns/op
blake2b_256·p0.999:  150528,000 ns/op
blake2b_256·p0.9999: 617148,211 ns/op
blake2b_256·p1.00:   822272,000 ns/op

Iteration   5: 124292,292 ±(99.9%) 87,440 ns/op
blake2b_256·p0.00:   118912,000 ns/op
blake2b_256·p0.50:   123136,000 ns/op
blake2b_256·p0.90:   126976,000 ns/op
blake2b_256·p0.95:   128640,000 ns/op
blake2b_256·p0.99:   135936,000 ns/op
blake2b_256·p0.999:  160256,000 ns/op
blake2b_256·p0.9999: 626280,448 ns/op
blake2b_256·p1.00:   789504,000 ns/op


# Run progress: 70,33% complete, ETA 04:30:03
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128264,927 ±(99.9%) 3248,427 ns/op
# Warmup Iteration   2: 123872,864 ±(99.9%) 158,440 ns/op
# Warmup Iteration   3: 123934,642 ±(99.9%) 116,240 ns/op
# Warmup Iteration   4: 124139,925 ±(99.9%) 87,891 ns/op
# Warmup Iteration   5: 123886,265 ±(99.9%) 87,923 ns/op
Iteration   1: 123800,735 ±(99.9%) 82,159 ns/op
blake2b_256·p0.00:   116352,000 ns/op
blake2b_256·p0.50:   122752,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127744,000 ns/op
blake2b_256·p0.99:   131072,000 ns/op
blake2b_256·p0.999:  150599,936 ns/op
blake2b_256·p0.9999: 629164,237 ns/op
blake2b_256·p1.00:   720896,000 ns/op

Iteration   2: 123828,449 ±(99.9%) 84,683 ns/op
blake2b_256·p0.00:   117888,000 ns/op
blake2b_256·p0.50:   122752,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127744,000 ns/op
blake2b_256·p0.99:   131328,000 ns/op
blake2b_256·p0.999:  153344,000 ns/op
blake2b_256·p0.9999: 587837,440 ns/op
blake2b_256·p1.00:   815104,000 ns/op

Iteration   3: 124148,344 ±(99.9%) 97,859 ns/op
blake2b_256·p0.00:   119936,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126848,000 ns/op
blake2b_256·p0.95:   128512,000 ns/op
blake2b_256·p0.99:   135168,000 ns/op
blake2b_256·p0.999:  153985,792 ns/op
blake2b_256·p0.9999: 634728,550 ns/op
blake2b_256·p1.00:   886784,000 ns/op

Iteration   4: 123877,398 ±(99.9%) 84,667 ns/op
blake2b_256·p0.00:   119296,000 ns/op
blake2b_256·p0.50:   122752,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127744,000 ns/op
blake2b_256·p0.99:   131584,000 ns/op
blake2b_256·p0.999:  161536,000 ns/op
blake2b_256·p0.9999: 616170,394 ns/op
blake2b_256·p1.00:   717824,000 ns/op

Iteration   5: 123797,130 ±(99.9%) 80,725 ns/op
blake2b_256·p0.00:   118912,000 ns/op
blake2b_256·p0.50:   122752,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127744,000 ns/op
blake2b_256·p0.99:   131328,000 ns/op
blake2b_256·p0.999:  144967,680 ns/op
blake2b_256·p0.9999: 621125,632 ns/op
blake2b_256·p1.00:   793600,000 ns/op


# Run progress: 70,50% complete, ETA 04:28:36
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128486,599 ±(99.9%) 3219,937 ns/op
# Warmup Iteration   2: 124409,143 ±(99.9%) 160,251 ns/op
# Warmup Iteration   3: 124146,847 ±(99.9%) 114,567 ns/op
# Warmup Iteration   4: 124109,196 ±(99.9%) 87,920 ns/op
# Warmup Iteration   5: 124021,888 ±(99.9%) 86,560 ns/op
Iteration   1: 124173,165 ±(99.9%) 84,808 ns/op
blake2b_256·p0.00:   118016,000 ns/op
blake2b_256·p0.50:   123264,000 ns/op
blake2b_256·p0.90:   126848,000 ns/op
blake2b_256·p0.95:   128256,000 ns/op
blake2b_256·p0.99:   131840,000 ns/op
blake2b_256·p0.999:  156037,888 ns/op
blake2b_256·p0.9999: 627563,725 ns/op
blake2b_256·p1.00:   754688,000 ns/op

Iteration   2: 124027,506 ±(99.9%) 83,507 ns/op
blake2b_256·p0.00:   120064,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126720,000 ns/op
blake2b_256·p0.95:   128128,000 ns/op
blake2b_256·p0.99:   131840,000 ns/op
blake2b_256·p0.999:  143725,824 ns/op
blake2b_256·p0.9999: 520149,299 ns/op
blake2b_256·p1.00:   1015808,000 ns/op

Iteration   3: 124019,986 ±(99.9%) 97,812 ns/op
blake2b_256·p0.00:   116096,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126592,000 ns/op
blake2b_256·p0.95:   127872,000 ns/op
blake2b_256·p0.99:   131072,000 ns/op
blake2b_256·p0.999:  154624,000 ns/op
blake2b_256·p0.9999: 637345,792 ns/op
blake2b_256·p1.00:   870400,000 ns/op

Iteration   4: 123983,771 ±(99.9%) 82,021 ns/op
blake2b_256·p0.00:   119424,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126592,000 ns/op
blake2b_256·p0.95:   127872,000 ns/op
blake2b_256·p0.99:   130944,000 ns/op
blake2b_256·p0.999:  145766,400 ns/op
blake2b_256·p0.9999: 499609,600 ns/op
blake2b_256·p1.00:   833536,000 ns/op

Iteration   5: 124241,941 ±(99.9%) 89,990 ns/op
blake2b_256·p0.00:   118784,000 ns/op
blake2b_256·p0.50:   123264,000 ns/op
blake2b_256·p0.90:   126848,000 ns/op
blake2b_256·p0.95:   128128,000 ns/op
blake2b_256·p0.99:   132096,000 ns/op
blake2b_256·p0.999:  159924,224 ns/op
blake2b_256·p0.9999: 635815,526 ns/op
blake2b_256·p1.00:   751616,000 ns/op


# Run progress: 70,67% complete, ETA 04:27:09
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 128513,130 ±(99.9%) 3297,886 ns/op
# Warmup Iteration   2: 123982,687 ±(99.9%) 159,377 ns/op
# Warmup Iteration   3: 123921,810 ±(99.9%) 107,694 ns/op
# Warmup Iteration   4: 124190,124 ±(99.9%) 93,150 ns/op
# Warmup Iteration   5: 123949,888 ±(99.9%) 92,683 ns/op
Iteration   1: 123907,419 ±(99.9%) 78,649 ns/op
blake2b_256·p0.00:   120192,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126336,000 ns/op
blake2b_256·p0.95:   127360,000 ns/op
blake2b_256·p0.99:   129408,000 ns/op
blake2b_256·p0.999:  140889,856 ns/op
blake2b_256·p0.9999: 618190,848 ns/op
blake2b_256·p1.00:   713728,000 ns/op

Iteration   2: 123928,302 ±(99.9%) 76,746 ns/op
blake2b_256·p0.00:   120576,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127360,000 ns/op
blake2b_256·p0.99:   129536,000 ns/op
blake2b_256·p0.999:  148061,440 ns/op
blake2b_256·p0.9999: 497338,624 ns/op
blake2b_256·p1.00:   796672,000 ns/op

Iteration   3: 124148,402 ±(99.9%) 95,055 ns/op
blake2b_256·p0.00:   120064,000 ns/op
blake2b_256·p0.50:   123136,000 ns/op
blake2b_256·p0.90:   126720,000 ns/op
blake2b_256·p0.95:   127744,000 ns/op
blake2b_256·p0.99:   130688,000 ns/op
blake2b_256·p0.999:  149760,000 ns/op
blake2b_256·p0.9999: 634376,192 ns/op
blake2b_256·p1.00:   826368,000 ns/op

Iteration   4: 123912,699 ±(99.9%) 84,588 ns/op
blake2b_256·p0.00:   120832,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126464,000 ns/op
blake2b_256·p0.95:   127360,000 ns/op
blake2b_256·p0.99:   129408,000 ns/op
blake2b_256·p0.999:  139701,248 ns/op
blake2b_256·p0.9999: 628966,195 ns/op
blake2b_256·p1.00:   760832,000 ns/op

Iteration   5: 123914,244 ±(99.9%) 88,076 ns/op
blake2b_256·p0.00:   118400,000 ns/op
blake2b_256·p0.50:   122880,000 ns/op
blake2b_256·p0.90:   126336,000 ns/op
blake2b_256·p0.95:   127360,000 ns/op
blake2b_256·p0.99:   129536,000 ns/op
blake2b_256·p0.999:  150618,880 ns/op
blake2b_256·p0.9999: 660216,832 ns/op
blake2b_256·p1.00:   815104,000 ns/op



Result "org.example.Main.blake2b_256":
N = 805713
mean = 124025,635 ±(99.9%) 27,310 ns/op

Histogram, ns/op:
[ 100000,000,  200000,000) = 805484
[ 200000,000,  300000,000) = 54
[ 300000,000,  400000,000) = 30
[ 400000,000,  500000,000) = 35
[ 500000,000,  600000,000) = 27
[ 600000,000,  700000,000) = 38
[ 700000,000,  800000,000) = 38
[ 800000,000,  900000,000) = 6
[ 900000,000, 1000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 116096,000 ns/op
p(50,0000) = 123008,000 ns/op
p(90,0000) = 126592,000 ns/op
p(95,0000) = 127744,000 ns/op
p(99,0000) = 130688,000 ns/op
p(99,9000) = 150784,000 ns/op
p(99,9900) = 606354,432 ns/op
p(99,9990) = 798602,977 ns/op
p(99,9999) = 1015808,000 ns/op
p(100,0000) = 1015808,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 512K)

# Run progress: 70,83% complete, ETA 04:25:42
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1027296,632 ±(99.9%) 26947,219 ns/op
# Warmup Iteration   2: 996833,768 ±(99.9%) 2321,195 ns/op
# Warmup Iteration   3: 993177,325 ±(99.9%) 1732,400 ns/op
# Warmup Iteration   4: 992541,439 ±(99.9%) 1600,572 ns/op
# Warmup Iteration   5: 991856,237 ±(99.9%) 1203,941 ns/op
Iteration   1: 993402,237 ±(99.9%) 706,613 ns/op
blake2b_256·p0.00:   958464,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1004544,000 ns/op
blake2b_256·p0.95:   1009664,000 ns/op
blake2b_256·p0.99:   1035264,000 ns/op
blake2b_256·p0.999:  1380352,000 ns/op
blake2b_256·p0.9999: 1595087,258 ns/op
blake2b_256·p1.00:   1595392,000 ns/op

Iteration   2: 992683,641 ±(99.9%) 711,430 ns/op
blake2b_256·p0.00:   962560,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1002496,000 ns/op
blake2b_256·p0.95:   1006592,000 ns/op
blake2b_256·p0.99:   1026048,000 ns/op
blake2b_256·p0.999:  1447628,800 ns/op
blake2b_256·p0.9999: 1640232,960 ns/op
blake2b_256·p1.00:   1640448,000 ns/op

Iteration   3: 993192,700 ±(99.9%) 1163,423 ns/op
blake2b_256·p0.00:   962560,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1001472,000 ns/op
blake2b_256·p0.95:   1006592,000 ns/op
blake2b_256·p0.99:   1020928,000 ns/op
blake2b_256·p0.999:  1277839,360 ns/op
blake2b_256·p0.9999: 3895470,080 ns/op
blake2b_256·p1.00:   3907584,000 ns/op

Iteration   4: 992870,583 ±(99.9%) 1078,181 ns/op
blake2b_256·p0.00:   961536,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1002496,000 ns/op
blake2b_256·p0.95:   1007616,000 ns/op
blake2b_256·p0.99:   1031168,000 ns/op
blake2b_256·p0.999:  1520689,152 ns/op
blake2b_256·p0.9999: 2995836,518 ns/op
blake2b_256·p1.00:   3002368,000 ns/op

Iteration   5: 995679,535 ±(99.9%) 1647,466 ns/op
blake2b_256·p0.00:   961536,000 ns/op
blake2b_256·p0.50:   991232,000 ns/op
blake2b_256·p0.90:   1004544,000 ns/op
blake2b_256·p0.95:   1011712,000 ns/op
blake2b_256·p0.99:   1076449,280 ns/op
blake2b_256·p0.999:  1579008,000 ns/op
blake2b_256·p0.9999: 3802612,122 ns/op
blake2b_256·p1.00:   3805184,000 ns/op


# Run progress: 71,00% complete, ETA 04:24:15
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1025187,769 ±(99.9%) 26303,995 ns/op
# Warmup Iteration   2: 991414,331 ±(99.9%) 1973,906 ns/op
# Warmup Iteration   3: 990602,721 ±(99.9%) 1293,888 ns/op
# Warmup Iteration   4: 992817,181 ±(99.9%) 930,975 ns/op
# Warmup Iteration   5: 989947,842 ±(99.9%) 765,590 ns/op
Iteration   1: 989954,231 ±(99.9%) 917,940 ns/op
blake2b_256·p0.00:   962560,000 ns/op
blake2b_256·p0.50:   987136,000 ns/op
blake2b_256·p0.90:   999424,000 ns/op
blake2b_256·p0.95:   1003520,000 ns/op
blake2b_256·p0.99:   1015838,720 ns/op
blake2b_256·p0.999:  1189750,784 ns/op
blake2b_256·p0.9999: 3280553,165 ns/op
blake2b_256·p1.00:   3297280,000 ns/op

Iteration   2: 990430,922 ±(99.9%) 635,244 ns/op
blake2b_256·p0.00:   956416,000 ns/op
blake2b_256·p0.50:   988160,000 ns/op
blake2b_256·p0.90:   1000448,000 ns/op
blake2b_256·p0.95:   1004544,000 ns/op
blake2b_256·p0.99:   1022976,000 ns/op
blake2b_256·p0.999:  1203462,144 ns/op
blake2b_256·p0.9999: 1628007,629 ns/op
blake2b_256·p1.00:   1628160,000 ns/op

Iteration   3: 990974,934 ±(99.9%) 1111,078 ns/op
blake2b_256·p0.00:   949248,000 ns/op
blake2b_256·p0.50:   988160,000 ns/op
blake2b_256·p0.90:   1000448,000 ns/op
blake2b_256·p0.95:   1005568,000 ns/op
blake2b_256·p0.99:   1030144,000 ns/op
blake2b_256·p0.999:  1442942,976 ns/op
blake2b_256·p0.9999: 3551954,330 ns/op
blake2b_256·p1.00:   3567616,000 ns/op

Iteration   4: 994134,827 ±(99.9%) 1558,384 ns/op
blake2b_256·p0.00:   958464,000 ns/op
blake2b_256·p0.50:   989184,000 ns/op
blake2b_256·p0.90:   1002496,000 ns/op
blake2b_256·p0.95:   1008640,000 ns/op
blake2b_256·p0.99:   1069977,600 ns/op
blake2b_256·p0.999:  1593927,680 ns/op
blake2b_256·p0.9999: 3667240,960 ns/op
blake2b_256·p1.00:   3674112,000 ns/op

Iteration   5: 990796,029 ±(99.9%) 2175,620 ns/op
blake2b_256·p0.00:   963584,000 ns/op
blake2b_256·p0.50:   987136,000 ns/op
blake2b_256·p0.90:   999424,000 ns/op
blake2b_256·p0.95:   1003520,000 ns/op
blake2b_256·p0.99:   1019904,000 ns/op
blake2b_256·p0.999:  1375473,664 ns/op
blake2b_256·p0.9999: 5662302,208 ns/op
blake2b_256·p1.00:   5668864,000 ns/op


# Run progress: 71,17% complete, ETA 04:22:47
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1026761,528 ±(99.9%) 26649,691 ns/op
# Warmup Iteration   2: 994237,479 ±(99.9%) 3119,017 ns/op
# Warmup Iteration   3: 993827,233 ±(99.9%) 1067,232 ns/op
# Warmup Iteration   4: 990657,732 ±(99.9%) 847,764 ns/op
# Warmup Iteration   5: 989988,919 ±(99.9%) 992,395 ns/op
Iteration   1: 990938,587 ±(99.9%) 1749,527 ns/op
blake2b_256·p0.00:   960512,000 ns/op
blake2b_256·p0.50:   988160,000 ns/op
blake2b_256·p0.90:   1000448,000 ns/op
blake2b_256·p0.95:   1004544,000 ns/op
blake2b_256·p0.99:   1016832,000 ns/op
blake2b_256·p0.999:  1321226,240 ns/op
blake2b_256·p0.9999: 4913200,333 ns/op
blake2b_256·p1.00:   4923392,000 ns/op

Iteration   2: 992844,747 ±(99.9%) 909,450 ns/op
blake2b_256·p0.00:   958464,000 ns/op
blake2b_256·p0.50:   989184,000 ns/op
blake2b_256·p0.90:   1003520,000 ns/op
blake2b_256·p0.95:   1008640,000 ns/op
blake2b_256·p0.99:   1056768,000 ns/op
blake2b_256·p0.999:  1427316,736 ns/op
blake2b_256·p0.9999: 1882307,789 ns/op
blake2b_256·p1.00:   1884160,000 ns/op

Iteration   3: 991579,530 ±(99.9%) 2380,887 ns/op
blake2b_256·p0.00:   959488,000 ns/op
blake2b_256·p0.50:   988160,000 ns/op
blake2b_256·p0.90:   1000448,000 ns/op
blake2b_256·p0.95:   1004544,000 ns/op
blake2b_256·p0.99:   1016832,000 ns/op
blake2b_256·p0.999:  1581611,008 ns/op
blake2b_256·p0.9999: 4650866,278 ns/op
blake2b_256·p1.00:   4653056,000 ns/op

Iteration   4: 990094,290 ±(99.9%) 897,077 ns/op
blake2b_256·p0.00:   970752,000 ns/op
blake2b_256·p0.50:   988160,000 ns/op
blake2b_256·p0.90:   1000448,000 ns/op
blake2b_256·p0.95:   1004544,000 ns/op
blake2b_256·p0.99:   1016872,960 ns/op
blake2b_256·p0.999:  1303789,568 ns/op
blake2b_256·p0.9999: 3028995,277 ns/op
blake2b_256·p1.00:   3043328,000 ns/op

Iteration   5: 990030,098 ±(99.9%) 915,945 ns/op
blake2b_256·p0.00:   963584,000 ns/op
blake2b_256·p0.50:   987136,000 ns/op
blake2b_256·p0.90:   999424,000 ns/op
blake2b_256·p0.95:   1004544,000 ns/op
blake2b_256·p0.99:   1016832,000 ns/op
blake2b_256·p0.999:  1191936,000 ns/op
blake2b_256·p0.9999: 2830581,760 ns/op
blake2b_256·p1.00:   2838528,000 ns/op


# Run progress: 71,33% complete, ETA 04:21:20
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1031568,424 ±(99.9%) 26912,912 ns/op
# Warmup Iteration   2: 993383,204 ±(99.9%) 1995,095 ns/op
# Warmup Iteration   3: 993547,529 ±(99.9%) 1856,355 ns/op
# Warmup Iteration   4: 993471,854 ±(99.9%) 647,274 ns/op
# Warmup Iteration   5: 994503,604 ±(99.9%) 1091,969 ns/op
Iteration   1: 993115,777 ±(99.9%) 1303,425 ns/op
blake2b_256·p0.00:   966656,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1003520,000 ns/op
blake2b_256·p0.95:   1008640,000 ns/op
blake2b_256·p0.99:   1026048,000 ns/op
blake2b_256·p0.999:  1220474,880 ns/op
blake2b_256·p0.9999: 4471005,184 ns/op
blake2b_256·p1.00:   4489216,000 ns/op

Iteration   2: 993259,953 ±(99.9%) 1565,827 ns/op
blake2b_256·p0.00:   962560,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1003520,000 ns/op
blake2b_256·p0.95:   1008640,000 ns/op
blake2b_256·p0.99:   1022976,000 ns/op
blake2b_256·p0.999:  1558200,320 ns/op
blake2b_256·p0.9999: 4899078,144 ns/op
blake2b_256·p1.00:   4915200,000 ns/op

Iteration   3: 993284,986 ±(99.9%) 1878,118 ns/op
blake2b_256·p0.00:   961536,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1003520,000 ns/op
blake2b_256·p0.95:   1008640,000 ns/op
blake2b_256·p0.99:   1025024,000 ns/op
blake2b_256·p0.999:  1318518,784 ns/op
blake2b_256·p0.9999: 5816896,717 ns/op
blake2b_256·p1.00:   5832704,000 ns/op

Iteration   4: 994715,822 ±(99.9%) 802,661 ns/op
blake2b_256·p0.00:   972800,000 ns/op
blake2b_256·p0.50:   992256,000 ns/op
blake2b_256·p0.90:   1006592,000 ns/op
blake2b_256·p0.95:   1012736,000 ns/op
blake2b_256·p0.99:   1042432,000 ns/op
blake2b_256·p0.999:  1447575,552 ns/op
blake2b_256·p0.9999: 1754714,522 ns/op
blake2b_256·p1.00:   1755136,000 ns/op

Iteration   5: 992009,122 ±(99.9%) 637,022 ns/op
blake2b_256·p0.00:   966656,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1003520,000 ns/op
blake2b_256·p0.95:   1007616,000 ns/op
blake2b_256·p0.99:   1019904,000 ns/op
blake2b_256·p0.999:  1142784,000 ns/op
blake2b_256·p0.9999: 2024095,744 ns/op
blake2b_256·p1.00:   2027520,000 ns/op


# Run progress: 71,50% complete, ETA 04:19:53
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1029901,376 ±(99.9%) 26542,451 ns/op
# Warmup Iteration   2: 994110,975 ±(99.9%) 1845,204 ns/op
# Warmup Iteration   3: 996790,463 ±(99.9%) 1777,219 ns/op
# Warmup Iteration   4: 993036,438 ±(99.9%) 905,635 ns/op
# Warmup Iteration   5: 991854,509 ±(99.9%) 549,328 ns/op
Iteration   1: 993218,843 ±(99.9%) 1805,101 ns/op
blake2b_256·p0.00:   961536,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1001472,000 ns/op
blake2b_256·p0.95:   1006592,000 ns/op
blake2b_256·p0.99:   1024000,000 ns/op
blake2b_256·p0.999:  1466351,616 ns/op
blake2b_256·p0.9999: 4850017,894 ns/op
blake2b_256·p1.00:   4857856,000 ns/op

Iteration   2: 994780,582 ±(99.9%) 1477,089 ns/op
blake2b_256·p0.00:   974848,000 ns/op
blake2b_256·p0.50:   991232,000 ns/op
blake2b_256·p0.90:   1003520,000 ns/op
blake2b_256·p0.95:   1008640,000 ns/op
blake2b_256·p0.99:   1043988,480 ns/op
blake2b_256·p0.999:  1345142,784 ns/op
blake2b_256·p0.9999: 4697610,650 ns/op
blake2b_256·p1.00:   4710400,000 ns/op

Iteration   3: 992482,844 ±(99.9%) 614,373 ns/op
blake2b_256·p0.00:   954368,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1001472,000 ns/op
blake2b_256·p0.95:   1006592,000 ns/op
blake2b_256·p0.99:   1022238,720 ns/op
blake2b_256·p0.999:  1259372,544 ns/op
blake2b_256·p0.9999: 1652352,614 ns/op
blake2b_256·p1.00:   1652736,000 ns/op

Iteration   4: 992652,217 ±(99.9%) 820,812 ns/op
blake2b_256·p0.00:   967680,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1001472,000 ns/op
blake2b_256·p0.95:   1005568,000 ns/op
blake2b_256·p0.99:   1021952,000 ns/op
blake2b_256·p0.999:  1513512,960 ns/op
blake2b_256·p0.9999: 2112919,552 ns/op
blake2b_256·p1.00:   2113536,000 ns/op

Iteration   5: 992749,591 ±(99.9%) 1564,972 ns/op
blake2b_256·p0.00:   959488,000 ns/op
blake2b_256·p0.50:   990208,000 ns/op
blake2b_256·p0.90:   1001472,000 ns/op
blake2b_256·p0.95:   1006592,000 ns/op
blake2b_256·p0.99:   1022976,000 ns/op
blake2b_256·p0.999:  1354784,768 ns/op
blake2b_256·p0.9999: 4692429,210 ns/op
blake2b_256·p1.00:   4702208,000 ns/op



Result "org.example.Main.blake2b_256":
N = 100631
mean = 993226,241 ±(99.9%) 420,255 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 0
[ 500000,000, 1000000,000) = 85303
[1000000,000, 1500000,000) = 15248
[1500000,000, 2000000,000) = 64
[2000000,000, 2500000,000) = 6
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 3
[3500000,000, 4000000,000) = 1
[4000000,000, 4500000,000) = 1
[4500000,000, 5000000,000) = 4
[5000000,000, 5500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 954368,000 ns/op
p(50,0000) = 990208,000 ns/op
p(90,0000) = 1003520,000 ns/op
p(95,0000) = 1007616,000 ns/op
p(99,0000) = 1026048,000 ns/op
p(99,9000) = 1311473,664 ns/op
p(99,9900) = 3125215,232 ns/op
p(99,9990) = 5826905,375 ns/op
p(99,9999) = 5832704,000 ns/op
p(100,0000) = 5832704,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 4M)

# Run progress: 71,67% complete, ETA 04:18:25
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8234626,741 ±(99.9%) 250855,228 ns/op
# Warmup Iteration   2: 7939446,952 ±(99.9%) 11769,499 ns/op
# Warmup Iteration   3: 7935057,270 ±(99.9%) 9900,749 ns/op
# Warmup Iteration   4: 7934634,667 ±(99.9%) 7866,911 ns/op
# Warmup Iteration   5: 7941333,909 ±(99.9%) 7289,504 ns/op
Iteration   1: 7930362,722 ±(99.9%) 6385,146 ns/op
blake2b_256·p0.00:   7864320,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7987200,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8256716,800 ns/op
blake2b_256·p0.999:  8770879,488 ns/op
blake2b_256·p0.9999: 8830976,000 ns/op
blake2b_256·p1.00:   8830976,000 ns/op

Iteration   2: 7930258,779 ±(99.9%) 8436,940 ns/op
blake2b_256·p0.00:   7798784,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7987200,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8372224,000 ns/op
blake2b_256·p0.999:  9523691,520 ns/op
blake2b_256·p0.9999: 9781248,000 ns/op
blake2b_256·p1.00:   9781248,000 ns/op

Iteration   3: 7930050,893 ±(99.9%) 7738,267 ns/op
blake2b_256·p0.00:   7847936,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7987200,000 ns/op
blake2b_256·p0.95:   8027340,800 ns/op
blake2b_256·p0.99:   8208384,000 ns/op
blake2b_256·p0.999:  9572417,536 ns/op
blake2b_256·p0.9999: 9928704,000 ns/op
blake2b_256·p1.00:   9928704,000 ns/op

Iteration   4: 7956048,242 ±(99.9%) 42154,308 ns/op
blake2b_256·p0.00:   7831552,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   8028160,000 ns/op
blake2b_256·p0.95:   8069120,000 ns/op
blake2b_256·p0.99:   8395489,280 ns/op
blake2b_256·p0.999:  19875266,560 ns/op
blake2b_256·p0.9999: 23658496,000 ns/op
blake2b_256·p1.00:   23658496,000 ns/op

Iteration   5: 7927783,638 ±(99.9%) 5836,363 ns/op
blake2b_256·p0.00:   7831552,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7987200,000 ns/op
blake2b_256·p0.95:   8035532,800 ns/op
blake2b_256·p0.99:   8234106,880 ns/op
blake2b_256·p0.999:  8594948,096 ns/op
blake2b_256·p0.9999: 8650752,000 ns/op
blake2b_256·p1.00:   8650752,000 ns/op


# Run progress: 71,83% complete, ETA 04:16:58
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8226109,735 ±(99.9%) 259581,419 ns/op
# Warmup Iteration   2: 7962519,643 ±(99.9%) 73804,896 ns/op
# Warmup Iteration   3: 7955585,527 ±(99.9%) 13734,552 ns/op
# Warmup Iteration   4: 7939811,330 ±(99.9%) 8887,654 ns/op
# Warmup Iteration   5: 7933113,295 ±(99.9%) 5712,003 ns/op
Iteration   1: 7943559,218 ±(99.9%) 11662,345 ns/op
blake2b_256·p0.00:   7806976,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   7995392,000 ns/op
blake2b_256·p0.95:   8036352,000 ns/op
blake2b_256·p0.99:   8418099,200 ns/op
blake2b_256·p0.999:  10808197,120 ns/op
blake2b_256·p0.9999: 11583488,000 ns/op
blake2b_256·p1.00:   11583488,000 ns/op

Iteration   2: 7950655,084 ±(99.9%) 11427,146 ns/op
blake2b_256·p0.00:   7823360,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   8019968,000 ns/op
blake2b_256·p0.95:   8069120,000 ns/op
blake2b_256·p0.99:   8388608,000 ns/op
blake2b_256·p0.999:  10585227,264 ns/op
blake2b_256·p0.9999: 11141120,000 ns/op
blake2b_256·p1.00:   11141120,000 ns/op

Iteration   3: 7934166,552 ±(99.9%) 5671,102 ns/op
blake2b_256·p0.00:   7856128,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   7995392,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8144240,640 ns/op
blake2b_256·p0.999:  8616542,208 ns/op
blake2b_256·p0.9999: 8650752,000 ns/op
blake2b_256·p1.00:   8650752,000 ns/op

Iteration   4: 7932619,175 ±(99.9%) 5577,226 ns/op
blake2b_256·p0.00:   7847936,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7995392,000 ns/op
blake2b_256·p0.95:   8035942,400 ns/op
blake2b_256·p0.99:   8168816,640 ns/op
blake2b_256·p0.999:  8478359,552 ns/op
blake2b_256·p0.9999: 8486912,000 ns/op
blake2b_256·p1.00:   8486912,000 ns/op

Iteration   5: 7943227,374 ±(99.9%) 23071,728 ns/op
blake2b_256·p0.00:   7864320,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   7995392,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8344371,200 ns/op
blake2b_256·p0.999:  14584709,120 ns/op
blake2b_256·p0.9999: 16105472,000 ns/op
blake2b_256·p1.00:   16105472,000 ns/op


# Run progress: 72,00% complete, ETA 04:15:30
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8220213,895 ±(99.9%) 242892,415 ns/op
# Warmup Iteration   2: 7944060,238 ±(99.9%) 11940,454 ns/op
# Warmup Iteration   3: 7939459,965 ±(99.9%) 10335,636 ns/op
# Warmup Iteration   4: 7965169,721 ±(99.9%) 76447,869 ns/op
# Warmup Iteration   5: 7950902,537 ±(99.9%) 41870,292 ns/op
Iteration   1: 8006476,452 ±(99.9%) 94056,799 ns/op
blake2b_256·p0.00:   7757824,000 ns/op
blake2b_256·p0.50:   7929856,000 ns/op
blake2b_256·p0.90:   8036352,000 ns/op
blake2b_256·p0.95:   8118272,000 ns/op
blake2b_256·p0.99:   8945664,000 ns/op
blake2b_256·p0.999:  35266560,000 ns/op
blake2b_256·p0.9999: 39124992,000 ns/op
blake2b_256·p1.00:   39124992,000 ns/op

Iteration   2: 7983090,914 ±(99.9%) 117465,585 ns/op
blake2b_256·p0.00:   7766016,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   7984742,400 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8391966,720 ns/op
blake2b_256·p0.999:  42216816,640 ns/op
blake2b_256·p0.9999: 46071808,000 ns/op
blake2b_256·p1.00:   46071808,000 ns/op

Iteration   3: 7942589,712 ±(99.9%) 6898,093 ns/op
blake2b_256·p0.00:   7790592,000 ns/op
blake2b_256·p0.50:   7929856,000 ns/op
blake2b_256·p0.90:   7995392,000 ns/op
blake2b_256·p0.95:   8036352,000 ns/op
blake2b_256·p0.99:   8298496,000 ns/op
blake2b_256·p0.999:  8884060,160 ns/op
blake2b_256·p0.9999: 8994816,000 ns/op
blake2b_256·p1.00:   8994816,000 ns/op

Iteration   4: 7935583,898 ±(99.9%) 6371,613 ns/op
blake2b_256·p0.00:   7847936,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   7995392,000 ns/op
blake2b_256·p0.95:   8019968,000 ns/op
blake2b_256·p0.99:   8345845,760 ns/op
blake2b_256·p0.999:  8613707,776 ns/op
blake2b_256·p0.9999: 8617984,000 ns/op
blake2b_256·p1.00:   8617984,000 ns/op

Iteration   5: 7949619,688 ±(99.9%) 8193,087 ns/op
blake2b_256·p0.00:   7856128,000 ns/op
blake2b_256·p0.50:   7929856,000 ns/op
blake2b_256·p0.90:   8028979,200 ns/op
blake2b_256·p0.95:   8077312,000 ns/op
blake2b_256·p0.99:   8337981,440 ns/op
blake2b_256·p0.999:  9158180,864 ns/op
blake2b_256·p0.9999: 9289728,000 ns/op
blake2b_256·p1.00:   9289728,000 ns/op


# Run progress: 72,17% complete, ETA 04:14:02
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8218752,000 ±(99.9%) 249827,780 ns/op
# Warmup Iteration   2: 7938965,452 ±(99.9%) 13060,210 ns/op
# Warmup Iteration   3: 7936156,038 ±(99.9%) 10095,403 ns/op
# Warmup Iteration   4: 7949782,486 ±(99.9%) 8749,994 ns/op
# Warmup Iteration   5: 7933392,863 ±(99.9%) 9220,168 ns/op
Iteration   1: 7927965,538 ±(99.9%) 5678,326 ns/op
blake2b_256·p0.00:   7864320,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7970816,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8232140,800 ns/op
blake2b_256·p0.999:  8519680,000 ns/op
blake2b_256·p0.9999: 8519680,000 ns/op
blake2b_256·p1.00:   8519680,000 ns/op

Iteration   2: 7931824,419 ±(99.9%) 6683,058 ns/op
blake2b_256·p0.00:   7872512,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7979008,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8307834,880 ns/op
blake2b_256·p0.999:  8807153,664 ns/op
blake2b_256·p0.9999: 8880128,000 ns/op
blake2b_256·p1.00:   8880128,000 ns/op

Iteration   3: 7943129,773 ±(99.9%) 8101,767 ns/op
blake2b_256·p0.00:   7872512,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   8011776,000 ns/op
blake2b_256·p0.95:   8044544,000 ns/op
blake2b_256·p0.99:   8285388,800 ns/op
blake2b_256·p0.999:  9430302,720 ns/op
blake2b_256·p0.9999: 9715712,000 ns/op
blake2b_256·p1.00:   9715712,000 ns/op

Iteration   4: 7933724,444 ±(99.9%) 8338,988 ns/op
blake2b_256·p0.00:   7864320,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7987200,000 ns/op
blake2b_256·p0.95:   8036352,000 ns/op
blake2b_256·p0.99:   8313077,760 ns/op
blake2b_256·p0.999:  9592373,248 ns/op
blake2b_256·p0.9999: 9797632,000 ns/op
blake2b_256·p1.00:   9797632,000 ns/op

Iteration   5: 7948818,722 ±(99.9%) 55720,892 ns/op
blake2b_256·p0.00:   7774208,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7979008,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8323072,000 ns/op
blake2b_256·p0.999:  23846944,768 ns/op
blake2b_256·p0.9999: 29032448,000 ns/op
blake2b_256·p1.00:   29032448,000 ns/op


# Run progress: 72,33% complete, ETA 04:12:35
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8212893,975 ±(99.9%) 242151,275 ns/op
# Warmup Iteration   2: 7958227,975 ±(99.9%) 14656,564 ns/op
# Warmup Iteration   3: 7939290,790 ±(99.9%) 10263,637 ns/op
# Warmup Iteration   4: 7935928,483 ±(99.9%) 8219,187 ns/op
# Warmup Iteration   5: 7936396,597 ±(99.9%) 8889,959 ns/op
Iteration   1: 7983306,837 ±(99.9%) 82963,040 ns/op
blake2b_256·p0.00:   7798784,000 ns/op
blake2b_256·p0.50:   7929856,000 ns/op
blake2b_256·p0.90:   8019968,000 ns/op
blake2b_256·p0.95:   8093696,000 ns/op
blake2b_256·p0.99:   8543764,480 ns/op
blake2b_256·p0.999:  31810371,584 ns/op
blake2b_256·p0.9999: 38993920,000 ns/op
blake2b_256·p1.00:   38993920,000 ns/op

Iteration   2: 7932424,127 ±(99.9%) 6649,213 ns/op
blake2b_256·p0.00:   7823360,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7986380,800 ns/op
blake2b_256·p0.95:   8019968,000 ns/op
blake2b_256·p0.99:   8347648,000 ns/op
blake2b_256·p0.999:  8715567,104 ns/op
blake2b_256·p0.9999: 8732672,000 ns/op
blake2b_256·p1.00:   8732672,000 ns/op

Iteration   3: 7937313,321 ±(99.9%) 21835,781 ns/op
blake2b_256·p0.00:   7872512,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7987200,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8162590,720 ns/op
blake2b_256·p0.999:  14198423,552 ns/op
blake2b_256·p0.9999: 15810560,000 ns/op
blake2b_256·p1.00:   15810560,000 ns/op

Iteration   4: 7929810,525 ±(99.9%) 6045,975 ns/op
blake2b_256·p0.00:   7823360,000 ns/op
blake2b_256·p0.50:   7913472,000 ns/op
blake2b_256·p0.90:   7979008,000 ns/op
blake2b_256·p0.95:   8028160,000 ns/op
blake2b_256·p0.99:   8164966,400 ns/op
blake2b_256·p0.999:  8721727,488 ns/op
blake2b_256·p0.9999: 8781824,000 ns/op
blake2b_256·p1.00:   8781824,000 ns/op

Iteration   5: 7953415,332 ±(99.9%) 12777,608 ns/op
blake2b_256·p0.00:   7864320,000 ns/op
blake2b_256·p0.50:   7921664,000 ns/op
blake2b_256·p0.90:   8019968,000 ns/op
blake2b_256·p0.95:   8060928,000 ns/op
blake2b_256·p0.99:   8552448,000 ns/op
blake2b_256·p0.999:  10108960,768 ns/op
blake2b_256·p0.9999: 10240000,000 ns/op
blake2b_256·p1.00:   10240000,000 ns/op



Result "org.example.Main.blake2b_256":
N = 12589
mean = 7942140,421 ±(99.9%) 10396,951 ns/op

Histogram, ns/op:
[       0,000,  2500000,000) = 0
[ 2500000,000,  5000000,000) = 0
[ 5000000,000,  7500000,000) = 0
[ 7500000,000, 10000000,000) = 12583
[10000000,000, 12500000,000) = 3
[12500000,000, 15000000,000) = 0
[15000000,000, 17500000,000) = 1
[17500000,000, 20000000,000) = 0
[20000000,000, 22500000,000) = 0
[22500000,000, 25000000,000) = 0
[25000000,000, 27500000,000) = 0
[27500000,000, 30000000,000) = 1
[30000000,000, 32500000,000) = 0
[32500000,000, 35000000,000) = 0
[35000000,000, 37500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 7774208,000 ns/op
p(50,0000) = 7913472,000 ns/op
p(90,0000) = 7995392,000 ns/op
p(95,0000) = 8036352,000 ns/op
p(99,0000) = 8364851,200 ns/op
p(99,9000) = 9356083,200 ns/op
p(99,9900) = 36413898,752 ns/op
p(99,9990) = 38993920,000 ns/op
p(99,9999) = 38993920,000 ns/op
p(100,0000) = 38993920,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 20M)

# Run progress: 72,50% complete, ETA 04:11:07
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41177913,942 ±(99.9%) 1461845,346 ns/op
# Warmup Iteration   2: 39710654,984 ±(99.9%) 72494,887 ns/op
# Warmup Iteration   3: 40200677,269 ±(99.9%) 1770347,226 ns/op
# Warmup Iteration   4: 39739782,095 ±(99.9%) 66924,738 ns/op
# Warmup Iteration   5: 39683868,444 ±(99.9%) 60827,816 ns/op
Iteration   1: 39660982,857 ±(99.9%) 47673,610 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39845888,000 ns/op
blake2b_256·p0.95:   40130969,600 ns/op
blake2b_256·p0.99:   40724725,760 ns/op
blake2b_256·p0.999:  41418752,000 ns/op
blake2b_256·p0.9999: 41418752,000 ns/op
blake2b_256·p1.00:   41418752,000 ns/op

Iteration   2: 39668004,571 ±(99.9%) 54292,358 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40196505,600 ns/op
blake2b_256·p0.99:   40963276,800 ns/op
blake2b_256·p0.999:  41549824,000 ns/op
blake2b_256·p0.9999: 41549824,000 ns/op
blake2b_256·p1.00:   41549824,000 ns/op

Iteration   3: 39701552,762 ±(99.9%) 59145,317 ns/op
blake2b_256·p0.00:   39387136,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   40042496,000 ns/op
blake2b_256·p0.95:   40239104,000 ns/op
blake2b_256·p0.99:   40728657,920 ns/op
blake2b_256·p0.999:  42270720,000 ns/op
blake2b_256·p0.9999: 42270720,000 ns/op
blake2b_256·p1.00:   42270720,000 ns/op

Iteration   4: 39660462,730 ±(99.9%) 39147,313 ns/op
blake2b_256·p0.00:   39387136,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40130969,600 ns/op
blake2b_256·p0.99:   40366243,840 ns/op
blake2b_256·p0.999:  40501248,000 ns/op
blake2b_256·p0.9999: 40501248,000 ns/op
blake2b_256·p1.00:   40501248,000 ns/op

Iteration   5: 39653701,079 ±(99.9%) 55120,955 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39845888,000 ns/op
blake2b_256·p0.95:   40088371,200 ns/op
blake2b_256·p0.99:   41418752,000 ns/op
blake2b_256·p0.999:  41418752,000 ns/op
blake2b_256·p0.9999: 41418752,000 ns/op
blake2b_256·p1.00:   41418752,000 ns/op


# Run progress: 72,67% complete, ETA 04:09:39
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41199489,580 ±(99.9%) 1458406,058 ns/op
# Warmup Iteration   2: 39831527,522 ±(99.9%) 82097,446 ns/op
# Warmup Iteration   3: 39692710,603 ±(99.9%) 45154,370 ns/op
# Warmup Iteration   4: 39703893,333 ±(99.9%) 43217,778 ns/op
# Warmup Iteration   5: 39694010,921 ±(99.9%) 46906,602 ns/op
Iteration   1: 39779051,683 ±(99.9%) 78946,956 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   40239104,000 ns/op
blake2b_256·p0.95:   40458649,600 ns/op
blake2b_256·p0.99:   41669099,520 ns/op
blake2b_256·p0.999:  42532864,000 ns/op
blake2b_256·p0.9999: 42532864,000 ns/op
blake2b_256·p1.00:   42532864,000 ns/op

Iteration   2: 40132772,498 ±(99.9%) 1339696,060 ns/op
blake2b_256·p0.00:   39387136,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   40108032,000 ns/op
blake2b_256·p0.95:   40271872,000 ns/op
blake2b_256·p0.99:   42401792,000 ns/op
blake2b_256·p0.999:  139722752,000 ns/op
blake2b_256·p0.9999: 139722752,000 ns/op
blake2b_256·p1.00:   139722752,000 ns/op

Iteration   3: 39734060,698 ±(99.9%) 129639,600 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   39976960,000 ns/op
blake2b_256·p0.95:   40173568,000 ns/op
blake2b_256·p0.99:   40659189,760 ns/op
blake2b_256·p0.999:  49020928,000 ns/op
blake2b_256·p0.9999: 49020928,000 ns/op
blake2b_256·p1.00:   49020928,000 ns/op

Iteration   4: 39673465,905 ±(99.9%) 40424,700 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40108032,000 ns/op
blake2b_256·p0.99:   40562851,840 ns/op
blake2b_256·p0.999:  40828928,000 ns/op
blake2b_256·p0.9999: 40828928,000 ns/op
blake2b_256·p1.00:   40828928,000 ns/op

Iteration   5: 39791014,603 ±(99.9%) 94396,865 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   40173568,000 ns/op
blake2b_256·p0.95:   40697856,000 ns/op
blake2b_256·p0.99:   42277928,960 ns/op
blake2b_256·p0.999:  43188224,000 ns/op
blake2b_256·p0.9999: 43188224,000 ns/op
blake2b_256·p1.00:   43188224,000 ns/op


# Run progress: 72,83% complete, ETA 04:08:11
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41087311,738 ±(99.9%) 1462334,207 ns/op
# Warmup Iteration   2: 39727819,175 ±(99.9%) 68583,923 ns/op
# Warmup Iteration   3: 39668004,571 ±(99.9%) 54250,743 ns/op
# Warmup Iteration   4: 39755906,032 ±(99.9%) 69634,356 ns/op
# Warmup Iteration   5: 39700772,571 ±(99.9%) 73819,517 ns/op
Iteration   1: 39674766,222 ±(99.9%) 42858,215 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40108032,000 ns/op
blake2b_256·p0.99:   40397045,760 ns/op
blake2b_256·p0.999:  41353216,000 ns/op
blake2b_256·p0.9999: 41353216,000 ns/op
blake2b_256·p1.00:   41353216,000 ns/op

Iteration   2: 39686209,016 ±(99.9%) 51477,732 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40173568,000 ns/op
blake2b_256·p0.99:   40651325,440 ns/op
blake2b_256·p0.999:  41943040,000 ns/op
blake2b_256·p0.9999: 41943040,000 ns/op
blake2b_256·p1.00:   41943040,000 ns/op

Iteration   3: 39739001,905 ±(99.9%) 91564,451 ns/op
blake2b_256·p0.00:   39387136,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   40088371,200 ns/op
blake2b_256·p0.95:   40304640,000 ns/op
blake2b_256·p0.99:   41996779,520 ns/op
blake2b_256·p0.999:  43974656,000 ns/op
blake2b_256·p0.9999: 43974656,000 ns/op
blake2b_256·p1.00:   43974656,000 ns/op

Iteration   4: 39756166,095 ±(99.9%) 82954,179 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   40108032,000 ns/op
blake2b_256·p0.95:   40370176,000 ns/op
blake2b_256·p0.99:   41877504,000 ns/op
blake2b_256·p0.999:  43057152,000 ns/op
blake2b_256·p0.9999: 43057152,000 ns/op
blake2b_256·p1.00:   43057152,000 ns/op

Iteration   5: 39689849,905 ±(99.9%) 91147,267 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40042496,000 ns/op
blake2b_256·p0.99:   40655257,600 ns/op
blake2b_256·p0.999:  45875200,000 ns/op
blake2b_256·p0.9999: 45875200,000 ns/op
blake2b_256·p1.00:   45875200,000 ns/op


# Run progress: 73,00% complete, ETA 04:06:43
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41052126,426 ±(99.9%) 1443050,737 ns/op
# Warmup Iteration   2: 39819255,841 ±(99.9%) 196150,393 ns/op
# Warmup Iteration   3: 39742382,730 ±(99.9%) 83788,243 ns/op
# Warmup Iteration   4: 39683608,381 ±(99.9%) 56396,878 ns/op
# Warmup Iteration   5: 39647466,751 ±(99.9%) 44392,429 ns/op
Iteration   1: 39685948,952 ±(99.9%) 67510,932 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40108032,000 ns/op
blake2b_256·p0.99:   41205760,000 ns/op
blake2b_256·p0.999:  43188224,000 ns/op
blake2b_256·p0.9999: 43188224,000 ns/op
blake2b_256·p1.00:   43188224,000 ns/op

Iteration   2: 39767608,889 ±(99.9%) 112499,845 ns/op
blake2b_256·p0.00:   39321600,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   40173568,000 ns/op
blake2b_256·p0.95:   40393113,600 ns/op
blake2b_256·p0.99:   41568829,440 ns/op
blake2b_256·p0.999:  46661632,000 ns/op
blake2b_256·p0.9999: 46661632,000 ns/op
blake2b_256·p1.00:   46661632,000 ns/op

Iteration   3: 39651360,508 ±(99.9%) 64380,914 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39845888,000 ns/op
blake2b_256·p0.95:   40130969,600 ns/op
blake2b_256·p0.99:   40859074,560 ns/op
blake2b_256·p0.999:  43122688,000 ns/op
blake2b_256·p0.9999: 43122688,000 ns/op
blake2b_256·p1.00:   43122688,000 ns/op

Iteration   4: 39673205,841 ±(99.9%) 51275,727 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39976960,000 ns/op
blake2b_256·p0.95:   40173568,000 ns/op
blake2b_256·p0.99:   40774533,120 ns/op
blake2b_256·p0.999:  41484288,000 ns/op
blake2b_256·p0.9999: 41484288,000 ns/op
blake2b_256·p1.00:   41484288,000 ns/op

Iteration   5: 39637105,328 ±(99.9%) 35444,826 ns/op
blake2b_256·p0.00:   39387136,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39845888,000 ns/op
blake2b_256·p0.95:   40042496,000 ns/op
blake2b_256·p0.99:   40304640,000 ns/op
blake2b_256·p0.999:  40304640,000 ns/op
blake2b_256·p0.9999: 40304640,000 ns/op
blake2b_256·p1.00:   40304640,000 ns/op


# Run progress: 73,17% complete, ETA 04:05:15
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 41240483,292 ±(99.9%) 1462933,713 ns/op
# Warmup Iteration   2: 39735100,952 ±(99.9%) 57040,622 ns/op
# Warmup Iteration   3: 39726778,921 ±(99.9%) 90850,162 ns/op
# Warmup Iteration   4: 39675546,413 ±(99.9%) 47050,160 ns/op
# Warmup Iteration   5: 39810519,365 ±(99.9%) 93830,017 ns/op
Iteration   1: 39713775,746 ±(99.9%) 60970,787 ns/op
blake2b_256·p0.00:   39518208,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   39976960,000 ns/op
blake2b_256·p0.95:   40196505,600 ns/op
blake2b_256·p0.99:   40979005,440 ns/op
blake2b_256·p0.999:  42729472,000 ns/op
blake2b_256·p0.9999: 42729472,000 ns/op
blake2b_256·p1.00:   42729472,000 ns/op

Iteration   2: 39679447,365 ±(99.9%) 40237,334 ns/op
blake2b_256·p0.00:   39387136,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39976960,000 ns/op
blake2b_256·p0.95:   40108032,000 ns/op
blake2b_256·p0.99:   40366243,840 ns/op
blake2b_256·p0.999:  40435712,000 ns/op
blake2b_256·p0.9999: 40435712,000 ns/op
blake2b_256·p1.00:   40435712,000 ns/op

Iteration   3: 39696351,492 ±(99.9%) 47594,839 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39583744,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40239104,000 ns/op
blake2b_256·p0.99:   40562851,840 ns/op
blake2b_256·p0.999:  41091072,000 ns/op
blake2b_256·p0.9999: 41091072,000 ns/op
blake2b_256·p1.00:   41091072,000 ns/op

Iteration   4: 39794135,365 ±(99.9%) 84175,678 ns/op
blake2b_256·p0.00:   39452672,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   40108032,000 ns/op
blake2b_256·p0.95:   40370176,000 ns/op
blake2b_256·p0.99:   41730703,360 ns/op
blake2b_256·p0.999:  43450368,000 ns/op
blake2b_256·p0.9999: 43450368,000 ns/op
blake2b_256·p1.00:   43450368,000 ns/op

Iteration   5: 39727559,111 ±(99.9%) 70325,737 ns/op
blake2b_256·p0.00:   39518208,000 ns/op
blake2b_256·p0.50:   39649280,000 ns/op
blake2b_256·p0.90:   39911424,000 ns/op
blake2b_256·p0.95:   40239104,000 ns/op
blake2b_256·p0.99:   41830973,440 ns/op
blake2b_256·p0.999:  42795008,000 ns/op
blake2b_256·p0.9999: 42795008,000 ns/op
blake2b_256·p1.00:   42795008,000 ns/op



Result "org.example.Main.blake2b_256":
N = 2521
mean = 39702623,860 ±(99.9%) 21141,378 ns/op

Histogram, ns/op:
[39000000,000, 39500000,000) = 80
[39500000,000, 40000000,000) = 2217
[40000000,000, 40500000,000) = 185
[40500000,000, 41000000,000) = 16
[41000000,000, 41500000,000) = 12
[41500000,000, 42000000,000) = 2
[42000000,000, 42500000,000) = 3
[42500000,000, 43000000,000) = 2
[43000000,000, 43500000,000) = 3
[43500000,000, 44000000,000) = 0
[44000000,000, 44500000,000) = 0
[44500000,000, 45000000,000) = 0
[45000000,000, 45500000,000) = 0
[45500000,000, 46000000,000) = 0
[46000000,000, 46500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 39321600,000 ns/op
p(50,0000) = 39649280,000 ns/op
p(90,0000) = 39976960,000 ns/op
p(95,0000) = 40173568,000 ns/op
p(99,0000) = 40763392,000 ns/op
p(99,9000) = 43313528,832 ns/op
p(99,9900) = 46661632,000 ns/op
p(99,9990) = 46661632,000 ns/op
p(99,9999) = 46661632,000 ns/op
p(100,0000) = 46661632,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 64K)

# Run progress: 73,33% complete, ETA 04:03:47
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 808,493 ±(99.9%) 3,656 ns/op
# Warmup Iteration   2: 806,102 ±(99.9%) 0,943 ns/op
# Warmup Iteration   3: 803,996 ±(99.9%) 0,546 ns/op
# Warmup Iteration   4: 802,284 ±(99.9%) 0,522 ns/op
# Warmup Iteration   5: 802,353 ±(99.9%) 0,468 ns/op
Iteration   1: 802,558 ±(99.9%) 0,502 ns/op
crc32·p0.00:   771,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  2352,652 ns/op
crc32·p0.9999: 4006,924 ns/op
crc32·p1.00:   15184,000 ns/op

Iteration   2: 804,832 ±(99.9%) 0,660 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   842,000 ns/op
crc32·p0.999:  3256,000 ns/op
crc32·p0.9999: 4869,152 ns/op
crc32·p1.00:   26976,000 ns/op

Iteration   3: 802,488 ±(99.9%) 0,482 ns/op
crc32·p0.00:   771,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  2334,988 ns/op
crc32·p0.9999: 3966,900 ns/op
crc32·p1.00:   10128,000 ns/op

Iteration   4: 802,290 ±(99.9%) 0,472 ns/op
crc32·p0.00:   771,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  2294,004 ns/op
crc32·p0.9999: 4001,734 ns/op
crc32·p1.00:   8432,000 ns/op

Iteration   5: 802,456 ±(99.9%) 0,556 ns/op
crc32·p0.00:   751,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  1655,656 ns/op
crc32·p0.9999: 4008,000 ns/op
crc32·p1.00:   25760,000 ns/op


# Run progress: 73,50% complete, ETA 04:02:19
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 807,346 ±(99.9%) 3,603 ns/op
# Warmup Iteration   2: 808,796 ±(99.9%) 0,894 ns/op
# Warmup Iteration   3: 802,454 ±(99.9%) 0,485 ns/op
# Warmup Iteration   4: 803,596 ±(99.9%) 1,358 ns/op
# Warmup Iteration   5: 804,106 ±(99.9%) 0,698 ns/op
Iteration   1: 802,816 ±(99.9%) 0,615 ns/op
crc32·p0.00:   741,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  2687,940 ns/op
crc32·p0.9999: 4352,556 ns/op
crc32·p1.00:   20256,000 ns/op

Iteration   2: 802,597 ±(99.9%) 0,559 ns/op
crc32·p0.00:   741,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  1868,000 ns/op
crc32·p0.9999: 3968,000 ns/op
crc32·p1.00:   26816,000 ns/op

Iteration   3: 803,131 ±(99.9%) 0,509 ns/op
crc32·p0.00:   762,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  1652,110 ns/op
crc32·p0.9999: 4136,000 ns/op
crc32·p1.00:   15520,000 ns/op

Iteration   4: 804,152 ±(99.9%) 0,518 ns/op
crc32·p0.00:   771,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  2223,480 ns/op
crc32·p0.9999: 4174,972 ns/op
crc32·p1.00:   15296,000 ns/op

Iteration   5: 802,890 ±(99.9%) 0,493 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  2283,316 ns/op
crc32·p0.9999: 4015,154 ns/op
crc32·p1.00:   15888,000 ns/op


# Run progress: 73,67% complete, ETA 04:00:51
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 807,751 ±(99.9%) 3,640 ns/op
# Warmup Iteration   2: 804,717 ±(99.9%) 0,836 ns/op
# Warmup Iteration   3: 803,891 ±(99.9%) 0,634 ns/op
# Warmup Iteration   4: 802,395 ±(99.9%) 0,587 ns/op
# Warmup Iteration   5: 802,761 ±(99.9%) 0,624 ns/op
Iteration   1: 802,247 ±(99.9%) 0,500 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   822,000 ns/op
crc32·p0.999:  1642,000 ns/op
crc32·p0.9999: 4028,000 ns/op
crc32·p1.00:   12384,000 ns/op

Iteration   2: 804,809 ±(99.9%) 0,599 ns/op
crc32·p0.00:   751,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   852,000 ns/op
crc32·p0.999:  2325,280 ns/op
crc32·p0.9999: 4571,725 ns/op
crc32·p1.00:   21472,000 ns/op

Iteration   3: 802,348 ±(99.9%) 0,508 ns/op
crc32·p0.00:   752,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   822,000 ns/op
crc32·p0.999:  2285,184 ns/op
crc32·p0.9999: 4269,930 ns/op
crc32·p1.00:   14096,000 ns/op

Iteration   4: 802,412 ±(99.9%) 0,453 ns/op
crc32·p0.00:   771,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   822,000 ns/op
crc32·p0.999:  1612,850 ns/op
crc32·p0.9999: 3932,910 ns/op
crc32·p1.00:   5984,000 ns/op

Iteration   5: 802,626 ±(99.9%) 0,623 ns/op
crc32·p0.00:   742,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   822,000 ns/op
crc32·p0.999:  2096,064 ns/op
crc32·p0.9999: 4442,269 ns/op
crc32·p1.00:   21216,000 ns/op


# Run progress: 73,83% complete, ETA 03:59:23
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 811,334 ±(99.9%) 4,505 ns/op
# Warmup Iteration   2: 807,179 ±(99.9%) 1,303 ns/op
# Warmup Iteration   3: 807,347 ±(99.9%) 0,995 ns/op
# Warmup Iteration   4: 808,261 ±(99.9%) 1,069 ns/op
# Warmup Iteration   5: 804,852 ±(99.9%) 0,648 ns/op
Iteration   1: 803,233 ±(99.9%) 0,546 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  2957,380 ns/op
crc32·p0.9999: 4440,966 ns/op
crc32·p1.00:   13040,000 ns/op

Iteration   2: 802,444 ±(99.9%) 0,514 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   831,000 ns/op
crc32·p0.999:  2512,900 ns/op
crc32·p0.9999: 4093,956 ns/op
crc32·p1.00:   16864,000 ns/op

Iteration   3: 801,938 ±(99.9%) 0,552 ns/op
crc32·p0.00:   751,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   822,000 ns/op
crc32·p0.999:  1642,000 ns/op
crc32·p0.9999: 4203,574 ns/op
crc32·p1.00:   21216,000 ns/op

Iteration   4: 803,186 ±(99.9%) 0,540 ns/op
crc32·p0.00:   751,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  2516,760 ns/op
crc32·p0.9999: 4230,255 ns/op
crc32·p1.00:   16064,000 ns/op

Iteration   5: 804,264 ±(99.9%) 0,553 ns/op
crc32·p0.00:   741,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  3057,588 ns/op
crc32·p0.9999: 4566,034 ns/op
crc32·p1.00:   14256,000 ns/op


# Run progress: 74,00% complete, ETA 03:57:54
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 809,422 ±(99.9%) 4,072 ns/op
# Warmup Iteration   2: 808,247 ±(99.9%) 1,117 ns/op
# Warmup Iteration   3: 803,145 ±(99.9%) 0,576 ns/op
# Warmup Iteration   4: 804,771 ±(99.9%) 0,581 ns/op
# Warmup Iteration   5: 802,237 ±(99.9%) 0,526 ns/op
Iteration   1: 801,910 ±(99.9%) 0,441 ns/op
crc32·p0.00:   771,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  1572,000 ns/op
crc32·p0.9999: 3941,783 ns/op
crc32·p1.00:   6160,000 ns/op

Iteration   2: 801,955 ±(99.9%) 0,554 ns/op
crc32·p0.00:   751,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  1640,272 ns/op
crc32·p0.9999: 4045,341 ns/op
crc32·p1.00:   27680,000 ns/op

Iteration   3: 804,099 ±(99.9%) 0,563 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  2485,120 ns/op
crc32·p0.9999: 4414,512 ns/op
crc32·p1.00:   18816,000 ns/op

Iteration   4: 802,426 ±(99.9%) 0,531 ns/op
crc32·p0.00:   761,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   822,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  3229,340 ns/op
crc32·p0.9999: 4324,267 ns/op
crc32·p1.00:   14656,000 ns/op

Iteration   5: 802,110 ±(99.9%) 0,641 ns/op
crc32·p0.00:   751,000 ns/op
crc32·p0.50:   801,000 ns/op
crc32·p0.90:   812,000 ns/op
crc32·p0.95:   821,000 ns/op
crc32·p0.99:   832,000 ns/op
crc32·p0.999:  2746,224 ns/op
crc32·p0.9999: 4485,141 ns/op
crc32·p1.00:   29600,000 ns/op



Result "org.example.Main.crc32":
N = 3922619
mean =    802,756 ±(99.9%) 0,172 ns/op

Histogram, ns/op:
[    0,000,  2500,000) = 3918715
[ 2500,000,  5000,000) = 3777
[ 5000,000,  7500,000) = 87
[ 7500,000, 10000,000) = 12
[10000,000, 12500,000) = 8
[12500,000, 15000,000) = 7
[15000,000, 17500,000) = 5
[17500,000, 20000,000) = 5
[20000,000, 22500,000) = 1
[22500,000, 25000,000) = 0
[25000,000, 27500,000) = 0

Percentiles, ns/op:
p(0,0000) =    741,000 ns/op
p(50,0000) =    801,000 ns/op
p(90,0000) =    812,000 ns/op
p(95,0000) =    822,000 ns/op
p(99,0000) =    832,000 ns/op
p(99,9000) =   2472,000 ns/op
p(99,9900) =   4288,000 ns/op
p(99,9990) =   7654,666 ns/op
p(99,9999) =  19001,712 ns/op
p(100,0000) =  29600,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 512K)

# Run progress: 74,17% complete, ETA 03:56:26
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 6200,924 ±(99.9%) 4,306 ns/op
# Warmup Iteration   2: 6204,304 ±(99.9%) 2,512 ns/op
# Warmup Iteration   3: 6189,942 ±(99.9%) 2,277 ns/op
# Warmup Iteration   4: 6189,159 ±(99.9%) 2,277 ns/op
# Warmup Iteration   5: 6194,919 ±(99.9%) 2,143 ns/op
Iteration   1: 6299,139 ±(99.9%) 3,940 ns/op
crc32·p0.00:   5816,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6440,000 ns/op
crc32·p0.95:   6656,000 ns/op
crc32·p0.99:   8176,000 ns/op
crc32·p0.999:  11370,752 ns/op
crc32·p0.9999: 21225,754 ns/op
crc32·p1.00:   42048,000 ns/op

Iteration   2: 6372,272 ±(99.9%) 6,602 ns/op
crc32·p0.00:   5976,000 ns/op
crc32·p0.50:   6240,000 ns/op
crc32·p0.90:   6552,000 ns/op
crc32·p0.95:   7392,000 ns/op
crc32·p0.99:   8496,000 ns/op
crc32·p0.999:  15385,632 ns/op
crc32·p0.9999: 31205,779 ns/op
crc32·p1.00:   203264,000 ns/op

Iteration   3: 6199,869 ±(99.9%) 2,236 ns/op
crc32·p0.00:   5984,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6672,000 ns/op
crc32·p0.999:  9525,680 ns/op
crc32·p0.9999: 13561,656 ns/op
crc32·p1.00:   20576,000 ns/op

Iteration   4: 6195,657 ±(99.9%) 2,256 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6680,000 ns/op
crc32·p0.999:  9696,000 ns/op
crc32·p0.9999: 12808,654 ns/op
crc32·p1.00:   21664,000 ns/op

Iteration   5: 6206,046 ±(99.9%) 2,383 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6720,000 ns/op
crc32·p0.999:  10048,352 ns/op
crc32·p0.9999: 14358,541 ns/op
crc32·p1.00:   21728,000 ns/op


# Run progress: 74,33% complete, ETA 03:54:57
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 6185,085 ±(99.9%) 5,553 ns/op
# Warmup Iteration   2: 6188,412 ±(99.9%) 2,536 ns/op
# Warmup Iteration   3: 6225,491 ±(99.9%) 2,123 ns/op
# Warmup Iteration   4: 6237,988 ±(99.9%) 2,526 ns/op
# Warmup Iteration   5: 6231,621 ±(99.9%) 2,165 ns/op
Iteration   1: 6221,454 ±(99.9%) 2,223 ns/op
crc32·p0.00:   6000,000 ns/op
crc32·p0.50:   6224,000 ns/op
crc32·p0.90:   6400,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6680,000 ns/op
crc32·p0.999:  9344,000 ns/op
crc32·p0.9999: 14111,856 ns/op
crc32·p1.00:   24832,000 ns/op

Iteration   2: 6217,198 ±(99.9%) 2,184 ns/op
crc32·p0.00:   5968,000 ns/op
crc32·p0.50:   6224,000 ns/op
crc32·p0.90:   6400,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6680,000 ns/op
crc32·p0.999:  9456,000 ns/op
crc32·p0.9999: 12950,349 ns/op
crc32·p1.00:   19936,000 ns/op

Iteration   3: 6241,559 ±(99.9%) 2,954 ns/op
crc32·p0.00:   5840,000 ns/op
crc32·p0.50:   6232,000 ns/op
crc32·p0.90:   6416,000 ns/op
crc32·p0.95:   6432,000 ns/op
crc32·p0.99:   7512,000 ns/op
crc32·p0.999:  10160,000 ns/op
crc32·p0.9999: 18872,179 ns/op
crc32·p1.00:   35776,000 ns/op

Iteration   4: 6224,988 ±(99.9%) 2,305 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6232,000 ns/op
crc32·p0.90:   6400,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6688,000 ns/op
crc32·p0.999:  9584,000 ns/op
crc32·p0.9999: 14177,744 ns/op
crc32·p1.00:   22304,000 ns/op

Iteration   5: 6222,157 ±(99.9%) 2,230 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6232,000 ns/op
crc32·p0.90:   6400,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6680,000 ns/op
crc32·p0.999:  9472,000 ns/op
crc32·p0.9999: 14374,720 ns/op
crc32·p1.00:   18880,000 ns/op


# Run progress: 74,50% complete, ETA 03:53:29
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 6258,461 ±(99.9%) 4,413 ns/op
# Warmup Iteration   2: 6203,081 ±(99.9%) 2,407 ns/op
# Warmup Iteration   3: 6200,109 ±(99.9%) 2,461 ns/op
# Warmup Iteration   4: 6195,440 ±(99.9%) 2,194 ns/op
# Warmup Iteration   5: 6190,951 ±(99.9%) 2,213 ns/op
Iteration   1: 6206,558 ±(99.9%) 2,395 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6776,000 ns/op
crc32·p0.999:  9867,232 ns/op
crc32·p0.9999: 14545,971 ns/op
crc32·p1.00:   26944,000 ns/op

Iteration   2: 6198,424 ±(99.9%) 2,436 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6696,000 ns/op
crc32·p0.999:  9488,000 ns/op
crc32·p0.9999: 15092,058 ns/op
crc32·p1.00:   50048,000 ns/op

Iteration   3: 6198,021 ±(99.9%) 2,228 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6712,000 ns/op
crc32·p0.999:  9461,888 ns/op
crc32·p0.9999: 12834,944 ns/op
crc32·p1.00:   21440,000 ns/op

Iteration   4: 6203,188 ±(99.9%) 2,225 ns/op
crc32·p0.00:   6000,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6712,000 ns/op
crc32·p0.999:  9496,960 ns/op
crc32·p0.9999: 12600,960 ns/op
crc32·p1.00:   24320,000 ns/op

Iteration   5: 6210,172 ±(99.9%) 2,349 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6736,000 ns/op
crc32·p0.999:  9824,432 ns/op
crc32·p0.9999: 14282,723 ns/op
crc32·p1.00:   23104,000 ns/op


# Run progress: 74,67% complete, ETA 03:52:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 6192,384 ±(99.9%) 4,880 ns/op
# Warmup Iteration   2: 6196,865 ±(99.9%) 2,298 ns/op
# Warmup Iteration   3: 6213,656 ±(99.9%) 2,195 ns/op
# Warmup Iteration   4: 6214,947 ±(99.9%) 2,368 ns/op
# Warmup Iteration   5: 6217,071 ±(99.9%) 2,206 ns/op
Iteration   1: 6214,334 ±(99.9%) 2,180 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6688,000 ns/op
crc32·p0.999:  9488,000 ns/op
crc32·p0.9999: 12432,819 ns/op
crc32·p1.00:   20448,000 ns/op

Iteration   2: 6211,526 ±(99.9%) 2,212 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6400,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6680,000 ns/op
crc32·p0.999:  9584,000 ns/op
crc32·p0.9999: 12865,690 ns/op
crc32·p1.00:   18752,000 ns/op

Iteration   3: 6216,113 ±(99.9%) 2,321 ns/op
crc32·p0.00:   5968,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6752,000 ns/op
crc32·p0.999:  9744,000 ns/op
crc32·p0.9999: 13259,222 ns/op
crc32·p1.00:   24992,000 ns/op

Iteration   4: 6216,250 ±(99.9%) 2,596 ns/op
crc32·p0.00:   5808,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6696,000 ns/op
crc32·p0.999:  9770,864 ns/op
crc32·p0.9999: 16031,210 ns/op
crc32·p1.00:   51712,000 ns/op

Iteration   5: 6215,161 ±(99.9%) 2,201 ns/op
crc32·p0.00:   5856,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6688,000 ns/op
crc32·p0.999:  9424,000 ns/op
crc32·p0.9999: 13026,808 ns/op
crc32·p1.00:   25600,000 ns/op


# Run progress: 74,83% complete, ETA 03:50:32
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 6137,437 ±(99.9%) 4,949 ns/op
# Warmup Iteration   2: 6193,249 ±(99.9%) 2,572 ns/op
# Warmup Iteration   3: 6224,362 ±(99.9%) 2,936 ns/op
# Warmup Iteration   4: 6208,917 ±(99.9%) 2,523 ns/op
# Warmup Iteration   5: 6213,605 ±(99.9%) 2,581 ns/op
Iteration   1: 6206,426 ±(99.9%) 2,630 ns/op
crc32·p0.00:   5856,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6720,000 ns/op
crc32·p0.999:  9962,320 ns/op
crc32·p0.9999: 16716,384 ns/op
crc32·p1.00:   52992,000 ns/op

Iteration   2: 6240,932 ±(99.9%) 3,376 ns/op
crc32·p0.00:   5808,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6408,000 ns/op
crc32·p0.95:   6440,000 ns/op
crc32·p0.99:   7672,000 ns/op
crc32·p0.999:  11398,432 ns/op
crc32·p0.9999: 23331,891 ns/op
crc32·p1.00:   46080,000 ns/op

Iteration   3: 6221,343 ±(99.9%) 2,262 ns/op
crc32·p0.00:   6016,000 ns/op
crc32·p0.50:   6216,000 ns/op
crc32·p0.90:   6400,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6696,000 ns/op
crc32·p0.999:  9584,000 ns/op
crc32·p0.9999: 13326,592 ns/op
crc32·p1.00:   21344,000 ns/op

Iteration   4: 6203,745 ±(99.9%) 2,272 ns/op
crc32·p0.00:   6008,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6416,000 ns/op
crc32·p0.99:   6696,000 ns/op
crc32·p0.999:  9584,000 ns/op
crc32·p0.9999: 13718,544 ns/op
crc32·p1.00:   19776,000 ns/op

Iteration   5: 6199,251 ±(99.9%) 2,392 ns/op
crc32·p0.00:   6000,000 ns/op
crc32·p0.50:   6208,000 ns/op
crc32·p0.90:   6392,000 ns/op
crc32·p0.95:   6408,000 ns/op
crc32·p0.99:   6720,000 ns/op
crc32·p0.999:  9696,000 ns/op
crc32·p0.9999: 14950,182 ns/op
crc32·p1.00:   26944,000 ns/op



Result "org.example.Main.crc32":
N = 1991926
mean =   6214,500 ±(99.9%) 0,781 ns/op

Histogram, ns/op:
[    0,000,  5000,000) = 0
[ 5000,000, 10000,000) = 1990201
[10000,000, 15000,000) = 1527
[15000,000, 20000,000) = 141
[20000,000, 25000,000) = 31
[25000,000, 30000,000) = 18
[30000,000, 35000,000) = 3
[35000,000, 40000,000) = 1
[40000,000, 45000,000) = 1
[45000,000, 50000,000) = 1
[50000,000, 55000,000) = 2

Percentiles, ns/op:
p(0,0000) =   5808,000 ns/op
p(50,0000) =   6216,000 ns/op
p(90,0000) =   6392,000 ns/op
p(95,0000) =   6416,000 ns/op
p(99,0000) =   6720,000 ns/op
p(99,9000) =   9776,000 ns/op
p(99,9900) =  14988,917 ns/op
p(99,9990) =  26412,917 ns/op
p(99,9999) =  51722,333 ns/op
p(100,0000) =  52992,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 4M)

# Run progress: 75,00% complete, ETA 03:49:03
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 51450,099 ±(99.9%) 15,393 ns/op
# Warmup Iteration   2: 51349,252 ±(99.9%) 12,647 ns/op
# Warmup Iteration   3: 51609,789 ±(99.9%) 11,629 ns/op
# Warmup Iteration   4: 51460,831 ±(99.9%) 12,304 ns/op
# Warmup Iteration   5: 51137,110 ±(99.9%) 17,195 ns/op
Iteration   1: 51258,476 ±(99.9%) 12,055 ns/op
crc32·p0.00:   48832,000 ns/op
crc32·p0.50:   50944,000 ns/op
crc32·p0.90:   51968,000 ns/op
crc32·p0.95:   54720,000 ns/op
crc32·p0.99:   56576,000 ns/op
crc32·p0.999:  67990,400 ns/op
crc32·p0.9999: 72704,000 ns/op
crc32·p1.00:   241152,000 ns/op

Iteration   2: 50951,666 ±(99.9%) 12,553 ns/op
crc32·p0.00:   48640,000 ns/op
crc32·p0.50:   50752,000 ns/op
crc32·p0.90:   51648,000 ns/op
crc32·p0.95:   54208,000 ns/op
crc32·p0.99:   56768,000 ns/op
crc32·p0.999:  68352,000 ns/op
crc32·p0.9999: 73344,000 ns/op
crc32·p1.00:   100480,000 ns/op

Iteration   3: 50555,477 ±(99.9%) 12,454 ns/op
crc32·p0.00:   48064,000 ns/op
crc32·p0.50:   50048,000 ns/op
crc32·p0.90:   51328,000 ns/op
crc32·p0.95:   53952,000 ns/op
crc32·p0.99:   57088,000 ns/op
crc32·p0.999:  68352,000 ns/op
crc32·p0.9999: 75807,590 ns/op
crc32·p1.00:   92928,000 ns/op

Iteration   4: 51282,571 ±(99.9%) 14,783 ns/op
crc32·p0.00:   47744,000 ns/op
crc32·p0.50:   51072,000 ns/op
crc32·p0.90:   52096,000 ns/op
crc32·p0.95:   54592,000 ns/op
crc32·p0.99:   57728,000 ns/op
crc32·p0.999:  72737,408 ns/op
crc32·p0.9999: 101126,682 ns/op
crc32·p1.00:   162816,000 ns/op

Iteration   5: 51382,957 ±(99.9%) 10,278 ns/op
crc32·p0.00:   49664,000 ns/op
crc32·p0.50:   51072,000 ns/op
crc32·p0.90:   52096,000 ns/op
crc32·p0.95:   54400,000 ns/op
crc32·p0.99:   56384,000 ns/op
crc32·p0.999:  66304,000 ns/op
crc32·p0.9999: 72264,051 ns/op
crc32·p1.00:   78720,000 ns/op


# Run progress: 75,17% complete, ETA 03:47:34
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 51539,572 ±(99.9%) 12,687 ns/op
# Warmup Iteration   2: 51289,633 ±(99.9%) 12,883 ns/op
# Warmup Iteration   3: 50696,840 ±(99.9%) 15,734 ns/op
# Warmup Iteration   4: 50555,993 ±(99.9%) 11,948 ns/op
# Warmup Iteration   5: 50442,813 ±(99.9%) 10,937 ns/op
Iteration   1: 50801,015 ±(99.9%) 12,509 ns/op
crc32·p0.00:   47168,000 ns/op
crc32·p0.50:   50240,000 ns/op
crc32·p0.90:   51776,000 ns/op
crc32·p0.95:   54080,000 ns/op
crc32·p0.99:   56709,120 ns/op
crc32·p0.999:  68736,000 ns/op
crc32·p0.9999: 77184,000 ns/op
crc32·p1.00:   99456,000 ns/op

Iteration   2: 51018,685 ±(99.9%) 16,129 ns/op
crc32·p0.00:   48448,000 ns/op
crc32·p0.50:   50624,000 ns/op
crc32·p0.90:   52032,000 ns/op
crc32·p0.95:   54272,000 ns/op
crc32·p0.99:   58176,000 ns/op
crc32·p0.999:  73088,000 ns/op
crc32·p0.9999: 109858,970 ns/op
crc32·p1.00:   178688,000 ns/op

Iteration   3: 50619,655 ±(99.9%) 12,660 ns/op
crc32·p0.00:   48128,000 ns/op
crc32·p0.50:   50176,000 ns/op
crc32·p0.90:   51264,000 ns/op
crc32·p0.95:   54016,000 ns/op
crc32·p0.99:   56640,000 ns/op
crc32·p0.999:  68992,000 ns/op
crc32·p0.9999: 78963,622 ns/op
crc32·p1.00:   124672,000 ns/op

Iteration   4: 51311,882 ±(99.9%) 12,288 ns/op
crc32·p0.00:   48256,000 ns/op
crc32·p0.50:   51072,000 ns/op
crc32·p0.90:   51776,000 ns/op
crc32·p0.95:   54720,000 ns/op
crc32·p0.99:   56960,000 ns/op
crc32·p0.999:  68864,000 ns/op
crc32·p0.9999: 74624,000 ns/op
crc32·p1.00:   152576,000 ns/op

Iteration   5: 50989,605 ±(99.9%) 12,147 ns/op
crc32·p0.00:   48448,000 ns/op
crc32·p0.50:   50752,000 ns/op
crc32·p0.90:   51712,000 ns/op
crc32·p0.95:   54208,000 ns/op
crc32·p0.99:   56640,000 ns/op
crc32·p0.999:  67584,000 ns/op
crc32·p0.9999: 74624,000 ns/op
crc32·p1.00:   165376,000 ns/op


# Run progress: 75,33% complete, ETA 03:46:06
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 51496,689 ±(99.9%) 16,612 ns/op
# Warmup Iteration   2: 51411,349 ±(99.9%) 11,563 ns/op
# Warmup Iteration   3: 51213,709 ±(99.9%) 12,215 ns/op
# Warmup Iteration   4: 50481,978 ±(99.9%) 11,323 ns/op
# Warmup Iteration   5: 50873,019 ±(99.9%) 16,124 ns/op
Iteration   1: 50540,162 ±(99.9%) 12,392 ns/op
crc32·p0.00:   49024,000 ns/op
crc32·p0.50:   50176,000 ns/op
crc32·p0.90:   50560,000 ns/op
crc32·p0.95:   54016,000 ns/op
crc32·p0.99:   56768,000 ns/op
crc32·p0.999:  68224,000 ns/op
crc32·p0.9999: 75678,912 ns/op
crc32·p1.00:   138240,000 ns/op

Iteration   2: 50537,611 ±(99.9%) 11,539 ns/op
crc32·p0.00:   48960,000 ns/op
crc32·p0.50:   50176,000 ns/op
crc32·p0.90:   51264,000 ns/op
crc32·p0.95:   53888,000 ns/op
crc32·p0.99:   55808,000 ns/op
crc32·p0.999:  68480,000 ns/op
crc32·p0.9999: 73856,000 ns/op
crc32·p1.00:   79232,000 ns/op

Iteration   3: 50961,947 ±(99.9%) 12,141 ns/op
crc32·p0.00:   49344,000 ns/op
crc32·p0.50:   50368,000 ns/op
crc32·p0.90:   51712,000 ns/op
crc32·p0.95:   54208,000 ns/op
crc32·p0.99:   56576,000 ns/op
crc32·p0.999:  68352,000 ns/op
crc32·p0.9999: 74496,000 ns/op
crc32·p1.00:   99456,000 ns/op

Iteration   4: 51316,856 ±(99.9%) 16,976 ns/op
crc32·p0.00:   49280,000 ns/op
crc32·p0.50:   51136,000 ns/op
crc32·p0.90:   52224,000 ns/op
crc32·p0.95:   54720,000 ns/op
crc32·p0.99:   58176,000 ns/op
crc32·p0.999:  75185,920 ns/op
crc32·p0.9999: 120369,920 ns/op
crc32·p1.00:   176384,000 ns/op

Iteration   5: 51652,276 ±(99.9%) 11,524 ns/op
crc32·p0.00:   50176,000 ns/op
crc32·p0.50:   51264,000 ns/op
crc32·p0.90:   51840,000 ns/op
crc32·p0.95:   55040,000 ns/op
crc32·p0.99:   57152,000 ns/op
crc32·p0.999:  68992,000 ns/op
crc32·p0.9999: 74709,082 ns/op
crc32·p1.00:   82688,000 ns/op


# Run progress: 75,50% complete, ETA 03:44:37
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 51342,810 ±(99.9%) 12,345 ns/op
# Warmup Iteration   2: 51313,414 ±(99.9%) 11,895 ns/op
# Warmup Iteration   3: 51314,579 ±(99.9%) 15,197 ns/op
# Warmup Iteration   4: 50451,136 ±(99.9%) 11,190 ns/op
# Warmup Iteration   5: 51044,264 ±(99.9%) 11,853 ns/op
Iteration   1: 50648,742 ±(99.9%) 11,686 ns/op
crc32·p0.00:   48896,000 ns/op
crc32·p0.50:   50176,000 ns/op
crc32·p0.90:   51392,000 ns/op
crc32·p0.95:   53952,000 ns/op
crc32·p0.99:   56000,000 ns/op
crc32·p0.999:  68608,000 ns/op
crc32·p0.9999: 74496,000 ns/op
crc32·p1.00:   88832,000 ns/op

Iteration   2: 51013,458 ±(99.9%) 14,525 ns/op
crc32·p0.00:   47872,000 ns/op
crc32·p0.50:   50752,000 ns/op
crc32·p0.90:   51712,000 ns/op
crc32·p0.95:   54336,000 ns/op
crc32·p0.99:   57856,000 ns/op
crc32·p0.999:  71424,000 ns/op
crc32·p0.9999: 93824,000 ns/op
crc32·p1.00:   129536,000 ns/op

Iteration   3: 51429,539 ±(99.9%) 11,572 ns/op
crc32·p0.00:   49792,000 ns/op
crc32·p0.50:   51072,000 ns/op
crc32·p0.90:   51584,000 ns/op
crc32·p0.95:   55040,000 ns/op
crc32·p0.99:   56832,000 ns/op
crc32·p0.999:  68608,000 ns/op
crc32·p0.9999: 74240,000 ns/op
crc32·p1.00:   79232,000 ns/op

Iteration   4: 51352,072 ±(99.9%) 11,237 ns/op
crc32·p0.00:   49152,000 ns/op
crc32·p0.50:   51072,000 ns/op
crc32·p0.90:   51520,000 ns/op
crc32·p0.95:   54848,000 ns/op
crc32·p0.99:   56384,000 ns/op
crc32·p0.999:  68608,000 ns/op
crc32·p0.9999: 73229,773 ns/op
crc32·p1.00:   79744,000 ns/op

Iteration   5: 50817,264 ±(99.9%) 12,635 ns/op
crc32·p0.00:   48384,000 ns/op
crc32·p0.50:   50240,000 ns/op
crc32·p0.90:   51456,000 ns/op
crc32·p0.95:   54144,000 ns/op
crc32·p0.99:   57152,000 ns/op
crc32·p0.999:  68864,000 ns/op
crc32·p0.9999: 75692,582 ns/op
crc32·p1.00:   92544,000 ns/op


# Run progress: 75,67% complete, ETA 03:43:08
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 50708,941 ±(99.9%) 17,539 ns/op
# Warmup Iteration   2: 51060,098 ±(99.9%) 13,225 ns/op
# Warmup Iteration   3: 50970,968 ±(99.9%) 12,187 ns/op
# Warmup Iteration   4: 50518,634 ±(99.9%) 11,309 ns/op
# Warmup Iteration   5: 51318,370 ±(99.9%) 17,331 ns/op
Iteration   1: 50715,908 ±(99.9%) 12,604 ns/op
crc32·p0.00:   48576,000 ns/op
crc32·p0.50:   50176,000 ns/op
crc32·p0.90:   51520,000 ns/op
crc32·p0.95:   54016,000 ns/op
crc32·p0.99:   56704,000 ns/op
crc32·p0.999:  68224,000 ns/op
crc32·p0.9999: 88636,314 ns/op
crc32·p1.00:   124672,000 ns/op

Iteration   2: 50665,738 ±(99.9%) 11,623 ns/op
crc32·p0.00:   48128,000 ns/op
crc32·p0.50:   50176,000 ns/op
crc32·p0.90:   51264,000 ns/op
crc32·p0.95:   54016,000 ns/op
crc32·p0.99:   56256,000 ns/op
crc32·p0.999:  67712,000 ns/op
crc32·p0.9999: 74536,755 ns/op
crc32·p1.00:   89728,000 ns/op

Iteration   3: 50796,423 ±(99.9%) 12,292 ns/op
crc32·p0.00:   48256,000 ns/op
crc32·p0.50:   50240,000 ns/op
crc32·p0.90:   51456,000 ns/op
crc32·p0.95:   54144,000 ns/op
crc32·p0.99:   56896,000 ns/op
crc32·p0.999:  68096,000 ns/op
crc32·p0.9999: 76503,091 ns/op
crc32·p1.00:   112896,000 ns/op

Iteration   4: 51095,115 ±(99.9%) 11,896 ns/op
crc32·p0.00:   48320,000 ns/op
crc32·p0.50:   50880,000 ns/op
crc32·p0.90:   51968,000 ns/op
crc32·p0.95:   54144,000 ns/op
crc32·p0.99:   57088,000 ns/op
crc32·p0.999:  68096,000 ns/op
crc32·p0.9999: 74100,224 ns/op
crc32·p1.00:   105472,000 ns/op

Iteration   5: 51275,275 ±(99.9%) 15,617 ns/op
crc32·p0.00:   48960,000 ns/op
crc32·p0.50:   50944,000 ns/op
crc32·p0.90:   51968,000 ns/op
crc32·p0.95:   54912,000 ns/op
crc32·p0.99:   57984,000 ns/op
crc32·p0.999:  73088,000 ns/op
crc32·p0.9999: 111494,042 ns/op
crc32·p1.00:   168192,000 ns/op



Result "org.example.Main.crc32":
N = 1958928
mean =  50979,429 ±(99.9%) 4,050 ns/op

Histogram, ns/op:
[     0,000,  12500,000) = 0
[ 12500,000,  25000,000) = 0
[ 25000,000,  37500,000) = 0
[ 37500,000,  50000,000) = 281542
[ 50000,000,  62500,000) = 1670703
[ 62500,000,  75000,000) = 6237
[ 75000,000,  87500,000) = 283
[ 87500,000, 100000,000) = 111
[100000,000, 112500,000) = 27
[112500,000, 125000,000) = 15
[125000,000, 137500,000) = 5
[137500,000, 150000,000) = 1
[150000,000, 162500,000) = 2
[162500,000, 175000,000) = 2
[175000,000, 187500,000) = 0

Percentiles, ns/op:
p(0,0000) =  47872,000 ns/op
p(50,0000) =  50752,000 ns/op
p(90,0000) =  51520,000 ns/op
p(95,0000) =  54272,000 ns/op
p(99,0000) =  56896,000 ns/op
p(99,9000) =  68736,000 ns/op
p(99,9900) =  85376,000 ns/op
p(99,9990) = 117691,425 ns/op
p(99,9999) = 164264,227 ns/op
p(100,0000) = 168192,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 20M)

# Run progress: 75,83% complete, ETA 03:41:39
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 260277,686 ±(99.9%) 111,065 ns/op
# Warmup Iteration   2: 256448,805 ±(99.9%) 95,343 ns/op
# Warmup Iteration   3: 256525,361 ±(99.9%) 94,777 ns/op
# Warmup Iteration   4: 261935,106 ±(99.9%) 502,685 ns/op
# Warmup Iteration   5: 258549,017 ±(99.9%) 101,838 ns/op
Iteration   1: 260919,553 ±(99.9%) 94,685 ns/op
crc32·p0.00:   248576,000 ns/op
crc32·p0.50:   259328,000 ns/op
crc32·p0.90:   265216,000 ns/op
crc32·p0.95:   268288,000 ns/op
crc32·p0.99:   283648,000 ns/op
crc32·p0.999:  312320,000 ns/op
crc32·p0.9999: 378979,072 ns/op
crc32·p1.00:   441856,000 ns/op

Iteration   2: 259182,084 ±(99.9%) 130,785 ns/op
crc32·p0.00:   249856,000 ns/op
crc32·p0.50:   258048,000 ns/op
crc32·p0.90:   264704,000 ns/op
crc32·p0.95:   269312,000 ns/op
crc32·p0.99:   287744,000 ns/op
crc32·p0.999:  337636,864 ns/op
crc32·p0.9999: 438076,160 ns/op
crc32·p1.00:   608256,000 ns/op

Iteration   3: 259767,303 ±(99.9%) 434,012 ns/op
crc32·p0.00:   247296,000 ns/op
crc32·p0.50:   255488,000 ns/op
crc32·p0.90:   265216,000 ns/op
crc32·p0.95:   276992,000 ns/op
crc32·p0.99:   321024,000 ns/op
crc32·p0.999:  595013,632 ns/op
crc32·p0.9999: 1248953,958 ns/op
crc32·p1.00:   1564672,000 ns/op

Iteration   4: 257768,265 ±(99.9%) 104,260 ns/op
crc32·p0.00:   249344,000 ns/op
crc32·p0.50:   256768,000 ns/op
crc32·p0.90:   263680,000 ns/op
crc32·p0.95:   266752,000 ns/op
crc32·p0.99:   284160,000 ns/op
crc32·p0.999:  313584,640 ns/op
crc32·p0.9999: 343804,928 ns/op
crc32·p1.00:   380928,000 ns/op

Iteration   5: 259135,112 ±(99.9%) 110,700 ns/op
crc32·p0.00:   249856,000 ns/op
crc32·p0.50:   258304,000 ns/op
crc32·p0.90:   265216,000 ns/op
crc32·p0.95:   268800,000 ns/op
crc32·p0.99:   286208,000 ns/op
crc32·p0.999:  315392,000 ns/op
crc32·p0.9999: 352845,824 ns/op
crc32·p1.00:   357376,000 ns/op


# Run progress: 76,00% complete, ETA 03:40:10
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 259309,803 ±(99.9%) 108,900 ns/op
# Warmup Iteration   2: 263254,680 ±(99.9%) 454,973 ns/op
# Warmup Iteration   3: 260685,632 ±(99.9%) 101,132 ns/op
# Warmup Iteration   4: 261924,838 ±(99.9%) 162,130 ns/op
# Warmup Iteration   5: 263348,267 ±(99.9%) 91,390 ns/op
Iteration   1: 264738,940 ±(99.9%) 631,651 ns/op
crc32·p0.00:   247808,000 ns/op
crc32·p0.50:   260352,000 ns/op
crc32·p0.90:   269312,000 ns/op
crc32·p0.95:   281600,000 ns/op
crc32·p0.99:   347136,000 ns/op
crc32·p0.999:  765587,456 ns/op
crc32·p0.9999: 1471783,731 ns/op
crc32·p1.00:   3137536,000 ns/op

Iteration   2: 261327,603 ±(99.9%) 97,687 ns/op
crc32·p0.00:   250880,000 ns/op
crc32·p0.50:   260352,000 ns/op
crc32·p0.90:   266240,000 ns/op
crc32·p0.95:   268800,000 ns/op
crc32·p0.99:   285696,000 ns/op
crc32·p0.999:  314760,192 ns/op
crc32·p0.9999: 344004,096 ns/op
crc32·p1.00:   372736,000 ns/op

Iteration   3: 258992,345 ±(99.9%) 100,036 ns/op
crc32·p0.00:   248576,000 ns/op
crc32·p0.50:   257536,000 ns/op
crc32·p0.90:   264192,000 ns/op
crc32·p0.95:   267264,000 ns/op
crc32·p0.99:   283648,000 ns/op
crc32·p0.999:  315095,040 ns/op
crc32·p0.9999: 374332,416 ns/op
crc32·p1.00:   398336,000 ns/op

Iteration   4: 262371,489 ±(99.9%) 102,553 ns/op
crc32·p0.00:   251392,000 ns/op
crc32·p0.50:   261632,000 ns/op
crc32·p0.90:   268288,000 ns/op
crc32·p0.95:   270848,000 ns/op
crc32·p0.99:   285696,000 ns/op
crc32·p0.999:  311766,528 ns/op
crc32·p0.9999: 358379,264 ns/op
crc32·p1.00:   417792,000 ns/op

Iteration   5: 265326,412 ±(99.9%) 393,606 ns/op
crc32·p0.00:   249600,000 ns/op
crc32·p0.50:   262144,000 ns/op
crc32·p0.90:   270848,000 ns/op
crc32·p0.95:   280704,000 ns/op
crc32·p0.99:   329216,000 ns/op
crc32·p0.999:  620897,280 ns/op
crc32·p0.9999: 1054565,376 ns/op
crc32·p1.00:   1519616,000 ns/op


# Run progress: 76,17% complete, ETA 03:38:41
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 258799,597 ±(99.9%) 143,912 ns/op
# Warmup Iteration   2: 258227,645 ±(99.9%) 93,344 ns/op
# Warmup Iteration   3: 262015,906 ±(99.9%) 115,200 ns/op
# Warmup Iteration   4: 264516,729 ±(99.9%) 448,854 ns/op
# Warmup Iteration   5: 259336,857 ±(99.9%) 105,158 ns/op
Iteration   1: 259911,841 ±(99.9%) 99,905 ns/op
crc32·p0.00:   249344,000 ns/op
crc32·p0.50:   259584,000 ns/op
crc32·p0.90:   265728,000 ns/op
crc32·p0.95:   268800,000 ns/op
crc32·p0.99:   284160,000 ns/op
crc32·p0.999:  308509,184 ns/op
crc32·p0.9999: 338205,184 ns/op
crc32·p1.00:   352768,000 ns/op

Iteration   2: 258314,066 ±(99.9%) 94,525 ns/op
crc32·p0.00:   250112,000 ns/op
crc32·p0.50:   256768,000 ns/op
crc32·p0.90:   262656,000 ns/op
crc32·p0.95:   265728,000 ns/op
crc32·p0.99:   282112,000 ns/op
crc32·p0.999:  312132,608 ns/op
crc32·p0.9999: 352902,861 ns/op
crc32·p1.00:   371712,000 ns/op

Iteration   3: 261960,771 ±(99.9%) 419,809 ns/op
crc32·p0.00:   248576,000 ns/op
crc32·p0.50:   257536,000 ns/op
crc32·p0.90:   267776,000 ns/op
crc32·p0.95:   280064,000 ns/op
crc32·p0.99:   338728,960 ns/op
crc32·p0.999:  584273,920 ns/op
crc32·p0.9999: 1099608,883 ns/op
crc32·p1.00:   1302528,000 ns/op

Iteration   4: 258239,108 ±(99.9%) 90,690 ns/op
crc32·p0.00:   248576,000 ns/op
crc32·p0.50:   256768,000 ns/op
crc32·p0.90:   262656,000 ns/op
crc32·p0.95:   266240,000 ns/op
crc32·p0.99:   281600,000 ns/op
crc32·p0.999:  308224,000 ns/op
crc32·p0.9999: 342707,610 ns/op
crc32·p1.00:   359424,000 ns/op

Iteration   5: 258476,044 ±(99.9%) 90,962 ns/op
crc32·p0.00:   250624,000 ns/op
crc32·p0.50:   257024,000 ns/op
crc32·p0.90:   263168,000 ns/op
crc32·p0.95:   266240,000 ns/op
crc32·p0.99:   281600,000 ns/op
crc32·p0.999:  306013,184 ns/op
crc32·p0.9999: 330689,229 ns/op
crc32·p1.00:   344064,000 ns/op


# Run progress: 76,33% complete, ETA 03:37:12
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 259699,754 ±(99.9%) 125,819 ns/op
# Warmup Iteration   2: 260854,616 ±(99.9%) 429,688 ns/op
# Warmup Iteration   3: 260887,253 ±(99.9%) 113,147 ns/op
# Warmup Iteration   4: 257479,229 ±(99.9%) 90,556 ns/op
# Warmup Iteration   5: 257763,164 ±(99.9%) 93,486 ns/op
Iteration   1: 262388,678 ±(99.9%) 459,042 ns/op
crc32·p0.00:   246784,000 ns/op
crc32·p0.50:   258560,000 ns/op
crc32·p0.90:   267776,000 ns/op
crc32·p0.95:   279040,000 ns/op
crc32·p0.99:   348277,760 ns/op
crc32·p0.999:  659298,304 ns/op
crc32·p0.9999: 1073545,421 ns/op
crc32·p1.00:   1357824,000 ns/op

Iteration   2: 257947,058 ±(99.9%) 99,238 ns/op
crc32·p0.00:   249600,000 ns/op
crc32·p0.50:   256256,000 ns/op
crc32·p0.90:   263168,000 ns/op
crc32·p0.95:   267264,000 ns/op
crc32·p0.99:   282624,000 ns/op
crc32·p0.999:  307712,000 ns/op
crc32·p0.9999: 349896,448 ns/op
crc32·p1.00:   365568,000 ns/op

Iteration   3: 263047,978 ±(99.9%) 108,353 ns/op
crc32·p0.00:   249344,000 ns/op
crc32·p0.50:   261120,000 ns/op
crc32·p0.90:   267776,000 ns/op
crc32·p0.95:   270848,000 ns/op
crc32·p0.99:   286720,000 ns/op
crc32·p0.999:  316428,288 ns/op
crc32·p0.9999: 477714,432 ns/op
crc32·p1.00:   503296,000 ns/op

Iteration   4: 259514,426 ±(99.9%) 100,310 ns/op
crc32·p0.00:   249856,000 ns/op
crc32·p0.50:   259328,000 ns/op
crc32·p0.90:   266240,000 ns/op
crc32·p0.95:   268800,000 ns/op
crc32·p0.99:   283136,000 ns/op
crc32·p0.999:  303616,000 ns/op
crc32·p0.9999: 329881,600 ns/op
crc32·p1.00:   336384,000 ns/op

Iteration   5: 260999,481 ±(99.9%) 415,104 ns/op
crc32·p0.00:   249600,000 ns/op
crc32·p0.50:   256512,000 ns/op
crc32·p0.90:   267264,000 ns/op
crc32·p0.95:   280064,000 ns/op
crc32·p0.99:   340193,280 ns/op
crc32·p0.999:  552501,248 ns/op
crc32·p0.9999: 916405,658 ns/op
crc32·p1.00:   2686976,000 ns/op


# Run progress: 76,50% complete, ETA 03:35:43
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 262024,209 ±(99.9%) 133,396 ns/op
# Warmup Iteration   2: 259800,274 ±(99.9%) 110,179 ns/op
# Warmup Iteration   3: 260489,200 ±(99.9%) 105,723 ns/op
# Warmup Iteration   4: 263358,107 ±(99.9%) 487,242 ns/op
# Warmup Iteration   5: 259566,070 ±(99.9%) 88,759 ns/op
Iteration   1: 261682,768 ±(99.9%) 101,528 ns/op
crc32·p0.00:   252160,000 ns/op
crc32·p0.50:   261376,000 ns/op
crc32·p0.90:   268288,000 ns/op
crc32·p0.95:   270848,000 ns/op
crc32·p0.99:   284160,000 ns/op
crc32·p0.999:  311204,864 ns/op
crc32·p0.9999: 336477,286 ns/op
crc32·p1.00:   351232,000 ns/op

Iteration   2: 263968,509 ±(99.9%) 92,037 ns/op
crc32·p0.00:   251904,000 ns/op
crc32·p0.50:   262656,000 ns/op
crc32·p0.90:   269312,000 ns/op
crc32·p0.95:   271872,000 ns/op
crc32·p0.99:   283136,000 ns/op
crc32·p0.999:  312320,000 ns/op
crc32·p0.9999: 345166,336 ns/op
crc32·p1.00:   373760,000 ns/op

Iteration   3: 266442,823 ±(99.9%) 351,365 ns/op
crc32·p0.00:   252672,000 ns/op
crc32·p0.50:   263680,000 ns/op
crc32·p0.90:   270848,000 ns/op
crc32·p0.95:   278528,000 ns/op
crc32·p0.99:   320547,840 ns/op
crc32·p0.999:  566791,168 ns/op
crc32·p0.9999: 1056945,766 ns/op
crc32·p1.00:   1425408,000 ns/op

Iteration   4: 263233,083 ±(99.9%) 119,143 ns/op
crc32·p0.00:   249344,000 ns/op
crc32·p0.50:   262656,000 ns/op
crc32·p0.90:   269312,000 ns/op
crc32·p0.95:   272384,000 ns/op
crc32·p0.99:   288256,000 ns/op
crc32·p0.999:  326683,136 ns/op
crc32·p0.9999: 420460,544 ns/op
crc32·p1.00:   440832,000 ns/op

Iteration   5: 262294,152 ±(99.9%) 103,667 ns/op
crc32·p0.00:   251136,000 ns/op
crc32·p0.50:   261888,000 ns/op
crc32·p0.90:   268288,000 ns/op
crc32·p0.95:   270848,000 ns/op
crc32·p0.99:   286208,000 ns/op
crc32·p0.999:  309666,816 ns/op
crc32·p0.9999: 345455,667 ns/op
crc32·p1.00:   378880,000 ns/op



Result "org.example.Main.crc32":
N = 381112
mean = 262132,704 ±(99.9%) 77,028 ns/op

Histogram, ns/op:
[      0,000,  250000,000) = 15
[ 250000,000,  500000,000) = 380896
[ 500000,000,  750000,000) = 163
[ 750000,000, 1000000,000) = 28
[1000000,000, 1250000,000) = 6
[1250000,000, 1500000,000) = 3
[1500000,000, 1750000,000) = 0
[1750000,000, 2000000,000) = 0
[2000000,000, 2250000,000) = 0
[2250000,000, 2500000,000) = 0
[2500000,000, 2750000,000) = 1

Percentiles, ns/op:
p(0,0000) = 246784,000 ns/op
p(50,0000) = 261120,000 ns/op
p(90,0000) = 268288,000 ns/op
p(95,0000) = 272384,000 ns/op
p(99,0000) = 294912,000 ns/op
p(99,9000) = 425984,000 ns/op
p(99,9900) = 750818,202 ns/op
p(99,9990) = 1354501,612 ns/op
p(99,9999) = 2686976,000 ns/op
p(100,0000) = 2686976,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 64K)

# Run progress: 76,67% complete, ETA 03:34:14
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 92829,386 ±(99.9%) 40,856 ns/op
# Warmup Iteration   2: 92810,409 ±(99.9%) 13,642 ns/op
# Warmup Iteration   3: 92574,560 ±(99.9%) 14,148 ns/op
# Warmup Iteration   4: 92406,664 ±(99.9%) 11,615 ns/op
# Warmup Iteration   5: 92437,670 ±(99.9%) 15,016 ns/op
Iteration   1: 92412,037 ±(99.9%) 11,502 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99200,000 ns/op
crc64_ecma·p0.9999: 105600,000 ns/op
crc64_ecma·p1.00:   117504,000 ns/op

Iteration   2: 92761,097 ±(99.9%) 17,177 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   95232,000 ns/op
crc64_ecma·p0.95:   96128,000 ns/op
crc64_ecma·p0.99:   98944,000 ns/op
crc64_ecma·p0.999:  102912,000 ns/op
crc64_ecma·p0.9999: 130193,472 ns/op
crc64_ecma·p1.00:   155136,000 ns/op

Iteration   3: 92370,534 ±(99.9%) 11,067 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99200,000 ns/op
crc64_ecma·p0.9999: 105751,232 ns/op
crc64_ecma·p1.00:   111104,000 ns/op

Iteration   4: 92374,444 ±(99.9%) 11,180 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   94976,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 105460,352 ns/op
crc64_ecma·p1.00:   115072,000 ns/op

Iteration   5: 92436,929 ±(99.9%) 12,432 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99584,000 ns/op
crc64_ecma·p0.9999: 110938,598 ns/op
crc64_ecma·p1.00:   161792,000 ns/op


# Run progress: 76,83% complete, ETA 03:32:45
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 93301,394 ±(99.9%) 44,922 ns/op
# Warmup Iteration   2: 92748,302 ±(99.9%) 13,119 ns/op
# Warmup Iteration   3: 92537,360 ±(99.9%) 14,475 ns/op
# Warmup Iteration   4: 92459,796 ±(99.9%) 12,892 ns/op
# Warmup Iteration   5: 92823,920 ±(99.9%) 18,782 ns/op
Iteration   1: 92394,404 ±(99.9%) 11,303 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 106765,466 ns/op
crc64_ecma·p1.00:   122880,000 ns/op

Iteration   2: 92403,948 ±(99.9%) 11,891 ns/op
crc64_ecma·p0.00:   91392,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 116679,270 ns/op
crc64_ecma·p1.00:   137728,000 ns/op

Iteration   3: 92589,809 ±(99.9%) 12,776 ns/op
crc64_ecma·p0.00:   91520,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95616,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99200,000 ns/op
crc64_ecma·p0.9999: 105349,120 ns/op
crc64_ecma·p1.00:   139776,000 ns/op

Iteration   4: 92897,783 ±(99.9%) 18,493 ns/op
crc64_ecma·p0.00:   91520,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   95360,000 ns/op
crc64_ecma·p0.95:   96128,000 ns/op
crc64_ecma·p0.99:   98944,000 ns/op
crc64_ecma·p0.999:  103040,000 ns/op
crc64_ecma·p0.9999: 138496,000 ns/op
crc64_ecma·p1.00:   152576,000 ns/op

Iteration   5: 92607,358 ±(99.9%) 14,591 ns/op
crc64_ecma·p0.00:   91520,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   94848,000 ns/op
crc64_ecma·p0.95:   95616,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99456,000 ns/op
crc64_ecma·p0.9999: 139520,000 ns/op
crc64_ecma·p1.00:   159744,000 ns/op


# Run progress: 77,00% complete, ETA 03:31:15
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 93036,213 ±(99.9%) 43,122 ns/op
# Warmup Iteration   2: 92953,969 ±(99.9%) 16,243 ns/op
# Warmup Iteration   3: 92747,587 ±(99.9%) 17,618 ns/op
# Warmup Iteration   4: 92365,342 ±(99.9%) 11,230 ns/op
# Warmup Iteration   5: 92547,283 ±(99.9%) 13,408 ns/op
Iteration   1: 92382,868 ±(99.9%) 11,319 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   94976,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99200,000 ns/op
crc64_ecma·p0.9999: 110221,773 ns/op
crc64_ecma·p1.00:   125312,000 ns/op

Iteration   2: 92838,279 ±(99.9%) 16,285 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   95232,000 ns/op
crc64_ecma·p0.95:   96256,000 ns/op
crc64_ecma·p0.99:   98944,000 ns/op
crc64_ecma·p0.999:  102190,976 ns/op
crc64_ecma·p0.9999: 113155,059 ns/op
crc64_ecma·p1.00:   135680,000 ns/op

Iteration   3: 92442,975 ±(99.9%) 12,682 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99840,000 ns/op
crc64_ecma·p0.9999: 123256,320 ns/op
crc64_ecma·p1.00:   141312,000 ns/op

Iteration   4: 92630,921 ±(99.9%) 14,459 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   94848,000 ns/op
crc64_ecma·p0.95:   96000,000 ns/op
crc64_ecma·p0.99:   96640,000 ns/op
crc64_ecma·p0.999:  100480,000 ns/op
crc64_ecma·p0.9999: 137216,000 ns/op
crc64_ecma·p1.00:   153856,000 ns/op

Iteration   5: 92458,590 ±(99.9%) 13,025 ns/op
crc64_ecma·p0.00:   91520,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95232,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99840,000 ns/op
crc64_ecma·p0.9999: 128082,701 ns/op
crc64_ecma·p1.00:   147968,000 ns/op


# Run progress: 77,17% complete, ETA 03:29:46
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 93067,234 ±(99.9%) 45,807 ns/op
# Warmup Iteration   2: 92649,852 ±(99.9%) 11,769 ns/op
# Warmup Iteration   3: 92516,913 ±(99.9%) 15,703 ns/op
# Warmup Iteration   4: 92551,790 ±(99.9%) 14,265 ns/op
# Warmup Iteration   5: 92778,102 ±(99.9%) 16,575 ns/op
Iteration   1: 92440,376 ±(99.9%) 12,337 ns/op
crc64_ecma·p0.00:   91392,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95232,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99827,456 ns/op
crc64_ecma·p0.9999: 111000,346 ns/op
crc64_ecma·p1.00:   145152,000 ns/op

Iteration   2: 92541,609 ±(99.9%) 13,484 ns/op
crc64_ecma·p0.00:   91520,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95488,000 ns/op
crc64_ecma·p0.99:   96512,000 ns/op
crc64_ecma·p0.999:  99840,000 ns/op
crc64_ecma·p0.9999: 121216,000 ns/op
crc64_ecma·p1.00:   149248,000 ns/op

Iteration   3: 92613,186 ±(99.9%) 12,518 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   94848,000 ns/op
crc64_ecma·p0.95:   95616,000 ns/op
crc64_ecma·p0.99:   96512,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 100992,000 ns/op
crc64_ecma·p1.00:   112256,000 ns/op

Iteration   4: 92926,494 ±(99.9%) 15,999 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   95488,000 ns/op
crc64_ecma·p0.95:   96256,000 ns/op
crc64_ecma·p0.99:   98944,000 ns/op
crc64_ecma·p0.999:  101376,000 ns/op
crc64_ecma·p0.9999: 105887,693 ns/op
crc64_ecma·p1.00:   108928,000 ns/op

Iteration   5: 92645,400 ±(99.9%) 12,638 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   94848,000 ns/op
crc64_ecma·p0.95:   95744,000 ns/op
crc64_ecma·p0.99:   96512,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 104704,000 ns/op
crc64_ecma·p1.00:   110464,000 ns/op


# Run progress: 77,33% complete, ETA 03:28:17
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 93102,582 ±(99.9%) 38,815 ns/op
# Warmup Iteration   2: 92860,845 ±(99.9%) 13,877 ns/op
# Warmup Iteration   3: 92939,756 ±(99.9%) 19,031 ns/op
# Warmup Iteration   4: 92469,572 ±(99.9%) 12,637 ns/op
# Warmup Iteration   5: 92386,442 ±(99.9%) 11,250 ns/op
Iteration   1: 92430,201 ±(99.9%) 12,717 ns/op
crc64_ecma·p0.00:   91520,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95104,000 ns/op
crc64_ecma·p0.99:   96256,000 ns/op
crc64_ecma·p0.999:  99584,000 ns/op
crc64_ecma·p0.9999: 135442,816 ns/op
crc64_ecma·p1.00:   157184,000 ns/op

Iteration   2: 92801,505 ±(99.9%) 17,328 ns/op
crc64_ecma·p0.00:   91392,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   95232,000 ns/op
crc64_ecma·p0.95:   96256,000 ns/op
crc64_ecma·p0.99:   99200,000 ns/op
crc64_ecma·p0.999:  102912,000 ns/op
crc64_ecma·p0.9999: 122409,344 ns/op
crc64_ecma·p1.00:   152576,000 ns/op

Iteration   3: 92490,553 ±(99.9%) 12,070 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95232,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 113494,810 ns/op
crc64_ecma·p1.00:   123520,000 ns/op

Iteration   4: 92523,760 ±(99.9%) 15,193 ns/op
crc64_ecma·p0.00:   91392,000 ns/op
crc64_ecma·p0.50:   91904,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95232,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99968,000 ns/op
crc64_ecma·p0.9999: 139673,446 ns/op
crc64_ecma·p1.00:   153344,000 ns/op

Iteration   5: 92593,255 ±(99.9%) 12,209 ns/op
crc64_ecma·p0.00:   91776,000 ns/op
crc64_ecma·p0.50:   92288,000 ns/op
crc64_ecma·p0.90:   94720,000 ns/op
crc64_ecma·p0.95:   95488,000 ns/op
crc64_ecma·p0.99:   96384,000 ns/op
crc64_ecma·p0.999:  99328,000 ns/op
crc64_ecma·p0.9999: 101813,325 ns/op
crc64_ecma·p1.00:   114944,000 ns/op



Result "org.example.Main.crc64_ecma":
N = 1079085
mean =  92600,387 ±(99.9%) 4,376 ns/op

Histogram, ns/op:
[ 90000,000,  95000,000) = 985708
[ 95000,000, 100000,000) = 91697
[100000,000, 105000,000) = 1415
[105000,000, 110000,000) = 102
[110000,000, 115000,000) = 27
[115000,000, 120000,000) = 27
[120000,000, 125000,000) = 37
[125000,000, 130000,000) = 7
[130000,000, 135000,000) = 4
[135000,000, 140000,000) = 42
[140000,000, 145000,000) = 10
[145000,000, 150000,000) = 4
[150000,000, 155000,000) = 3

Percentiles, ns/op:
p(0,0000) =  91392,000 ns/op
p(50,0000) =  92288,000 ns/op
p(90,0000) =  94848,000 ns/op
p(95,0000) =  95744,000 ns/op
p(99,0000) =  96896,000 ns/op
p(99,9000) = 100736,000 ns/op
p(99,9900) = 120064,000 ns/op
p(99,9990) = 143872,000 ns/op
p(99,9999) = 157163,754 ns/op
p(100,0000) = 157184,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 512K)

# Run progress: 77,50% complete, ETA 03:26:47
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 745561,256 ±(99.9%) 504,042 ns/op
# Warmup Iteration   2: 743020,904 ±(99.9%) 223,311 ns/op
# Warmup Iteration   3: 741348,419 ±(99.9%) 95,822 ns/op
# Warmup Iteration   4: 744381,625 ±(99.9%) 331,520 ns/op
# Warmup Iteration   5: 741706,288 ±(99.9%) 166,566 ns/op
Iteration   1: 739200,095 ±(99.9%) 94,433 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   749568,000 ns/op
crc64_ecma·p0.999:  765952,000 ns/op
crc64_ecma·p0.9999: 780951,245 ns/op
crc64_ecma·p1.00:   781312,000 ns/op

Iteration   2: 739230,613 ±(99.9%) 127,783 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   749568,000 ns/op
crc64_ecma·p0.999:  771072,000 ns/op
crc64_ecma·p0.9999: 980043,674 ns/op
crc64_ecma·p1.00:   1054720,000 ns/op

Iteration   3: 738908,953 ±(99.9%) 90,130 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   748544,000 ns/op
crc64_ecma·p0.999:  762820,608 ns/op
crc64_ecma·p0.9999: 777155,891 ns/op
crc64_ecma·p1.00:   778240,000 ns/op

Iteration   4: 738741,798 ±(99.9%) 86,399 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   747520,000 ns/op
crc64_ecma·p0.999:  766976,000 ns/op
crc64_ecma·p0.9999: 775830,323 ns/op
crc64_ecma·p1.00:   776192,000 ns/op

Iteration   5: 739021,012 ±(99.9%) 148,921 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   748544,000 ns/op
crc64_ecma·p0.999:  770532,352 ns/op
crc64_ecma·p0.9999: 1048342,221 ns/op
crc64_ecma·p1.00:   1058816,000 ns/op


# Run progress: 77,67% complete, ETA 03:25:18
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 742802,718 ±(99.9%) 368,012 ns/op
# Warmup Iteration   2: 743668,093 ±(99.9%) 133,291 ns/op
# Warmup Iteration   3: 743484,419 ±(99.9%) 142,875 ns/op
# Warmup Iteration   4: 743526,781 ±(99.9%) 104,160 ns/op
# Warmup Iteration   5: 741818,603 ±(99.9%) 102,520 ns/op
Iteration   1: 740904,914 ±(99.9%) 116,130 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   753664,000 ns/op
crc64_ecma·p0.999:  768000,000 ns/op
crc64_ecma·p0.9999: 912162,406 ns/op
crc64_ecma·p1.00:   985088,000 ns/op

Iteration   2: 740785,143 ±(99.9%) 95,735 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   751616,000 ns/op
crc64_ecma·p0.999:  765952,000 ns/op
crc64_ecma·p0.9999: 779264,000 ns/op
crc64_ecma·p1.00:   779264,000 ns/op

Iteration   3: 740850,109 ±(99.9%) 113,717 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   752640,000 ns/op
crc64_ecma·p0.999:  767497,216 ns/op
crc64_ecma·p0.9999: 926950,605 ns/op
crc64_ecma·p1.00:   936960,000 ns/op

Iteration   4: 740990,330 ±(99.9%) 108,620 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   754688,000 ns/op
crc64_ecma·p0.999:  773643,264 ns/op
crc64_ecma·p0.9999: 817624,678 ns/op
crc64_ecma·p1.00:   837632,000 ns/op

Iteration   5: 740604,604 ±(99.9%) 139,181 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   752640,000 ns/op
crc64_ecma·p0.999:  775168,000 ns/op
crc64_ecma·p0.9999: 948948,173 ns/op
crc64_ecma·p1.00:   955392,000 ns/op


# Run progress: 77,83% complete, ETA 03:23:48
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 742252,867 ±(99.9%) 429,108 ns/op
# Warmup Iteration   2: 741528,008 ±(99.9%) 98,827 ns/op
# Warmup Iteration   3: 741925,753 ±(99.9%) 150,498 ns/op
# Warmup Iteration   4: 743050,785 ±(99.9%) 158,096 ns/op
# Warmup Iteration   5: 742223,097 ±(99.9%) 187,536 ns/op
Iteration   1: 739291,645 ±(99.9%) 148,954 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   749568,000 ns/op
crc64_ecma·p0.999:  767466,496 ns/op
crc64_ecma·p0.9999: 988650,496 ns/op
crc64_ecma·p1.00:   992256,000 ns/op

Iteration   2: 738884,277 ±(99.9%) 87,691 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   747520,000 ns/op
crc64_ecma·p0.999:  762880,000 ns/op
crc64_ecma·p0.9999: 777517,261 ns/op
crc64_ecma·p1.00:   778240,000 ns/op

Iteration   3: 738774,071 ±(99.9%) 85,641 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   747520,000 ns/op
crc64_ecma·p0.999:  761856,000 ns/op
crc64_ecma·p0.9999: 773782,426 ns/op
crc64_ecma·p1.00:   774144,000 ns/op

Iteration   4: 739208,122 ±(99.9%) 134,498 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   749568,000 ns/op
crc64_ecma·p0.999:  768000,000 ns/op
crc64_ecma·p0.9999: 1021924,762 ns/op
crc64_ecma·p1.00:   1073152,000 ns/op

Iteration   5: 739021,974 ±(99.9%) 93,947 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   750592,000 ns/op
crc64_ecma·p0.999:  765952,000 ns/op
crc64_ecma·p0.9999: 795109,376 ns/op
crc64_ecma·p1.00:   798720,000 ns/op


# Run progress: 78,00% complete, ETA 03:22:19
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 743696,045 ±(99.9%) 459,300 ns/op
# Warmup Iteration   2: 743951,326 ±(99.9%) 249,927 ns/op
# Warmup Iteration   3: 743128,208 ±(99.9%) 125,533 ns/op
# Warmup Iteration   4: 742979,998 ±(99.9%) 197,395 ns/op
# Warmup Iteration   5: 747801,746 ±(99.9%) 202,911 ns/op
Iteration   1: 742064,115 ±(99.9%) 248,510 ns/op
crc64_ecma·p0.00:   735232,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   745472,000 ns/op
crc64_ecma·p0.95:   755712,000 ns/op
crc64_ecma·p0.99:   777216,000 ns/op
crc64_ecma·p0.999:  801976,320 ns/op
crc64_ecma·p0.9999: 1054610,432 ns/op
crc64_ecma·p1.00:   1083392,000 ns/op

Iteration   2: 743505,359 ±(99.9%) 278,619 ns/op
crc64_ecma·p0.00:   732160,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   750592,000 ns/op
crc64_ecma·p0.95:   768000,000 ns/op
crc64_ecma·p0.99:   781312,000 ns/op
crc64_ecma·p0.999:  792576,000 ns/op
crc64_ecma·p0.9999: 1054937,805 ns/op
crc64_ecma·p1.00:   1058816,000 ns/op

Iteration   3: 740963,409 ±(99.9%) 173,230 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   753664,000 ns/op
crc64_ecma·p0.999:  772618,240 ns/op
crc64_ecma·p0.9999: 1092119,552 ns/op
crc64_ecma·p1.00:   1118208,000 ns/op

Iteration   4: 740742,308 ±(99.9%) 92,138 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   751616,000 ns/op
crc64_ecma·p0.999:  763904,000 ns/op
crc64_ecma·p0.9999: 775834,214 ns/op
crc64_ecma·p1.00:   776192,000 ns/op

Iteration   5: 740785,219 ±(99.9%) 102,180 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   754688,000 ns/op
crc64_ecma·p0.999:  765966,336 ns/op
crc64_ecma·p0.9999: 779881,267 ns/op
crc64_ecma·p1.00:   781312,000 ns/op


# Run progress: 78,17% complete, ETA 03:20:49
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 746529,432 ±(99.9%) 495,969 ns/op
# Warmup Iteration   2: 743479,924 ±(99.9%) 107,699 ns/op
# Warmup Iteration   3: 743459,274 ±(99.9%) 101,910 ns/op
# Warmup Iteration   4: 743405,184 ±(99.9%) 135,357 ns/op
# Warmup Iteration   5: 744109,869 ±(99.9%) 341,652 ns/op
Iteration   1: 739012,760 ±(99.9%) 93,792 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   750592,000 ns/op
crc64_ecma·p0.999:  765412,352 ns/op
crc64_ecma·p0.9999: 777517,670 ns/op
crc64_ecma·p1.00:   778240,000 ns/op

Iteration   2: 738979,929 ±(99.9%) 108,485 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   748544,000 ns/op
crc64_ecma·p0.999:  766976,000 ns/op
crc64_ecma·p0.9999: 916480,000 ns/op
crc64_ecma·p1.00:   916480,000 ns/op

Iteration   3: 740858,118 ±(99.9%) 209,315 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   741376,000 ns/op
crc64_ecma·p0.90:   744448,000 ns/op
crc64_ecma·p0.95:   745472,000 ns/op
crc64_ecma·p0.99:   752640,000 ns/op
crc64_ecma·p0.999:  771592,192 ns/op
crc64_ecma·p0.9999: 1137290,445 ns/op
crc64_ecma·p1.00:   1153024,000 ns/op

Iteration   4: 742664,636 ±(99.9%) 276,372 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   740352,000 ns/op
crc64_ecma·p0.90:   748544,000 ns/op
crc64_ecma·p0.95:   765952,000 ns/op
crc64_ecma·p0.99:   780288,000 ns/op
crc64_ecma·p0.999:  795731,968 ns/op
crc64_ecma·p0.9999: 959140,557 ns/op
crc64_ecma·p1.00:   968704,000 ns/op

Iteration   5: 739302,099 ±(99.9%) 132,452 ns/op
crc64_ecma·p0.00:   734208,000 ns/op
crc64_ecma·p0.50:   738304,000 ns/op
crc64_ecma·p0.90:   743424,000 ns/op
crc64_ecma·p0.95:   744448,000 ns/op
crc64_ecma·p0.99:   755712,000 ns/op
crc64_ecma·p0.999:  782336,000 ns/op
crc64_ecma·p0.9999: 805611,110 ns/op
crc64_ecma·p1.00:   817152,000 ns/op



Result "org.example.Main.crc64_ecma":
N = 134908
mean = 740884,866 ±(99.9%) 60,204 ns/op

Histogram, ns/op:
[ 700000,000,  750000,000) = 129856
[ 750000,000,  800000,000) = 5001
[ 800000,000,  850000,000) = 20
[ 850000,000,  900000,000) = 10
[ 900000,000,  950000,000) = 8
[ 950000,000, 1000000,000) = 4
[1000000,000, 1050000,000) = 4
[1050000,000, 1100000,000) = 2
[1100000,000, 1150000,000) = 2

Percentiles, ns/op:
p(0,0000) = 732160,000 ns/op
p(50,0000) = 739328,000 ns/op
p(90,0000) = 744448,000 ns/op
p(95,0000) = 747520,000 ns/op
p(99,0000) = 772096,000 ns/op
p(99,9000) = 787456,000 ns/op
p(99,9900) = 949787,955 ns/op
p(99,9990) = 1140870,083 ns/op
p(99,9999) = 1153024,000 ns/op
p(100,0000) = 1153024,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 4M)

# Run progress: 78,33% complete, ETA 03:19:20
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 5938168,090 ±(99.9%) 4498,853 ns/op
# Warmup Iteration   2: 5941493,955 ±(99.9%) 1766,005 ns/op
# Warmup Iteration   3: 5980111,005 ±(99.9%) 6967,722 ns/op
# Warmup Iteration   4: 5946758,472 ±(99.9%) 1688,667 ns/op
# Warmup Iteration   5: 5947192,195 ±(99.9%) 2776,035 ns/op
Iteration   1: 5951848,838 ±(99.9%) 1704,965 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5980160,000 ns/op
crc64_ecma·p0.99:   6053888,000 ns/op
crc64_ecma·p0.999:  6206218,240 ns/op
crc64_ecma·p0.9999: 6234112,000 ns/op
crc64_ecma·p1.00:   6234112,000 ns/op

Iteration   2: 5964543,389 ±(99.9%) 5642,582 ns/op
crc64_ecma·p0.00:   5914624,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   6004736,000 ns/op
crc64_ecma·p0.95:   6168576,000 ns/op
crc64_ecma·p0.99:   6258688,000 ns/op
crc64_ecma·p0.999:  6384214,016 ns/op
crc64_ecma·p0.9999: 6389760,000 ns/op
crc64_ecma·p1.00:   6389760,000 ns/op

Iteration   3: 5937001,197 ±(99.9%) 1258,575 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5939200,000 ns/op
crc64_ecma·p0.90:   5947392,000 ns/op
crc64_ecma·p0.95:   5955584,000 ns/op
crc64_ecma·p0.99:   5997772,800 ns/op
crc64_ecma·p0.999:  6075432,960 ns/op
crc64_ecma·p0.9999: 6086656,000 ns/op
crc64_ecma·p1.00:   6086656,000 ns/op

Iteration   4: 5937813,587 ±(99.9%) 2202,503 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5939200,000 ns/op
crc64_ecma·p0.90:   5947392,000 ns/op
crc64_ecma·p0.95:   5955584,000 ns/op
crc64_ecma·p0.99:   6021120,000 ns/op
crc64_ecma·p0.999:  6440796,160 ns/op
crc64_ecma·p0.9999: 6676480,000 ns/op
crc64_ecma·p1.00:   6676480,000 ns/op

Iteration   5: 5937224,969 ±(99.9%) 1657,033 ns/op
crc64_ecma·p0.00:   5914624,000 ns/op
crc64_ecma·p0.50:   5939200,000 ns/op
crc64_ecma·p0.90:   5947392,000 ns/op
crc64_ecma·p0.95:   5955584,000 ns/op
crc64_ecma·p0.99:   6029312,000 ns/op
crc64_ecma·p0.999:  6205153,280 ns/op
crc64_ecma·p0.9999: 6266880,000 ns/op
crc64_ecma·p1.00:   6266880,000 ns/op


# Run progress: 78,50% complete, ETA 03:17:50
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 5963815,103 ±(99.9%) 7319,429 ns/op
# Warmup Iteration   2: 5959179,296 ±(99.9%) 4212,903 ns/op
# Warmup Iteration   3: 5951093,029 ±(99.9%) 1445,807 ns/op
# Warmup Iteration   4: 5951531,886 ±(99.9%) 1517,163 ns/op
# Warmup Iteration   5: 5964851,322 ±(99.9%) 4336,674 ns/op
Iteration   1: 5953276,188 ±(99.9%) 1727,467 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5963776,000 ns/op
crc64_ecma·p0.95:   5971968,000 ns/op
crc64_ecma·p0.99:   6037504,000 ns/op
crc64_ecma·p0.999:  6348472,320 ns/op
crc64_ecma·p0.9999: 6365184,000 ns/op
crc64_ecma·p1.00:   6365184,000 ns/op

Iteration   2: 5951924,679 ±(99.9%) 1348,603 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6029312,000 ns/op
crc64_ecma·p0.999:  6135808,000 ns/op
crc64_ecma·p0.9999: 6135808,000 ns/op
crc64_ecma·p1.00:   6135808,000 ns/op

Iteration   3: 5953246,914 ±(99.9%) 2163,592 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5963776,000 ns/op
crc64_ecma·p0.95:   5971968,000 ns/op
crc64_ecma·p0.99:   6062080,000 ns/op
crc64_ecma·p0.999:  6307840,000 ns/op
crc64_ecma·p0.9999: 6307840,000 ns/op
crc64_ecma·p1.00:   6307840,000 ns/op

Iteration   4: 5975038,164 ±(99.9%) 6596,833 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   6037504,000 ns/op
crc64_ecma·p0.95:   6193152,000 ns/op
crc64_ecma·p0.99:   6375505,920 ns/op
crc64_ecma·p0.999:  6485213,184 ns/op
crc64_ecma·p0.9999: 6496256,000 ns/op
crc64_ecma·p1.00:   6496256,000 ns/op

Iteration   5: 5952149,117 ±(99.9%) 1499,789 ns/op
crc64_ecma·p0.00:   5931008,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6045696,000 ns/op
crc64_ecma·p0.999:  6146621,440 ns/op
crc64_ecma·p0.9999: 6152192,000 ns/op
crc64_ecma·p1.00:   6152192,000 ns/op


# Run progress: 78,67% complete, ETA 03:16:20
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 5945047,948 ±(99.9%) 6052,038 ns/op
# Warmup Iteration   2: 5939170,795 ±(99.9%) 1542,765 ns/op
# Warmup Iteration   3: 5955091,211 ±(99.9%) 5426,351 ns/op
# Warmup Iteration   4: 5940003,137 ±(99.9%) 1635,078 ns/op
# Warmup Iteration   5: 5939302,217 ±(99.9%) 1334,024 ns/op
Iteration   1: 5950610,286 ±(99.9%) 1534,677 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5971968,000 ns/op
crc64_ecma·p0.99:   6045696,000 ns/op
crc64_ecma·p0.999:  6127616,000 ns/op
crc64_ecma·p0.9999: 6127616,000 ns/op
crc64_ecma·p1.00:   6127616,000 ns/op

Iteration   2: 5968847,704 ±(99.9%) 5173,163 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5999820,800 ns/op
crc64_ecma·p0.95:   6145638,400 ns/op
crc64_ecma·p0.99:   6250496,000 ns/op
crc64_ecma·p0.999:  6361841,664 ns/op
crc64_ecma·p0.9999: 6406144,000 ns/op
crc64_ecma·p1.00:   6406144,000 ns/op

Iteration   3: 5953490,868 ±(99.9%) 3200,299 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5963776,000 ns/op
crc64_ecma·p0.95:   5971968,000 ns/op
crc64_ecma·p0.99:   6070272,000 ns/op
crc64_ecma·p0.999:  6567034,880 ns/op
crc64_ecma·p0.9999: 6578176,000 ns/op
crc64_ecma·p1.00:   6578176,000 ns/op

Iteration   4: 5948420,876 ±(99.9%) 2236,708 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5971968,000 ns/op
crc64_ecma·p0.99:   6053888,000 ns/op
crc64_ecma·p0.999:  6332358,656 ns/op
crc64_ecma·p0.9999: 6594560,000 ns/op
crc64_ecma·p1.00:   6594560,000 ns/op

Iteration   5: 5951585,524 ±(99.9%) 1569,739 ns/op
crc64_ecma·p0.00:   5931008,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5971968,000 ns/op
crc64_ecma·p0.99:   6045696,000 ns/op
crc64_ecma·p0.999:  6179381,248 ns/op
crc64_ecma·p0.9999: 6184960,000 ns/op
crc64_ecma·p1.00:   6184960,000 ns/op


# Run progress: 78,83% complete, ETA 03:14:51
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 5968955,300 ±(99.9%) 6582,492 ns/op
# Warmup Iteration   2: 5954598,423 ±(99.9%) 1656,798 ns/op
# Warmup Iteration   3: 5948049,894 ±(99.9%) 2889,433 ns/op
# Warmup Iteration   4: 5937390,366 ±(99.9%) 1350,209 ns/op
# Warmup Iteration   5: 5960483,568 ±(99.9%) 5229,172 ns/op
Iteration   1: 5960288,172 ±(99.9%) 4472,917 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5963776,000 ns/op
crc64_ecma·p0.95:   6012928,000 ns/op
crc64_ecma·p0.99:   6268682,240 ns/op
crc64_ecma·p0.999:  6623428,608 ns/op
crc64_ecma·p0.9999: 6856704,000 ns/op
crc64_ecma·p1.00:   6856704,000 ns/op

Iteration   2: 5951049,143 ±(99.9%) 1433,153 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6029312,000 ns/op
crc64_ecma·p0.999:  6196264,960 ns/op
crc64_ecma·p0.9999: 6307840,000 ns/op
crc64_ecma·p1.00:   6307840,000 ns/op

Iteration   3: 5952168,634 ±(99.9%) 1634,184 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6037504,000 ns/op
crc64_ecma·p0.999:  6249185,280 ns/op
crc64_ecma·p0.9999: 6316032,000 ns/op
crc64_ecma·p1.00:   6316032,000 ns/op

Iteration   4: 5951010,133 ±(99.9%) 1483,593 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6045696,000 ns/op
crc64_ecma·p0.999:  6154100,736 ns/op
crc64_ecma·p0.9999: 6193152,000 ns/op
crc64_ecma·p1.00:   6193152,000 ns/op

Iteration   5: 5973339,046 ±(99.9%) 6717,347 ns/op
crc64_ecma·p0.00:   5931008,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5996544,000 ns/op
crc64_ecma·p0.95:   6130073,600 ns/op
crc64_ecma·p0.99:   6441369,600 ns/op
crc64_ecma·p0.999:  6586368,000 ns/op
crc64_ecma·p0.9999: 6586368,000 ns/op
crc64_ecma·p1.00:   6586368,000 ns/op


# Run progress: 79,00% complete, ETA 03:13:21
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 5961074,643 ±(99.9%) 5049,241 ns/op
# Warmup Iteration   2: 5959638,478 ±(99.9%) 3843,207 ns/op
# Warmup Iteration   3: 5951317,333 ±(99.9%) 1436,765 ns/op
# Warmup Iteration   4: 5961958,812 ±(99.9%) 6286,813 ns/op
# Warmup Iteration   5: 5933307,594 ±(99.9%) 1167,504 ns/op
Iteration   1: 5946836,445 ±(99.9%) 1999,914 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6037504,000 ns/op
crc64_ecma·p0.999:  6318637,056 ns/op
crc64_ecma·p0.9999: 6324224,000 ns/op
crc64_ecma·p1.00:   6324224,000 ns/op

Iteration   2: 5937083,895 ±(99.9%) 1866,489 ns/op
crc64_ecma·p0.00:   5914624,000 ns/op
crc64_ecma·p0.50:   5931008,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6037504,000 ns/op
crc64_ecma·p0.999:  6228500,480 ns/op
crc64_ecma·p0.9999: 6234112,000 ns/op
crc64_ecma·p1.00:   6234112,000 ns/op

Iteration   3: 5963287,217 ±(99.9%) 5854,940 ns/op
crc64_ecma·p0.00:   5914624,000 ns/op
crc64_ecma·p0.50:   5939200,000 ns/op
crc64_ecma·p0.90:   6007193,600 ns/op
crc64_ecma·p0.95:   6176768,000 ns/op
crc64_ecma·p0.99:   6266880,000 ns/op
crc64_ecma·p0.999:  6427820,032 ns/op
crc64_ecma·p0.9999: 6438912,000 ns/op
crc64_ecma·p1.00:   6438912,000 ns/op

Iteration   4: 5946529,428 ±(99.9%) 4216,517 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5939200,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6275072,000 ns/op
crc64_ecma·p0.999:  6485082,112 ns/op
crc64_ecma·p0.9999: 6496256,000 ns/op
crc64_ecma·p1.00:   6496256,000 ns/op

Iteration   5: 5953095,662 ±(99.9%) 3628,783 ns/op
crc64_ecma·p0.00:   5922816,000 ns/op
crc64_ecma·p0.50:   5947392,000 ns/op
crc64_ecma·p0.90:   5955584,000 ns/op
crc64_ecma·p0.95:   5963776,000 ns/op
crc64_ecma·p0.99:   6243942,400 ns/op
crc64_ecma·p0.999:  6611927,040 ns/op
crc64_ecma·p0.9999: 6701056,000 ns/op
crc64_ecma·p1.00:   6701056,000 ns/op



Result "org.example.Main.crc64_ecma":
N = 16790
mean = 5953452,324 ±(99.9%) 1223,503 ns/op

Histogram, ns/op:
[5900000,000, 6000000,000) = 16080
[6000000,000, 6100000,000) = 376
[6100000,000, 6200000,000) = 115
[6200000,000, 6300000,000) = 158
[6300000,000, 6400000,000) = 24
[6400000,000, 6500000,000) = 22
[6500000,000, 6600000,000) = 13
[6600000,000, 6700000,000) = 0
[6700000,000, 6800000,000) = 1

Percentiles, ns/op:
p(0,0000) = 5914624,000 ns/op
p(50,0000) = 5947392,000 ns/op
p(90,0000) = 5963776,000 ns/op
p(95,0000) = 5988352,000 ns/op
p(99,0000) = 6225920,000 ns/op
p(99,9000) = 6496256,000 ns/op
p(99,9900) = 6751003,443 ns/op
p(99,9990) = 6856704,000 ns/op
p(99,9999) = 6856704,000 ns/op
p(100,0000) = 6856704,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 20M)

# Run progress: 79,17% complete, ETA 03:11:51
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 29753734,095 ±(99.9%) 28188,537 ns/op
# Warmup Iteration   2: 29875808,287 ±(99.9%) 61178,608 ns/op
# Warmup Iteration   3: 29767777,524 ±(99.9%) 14061,863 ns/op
# Warmup Iteration   4: 29766217,143 ±(99.9%) 13219,184 ns/op
# Warmup Iteration   5: 29757927,619 ±(99.9%) 16109,442 ns/op
Iteration   1: 29871700,060 ±(99.9%) 57656,401 ns/op
crc64_ecma·p0.00:   29687808,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   30159667,200 ns/op
crc64_ecma·p0.95:   30867456,000 ns/op
crc64_ecma·p0.99:   31183339,520 ns/op
crc64_ecma·p0.999:  31326208,000 ns/op
crc64_ecma·p0.9999: 31326208,000 ns/op
crc64_ecma·p1.00:   31326208,000 ns/op

Iteration   2: 29760073,143 ±(99.9%) 11837,443 ns/op
crc64_ecma·p0.00:   29720576,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29753344,000 ns/op
crc64_ecma·p0.95:   29856563,200 ns/op
crc64_ecma·p0.99:   30122311,680 ns/op
crc64_ecma·p0.999:  30310400,000 ns/op
crc64_ecma·p0.9999: 30310400,000 ns/op
crc64_ecma·p1.00:   30310400,000 ns/op

Iteration   3: 29759292,952 ±(99.9%) 12235,286 ns/op
crc64_ecma·p0.00:   29720576,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29851648,000 ns/op
crc64_ecma·p0.99:   30142955,520 ns/op
crc64_ecma·p0.999:  30375936,000 ns/op
crc64_ecma·p0.9999: 30375936,000 ns/op
crc64_ecma·p1.00:   30375936,000 ns/op

Iteration   4: 29761731,048 ±(99.9%) 15194,467 ns/op
crc64_ecma·p0.00:   29687808,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29949952,000 ns/op
crc64_ecma·p0.99:   30134435,840 ns/op
crc64_ecma·p0.999:  30572544,000 ns/op
crc64_ecma·p0.9999: 30572544,000 ns/op
crc64_ecma·p1.00:   30572544,000 ns/op

Iteration   5: 29870037,206 ±(99.9%) 61862,532 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   30140006,400 ns/op
crc64_ecma·p0.95:   30788812,800 ns/op
crc64_ecma·p0.99:   31356354,560 ns/op
crc64_ecma·p0.999:  31653888,000 ns/op
crc64_ecma·p0.9999: 31653888,000 ns/op
crc64_ecma·p1.00:   31653888,000 ns/op


# Run progress: 79,33% complete, ETA 03:10:21
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 29773726,476 ±(99.9%) 26958,992 ns/op
# Warmup Iteration   2: 29745444,571 ±(99.9%) 12437,888 ns/op
# Warmup Iteration   3: 29781138,286 ±(99.9%) 29122,823 ns/op
# Warmup Iteration   4: 29878351,475 ±(99.9%) 70666,933 ns/op
# Warmup Iteration   5: 29767680,000 ±(99.9%) 13933,723 ns/op
Iteration   1: 29766509,714 ±(99.9%) 15002,179 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29954867,200 ns/op
crc64_ecma·p0.99:   30244864,000 ns/op
crc64_ecma·p0.999:  30277632,000 ns/op
crc64_ecma·p0.9999: 30277632,000 ns/op
crc64_ecma·p1.00:   30277632,000 ns/op

Iteration   2: 29755977,143 ±(99.9%) 13706,044 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29922099,200 ns/op
crc64_ecma·p0.99:   30134435,840 ns/op
crc64_ecma·p0.999:  30277632,000 ns/op
crc64_ecma·p0.9999: 30277632,000 ns/op
crc64_ecma·p1.00:   30277632,000 ns/op

Iteration   3: 29838345,170 ±(99.9%) 48245,494 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   30048256,000 ns/op
crc64_ecma·p0.95:   30474240,000 ns/op
crc64_ecma·p0.99:   31085035,520 ns/op
crc64_ecma·p0.999:  31195136,000 ns/op
crc64_ecma·p0.9999: 31195136,000 ns/op
crc64_ecma·p1.00:   31195136,000 ns/op

Iteration   4: 29770800,762 ±(99.9%) 20279,157 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29922099,200 ns/op
crc64_ecma·p0.99:   30167203,840 ns/op
crc64_ecma·p0.999:  30932992,000 ns/op
crc64_ecma·p0.9999: 30932992,000 ns/op
crc64_ecma·p1.00:   30932992,000 ns/op

Iteration   5: 29758025,143 ±(99.9%) 13047,072 ns/op
crc64_ecma·p0.00:   29720576,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29856563,200 ns/op
crc64_ecma·p0.99:   30146560,000 ns/op
crc64_ecma·p0.999:  30343168,000 ns/op
crc64_ecma·p0.9999: 30343168,000 ns/op
crc64_ecma·p1.00:   30343168,000 ns/op


# Run progress: 79,50% complete, ETA 03:08:51
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 29797619,810 ±(99.9%) 40909,328 ns/op
# Warmup Iteration   2: 29876003,916 ±(99.9%) 64023,036 ns/op
# Warmup Iteration   3: 29760365,714 ±(99.9%) 19336,872 ns/op
# Warmup Iteration   4: 29679348,605 ±(99.9%) 8207,131 ns/op
# Warmup Iteration   5: 29685668,843 ±(99.9%) 17607,321 ns/op
Iteration   1: 29791573,333 ±(99.9%) 59438,831 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29687808,000 ns/op
crc64_ecma·p0.90:   29982720,000 ns/op
crc64_ecma·p0.95:   30723276,800 ns/op
crc64_ecma·p0.99:   31376015,360 ns/op
crc64_ecma·p0.999:  31588352,000 ns/op
crc64_ecma·p0.9999: 31588352,000 ns/op
crc64_ecma·p1.00:   31588352,000 ns/op

Iteration   2: 29755684,571 ±(99.9%) 13243,589 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29917184,000 ns/op
crc64_ecma·p0.99:   30068899,840 ns/op
crc64_ecma·p0.999:  30343168,000 ns/op
crc64_ecma·p0.9999: 30343168,000 ns/op
crc64_ecma·p1.00:   30343168,000 ns/op

Iteration   3: 29735647,335 ±(99.9%) 22048,178 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29720576,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29884416,000 ns/op
crc64_ecma·p0.99:   30240276,480 ns/op
crc64_ecma·p0.999:  30998528,000 ns/op
crc64_ecma·p0.9999: 30998528,000 ns/op
crc64_ecma·p1.00:   30998528,000 ns/op

Iteration   4: 29693447,596 ±(99.9%) 14053,981 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29687808,000 ns/op
crc64_ecma·p0.90:   29753344,000 ns/op
crc64_ecma·p0.95:   29818880,000 ns/op
crc64_ecma·p0.99:   30035804,160 ns/op
crc64_ecma·p0.999:  30507008,000 ns/op
crc64_ecma·p0.9999: 30507008,000 ns/op
crc64_ecma·p1.00:   30507008,000 ns/op

Iteration   5: 29790890,667 ±(99.9%) 58944,339 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29687808,000 ns/op
crc64_ecma·p0.90:   29917184,000 ns/op
crc64_ecma·p0.95:   30605312,000 ns/op
crc64_ecma·p0.99:   31277711,360 ns/op
crc64_ecma·p0.999:  32145408,000 ns/op
crc64_ecma·p0.9999: 32145408,000 ns/op
crc64_ecma·p1.00:   32145408,000 ns/op


# Run progress: 79,67% complete, ETA 03:07:21
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 29764364,190 ±(99.9%) 32716,408 ns/op
# Warmup Iteration   2: 29772556,190 ±(99.9%) 15723,263 ns/op
# Warmup Iteration   3: 29755392,000 ±(99.9%) 16481,262 ns/op
# Warmup Iteration   4: 29875612,657 ±(99.9%) 61587,787 ns/op
# Warmup Iteration   5: 29769240,381 ±(99.9%) 13548,254 ns/op
Iteration   1: 29763779,048 ±(99.9%) 11757,664 ns/op
crc64_ecma·p0.00:   29720576,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29851648,000 ns/op
crc64_ecma·p0.99:   30134435,840 ns/op
crc64_ecma·p0.999:  30244864,000 ns/op
crc64_ecma·p0.9999: 30244864,000 ns/op
crc64_ecma·p1.00:   30244864,000 ns/op

Iteration   2: 29767094,857 ±(99.9%) 13114,133 ns/op
crc64_ecma·p0.00:   29720576,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29917184,000 ns/op
crc64_ecma·p0.99:   30134435,840 ns/op
crc64_ecma·p0.999:  30244864,000 ns/op
crc64_ecma·p0.9999: 30244864,000 ns/op
crc64_ecma·p1.00:   30244864,000 ns/op

Iteration   3: 29876003,916 ±(99.9%) 76372,171 ns/op
crc64_ecma·p0.00:   29687808,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   30094131,200 ns/op
crc64_ecma·p0.95:   30952652,800 ns/op
crc64_ecma·p0.99:   32023511,040 ns/op
crc64_ecma·p0.999:  32440320,000 ns/op
crc64_ecma·p0.9999: 32440320,000 ns/op
crc64_ecma·p1.00:   32440320,000 ns/op

Iteration   4: 29715617,045 ±(99.9%) 12927,928 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29687808,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29822156,800 ns/op
crc64_ecma·p0.99:   30035804,160 ns/op
crc64_ecma·p0.999:  30277632,000 ns/op
crc64_ecma·p0.9999: 30277632,000 ns/op
crc64_ecma·p1.00:   30277632,000 ns/op

Iteration   5: 29724368,142 ±(99.9%) 15046,810 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29720576,000 ns/op
crc64_ecma·p0.90:   29753344,000 ns/op
crc64_ecma·p0.95:   29818880,000 ns/op
crc64_ecma·p0.99:   30068572,160 ns/op
crc64_ecma·p0.999:  30638080,000 ns/op
crc64_ecma·p0.9999: 30638080,000 ns/op
crc64_ecma·p1.00:   30638080,000 ns/op


# Run progress: 79,83% complete, ETA 03:05:51
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 29713769,591 ±(99.9%) 30996,019 ns/op
# Warmup Iteration   2: 29854875,893 ±(99.9%) 68108,545 ns/op
# Warmup Iteration   3: 29730882,849 ±(99.9%) 29745,581 ns/op
# Warmup Iteration   4: 29733508,178 ±(99.9%) 14379,229 ns/op
# Warmup Iteration   5: 29768070,095 ±(99.9%) 15226,095 ns/op
Iteration   1: 29789525,333 ±(99.9%) 41097,520 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29987635,200 ns/op
crc64_ecma·p0.99:   31191531,520 ns/op
crc64_ecma·p0.999:  31817728,000 ns/op
crc64_ecma·p0.9999: 31817728,000 ns/op
crc64_ecma·p1.00:   31817728,000 ns/op

Iteration   2: 29822293,333 ±(99.9%) 52011,788 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   30025318,400 ns/op
crc64_ecma·p0.95:   30297292,800 ns/op
crc64_ecma·p0.99:   31248547,840 ns/op
crc64_ecma·p0.999:  31490048,000 ns/op
crc64_ecma·p0.9999: 31490048,000 ns/op
crc64_ecma·p1.00:   31490048,000 ns/op

Iteration   3: 29736327,976 ±(99.9%) 32748,022 ns/op
crc64_ecma·p0.00:   29622272,000 ns/op
crc64_ecma·p0.50:   29720576,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29854924,800 ns/op
crc64_ecma·p0.99:   30871388,160 ns/op
crc64_ecma·p0.999:  31522816,000 ns/op
crc64_ecma·p0.9999: 31522816,000 ns/op
crc64_ecma·p1.00:   31522816,000 ns/op

Iteration   4: 29757342,476 ±(99.9%) 13809,843 ns/op
crc64_ecma·p0.00:   29655040,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29851648,000 ns/op
crc64_ecma·p0.99:   30212096,000 ns/op
crc64_ecma·p0.999:  30343168,000 ns/op
crc64_ecma·p0.9999: 30343168,000 ns/op
crc64_ecma·p1.00:   30343168,000 ns/op

Iteration   5: 29755977,143 ±(99.9%) 12752,397 ns/op
crc64_ecma·p0.00:   29720576,000 ns/op
crc64_ecma·p0.50:   29753344,000 ns/op
crc64_ecma·p0.90:   29786112,000 ns/op
crc64_ecma·p0.95:   29884416,000 ns/op
crc64_ecma·p0.99:   30167203,840 ns/op
crc64_ecma·p0.999:  30343168,000 ns/op
crc64_ecma·p0.9999: 30343168,000 ns/op
crc64_ecma·p1.00:   30343168,000 ns/op



Result "org.example.Main.crc64_ecma":
N = 3362
mean = 29770761,137 ±(99.9%) 11297,150 ns/op

Histogram, ns/op:
[29000000,000, 29250000,000) = 0
[29250000,000, 29500000,000) = 0
[29500000,000, 29750000,000) = 1382
[29750000,000, 30000000,000) = 1836
[30000000,000, 30250000,000) = 80
[30250000,000, 30500000,000) = 12
[30500000,000, 30750000,000) = 11
[30750000,000, 31000000,000) = 6
[31000000,000, 31250000,000) = 18
[31250000,000, 31500000,000) = 8
[31500000,000, 31750000,000) = 4
[31750000,000, 32000000,000) = 2
[32000000,000, 32250000,000) = 1
[32250000,000, 32500000,000) = 2
[32500000,000, 32750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 29622272,000 ns/op
p(50,0000) = 29753344,000 ns/op
p(90,0000) = 29786112,000 ns/op
p(95,0000) = 29949952,000 ns/op
p(99,0000) = 31031296,000 ns/op
p(99,9000) = 32023314,432 ns/op
p(99,9900) = 32440320,000 ns/op
p(99,9990) = 32440320,000 ns/op
p(99,9999) = 32440320,000 ns/op
p(100,0000) = 32440320,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 64K)

# Run progress: 80,00% complete, ETA 03:04:21
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 71232,896 ±(99.9%) 1904,176 ns/op
# Warmup Iteration   2: 70368,098 ±(99.9%) 12,784 ns/op
# Warmup Iteration   3: 70405,917 ±(99.9%) 12,240 ns/op
# Warmup Iteration   4: 70351,542 ±(99.9%) 36,207 ns/op
# Warmup Iteration   5: 70217,534 ±(99.9%) 14,743 ns/op
Iteration   1: 70078,000 ±(99.9%) 9,668 ns/op
kangaroo12_128·p0.00:   69120,000 ns/op
kangaroo12_128·p0.50:   69760,000 ns/op
kangaroo12_128·p0.90:   70400,000 ns/op
kangaroo12_128·p0.95:   73088,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  77568,000 ns/op
kangaroo12_128·p0.9999: 88509,184 ns/op
kangaroo12_128·p1.00:   120960,000 ns/op

Iteration   2: 70014,821 ±(99.9%) 11,970 ns/op
kangaroo12_128·p0.00:   67840,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70400,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  84396,800 ns/op
kangaroo12_128·p0.9999: 102136,320 ns/op
kangaroo12_128·p1.00:   215296,000 ns/op

Iteration   3: 70074,862 ±(99.9%) 36,222 ns/op
kangaroo12_128·p0.00:   66176,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   72192,000 ns/op
kangaroo12_128·p0.95:   73216,000 ns/op
kangaroo12_128·p0.99:   74880,000 ns/op
kangaroo12_128·p0.999:  87040,000 ns/op
kangaroo12_128·p0.9999: 102749,952 ns/op
kangaroo12_128·p1.00:   1521664,000 ns/op

Iteration   4: 70266,027 ±(99.9%) 19,151 ns/op
kangaroo12_128·p0.00:   68736,000 ns/op
kangaroo12_128·p0.50:   69760,000 ns/op
kangaroo12_128·p0.90:   71936,000 ns/op
kangaroo12_128·p0.95:   73216,000 ns/op
kangaroo12_128·p0.99:   77824,000 ns/op
kangaroo12_128·p0.999:  96749,696 ns/op
kangaroo12_128·p0.9999: 113225,139 ns/op
kangaroo12_128·p1.00:   186112,000 ns/op

Iteration   5: 70016,493 ±(99.9%) 10,399 ns/op
kangaroo12_128·p0.00:   66944,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70272,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  81792,000 ns/op
kangaroo12_128·p0.9999: 94610,739 ns/op
kangaroo12_128·p1.00:   125184,000 ns/op


# Run progress: 80,17% complete, ETA 03:02:51
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70834,581 ±(99.9%) 1807,717 ns/op
# Warmup Iteration   2: 70330,126 ±(99.9%) 12,604 ns/op
# Warmup Iteration   3: 70488,047 ±(99.9%) 21,478 ns/op
# Warmup Iteration   4: 70175,368 ±(99.9%) 42,080 ns/op
# Warmup Iteration   5: 69886,207 ±(99.9%) 8,255 ns/op
Iteration   1: 69902,750 ±(99.9%) 13,358 ns/op
kangaroo12_128·p0.00:   67328,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   70272,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73884,160 ns/op
kangaroo12_128·p0.999:  88704,000 ns/op
kangaroo12_128·p0.9999: 103988,454 ns/op
kangaroo12_128·p1.00:   132096,000 ns/op

Iteration   2: 70090,347 ±(99.9%) 16,294 ns/op
kangaroo12_128·p0.00:   68352,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   71424,000 ns/op
kangaroo12_128·p0.95:   73088,000 ns/op
kangaroo12_128·p0.99:   77184,000 ns/op
kangaroo12_128·p0.999:  93056,000 ns/op
kangaroo12_128·p0.9999: 105984,000 ns/op
kangaroo12_128·p1.00:   130560,000 ns/op

Iteration   3: 69965,738 ±(99.9%) 37,323 ns/op
kangaroo12_128·p0.00:   67840,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   72192,000 ns/op
kangaroo12_128·p0.95:   73088,000 ns/op
kangaroo12_128·p0.99:   74880,000 ns/op
kangaroo12_128·p0.999:  83103,872 ns/op
kangaroo12_128·p0.9999: 93404,787 ns/op
kangaroo12_128·p1.00:   1593344,000 ns/op

Iteration   4: 69848,549 ±(99.9%) 11,718 ns/op
kangaroo12_128·p0.00:   68736,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   72064,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  81792,000 ns/op
kangaroo12_128·p0.9999: 88974,630 ns/op
kangaroo12_128·p1.00:   103424,000 ns/op

Iteration   5: 69834,120 ±(99.9%) 11,353 ns/op
kangaroo12_128·p0.00:   68864,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   72064,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  80896,000 ns/op
kangaroo12_128·p0.9999: 88882,714 ns/op
kangaroo12_128·p1.00:   102656,000 ns/op


# Run progress: 80,33% complete, ETA 03:01:21
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 71165,580 ±(99.9%) 1822,462 ns/op
# Warmup Iteration   2: 70380,673 ±(99.9%) 13,815 ns/op
# Warmup Iteration   3: 70384,252 ±(99.9%) 11,894 ns/op
# Warmup Iteration   4: 70196,047 ±(99.9%) 40,030 ns/op
# Warmup Iteration   5: 70054,884 ±(99.9%) 13,479 ns/op
Iteration   1: 69940,669 ±(99.9%) 8,660 ns/op
kangaroo12_128·p0.00:   69120,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70144,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73472,000 ns/op
kangaroo12_128·p0.999:  77440,000 ns/op
kangaroo12_128·p0.9999: 87884,480 ns/op
kangaroo12_128·p1.00:   102656,000 ns/op

Iteration   2: 69926,533 ±(99.9%) 8,442 ns/op
kangaroo12_128·p0.00:   68864,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70144,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73344,000 ns/op
kangaroo12_128·p0.999:  75776,000 ns/op
kangaroo12_128·p0.9999: 84663,424 ns/op
kangaroo12_128·p1.00:   108416,000 ns/op

Iteration   3: 70062,231 ±(99.9%) 36,827 ns/op
kangaroo12_128·p0.00:   68864,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   71040,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73728,000 ns/op
kangaroo12_128·p0.999:  76928,000 ns/op
kangaroo12_128·p0.9999: 87358,566 ns/op
kangaroo12_128·p1.00:   1605632,000 ns/op

Iteration   4: 70001,658 ±(99.9%) 11,893 ns/op
kangaroo12_128·p0.00:   67840,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70528,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  86569,344 ns/op
kangaroo12_128·p0.9999: 99968,000 ns/op
kangaroo12_128·p1.00:   133632,000 ns/op

Iteration   5: 69878,186 ±(99.9%) 12,253 ns/op
kangaroo12_128·p0.00:   68736,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   71680,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  81928,960 ns/op
kangaroo12_128·p0.9999: 103386,496 ns/op
kangaroo12_128·p1.00:   133376,000 ns/op


# Run progress: 80,50% complete, ETA 02:59:51
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70838,005 ±(99.9%) 1841,442 ns/op
# Warmup Iteration   2: 70168,102 ±(99.9%) 14,506 ns/op
# Warmup Iteration   3: 70377,794 ±(99.9%) 17,588 ns/op
# Warmup Iteration   4: 70092,415 ±(99.9%) 34,642 ns/op
# Warmup Iteration   5: 69838,752 ±(99.9%) 11,982 ns/op
Iteration   1: 69816,415 ±(99.9%) 11,552 ns/op
kangaroo12_128·p0.00:   67968,000 ns/op
kangaroo12_128·p0.50:   69376,000 ns/op
kangaroo12_128·p0.90:   71936,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  80896,000 ns/op
kangaroo12_128·p0.9999: 94424,870 ns/op
kangaroo12_128·p1.00:   113280,000 ns/op

Iteration   2: 69960,876 ±(99.9%) 15,748 ns/op
kangaroo12_128·p0.00:   67200,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   71936,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   76544,000 ns/op
kangaroo12_128·p0.999:  90112,000 ns/op
kangaroo12_128·p0.9999: 107065,370 ns/op
kangaroo12_128·p1.00:   148736,000 ns/op

Iteration   3: 70000,972 ±(99.9%) 34,422 ns/op
kangaroo12_128·p0.00:   68736,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   71040,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  80000,000 ns/op
kangaroo12_128·p0.9999: 97024,000 ns/op
kangaroo12_128·p1.00:   1486848,000 ns/op

Iteration   4: 69861,880 ±(99.9%) 11,176 ns/op
kangaroo12_128·p0.00:   67584,000 ns/op
kangaroo12_128·p0.50:   69504,000 ns/op
kangaroo12_128·p0.90:   70144,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73728,000 ns/op
kangaroo12_128·p0.999:  83844,864 ns/op
kangaroo12_128·p0.9999: 96180,173 ns/op
kangaroo12_128·p1.00:   111104,000 ns/op

Iteration   5: 69886,251 ±(99.9%) 12,606 ns/op
kangaroo12_128·p0.00:   66816,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70272,000 ns/op
kangaroo12_128·p0.95:   72832,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  86912,000 ns/op
kangaroo12_128·p0.9999: 106240,000 ns/op
kangaroo12_128·p1.00:   123264,000 ns/op


# Run progress: 80,67% complete, ETA 02:58:20
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 71108,453 ±(99.9%) 1848,362 ns/op
# Warmup Iteration   2: 70412,493 ±(99.9%) 15,846 ns/op
# Warmup Iteration   3: 70379,773 ±(99.9%) 13,653 ns/op
# Warmup Iteration   4: 70329,524 ±(99.9%) 39,109 ns/op
# Warmup Iteration   5: 70214,937 ±(99.9%) 18,605 ns/op
Iteration   1: 69985,425 ±(99.9%) 11,808 ns/op
kangaroo12_128·p0.00:   66944,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70784,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  83072,000 ns/op
kangaroo12_128·p0.9999: 97631,744 ns/op
kangaroo12_128·p1.00:   128128,000 ns/op

Iteration   2: 69922,326 ±(99.9%) 10,988 ns/op
kangaroo12_128·p0.00:   67584,000 ns/op
kangaroo12_128·p0.50:   69632,000 ns/op
kangaroo12_128·p0.90:   70272,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  82196,608 ns/op
kangaroo12_128·p0.9999: 97866,304 ns/op
kangaroo12_128·p1.00:   141568,000 ns/op

Iteration   3: 70217,478 ±(99.9%) 38,374 ns/op
kangaroo12_128·p0.00:   67712,000 ns/op
kangaroo12_128·p0.50:   69888,000 ns/op
kangaroo12_128·p0.90:   71296,000 ns/op
kangaroo12_128·p0.95:   73088,000 ns/op
kangaroo12_128·p0.99:   74112,000 ns/op
kangaroo12_128·p0.999:  80000,000 ns/op
kangaroo12_128·p0.9999: 101504,000 ns/op
kangaroo12_128·p1.00:   1665024,000 ns/op

Iteration   4: 70132,904 ±(99.9%) 11,669 ns/op
kangaroo12_128·p0.00:   67200,000 ns/op
kangaroo12_128·p0.50:   69888,000 ns/op
kangaroo12_128·p0.90:   70400,000 ns/op
kangaroo12_128·p0.95:   72960,000 ns/op
kangaroo12_128·p0.99:   73856,000 ns/op
kangaroo12_128·p0.999:  86656,000 ns/op
kangaroo12_128·p0.9999: 97478,912 ns/op
kangaroo12_128·p1.00:   195840,000 ns/op

Iteration   5: 70197,994 ±(99.9%) 11,844 ns/op
kangaroo12_128·p0.00:   66432,000 ns/op
kangaroo12_128·p0.50:   69888,000 ns/op
kangaroo12_128·p0.90:   70656,000 ns/op
kangaroo12_128·p0.95:   73088,000 ns/op
kangaroo12_128·p0.99:   73984,000 ns/op
kangaroo12_128·p0.999:  84188,160 ns/op
kangaroo12_128·p0.9999: 101614,080 ns/op
kangaroo12_128·p1.00:   200704,000 ns/op



Result "org.example.Main.kangaroo12_128":
N = 1426844
mean =  69997,999 ±(99.9%) 6,216 ns/op

Histogram, ns/op:
[      0,000,  125000,000) = 1426831
[ 125000,000,  250000,000) = 11
[ 250000,000,  375000,000) = 0
[ 375000,000,  500000,000) = 0
[ 500000,000,  625000,000) = 0
[ 625000,000,  750000,000) = 0
[ 750000,000,  875000,000) = 0
[ 875000,000, 1000000,000) = 0
[1000000,000, 1125000,000) = 0
[1125000,000, 1250000,000) = 0
[1250000,000, 1375000,000) = 0
[1375000,000, 1500000,000) = 1
[1500000,000, 1625000,000) = 0
[1625000,000, 1750000,000) = 1
[1750000,000, 1875000,000) = 0

Percentiles, ns/op:
p(0,0000) =  66432,000 ns/op
p(50,0000) =  69632,000 ns/op
p(90,0000) =  70912,000 ns/op
p(95,0000) =  72960,000 ns/op
p(99,0000) =  73984,000 ns/op
p(99,9000) =  84608,000 ns/op
p(99,9900) = 101544,384 ns/op
p(99,9990) = 124106,746 ns/op
p(99,9999) = 1588970,465 ns/op
p(100,0000) = 1665024,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 512K)

# Run progress: 80,83% complete, ETA 02:56:50
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 560886,772 ±(99.9%) 14657,194 ns/op
# Warmup Iteration   2: 555759,465 ±(99.9%) 120,634 ns/op
# Warmup Iteration   3: 556698,747 ±(99.9%) 236,706 ns/op
# Warmup Iteration   4: 556875,573 ±(99.9%) 125,666 ns/op
# Warmup Iteration   5: 556582,393 ±(99.9%) 101,906 ns/op
Iteration   1: 557069,704 ±(99.9%) 104,032 ns/op
kangaroo12_128·p0.00:   546816,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   567961,600 ns/op
kangaroo12_128·p0.999:  599106,560 ns/op
kangaroo12_128·p0.9999: 709375,488 ns/op
kangaroo12_128·p1.00:   728064,000 ns/op

Iteration   2: 556496,915 ±(99.9%) 125,329 ns/op
kangaroo12_128·p0.00:   539648,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   569344,000 ns/op
kangaroo12_128·p0.999:  623710,208 ns/op
kangaroo12_128·p0.9999: 725133,312 ns/op
kangaroo12_128·p1.00:   749568,000 ns/op

Iteration   3: 557746,727 ±(99.9%) 247,996 ns/op
kangaroo12_128·p0.00:   548864,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   562176,000 ns/op
kangaroo12_128·p0.95:   565248,000 ns/op
kangaroo12_128·p0.99:   579584,000 ns/op
kangaroo12_128·p0.999:  734472,192 ns/op
kangaroo12_128·p0.9999: 865704,346 ns/op
kangaroo12_128·p1.00:   1112064,000 ns/op

Iteration   4: 556782,994 ±(99.9%) 121,389 ns/op
kangaroo12_128·p0.00:   539648,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   568320,000 ns/op
kangaroo12_128·p0.999:  617528,320 ns/op
kangaroo12_128·p0.9999: 716407,296 ns/op
kangaroo12_128·p1.00:   718848,000 ns/op

Iteration   5: 557345,691 ±(99.9%) 304,899 ns/op
kangaroo12_128·p0.00:   547840,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   561152,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  599191,552 ns/op
kangaroo12_128·p0.9999: 1020470,067 ns/op
kangaroo12_128·p1.00:   2134016,000 ns/op


# Run progress: 81,00% complete, ETA 02:55:20
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 561775,084 ±(99.9%) 14609,209 ns/op
# Warmup Iteration   2: 558212,063 ±(99.9%) 284,946 ns/op
# Warmup Iteration   3: 556841,235 ±(99.9%) 118,684 ns/op
# Warmup Iteration   4: 557021,345 ±(99.9%) 84,834 ns/op
# Warmup Iteration   5: 556946,967 ±(99.9%) 103,613 ns/op
Iteration   1: 557806,891 ±(99.9%) 148,314 ns/op
kangaroo12_128·p0.00:   544768,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   563200,000 ns/op
kangaroo12_128·p0.99:   574464,000 ns/op
kangaroo12_128·p0.999:  632832,000 ns/op
kangaroo12_128·p0.9999: 749422,182 ns/op
kangaroo12_128·p1.00:   791552,000 ns/op

Iteration   2: 557201,576 ±(99.9%) 106,029 ns/op
kangaroo12_128·p0.00:   544768,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   559104,000 ns/op
kangaroo12_128·p0.95:   561152,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  596321,280 ns/op
kangaroo12_128·p0.9999: 735443,866 ns/op
kangaroo12_128·p1.00:   736256,000 ns/op

Iteration   3: 557195,522 ±(99.9%) 79,846 ns/op
kangaroo12_128·p0.00:   549888,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   559104,000 ns/op
kangaroo12_128·p0.95:   560128,000 ns/op
kangaroo12_128·p0.99:   564224,000 ns/op
kangaroo12_128·p0.999:  597062,656 ns/op
kangaroo12_128·p0.9999: 646779,699 ns/op
kangaroo12_128·p1.00:   672768,000 ns/op

Iteration   4: 557277,844 ±(99.9%) 162,454 ns/op
kangaroo12_128·p0.00:   539648,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   561152,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  664424,448 ns/op
kangaroo12_128·p0.9999: 769030,042 ns/op
kangaroo12_128·p1.00:   792576,000 ns/op

Iteration   5: 557887,871 ±(99.9%) 323,374 ns/op
kangaroo12_128·p0.00:   549888,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   563200,000 ns/op
kangaroo12_128·p0.99:   573347,840 ns/op
kangaroo12_128·p0.999:  670348,288 ns/op
kangaroo12_128·p0.9999: 1014684,262 ns/op
kangaroo12_128·p1.00:   2056192,000 ns/op


# Run progress: 81,17% complete, ETA 02:53:49
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 562297,220 ±(99.9%) 14863,954 ns/op
# Warmup Iteration   2: 557013,578 ±(99.9%) 122,381 ns/op
# Warmup Iteration   3: 557042,411 ±(99.9%) 141,049 ns/op
# Warmup Iteration   4: 557727,405 ±(99.9%) 166,686 ns/op
# Warmup Iteration   5: 556716,207 ±(99.9%) 97,495 ns/op
Iteration   1: 556617,338 ±(99.9%) 125,461 ns/op
kangaroo12_128·p0.00:   540672,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   567296,000 ns/op
kangaroo12_128·p0.999:  616550,400 ns/op
kangaroo12_128·p0.9999: 751308,800 ns/op
kangaroo12_128·p1.00:   865280,000 ns/op

Iteration   2: 557739,353 ±(99.9%) 231,907 ns/op
kangaroo12_128·p0.00:   544768,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   570368,000 ns/op
kangaroo12_128·p0.999:  712384,512 ns/op
kangaroo12_128·p0.9999: 858112,000 ns/op
kangaroo12_128·p1.00:   858112,000 ns/op

Iteration   3: 558219,943 ±(99.9%) 172,053 ns/op
kangaroo12_128·p0.00:   543744,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   562176,000 ns/op
kangaroo12_128·p0.95:   565248,000 ns/op
kangaroo12_128·p0.99:   581632,000 ns/op
kangaroo12_128·p0.999:  651367,424 ns/op
kangaroo12_128·p0.9999: 746117,427 ns/op
kangaroo12_128·p1.00:   748544,000 ns/op

Iteration   4: 557543,913 ±(99.9%) 78,486 ns/op
kangaroo12_128·p0.00:   551936,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   560128,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  602112,000 ns/op
kangaroo12_128·p0.9999: 633077,760 ns/op
kangaroo12_128·p1.00:   657408,000 ns/op

Iteration   5: 557492,433 ±(99.9%) 315,082 ns/op
kangaroo12_128·p0.00:   542720,000 ns/op
kangaroo12_128·p0.50:   557056,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   560128,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  626767,872 ns/op
kangaroo12_128·p0.9999: 1110783,386 ns/op
kangaroo12_128·p1.00:   2062336,000 ns/op


# Run progress: 81,33% complete, ETA 02:52:19
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 561736,008 ±(99.9%) 14413,823 ns/op
# Warmup Iteration   2: 558311,434 ±(99.9%) 268,364 ns/op
# Warmup Iteration   3: 555587,936 ±(99.9%) 152,664 ns/op
# Warmup Iteration   4: 555643,131 ±(99.9%) 105,472 ns/op
# Warmup Iteration   5: 556992,289 ±(99.9%) 116,107 ns/op
Iteration   1: 558149,449 ±(99.9%) 165,689 ns/op
kangaroo12_128·p0.00:   543744,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   563200,000 ns/op
kangaroo12_128·p0.99:   577536,000 ns/op
kangaroo12_128·p0.999:  669797,376 ns/op
kangaroo12_128·p0.9999: 746116,813 ns/op
kangaroo12_128·p1.00:   748544,000 ns/op

Iteration   2: 557421,025 ±(99.9%) 93,466 ns/op
kangaroo12_128·p0.00:   549888,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   559104,000 ns/op
kangaroo12_128·p0.95:   560128,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  606441,472 ns/op
kangaroo12_128·p0.9999: 699317,043 ns/op
kangaroo12_128·p1.00:   734208,000 ns/op

Iteration   3: 557350,546 ±(99.9%) 113,928 ns/op
kangaroo12_128·p0.00:   536576,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   559104,000 ns/op
kangaroo12_128·p0.95:   560128,000 ns/op
kangaroo12_128·p0.99:   565248,000 ns/op
kangaroo12_128·p0.999:  604538,880 ns/op
kangaroo12_128·p0.9999: 737960,960 ns/op
kangaroo12_128·p1.00:   920576,000 ns/op

Iteration   4: 557383,470 ±(99.9%) 97,714 ns/op
kangaroo12_128·p0.00:   542720,000 ns/op
kangaroo12_128·p0.50:   558080,000 ns/op
kangaroo12_128·p0.90:   559104,000 ns/op
kangaroo12_128·p0.95:   560128,000 ns/op
kangaroo12_128·p0.99:   564224,000 ns/op
kangaroo12_128·p0.999:  607539,200 ns/op
kangaroo12_128·p0.9999: 703004,160 ns/op
kangaroo12_128·p1.00:   716800,000 ns/op

Iteration   5: 557106,021 ±(99.9%) 321,865 ns/op
kangaroo12_128·p0.00:   545792,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   564224,000 ns/op
kangaroo12_128·p0.99:   576512,000 ns/op
kangaroo12_128·p0.999:  662663,168 ns/op
kangaroo12_128·p0.9999: 1003013,530 ns/op
kangaroo12_128·p1.00:   2074624,000 ns/op


# Run progress: 81,50% complete, ETA 02:50:49
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 562321,841 ±(99.9%) 14379,304 ns/op
# Warmup Iteration   2: 557259,349 ±(99.9%) 108,789 ns/op
# Warmup Iteration   3: 555826,118 ±(99.9%) 142,487 ns/op
# Warmup Iteration   4: 555980,769 ±(99.9%) 149,976 ns/op
# Warmup Iteration   5: 556633,517 ±(99.9%) 132,362 ns/op
Iteration   1: 556296,282 ±(99.9%) 131,051 ns/op
kangaroo12_128·p0.00:   549888,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   568320,000 ns/op
kangaroo12_128·p0.999:  622673,920 ns/op
kangaroo12_128·p0.9999: 737021,952 ns/op
kangaroo12_128·p1.00:   807936,000 ns/op

Iteration   2: 556133,403 ±(99.9%) 135,214 ns/op
kangaroo12_128·p0.00:   548864,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   560128,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   567296,000 ns/op
kangaroo12_128·p0.999:  615493,632 ns/op
kangaroo12_128·p0.9999: 748787,098 ns/op
kangaroo12_128·p1.00:   757760,000 ns/op

Iteration   3: 557647,961 ±(99.9%) 233,423 ns/op
kangaroo12_128·p0.00:   544768,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   562176,000 ns/op
kangaroo12_128·p0.95:   567296,000 ns/op
kangaroo12_128·p0.99:   583680,000 ns/op
kangaroo12_128·p0.999:  710141,952 ns/op
kangaroo12_128·p0.9999: 772309,299 ns/op
kangaroo12_128·p1.00:   773120,000 ns/op

Iteration   4: 556250,814 ±(99.9%) 112,225 ns/op
kangaroo12_128·p0.00:   549888,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   568320,000 ns/op
kangaroo12_128·p0.999:  587892,736 ns/op
kangaroo12_128·p0.9999: 715455,898 ns/op
kangaroo12_128·p1.00:   734208,000 ns/op

Iteration   5: 556246,595 ±(99.9%) 303,685 ns/op
kangaroo12_128·p0.00:   547840,000 ns/op
kangaroo12_128·p0.50:   556032,000 ns/op
kangaroo12_128·p0.90:   561152,000 ns/op
kangaroo12_128·p0.95:   562176,000 ns/op
kangaroo12_128·p0.99:   569344,000 ns/op
kangaroo12_128·p0.999:  595138,560 ns/op
kangaroo12_128·p0.9999: 980217,856 ns/op
kangaroo12_128·p1.00:   2105344,000 ns/op



Result "org.example.Main.kangaroo12_128":
N = 179367
mean = 556997,734 ±(99.9%) 59,981 ns/op

Histogram, ns/op:
[      0,000,  250000,000) = 0
[ 250000,000,  500000,000) = 0
[ 500000,000,  750000,000) = 179357
[ 750000,000, 1000000,000) = 8
[1000000,000, 1250000,000) = 0
[1250000,000, 1500000,000) = 0
[1500000,000, 1750000,000) = 0
[1750000,000, 2000000,000) = 0
[2000000,000, 2250000,000) = 2
[2250000,000, 2500000,000) = 0
[2500000,000, 2750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 536576,000 ns/op
p(50,0000) = 556032,000 ns/op
p(90,0000) = 560128,000 ns/op
p(95,0000) = 562176,000 ns/op
p(99,0000) = 571392,000 ns/op
p(99,9000) = 628736,000 ns/op
p(99,9900) = 734337,434 ns/op
p(99,9990) = 2080962,150 ns/op
p(99,9999) = 2105344,000 ns/op
p(100,0000) = 2105344,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 4M)

# Run progress: 81,67% complete, ETA 02:49:18
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4762445,361 ±(99.9%) 125833,870 ns/op
# Warmup Iteration   2: 4741065,594 ±(99.9%) 3179,037 ns/op
# Warmup Iteration   3: 4744778,393 ±(99.9%) 1537,551 ns/op
# Warmup Iteration   4: 4745249,064 ±(99.9%) 2337,903 ns/op
# Warmup Iteration   5: 4745688,615 ±(99.9%) 1117,872 ns/op
Iteration   1: 4750682,525 ±(99.9%) 3316,437 ns/op
kangaroo12_128·p0.00:   4661248,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4784128,000 ns/op
kangaroo12_128·p0.99:   4947968,000 ns/op
kangaroo12_128·p0.999:  5565030,400 ns/op
kangaroo12_128·p0.9999: 5603328,000 ns/op
kangaroo12_128·p1.00:   5603328,000 ns/op

Iteration   2: 4753121,553 ±(99.9%) 3617,232 ns/op
kangaroo12_128·p0.00:   4702208,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4792320,000 ns/op
kangaroo12_128·p0.99:   4849418,240 ns/op
kangaroo12_128·p0.999:  5275754,496 ns/op
kangaroo12_128·p0.9999: 6717440,000 ns/op
kangaroo12_128·p1.00:   6717440,000 ns/op

Iteration   3: 4750238,662 ±(99.9%) 1205,373 ns/op
kangaroo12_128·p0.00:   4710400,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  4968243,200 ns/op
kangaroo12_128·p0.9999: 5038080,000 ns/op
kangaroo12_128·p1.00:   5038080,000 ns/op

Iteration   4: 4751363,895 ±(99.9%) 1062,537 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  4865196,032 ns/op
kangaroo12_128·p0.9999: 4874240,000 ns/op
kangaroo12_128·p1.00:   4874240,000 ns/op

Iteration   5: 4752166,345 ±(99.9%) 1410,456 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  4855300,096 ns/op
kangaroo12_128·p0.9999: 5382144,000 ns/op
kangaroo12_128·p1.00:   5382144,000 ns/op


# Run progress: 81,83% complete, ETA 02:47:47
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4779078,030 ±(99.9%) 152650,275 ns/op
# Warmup Iteration   2: 4737091,943 ±(99.9%) 1574,739 ns/op
# Warmup Iteration   3: 4744790,063 ±(99.9%) 1524,551 ns/op
# Warmup Iteration   4: 4752107,914 ±(99.9%) 1530,613 ns/op
# Warmup Iteration   5: 4763710,475 ±(99.9%) 3286,229 ns/op
Iteration   1: 4748484,044 ±(99.9%) 2480,696 ns/op
kangaroo12_128·p0.00:   4653056,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4762828,800 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4816896,000 ns/op
kangaroo12_128·p0.999:  5262245,888 ns/op
kangaroo12_128·p0.9999: 5554176,000 ns/op
kangaroo12_128·p1.00:   5554176,000 ns/op

Iteration   2: 4755703,593 ±(99.9%) 1329,921 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4775936,000 ns/op
kangaroo12_128·p0.95:   4784128,000 ns/op
kangaroo12_128·p0.99:   4808704,000 ns/op
kangaroo12_128·p0.999:  4987256,832 ns/op
kangaroo12_128·p0.9999: 5152768,000 ns/op
kangaroo12_128·p1.00:   5152768,000 ns/op

Iteration   3: 4754742,805 ±(99.9%) 1087,637 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4808704,000 ns/op
kangaroo12_128·p0.999:  4900257,792 ns/op
kangaroo12_128·p0.9999: 4939776,000 ns/op
kangaroo12_128·p1.00:   4939776,000 ns/op

Iteration   4: 4765618,846 ±(99.9%) 5171,688 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4759552,000 ns/op
kangaroo12_128·p0.90:   4784128,000 ns/op
kangaroo12_128·p0.95:   4808704,000 ns/op
kangaroo12_128·p0.99:   4956160,000 ns/op
kangaroo12_128·p0.999:  5948358,656 ns/op
kangaroo12_128·p0.9999: 6103040,000 ns/op
kangaroo12_128·p1.00:   6103040,000 ns/op

Iteration   5: 4751920,936 ±(99.9%) 1994,558 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4816568,320 ns/op
kangaroo12_128·p0.999:  5335941,120 ns/op
kangaroo12_128·p0.9999: 5406720,000 ns/op
kangaroo12_128·p1.00:   5406720,000 ns/op


# Run progress: 82,00% complete, ETA 02:46:17
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4764857,072 ±(99.9%) 125443,696 ns/op
# Warmup Iteration   2: 4739759,848 ±(99.9%) 2054,559 ns/op
# Warmup Iteration   3: 4759934,475 ±(99.9%) 3666,872 ns/op
# Warmup Iteration   4: 4747312,646 ±(99.9%) 2655,920 ns/op
# Warmup Iteration   5: 4744607,240 ±(99.9%) 1237,509 ns/op
Iteration   1: 4745750,853 ±(99.9%) 1895,493 ns/op
kangaroo12_128·p0.00:   4694016,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4759552,000 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4824514,560 ns/op
kangaroo12_128·p0.999:  5207482,368 ns/op
kangaroo12_128·p0.9999: 5234688,000 ns/op
kangaroo12_128·p1.00:   5234688,000 ns/op

Iteration   2: 4761526,822 ±(99.9%) 7223,420 ns/op
kangaroo12_128·p0.00:   4677632,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4775936,000 ns/op
kangaroo12_128·p0.95:   4808704,000 ns/op
kangaroo12_128·p0.99:   5054464,000 ns/op
kangaroo12_128·p0.999:  6253772,800 ns/op
kangaroo12_128·p0.9999: 6938624,000 ns/op
kangaroo12_128·p1.00:   6938624,000 ns/op

Iteration   3: 4744848,410 ±(99.9%) 1232,878 ns/op
kangaroo12_128·p0.00:   4702208,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4759552,000 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  4976353,280 ns/op
kangaroo12_128·p0.9999: 5021696,000 ns/op
kangaroo12_128·p1.00:   5021696,000 ns/op

Iteration   4: 4747499,447 ±(99.9%) 2959,914 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4759552,000 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  5417402,368 ns/op
kangaroo12_128·p0.9999: 6176768,000 ns/op
kangaroo12_128·p1.00:   6176768,000 ns/op

Iteration   5: 4750203,620 ±(99.9%) 1901,218 ns/op
kangaroo12_128·p0.00:   4677632,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  5240750,080 ns/op
kangaroo12_128·p0.9999: 5300224,000 ns/op
kangaroo12_128·p1.00:   5300224,000 ns/op


# Run progress: 82,17% complete, ETA 02:44:46
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4775650,278 ±(99.9%) 125091,441 ns/op
# Warmup Iteration   2: 4742639,233 ±(99.9%) 2499,900 ns/op
# Warmup Iteration   3: 4747651,223 ±(99.9%) 4717,731 ns/op
# Warmup Iteration   4: 4745770,302 ±(99.9%) 2062,912 ns/op
# Warmup Iteration   5: 4758217,874 ±(99.9%) 2340,968 ns/op
Iteration   1: 4752298,788 ±(99.9%) 2502,824 ns/op
kangaroo12_128·p0.00:   4653056,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4832952,320 ns/op
kangaroo12_128·p0.999:  5331288,064 ns/op
kangaroo12_128·p0.9999: 5414912,000 ns/op
kangaroo12_128·p1.00:   5414912,000 ns/op

Iteration   2: 4752575,361 ±(99.9%) 1013,687 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  4848812,032 ns/op
kangaroo12_128·p0.9999: 4923392,000 ns/op
kangaroo12_128·p1.00:   4923392,000 ns/op

Iteration   3: 4750441,125 ±(99.9%) 1366,657 ns/op
kangaroo12_128·p0.00:   4710400,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4800512,000 ns/op
kangaroo12_128·p0.999:  5000151,040 ns/op
kangaroo12_128·p0.9999: 5152768,000 ns/op
kangaroo12_128·p1.00:   5152768,000 ns/op

Iteration   4: 4765642,285 ±(99.9%) 4492,263 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4759552,000 ns/op
kangaroo12_128·p0.90:   4784128,000 ns/op
kangaroo12_128·p0.95:   4816896,000 ns/op
kangaroo12_128·p0.99:   4890624,000 ns/op
kangaroo12_128·p0.999:  6072860,672 ns/op
kangaroo12_128·p0.9999: 6135808,000 ns/op
kangaroo12_128·p1.00:   6135808,000 ns/op

Iteration   5: 4755171,501 ±(99.9%) 2125,814 ns/op
kangaroo12_128·p0.00:   4702208,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4825088,000 ns/op
kangaroo12_128·p0.999:  5315026,944 ns/op
kangaroo12_128·p0.9999: 5521408,000 ns/op
kangaroo12_128·p1.00:   5521408,000 ns/op


# Run progress: 82,33% complete, ETA 02:43:16
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4760344,271 ±(99.9%) 126768,365 ns/op
# Warmup Iteration   2: 4734374,503 ±(99.9%) 2029,890 ns/op
# Warmup Iteration   3: 4750892,553 ±(99.9%) 1788,593 ns/op
# Warmup Iteration   4: 4750051,772 ±(99.9%) 1759,664 ns/op
# Warmup Iteration   5: 4748836,989 ±(99.9%) 2955,810 ns/op
Iteration   1: 4746678,301 ±(99.9%) 1298,072 ns/op
kangaroo12_128·p0.00:   4710400,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4759552,000 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4808704,000 ns/op
kangaroo12_128·p0.999:  4871634,944 ns/op
kangaroo12_128·p0.9999: 5210112,000 ns/op
kangaroo12_128·p1.00:   5210112,000 ns/op

Iteration   2: 4766630,638 ±(99.9%) 7355,556 ns/op
kangaroo12_128·p0.00:   4718592,000 ns/op
kangaroo12_128·p0.50:   4751360,000 ns/op
kangaroo12_128·p0.90:   4784128,000 ns/op
kangaroo12_128·p0.95:   4808704,000 ns/op
kangaroo12_128·p0.99:   5169315,840 ns/op
kangaroo12_128·p0.999:  5991890,944 ns/op
kangaroo12_128·p0.9999: 6864896,000 ns/op
kangaroo12_128·p1.00:   6864896,000 ns/op

Iteration   3: 4752458,499 ±(99.9%) 5781,880 ns/op
kangaroo12_128·p0.00:   4685824,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4767744,000 ns/op
kangaroo12_128·p0.95:   4775936,000 ns/op
kangaroo12_128·p0.99:   4849336,320 ns/op
kangaroo12_128·p0.999:  6537216,000 ns/op
kangaroo12_128·p0.9999: 6537216,000 ns/op
kangaroo12_128·p1.00:   6537216,000 ns/op

Iteration   4: 4742732,545 ±(99.9%) 1018,581 ns/op
kangaroo12_128·p0.00:   4677632,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4759552,000 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4792320,000 ns/op
kangaroo12_128·p0.999:  4856086,528 ns/op
kangaroo12_128·p0.9999: 4907008,000 ns/op
kangaroo12_128·p1.00:   4907008,000 ns/op

Iteration   5: 4744272,714 ±(99.9%) 1270,327 ns/op
kangaroo12_128·p0.00:   4694016,000 ns/op
kangaroo12_128·p0.50:   4743168,000 ns/op
kangaroo12_128·p0.90:   4759552,000 ns/op
kangaroo12_128·p0.95:   4767744,000 ns/op
kangaroo12_128·p0.99:   4816322,560 ns/op
kangaroo12_128·p0.999:  4980162,560 ns/op
kangaroo12_128·p0.9999: 5013504,000 ns/op
kangaroo12_128·p1.00:   5013504,000 ns/op



Result "org.example.Main.kangaroo12_128":
N = 21027
mean = 4752878,639 ±(99.9%) 1131,197 ns/op

Histogram, ns/op:
[4000000,000, 4250000,000) = 0
[4250000,000, 4500000,000) = 0
[4500000,000, 4750000,000) = 10172
[4750000,000, 5000000,000) = 10781
[5000000,000, 5250000,000) = 38
[5250000,000, 5500000,000) = 12
[5500000,000, 5750000,000) = 8
[5750000,000, 6000000,000) = 9
[6000000,000, 6250000,000) = 3
[6250000,000, 6500000,000) = 0
[6500000,000, 6750000,000) = 3

Percentiles, ns/op:
p(0,0000) = 4653056,000 ns/op
p(50,0000) = 4751360,000 ns/op
p(90,0000) = 4767744,000 ns/op
p(95,0000) = 4775936,000 ns/op
p(99,0000) = 4841472,000 ns/op
p(99,9000) = 5570560,000 ns/op
p(99,9900) = 6537216,000 ns/op
p(99,9990) = 6864896,000 ns/op
p(99,9999) = 6864896,000 ns/op
p(100,0000) = 6864896,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 20M)

# Run progress: 82,50% complete, ETA 02:41:45
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23829513,752 ±(99.9%) 639980,896 ns/op
# Warmup Iteration   2: 23774701,758 ±(99.9%) 138199,284 ns/op
# Warmup Iteration   3: 23738119,905 ±(99.9%) 7683,029 ns/op
# Warmup Iteration   4: 23749872,798 ±(99.9%) 16755,855 ns/op
# Warmup Iteration   5: 23767852,390 ±(99.9%) 26975,546 ns/op
Iteration   1: 23739131,743 ±(99.9%) 21426,708 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24117248,000 ns/op
kangaroo12_128·p0.999:  26050560,000 ns/op
kangaroo12_128·p0.9999: 26050560,000 ns/op
kangaroo12_128·p1.00:   26050560,000 ns/op

Iteration   2: 23718596,550 ±(99.9%) 12275,161 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23855104,000 ns/op
kangaroo12_128·p0.99:   24051712,000 ns/op
kangaroo12_128·p0.999:  24346624,000 ns/op
kangaroo12_128·p0.9999: 24346624,000 ns/op
kangaroo12_128·p1.00:   24346624,000 ns/op

Iteration   3: 23722323,716 ±(99.9%) 31818,604 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   23988797,440 ns/op
kangaroo12_128·p0.999:  27590656,000 ns/op
kangaroo12_128·p0.9999: 27590656,000 ns/op
kangaroo12_128·p1.00:   27590656,000 ns/op

Iteration   4: 23737263,734 ±(99.9%) 35127,013 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23822336,000 ns/op
kangaroo12_128·p0.95:   23920640,000 ns/op
kangaroo12_128·p0.99:   24659886,080 ns/op
kangaroo12_128·p0.999:  27328512,000 ns/op
kangaroo12_128·p0.9999: 27328512,000 ns/op
kangaroo12_128·p1.00:   27328512,000 ns/op

Iteration   5: 23729312,152 ±(99.9%) 13580,780 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24011407,360 ns/op
kangaroo12_128·p0.999:  24838144,000 ns/op
kangaroo12_128·p0.9999: 24838144,000 ns/op
kangaroo12_128·p1.00:   24838144,000 ns/op


# Run progress: 82,67% complete, ETA 02:40:14
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23764505,539 ±(99.9%) 624460,265 ns/op
# Warmup Iteration   2: 23687226,237 ±(99.9%) 28459,086 ns/op
# Warmup Iteration   3: 23721081,327 ±(99.9%) 20507,112 ns/op
# Warmup Iteration   4: 23757811,838 ±(99.9%) 35473,891 ns/op
# Warmup Iteration   5: 23714403,488 ±(99.9%) 29168,476 ns/op
Iteration   1: 23713549,346 ±(99.9%) 8765,895 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   23920640,000 ns/op
kangaroo12_128·p0.999:  24018944,000 ns/op
kangaroo12_128·p0.9999: 24018944,000 ns/op
kangaroo12_128·p1.00:   24018944,000 ns/op

Iteration   2: 23723566,104 ±(99.9%) 39139,297 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24003870,720 ns/op
kangaroo12_128·p0.999:  28540928,000 ns/op
kangaroo12_128·p0.9999: 28540928,000 ns/op
kangaroo12_128·p1.00:   28540928,000 ns/op

Iteration   3: 23757267,002 ±(99.9%) 20092,507 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23855104,000 ns/op
kangaroo12_128·p0.95:   24018944,000 ns/op
kangaroo12_128·p0.99:   24317788,160 ns/op
kangaroo12_128·p0.999:  24739840,000 ns/op
kangaroo12_128·p0.9999: 24739840,000 ns/op
kangaroo12_128·p1.00:   24739840,000 ns/op

Iteration   4: 23712928,152 ±(99.9%) 9551,162 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   23887872,000 ns/op
kangaroo12_128·p0.999:  24150016,000 ns/op
kangaroo12_128·p0.9999: 24150016,000 ns/op
kangaroo12_128·p1.00:   24150016,000 ns/op

Iteration   5: 23701436,057 ±(99.9%) 9797,413 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23756800,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   23913103,360 ns/op
kangaroo12_128·p0.999:  24150016,000 ns/op
kangaroo12_128·p0.9999: 24150016,000 ns/op
kangaroo12_128·p1.00:   24150016,000 ns/op


# Run progress: 82,83% complete, ETA 02:38:44
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23779449,615 ±(99.9%) 622972,850 ns/op
# Warmup Iteration   2: 23756410,831 ±(99.9%) 69731,693 ns/op
# Warmup Iteration   3: 23722246,066 ±(99.9%) 18619,506 ns/op
# Warmup Iteration   4: 23722323,716 ±(99.9%) 8398,732 ns/op
# Warmup Iteration   5: 23739287,411 ±(99.9%) 13255,184 ns/op
Iteration   1: 23768475,059 ±(99.9%) 33854,033 ns/op
kangaroo12_128·p0.00:   23494656,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23887872,000 ns/op
kangaroo12_128·p0.95:   24018944,000 ns/op
kangaroo12_128·p0.99:   24404951,040 ns/op
kangaroo12_128·p0.999:  26836992,000 ns/op
kangaroo12_128·p0.9999: 26836992,000 ns/op
kangaroo12_128·p1.00:   26836992,000 ns/op

Iteration   2: 23734281,706 ±(99.9%) 31684,682 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23855104,000 ns/op
kangaroo12_128·p0.99:   24076943,360 ns/op
kangaroo12_128·p0.999:  27328512,000 ns/op
kangaroo12_128·p0.9999: 27328512,000 ns/op
kangaroo12_128·p1.00:   27328512,000 ns/op

Iteration   3: 23716500,019 ±(99.9%) 12975,138 ns/op
kangaroo12_128·p0.00:   23527424,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24175247,360 ns/op
kangaroo12_128·p0.999:  24379392,000 ns/op
kangaroo12_128·p0.9999: 24379392,000 ns/op
kangaroo12_128·p1.00:   24379392,000 ns/op

Iteration   4: 23743957,435 ±(99.9%) 42115,620 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   23986176,000 ns/op
kangaroo12_128·p0.999:  28704768,000 ns/op
kangaroo12_128·p0.9999: 28704768,000 ns/op
kangaroo12_128·p1.00:   28704768,000 ns/op

Iteration   5: 23807122,286 ±(99.9%) 46551,158 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23756800,000 ns/op
kangaroo12_128·p0.90:   23920640,000 ns/op
kangaroo12_128·p0.95:   24117248,000 ns/op
kangaroo12_128·p0.99:   25659310,080 ns/op
kangaroo12_128·p0.999:  26509312,000 ns/op
kangaroo12_128·p0.9999: 26509312,000 ns/op
kangaroo12_128·p1.00:   26509312,000 ns/op


# Run progress: 83,00% complete, ETA 02:37:13
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23813519,848 ±(99.9%) 634685,696 ns/op
# Warmup Iteration   2: 23695457,062 ±(99.9%) 9887,620 ns/op
# Warmup Iteration   3: 23732884,019 ±(99.9%) 11954,177 ns/op
# Warmup Iteration   4: 23782407,297 ±(99.9%) 22120,847 ns/op
# Warmup Iteration   5: 23737030,233 ±(99.9%) 10325,403 ns/op
Iteration   1: 23738586,907 ±(99.9%) 10212,352 ns/op
kangaroo12_128·p0.00:   23625728,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23855104,000 ns/op
kangaroo12_128·p0.99:   24018944,000 ns/op
kangaroo12_128·p0.999:  24281088,000 ns/op
kangaroo12_128·p0.9999: 24281088,000 ns/op
kangaroo12_128·p1.00:   24281088,000 ns/op

Iteration   2: 23736641,064 ±(99.9%) 10820,231 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24110039,040 ns/op
kangaroo12_128·p0.999:  24281088,000 ns/op
kangaroo12_128·p0.9999: 24281088,000 ns/op
kangaroo12_128·p1.00:   24281088,000 ns/op

Iteration   3: 23800022,552 ±(99.9%) 39432,151 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23756800,000 ns/op
kangaroo12_128·p0.90:   23917363,200 ns/op
kangaroo12_128·p0.95:   24082841,600 ns/op
kangaroo12_128·p0.99:   25020989,440 ns/op
kangaroo12_128·p0.999:  26640384,000 ns/op
kangaroo12_128·p0.9999: 26640384,000 ns/op
kangaroo12_128·p1.00:   26640384,000 ns/op

Iteration   4: 23726749,725 ±(99.9%) 9542,662 ns/op
kangaroo12_128·p0.00:   23625728,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   23971102,720 ns/op
kangaroo12_128·p0.999:  24117248,000 ns/op
kangaroo12_128·p0.9999: 24117248,000 ns/op
kangaroo12_128·p1.00:   24117248,000 ns/op

Iteration   5: 23722479,014 ±(99.9%) 10969,384 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24029102,080 ns/op
kangaroo12_128·p0.999:  24379392,000 ns/op
kangaroo12_128·p0.9999: 24379392,000 ns/op
kangaroo12_128·p1.00:   24379392,000 ns/op


# Run progress: 83,17% complete, ETA 02:35:42
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23808682,667 ±(99.9%) 631710,807 ns/op
# Warmup Iteration   2: 23751351,639 ±(99.9%) 25520,100 ns/op
# Warmup Iteration   3: 23723643,754 ±(99.9%) 13323,987 ns/op
# Warmup Iteration   4: 23732728,720 ±(99.9%) 34632,474 ns/op
# Warmup Iteration   5: 23722323,716 ±(99.9%) 11706,355 ns/op
Iteration   1: 23771666,242 ±(99.9%) 29364,396 ns/op
kangaroo12_128·p0.00:   23560192,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23920640,000 ns/op
kangaroo12_128·p0.95:   24117248,000 ns/op
kangaroo12_128·p0.99:   24769331,200 ns/op
kangaroo12_128·p0.999:  25100288,000 ns/op
kangaroo12_128·p0.9999: 25100288,000 ns/op
kangaroo12_128·p1.00:   25100288,000 ns/op

Iteration   2: 23719838,938 ±(99.9%) 10461,628 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23691264,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23822336,000 ns/op
kangaroo12_128·p0.99:   24061870,080 ns/op
kangaroo12_128·p0.999:  24182784,000 ns/op
kangaroo12_128·p0.9999: 24182784,000 ns/op
kangaroo12_128·p1.00:   24182784,000 ns/op

Iteration   3: 23752519,145 ±(99.9%) 25438,250 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23822336,000 ns/op
kangaroo12_128·p0.95:   23855104,000 ns/op
kangaroo12_128·p0.99:   24135598,080 ns/op
kangaroo12_128·p0.999:  26411008,000 ns/op
kangaroo12_128·p0.9999: 26411008,000 ns/op
kangaroo12_128·p1.00:   26411008,000 ns/op

Iteration   4: 23736145,289 ±(99.9%) 10401,958 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23724032,000 ns/op
kangaroo12_128·p0.90:   23789568,000 ns/op
kangaroo12_128·p0.95:   23855104,000 ns/op
kangaroo12_128·p0.99:   24018944,000 ns/op
kangaroo12_128·p0.999:  24182784,000 ns/op
kangaroo12_128·p0.9999: 24182784,000 ns/op
kangaroo12_128·p1.00:   24182784,000 ns/op

Iteration   5: 23788633,995 ±(99.9%) 23480,495 ns/op
kangaroo12_128·p0.00:   23592960,000 ns/op
kangaroo12_128·p0.50:   23756800,000 ns/op
kangaroo12_128·p0.90:   23920640,000 ns/op
kangaroo12_128·p0.95:   24018944,000 ns/op
kangaroo12_128·p0.99:   24390533,120 ns/op
kangaroo12_128·p0.999:  25001984,000 ns/op
kangaroo12_128·p0.9999: 25001984,000 ns/op
kangaroo12_128·p1.00:   25001984,000 ns/op



Result "org.example.Main.kangaroo12_128":
N = 4213
mean = 23749294,394 ±(99.9%) 6615,402 ns/op

Histogram, ns/op:
[23000000,000, 23250000,000) = 0
[23250000,000, 23500000,000) = 0
[23500000,000, 23750000,000) = 2641
[23750000,000, 24000000,000) = 1455
[24000000,000, 24250000,000) = 80
[24250000,000, 24500000,000) = 18
[24500000,000, 24750000,000) = 4
[24750000,000, 25000000,000) = 6
[25000000,000, 25250000,000) = 5
[25250000,000, 25500000,000) = 1
[25500000,000, 25750000,000) = 1
[25750000,000, 26000000,000) = 0
[26000000,000, 26250000,000) = 0
[26250000,000, 26500000,000) = 1
[26500000,000, 26750000,000) = 1

Percentiles, ns/op:
p(0,0000) = 23560192,000 ns/op
p(50,0000) = 23724032,000 ns/op
p(90,0000) = 23822336,000 ns/op
p(95,0000) = 23887872,000 ns/op
p(99,0000) = 24210964,480 ns/op
p(99,9000) = 25332088,832 ns/op
p(99,9900) = 26640384,000 ns/op
p(99,9990) = 26640384,000 ns/op
p(99,9999) = 26640384,000 ns/op
p(100,0000) = 26640384,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 64K)

# Run progress: 83,33% complete, ETA 02:34:11
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70685,468 ±(99.9%) 1825,318 ns/op
# Warmup Iteration   2: 70057,616 ±(99.9%) 13,068 ns/op
# Warmup Iteration   3: 70192,347 ±(99.9%) 14,744 ns/op
# Warmup Iteration   4: 70314,223 ±(99.9%) 48,428 ns/op
# Warmup Iteration   5: 69805,575 ±(99.9%) 11,697 ns/op
Iteration   1: 69865,168 ±(99.9%) 9,364 ns/op
kangaroo12_256·p0.00:   68864,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70016,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73472,000 ns/op
kangaroo12_256·p0.999:  77568,000 ns/op
kangaroo12_256·p0.9999: 95834,125 ns/op
kangaroo12_256·p1.00:   115584,000 ns/op

Iteration   2: 69859,299 ±(99.9%) 10,104 ns/op
kangaroo12_256·p0.00:   67712,000 ns/op
kangaroo12_256·p0.50:   69504,000 ns/op
kangaroo12_256·p0.90:   70784,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73728,000 ns/op
kangaroo12_256·p0.999:  78592,000 ns/op
kangaroo12_256·p0.9999: 89728,000 ns/op
kangaroo12_256·p1.00:   128000,000 ns/op

Iteration   3: 70034,514 ±(99.9%) 35,007 ns/op
kangaroo12_256·p0.00:   67840,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   71040,000 ns/op
kangaroo12_256·p0.95:   72960,000 ns/op
kangaroo12_256·p0.99:   74368,000 ns/op
kangaroo12_256·p0.999:  87552,000 ns/op
kangaroo12_256·p0.9999: 104637,107 ns/op
kangaroo12_256·p1.00:   1478656,000 ns/op

Iteration   4: 69787,049 ±(99.9%) 11,446 ns/op
kangaroo12_256·p0.00:   67968,000 ns/op
kangaroo12_256·p0.50:   69504,000 ns/op
kangaroo12_256·p0.90:   70272,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73856,000 ns/op
kangaroo12_256·p0.999:  83328,000 ns/op
kangaroo12_256·p0.9999: 99256,448 ns/op
kangaroo12_256·p1.00:   114432,000 ns/op

Iteration   5: 69661,762 ±(99.9%) 10,318 ns/op
kangaroo12_256·p0.00:   67328,000 ns/op
kangaroo12_256·p0.50:   69248,000 ns/op
kangaroo12_256·p0.90:   70016,000 ns/op
kangaroo12_256·p0.95:   72576,000 ns/op
kangaroo12_256·p0.99:   73600,000 ns/op
kangaroo12_256·p0.999:  79232,000 ns/op
kangaroo12_256·p0.9999: 96115,507 ns/op
kangaroo12_256·p1.00:   110720,000 ns/op


# Run progress: 83,50% complete, ETA 02:32:40
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70858,884 ±(99.9%) 1805,377 ns/op
# Warmup Iteration   2: 70404,271 ±(99.9%) 19,517 ns/op
# Warmup Iteration   3: 70457,867 ±(99.9%) 16,328 ns/op
# Warmup Iteration   4: 70354,002 ±(99.9%) 34,048 ns/op
# Warmup Iteration   5: 70156,046 ±(99.9%) 10,140 ns/op
Iteration   1: 70274,061 ±(99.9%) 12,367 ns/op
kangaroo12_256·p0.00:   68736,000 ns/op
kangaroo12_256·p0.50:   70016,000 ns/op
kangaroo12_256·p0.90:   70656,000 ns/op
kangaroo12_256·p0.95:   73216,000 ns/op
kangaroo12_256·p0.99:   74112,000 ns/op
kangaroo12_256·p0.999:  87536,128 ns/op
kangaroo12_256·p0.9999: 104979,251 ns/op
kangaroo12_256·p1.00:   116992,000 ns/op

Iteration   2: 70087,567 ±(99.9%) 11,639 ns/op
kangaroo12_256·p0.00:   68608,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70784,000 ns/op
kangaroo12_256·p0.95:   72960,000 ns/op
kangaroo12_256·p0.99:   75008,000 ns/op
kangaroo12_256·p0.999:  82944,000 ns/op
kangaroo12_256·p0.9999: 90719,910 ns/op
kangaroo12_256·p1.00:   126720,000 ns/op

Iteration   3: 70093,202 ±(99.9%) 38,823 ns/op
kangaroo12_256·p0.00:   68608,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   71040,000 ns/op
kangaroo12_256·p0.95:   72960,000 ns/op
kangaroo12_256·p0.99:   74496,000 ns/op
kangaroo12_256·p0.999:  81856,512 ns/op
kangaroo12_256·p0.9999: 89888,563 ns/op
kangaroo12_256·p1.00:   1677312,000 ns/op

Iteration   4: 70033,579 ±(99.9%) 11,495 ns/op
kangaroo12_256·p0.00:   68096,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70272,000 ns/op
kangaroo12_256·p0.95:   72960,000 ns/op
kangaroo12_256·p0.99:   74240,000 ns/op
kangaroo12_256·p0.999:  84096,000 ns/op
kangaroo12_256·p0.9999: 100151,014 ns/op
kangaroo12_256·p1.00:   106880,000 ns/op

Iteration   5: 70064,997 ±(99.9%) 13,728 ns/op
kangaroo12_256·p0.00:   67200,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   71040,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   74368,000 ns/op
kangaroo12_256·p0.999:  89600,000 ns/op
kangaroo12_256·p0.9999: 105461,760 ns/op
kangaroo12_256·p1.00:   182016,000 ns/op


# Run progress: 83,67% complete, ETA 02:31:09
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70864,936 ±(99.9%) 2086,796 ns/op
# Warmup Iteration   2: 70030,740 ±(99.9%) 14,116 ns/op
# Warmup Iteration   3: 70101,890 ±(99.9%) 13,712 ns/op
# Warmup Iteration   4: 69946,681 ±(99.9%) 31,280 ns/op
# Warmup Iteration   5: 69889,387 ±(99.9%) 14,967 ns/op
Iteration   1: 69678,247 ±(99.9%) 10,998 ns/op
kangaroo12_256·p0.00:   65792,000 ns/op
kangaroo12_256·p0.50:   69248,000 ns/op
kangaroo12_256·p0.90:   70272,000 ns/op
kangaroo12_256·p0.95:   72704,000 ns/op
kangaroo12_256·p0.99:   73600,000 ns/op
kangaroo12_256·p0.999:  80896,000 ns/op
kangaroo12_256·p0.9999: 98431,283 ns/op
kangaroo12_256·p1.00:   117504,000 ns/op

Iteration   2: 69755,479 ±(99.9%) 11,729 ns/op
kangaroo12_256·p0.00:   68736,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70912,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73984,000 ns/op
kangaroo12_256·p0.999:  81897,088 ns/op
kangaroo12_256·p0.9999: 97245,235 ns/op
kangaroo12_256·p1.00:   124288,000 ns/op

Iteration   3: 69792,066 ±(99.9%) 29,964 ns/op
kangaroo12_256·p0.00:   66688,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70912,000 ns/op
kangaroo12_256·p0.95:   72704,000 ns/op
kangaroo12_256·p0.99:   73984,000 ns/op
kangaroo12_256·p0.999:  84580,608 ns/op
kangaroo12_256·p0.9999: 100192,922 ns/op
kangaroo12_256·p1.00:   1257472,000 ns/op

Iteration   4: 69974,584 ±(99.9%) 15,924 ns/op
kangaroo12_256·p0.00:   67584,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70272,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   75520,000 ns/op
kangaroo12_256·p0.999:  92416,000 ns/op
kangaroo12_256·p0.9999: 111511,091 ns/op
kangaroo12_256·p1.00:   155648,000 ns/op

Iteration   5: 69840,723 ±(99.9%) 13,223 ns/op
kangaroo12_256·p0.00:   66560,000 ns/op
kangaroo12_256·p0.50:   69504,000 ns/op
kangaroo12_256·p0.90:   70144,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73600,000 ns/op
kangaroo12_256·p0.999:  90239,360 ns/op
kangaroo12_256·p0.9999: 104421,504 ns/op
kangaroo12_256·p1.00:   137472,000 ns/op


# Run progress: 83,83% complete, ETA 02:29:38
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70851,886 ±(99.9%) 1832,690 ns/op
# Warmup Iteration   2: 70311,088 ±(99.9%) 14,099 ns/op
# Warmup Iteration   3: 70344,579 ±(99.9%) 16,911 ns/op
# Warmup Iteration   4: 69982,115 ±(99.9%) 41,357 ns/op
# Warmup Iteration   5: 69664,751 ±(99.9%) 10,262 ns/op
Iteration   1: 69708,005 ±(99.9%) 10,728 ns/op
kangaroo12_256·p0.00:   68864,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70016,000 ns/op
kangaroo12_256·p0.95:   72576,000 ns/op
kangaroo12_256·p0.99:   73856,000 ns/op
kangaroo12_256·p0.999:  81372,800 ns/op
kangaroo12_256·p0.9999: 88368,640 ns/op
kangaroo12_256·p1.00:   102016,000 ns/op

Iteration   2: 69998,476 ±(99.9%) 14,760 ns/op
kangaroo12_256·p0.00:   68608,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70912,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   75776,000 ns/op
kangaroo12_256·p0.999:  93568,000 ns/op
kangaroo12_256·p0.9999: 105856,000 ns/op
kangaroo12_256·p1.00:   116736,000 ns/op

Iteration   3: 70009,083 ±(99.9%) 37,444 ns/op
kangaroo12_256·p0.00:   68096,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   71040,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73728,000 ns/op
kangaroo12_256·p0.999:  77184,000 ns/op
kangaroo12_256·p0.9999: 89335,501 ns/op
kangaroo12_256·p1.00:   1638400,000 ns/op

Iteration   4: 69922,361 ±(99.9%) 8,905 ns/op
kangaroo12_256·p0.00:   68480,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70144,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73600,000 ns/op
kangaroo12_256·p0.999:  77184,000 ns/op
kangaroo12_256·p0.9999: 84736,000 ns/op
kangaroo12_256·p1.00:   134656,000 ns/op

Iteration   5: 69931,795 ±(99.9%) 8,789 ns/op
kangaroo12_256·p0.00:   68608,000 ns/op
kangaroo12_256·p0.50:   69632,000 ns/op
kangaroo12_256·p0.90:   70144,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   73600,000 ns/op
kangaroo12_256·p0.999:  77184,000 ns/op
kangaroo12_256·p0.9999: 85651,750 ns/op
kangaroo12_256·p1.00:   101248,000 ns/op


# Run progress: 84,00% complete, ETA 02:28:07
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 70848,540 ±(99.9%) 1811,263 ns/op
# Warmup Iteration   2: 69989,013 ±(99.9%) 12,786 ns/op
# Warmup Iteration   3: 70053,584 ±(99.9%) 13,194 ns/op
# Warmup Iteration   4: 70092,862 ±(99.9%) 39,591 ns/op
# Warmup Iteration   5: 70003,233 ±(99.9%) 14,874 ns/op
Iteration   1: 69744,751 ±(99.9%) 10,457 ns/op
kangaroo12_256·p0.00:   68864,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70016,000 ns/op
kangaroo12_256·p0.95:   72704,000 ns/op
kangaroo12_256·p0.99:   73856,000 ns/op
kangaroo12_256·p0.999:  81152,000 ns/op
kangaroo12_256·p0.9999: 87766,976 ns/op
kangaroo12_256·p1.00:   99968,000 ns/op

Iteration   2: 69763,043 ±(99.9%) 10,688 ns/op
kangaroo12_256·p0.00:   68224,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70400,000 ns/op
kangaroo12_256·p0.95:   72704,000 ns/op
kangaroo12_256·p0.99:   73984,000 ns/op
kangaroo12_256·p0.999:  81280,000 ns/op
kangaroo12_256·p0.9999: 90892,774 ns/op
kangaroo12_256·p1.00:   120064,000 ns/op

Iteration   3: 69787,432 ±(99.9%) 37,316 ns/op
kangaroo12_256·p0.00:   67328,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70656,000 ns/op
kangaroo12_256·p0.95:   72576,000 ns/op
kangaroo12_256·p0.99:   73984,000 ns/op
kangaroo12_256·p0.999:  82688,000 ns/op
kangaroo12_256·p0.9999: 97393,024 ns/op
kangaroo12_256·p1.00:   1615872,000 ns/op

Iteration   4: 69935,527 ±(99.9%) 15,738 ns/op
kangaroo12_256·p0.00:   68736,000 ns/op
kangaroo12_256·p0.50:   69504,000 ns/op
kangaroo12_256·p0.90:   70400,000 ns/op
kangaroo12_256·p0.95:   72832,000 ns/op
kangaroo12_256·p0.99:   78336,000 ns/op
kangaroo12_256·p0.999:  91904,000 ns/op
kangaroo12_256·p0.9999: 105399,936 ns/op
kangaroo12_256·p1.00:   120960,000 ns/op

Iteration   5: 69740,162 ±(99.9%) 10,560 ns/op
kangaroo12_256·p0.00:   68864,000 ns/op
kangaroo12_256·p0.50:   69376,000 ns/op
kangaroo12_256·p0.90:   70016,000 ns/op
kangaroo12_256·p0.95:   72576,000 ns/op
kangaroo12_256·p0.99:   73984,000 ns/op
kangaroo12_256·p0.999:  82048,000 ns/op
kangaroo12_256·p0.9999: 87085,747 ns/op
kangaroo12_256·p1.00:   97280,000 ns/op



Result "org.example.Main.kangaroo12_256":
N = 1429793
mean =  69853,891 ±(99.9%) 6,223 ns/op

Histogram, ns/op:
[      0,000,  125000,000) = 1429788
[ 125000,000,  250000,000) = 3
[ 250000,000,  375000,000) = 0
[ 375000,000,  500000,000) = 0
[ 500000,000,  625000,000) = 0
[ 625000,000,  750000,000) = 0
[ 750000,000,  875000,000) = 0
[ 875000,000, 1000000,000) = 0
[1000000,000, 1125000,000) = 0
[1125000,000, 1250000,000) = 0
[1250000,000, 1375000,000) = 0
[1375000,000, 1500000,000) = 0
[1500000,000, 1625000,000) = 1
[1625000,000, 1750000,000) = 1
[1750000,000, 1875000,000) = 0

Percentiles, ns/op:
p(0,0000) =  67328,000 ns/op
p(50,0000) =  69504,000 ns/op
p(90,0000) =  70528,000 ns/op
p(95,0000) =  72704,000 ns/op
p(99,0000) =  73984,000 ns/op
p(99,9000) =  82970,368 ns/op
p(99,9900) =  96768,000 ns/op
p(99,9990) = 111888,228 ns/op
p(99,9999) = 1628717,601 ns/op
p(100,0000) = 1638400,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 512K)

# Run progress: 84,17% complete, ETA 02:26:36
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 560055,374 ±(99.9%) 14660,450 ns/op
# Warmup Iteration   2: 555621,147 ±(99.9%) 149,031 ns/op
# Warmup Iteration   3: 557178,096 ±(99.9%) 212,715 ns/op
# Warmup Iteration   4: 555733,236 ±(99.9%) 93,705 ns/op
# Warmup Iteration   5: 557706,389 ±(99.9%) 105,127 ns/op
Iteration   1: 557759,571 ±(99.9%) 104,483 ns/op
kangaroo12_256·p0.00:   549888,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   561152,000 ns/op
kangaroo12_256·p0.95:   562176,000 ns/op
kangaroo12_256·p0.99:   567296,000 ns/op
kangaroo12_256·p0.999:  592896,000 ns/op
kangaroo12_256·p0.9999: 738037,248 ns/op
kangaroo12_256·p1.00:   806912,000 ns/op

Iteration   2: 557861,008 ±(99.9%) 193,215 ns/op
kangaroo12_256·p0.00:   535552,000 ns/op
kangaroo12_256·p0.50:   557056,000 ns/op
kangaroo12_256·p0.90:   562176,000 ns/op
kangaroo12_256·p0.95:   564224,000 ns/op
kangaroo12_256·p0.99:   578560,000 ns/op
kangaroo12_256·p0.999:  678912,000 ns/op
kangaroo12_256·p0.9999: 742982,656 ns/op
kangaroo12_256·p1.00:   776192,000 ns/op

Iteration   3: 556661,131 ±(99.9%) 109,112 ns/op
kangaroo12_256·p0.00:   547840,000 ns/op
kangaroo12_256·p0.50:   556032,000 ns/op
kangaroo12_256·p0.90:   561152,000 ns/op
kangaroo12_256·p0.95:   563200,000 ns/op
kangaroo12_256·p0.99:   568320,000 ns/op
kangaroo12_256·p0.999:  598016,000 ns/op
kangaroo12_256·p0.9999: 683428,045 ns/op
kangaroo12_256·p1.00:   685056,000 ns/op

Iteration   4: 556346,932 ±(99.9%) 124,767 ns/op
kangaroo12_256·p0.00:   549888,000 ns/op
kangaroo12_256·p0.50:   556032,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   562176,000 ns/op
kangaroo12_256·p0.99:   568320,000 ns/op
kangaroo12_256·p0.999:  616699,904 ns/op
kangaroo12_256·p0.9999: 710906,982 ns/op
kangaroo12_256·p1.00:   719872,000 ns/op

Iteration   5: 555907,561 ±(99.9%) 333,968 ns/op
kangaroo12_256·p0.00:   548864,000 ns/op
kangaroo12_256·p0.50:   555008,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   562176,000 ns/op
kangaroo12_256·p0.99:   567296,000 ns/op
kangaroo12_256·p0.999:  593034,240 ns/op
kangaroo12_256·p0.9999: 1024189,440 ns/op
kangaroo12_256·p1.00:   2289664,000 ns/op


# Run progress: 84,33% complete, ETA 02:25:05
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 561782,110 ±(99.9%) 14730,560 ns/op
# Warmup Iteration   2: 555991,423 ±(99.9%) 118,086 ns/op
# Warmup Iteration   3: 555868,541 ±(99.9%) 184,087 ns/op
# Warmup Iteration   4: 555605,737 ±(99.9%) 90,719 ns/op
# Warmup Iteration   5: 557396,381 ±(99.9%) 152,062 ns/op
Iteration   1: 557807,349 ±(99.9%) 86,752 ns/op
kangaroo12_256·p0.00:   550912,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   565248,000 ns/op
kangaroo12_256·p0.999:  604340,224 ns/op
kangaroo12_256·p0.9999: 673803,469 ns/op
kangaroo12_256·p1.00:   693248,000 ns/op

Iteration   2: 557772,891 ±(99.9%) 76,844 ns/op
kangaroo12_256·p0.00:   550912,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   565248,000 ns/op
kangaroo12_256·p0.999:  592050,176 ns/op
kangaroo12_256·p0.9999: 654336,000 ns/op
kangaroo12_256·p1.00:   654336,000 ns/op

Iteration   3: 557873,633 ±(99.9%) 119,711 ns/op
kangaroo12_256·p0.00:   545792,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   566272,000 ns/op
kangaroo12_256·p0.999:  626874,368 ns/op
kangaroo12_256·p0.9999: 751178,854 ns/op
kangaroo12_256·p1.00:   784384,000 ns/op

Iteration   4: 559037,475 ±(99.9%) 256,178 ns/op
kangaroo12_256·p0.00:   543744,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   562176,000 ns/op
kangaroo12_256·p0.95:   568320,000 ns/op
kangaroo12_256·p0.99:   583680,000 ns/op
kangaroo12_256·p0.999:  723075,072 ns/op
kangaroo12_256·p0.9999: 961911,194 ns/op
kangaroo12_256·p1.00:   1073152,000 ns/op

Iteration   5: 557655,562 ±(99.9%) 308,909 ns/op
kangaroo12_256·p0.00:   540672,000 ns/op
kangaroo12_256·p0.50:   557056,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   562176,000 ns/op
kangaroo12_256·p0.99:   568320,000 ns/op
kangaroo12_256·p0.999:  601088,000 ns/op
kangaroo12_256·p0.9999: 1026641,203 ns/op
kangaroo12_256·p1.00:   2138112,000 ns/op


# Run progress: 84,50% complete, ETA 02:23:34
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 561442,475 ±(99.9%) 14674,228 ns/op
# Warmup Iteration   2: 556225,454 ±(99.9%) 131,006 ns/op
# Warmup Iteration   3: 557655,505 ±(99.9%) 177,965 ns/op
# Warmup Iteration   4: 556084,893 ±(99.9%) 122,542 ns/op
# Warmup Iteration   5: 555469,956 ±(99.9%) 106,590 ns/op
Iteration   1: 555569,569 ±(99.9%) 119,796 ns/op
kangaroo12_256·p0.00:   542720,000 ns/op
kangaroo12_256·p0.50:   555008,000 ns/op
kangaroo12_256·p0.90:   559104,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   568320,000 ns/op
kangaroo12_256·p0.999:  615456,768 ns/op
kangaroo12_256·p0.9999: 748468,634 ns/op
kangaroo12_256·p1.00:   813056,000 ns/op

Iteration   2: 555652,015 ±(99.9%) 126,842 ns/op
kangaroo12_256·p0.00:   542720,000 ns/op
kangaroo12_256·p0.50:   555008,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   569344,000 ns/op
kangaroo12_256·p0.999:  619539,456 ns/op
kangaroo12_256·p0.9999: 717449,421 ns/op
kangaroo12_256·p1.00:   732160,000 ns/op

Iteration   3: 556623,044 ±(99.9%) 165,407 ns/op
kangaroo12_256·p0.00:   530432,000 ns/op
kangaroo12_256·p0.50:   556032,000 ns/op
kangaroo12_256·p0.90:   561152,000 ns/op
kangaroo12_256·p0.95:   563200,000 ns/op
kangaroo12_256·p0.99:   575488,000 ns/op
kangaroo12_256·p0.999:  657510,400 ns/op
kangaroo12_256·p0.9999: 785689,600 ns/op
kangaroo12_256·p1.00:   830464,000 ns/op

Iteration   4: 555633,870 ±(99.9%) 102,913 ns/op
kangaroo12_256·p0.00:   549888,000 ns/op
kangaroo12_256·p0.50:   555008,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   567296,000 ns/op
kangaroo12_256·p0.999:  589824,000 ns/op
kangaroo12_256·p0.9999: 696177,869 ns/op
kangaroo12_256·p1.00:   723968,000 ns/op

Iteration   5: 555600,749 ±(99.9%) 331,943 ns/op
kangaroo12_256·p0.00:   542720,000 ns/op
kangaroo12_256·p0.50:   555008,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   569344,000 ns/op
kangaroo12_256·p0.999:  614417,408 ns/op
kangaroo12_256·p0.9999: 1011896,934 ns/op
kangaroo12_256·p1.00:   2252800,000 ns/op


# Run progress: 84,67% complete, ETA 02:22:03
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 560564,780 ±(99.9%) 14528,682 ns/op
# Warmup Iteration   2: 557475,371 ±(99.9%) 182,282 ns/op
# Warmup Iteration   3: 556126,677 ±(99.9%) 105,732 ns/op
# Warmup Iteration   4: 556103,820 ±(99.9%) 87,609 ns/op
# Warmup Iteration   5: 557285,910 ±(99.9%) 107,776 ns/op
Iteration   1: 558513,174 ±(99.9%) 182,487 ns/op
kangaroo12_256·p0.00:   541696,000 ns/op
kangaroo12_256·p0.50:   557056,000 ns/op
kangaroo12_256·p0.90:   562176,000 ns/op
kangaroo12_256·p0.95:   565248,000 ns/op
kangaroo12_256·p0.99:   576512,000 ns/op
kangaroo12_256·p0.999:  661731,328 ns/op
kangaroo12_256·p0.9999: 765360,333 ns/op
kangaroo12_256·p1.00:   766976,000 ns/op

Iteration   2: 557922,057 ±(99.9%) 271,022 ns/op
kangaroo12_256·p0.00:   541696,000 ns/op
kangaroo12_256·p0.50:   557056,000 ns/op
kangaroo12_256·p0.90:   562176,000 ns/op
kangaroo12_256·p0.95:   563200,000 ns/op
kangaroo12_256·p0.99:   576512,000 ns/op
kangaroo12_256·p0.999:  738398,208 ns/op
kangaroo12_256·p0.9999: 856920,883 ns/op
kangaroo12_256·p1.00:   860160,000 ns/op

Iteration   3: 556847,399 ±(99.9%) 112,302 ns/op
kangaroo12_256·p0.00:   549888,000 ns/op
kangaroo12_256·p0.50:   556032,000 ns/op
kangaroo12_256·p0.90:   561152,000 ns/op
kangaroo12_256·p0.95:   563200,000 ns/op
kangaroo12_256·p0.99:   568320,000 ns/op
kangaroo12_256·p0.999:  604276,736 ns/op
kangaroo12_256·p0.9999: 702966,477 ns/op
kangaroo12_256·p1.00:   744448,000 ns/op

Iteration   4: 557790,197 ±(99.9%) 212,786 ns/op
kangaroo12_256·p0.00:   542720,000 ns/op
kangaroo12_256·p0.50:   557056,000 ns/op
kangaroo12_256·p0.90:   561152,000 ns/op
kangaroo12_256·p0.95:   563200,000 ns/op
kangaroo12_256·p0.99:   571392,000 ns/op
kangaroo12_256·p0.999:  690536,448 ns/op
kangaroo12_256·p0.9999: 855040,000 ns/op
kangaroo12_256·p1.00:   855040,000 ns/op

Iteration   5: 557980,660 ±(99.9%) 369,483 ns/op
kangaroo12_256·p0.00:   534528,000 ns/op
kangaroo12_256·p0.50:   556032,000 ns/op
kangaroo12_256·p0.90:   563200,000 ns/op
kangaroo12_256·p0.95:   568320,000 ns/op
kangaroo12_256·p0.99:   583680,000 ns/op
kangaroo12_256·p0.999:  719749,120 ns/op
kangaroo12_256·p0.9999: 1098509,312 ns/op
kangaroo12_256·p1.00:   2025472,000 ns/op


# Run progress: 84,83% complete, ETA 02:20:31
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 562125,408 ±(99.9%) 14398,537 ns/op
# Warmup Iteration   2: 556937,198 ±(99.9%) 126,894 ns/op
# Warmup Iteration   3: 556952,276 ±(99.9%) 293,765 ns/op
# Warmup Iteration   4: 558384,991 ±(99.9%) 246,082 ns/op
# Warmup Iteration   5: 557473,862 ±(99.9%) 139,627 ns/op
Iteration   1: 557153,992 ±(99.9%) 130,596 ns/op
kangaroo12_256·p0.00:   543744,000 ns/op
kangaroo12_256·p0.50:   557056,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   567296,000 ns/op
kangaroo12_256·p0.999:  627849,216 ns/op
kangaroo12_256·p0.9999: 737491,661 ns/op
kangaroo12_256·p1.00:   738304,000 ns/op

Iteration   2: 557442,050 ±(99.9%) 116,775 ns/op
kangaroo12_256·p0.00:   543744,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   565248,000 ns/op
kangaroo12_256·p0.999:  614400,000 ns/op
kangaroo12_256·p0.9999: 743842,611 ns/op
kangaroo12_256·p1.00:   936960,000 ns/op

Iteration   3: 558238,947 ±(99.9%) 188,253 ns/op
kangaroo12_256·p0.00:   550912,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   561152,000 ns/op
kangaroo12_256·p0.95:   563200,000 ns/op
kangaroo12_256·p0.99:   571392,000 ns/op
kangaroo12_256·p0.999:  683216,896 ns/op
kangaroo12_256·p0.9999: 831893,094 ns/op
kangaroo12_256·p1.00:   894976,000 ns/op

Iteration   4: 557499,918 ±(99.9%) 94,896 ns/op
kangaroo12_256·p0.00:   549888,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   565248,000 ns/op
kangaroo12_256·p0.999:  602351,616 ns/op
kangaroo12_256·p0.9999: 696467,251 ns/op
kangaroo12_256·p1.00:   794624,000 ns/op

Iteration   5: 557639,959 ±(99.9%) 310,363 ns/op
kangaroo12_256·p0.00:   549888,000 ns/op
kangaroo12_256·p0.50:   558080,000 ns/op
kangaroo12_256·p0.90:   560128,000 ns/op
kangaroo12_256·p0.95:   561152,000 ns/op
kangaroo12_256·p0.99:   566272,000 ns/op
kangaroo12_256·p0.999:  599040,000 ns/op
kangaroo12_256·p0.9999: 1031802,880 ns/op
kangaroo12_256·p1.00:   2166784,000 ns/op



Result "org.example.Main.kangaroo12_256":
N = 179142
mean = 557702,432 ±(99.9%) 68,814 ns/op

Histogram, ns/op:
[      0,000,  250000,000) = 0
[ 250000,000,  500000,000) = 0
[ 500000,000,  750000,000) = 179089
[ 750000,000, 1000000,000) = 51
[1000000,000, 1250000,000) = 0
[1250000,000, 1500000,000) = 0
[1500000,000, 1750000,000) = 0
[1750000,000, 2000000,000) = 0
[2000000,000, 2250000,000) = 2
[2250000,000, 2500000,000) = 0
[2500000,000, 2750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 534528,000 ns/op
p(50,0000) = 557056,000 ns/op
p(90,0000) = 561152,000 ns/op
p(95,0000) = 563200,000 ns/op
p(99,0000) = 572416,000 ns/op
p(99,9000) = 657261,568 ns/op
p(99,9900) = 845824,000 ns/op
p(99,9990) = 2054945,444 ns/op
p(99,9999) = 2166784,000 ns/op
p(100,0000) = 2166784,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 4M)

# Run progress: 85,00% complete, ETA 02:19:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4768795,359 ±(99.9%) 126119,090 ns/op
# Warmup Iteration   2: 4752929,841 ±(99.9%) 4944,155 ns/op
# Warmup Iteration   3: 4745719,734 ±(99.9%) 1911,856 ns/op
# Warmup Iteration   4: 4756385,934 ±(99.9%) 2198,055 ns/op
# Warmup Iteration   5: 4750725,354 ±(99.9%) 1696,968 ns/op
Iteration   1: 4762061,507 ±(99.9%) 4731,982 ns/op
kangaroo12_256·p0.00:   4677632,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4784128,000 ns/op
kangaroo12_256·p0.95:   4808704,000 ns/op
kangaroo12_256·p0.99:   5021696,000 ns/op
kangaroo12_256·p0.999:  5668044,800 ns/op
kangaroo12_256·p0.9999: 6217728,000 ns/op
kangaroo12_256·p1.00:   6217728,000 ns/op

Iteration   2: 4750935,403 ±(99.9%) 2749,862 ns/op
kangaroo12_256·p0.00:   4702208,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4824760,320 ns/op
kangaroo12_256·p0.999:  5557256,192 ns/op
kangaroo12_256·p0.9999: 5709824,000 ns/op
kangaroo12_256·p1.00:   5709824,000 ns/op

Iteration   3: 4751356,105 ±(99.9%) 1515,707 ns/op
kangaroo12_256·p0.00:   4653056,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4816896,000 ns/op
kangaroo12_256·p0.999:  4993712,128 ns/op
kangaroo12_256·p0.9999: 5275648,000 ns/op
kangaroo12_256·p1.00:   5275648,000 ns/op

Iteration   4: 4752131,287 ±(99.9%) 1466,084 ns/op
kangaroo12_256·p0.00:   4653056,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4816896,000 ns/op
kangaroo12_256·p0.999:  5037228,032 ns/op
kangaroo12_256·p0.9999: 5103616,000 ns/op
kangaroo12_256·p1.00:   5103616,000 ns/op

Iteration   5: 4762902,208 ±(99.9%) 2907,486 ns/op
kangaroo12_256·p0.00:   4718592,000 ns/op
kangaroo12_256·p0.50:   4759552,000 ns/op
kangaroo12_256·p0.90:   4784128,000 ns/op
kangaroo12_256·p0.95:   4808704,000 ns/op
kangaroo12_256·p0.99:   4915200,000 ns/op
kangaroo12_256·p0.999:  5446139,904 ns/op
kangaroo12_256·p0.9999: 5464064,000 ns/op
kangaroo12_256·p1.00:   5464064,000 ns/op


# Run progress: 85,17% complete, ETA 02:17:29
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4763632,381 ±(99.9%) 127469,240 ns/op
# Warmup Iteration   2: 4737469,724 ±(99.9%) 1551,076 ns/op
# Warmup Iteration   3: 4739996,903 ±(99.9%) 1813,842 ns/op
# Warmup Iteration   4: 4757929,204 ±(99.9%) 6142,959 ns/op
# Warmup Iteration   5: 4749962,221 ±(99.9%) 1425,185 ns/op
Iteration   1: 4745217,945 ±(99.9%) 1770,697 ns/op
kangaroo12_256·p0.00:   4685824,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4799938,560 ns/op
kangaroo12_256·p0.999:  4974600,192 ns/op
kangaroo12_256·p0.9999: 5611520,000 ns/op
kangaroo12_256·p1.00:   5611520,000 ns/op

Iteration   2: 4743801,743 ±(99.9%) 2269,532 ns/op
kangaroo12_256·p0.00:   4702208,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4808704,000 ns/op
kangaroo12_256·p0.999:  5321719,808 ns/op
kangaroo12_256·p0.9999: 5513216,000 ns/op
kangaroo12_256·p1.00:   5513216,000 ns/op

Iteration   3: 4753304,723 ±(99.9%) 3649,694 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4784128,000 ns/op
kangaroo12_256·p0.95:   4816896,000 ns/op
kangaroo12_256·p0.99:   4915200,000 ns/op
kangaroo12_256·p0.999:  5581144,064 ns/op
kangaroo12_256·p0.9999: 5881856,000 ns/op
kangaroo12_256·p1.00:   5881856,000 ns/op

Iteration   4: 4742783,089 ±(99.9%) 1451,294 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4816896,000 ns/op
kangaroo12_256·p0.999:  4956160,000 ns/op
kangaroo12_256·p0.9999: 5234688,000 ns/op
kangaroo12_256·p1.00:   5234688,000 ns/op

Iteration   5: 4741547,476 ±(99.9%) 1341,807 ns/op
kangaroo12_256·p0.00:   4702208,000 ns/op
kangaroo12_256·p0.50:   4734976,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4800512,000 ns/op
kangaroo12_256·p0.999:  5005467,648 ns/op
kangaroo12_256·p0.9999: 5144576,000 ns/op
kangaroo12_256·p1.00:   5144576,000 ns/op


# Run progress: 85,33% complete, ETA 02:15:57
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4761136,541 ±(99.9%) 126580,041 ns/op
# Warmup Iteration   2: 4743619,007 ±(99.9%) 2123,572 ns/op
# Warmup Iteration   3: 4749491,103 ±(99.9%) 1242,769 ns/op
# Warmup Iteration   4: 4749230,236 ±(99.9%) 3331,429 ns/op
# Warmup Iteration   5: 4743650,111 ±(99.9%) 2084,671 ns/op
Iteration   1: 4754029,610 ±(99.9%) 4738,150 ns/op
kangaroo12_256·p0.00:   4702208,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4784128,000 ns/op
kangaroo12_256·p0.95:   4816896,000 ns/op
kangaroo12_256·p0.99:   4972544,000 ns/op
kangaroo12_256·p0.999:  5774376,960 ns/op
kangaroo12_256·p0.9999: 6561792,000 ns/op
kangaroo12_256·p1.00:   6561792,000 ns/op

Iteration   2: 4753120,715 ±(99.9%) 3423,482 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4857528,320 ns/op
kangaroo12_256·p0.999:  5753405,440 ns/op
kangaroo12_256·p0.9999: 6004736,000 ns/op
kangaroo12_256·p1.00:   6004736,000 ns/op

Iteration   3: 4753144,936 ±(99.9%) 1000,287 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4800266,240 ns/op
kangaroo12_256·p0.999:  4849664,000 ns/op
kangaroo12_256·p0.9999: 4874240,000 ns/op
kangaroo12_256·p1.00:   4874240,000 ns/op

Iteration   4: 4750328,213 ±(99.9%) 1176,546 ns/op
kangaroo12_256·p0.00:   4677632,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4808294,400 ns/op
kangaroo12_256·p0.999:  4938506,240 ns/op
kangaroo12_256·p0.9999: 4947968,000 ns/op
kangaroo12_256·p1.00:   4947968,000 ns/op

Iteration   5: 4755781,574 ±(99.9%) 1893,537 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4775936,000 ns/op
kangaroo12_256·p0.95:   4792320,000 ns/op
kangaroo12_256·p0.99:   4833280,000 ns/op
kangaroo12_256·p0.999:  5129371,648 ns/op
kangaroo12_256·p0.9999: 5464064,000 ns/op
kangaroo12_256·p1.00:   5464064,000 ns/op


# Run progress: 85,50% complete, ETA 02:14:26
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4774914,446 ±(99.9%) 137469,359 ns/op
# Warmup Iteration   2: 4738526,255 ±(99.9%) 2346,295 ns/op
# Warmup Iteration   3: 4742122,130 ±(99.9%) 2054,838 ns/op
# Warmup Iteration   4: 4744576,122 ±(99.9%) 2148,514 ns/op
# Warmup Iteration   5: 4750168,578 ±(99.9%) 2943,557 ns/op
Iteration   1: 4744042,798 ±(99.9%) 1580,664 ns/op
kangaroo12_256·p0.00:   4653056,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4816896,000 ns/op
kangaroo12_256·p0.999:  5040963,584 ns/op
kangaroo12_256·p0.9999: 5169152,000 ns/op
kangaroo12_256·p1.00:   5169152,000 ns/op

Iteration   2: 4745357,979 ±(99.9%) 1767,602 ns/op
kangaroo12_256·p0.00:   4644864,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4816896,000 ns/op
kangaroo12_256·p0.999:  5141372,928 ns/op
kangaroo12_256·p0.9999: 5152768,000 ns/op
kangaroo12_256·p1.00:   5152768,000 ns/op

Iteration   3: 4751800,179 ±(99.9%) 1311,521 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4808704,000 ns/op
kangaroo12_256·p0.999:  5012324,352 ns/op
kangaroo12_256·p0.9999: 5087232,000 ns/op
kangaroo12_256·p1.00:   5087232,000 ns/op

Iteration   4: 4756003,823 ±(99.9%) 2967,321 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4775936,000 ns/op
kangaroo12_256·p0.95:   4792320,000 ns/op
kangaroo12_256·p0.99:   4931256,320 ns/op
kangaroo12_256·p0.999:  5247729,664 ns/op
kangaroo12_256·p0.9999: 5603328,000 ns/op
kangaroo12_256·p1.00:   5603328,000 ns/op

Iteration   5: 4749697,460 ±(99.9%) 1260,391 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4751360,000 ns/op
kangaroo12_256·p0.90:   4767744,000 ns/op
kangaroo12_256·p0.95:   4775936,000 ns/op
kangaroo12_256·p0.99:   4792320,000 ns/op
kangaroo12_256·p0.999:  4944977,920 ns/op
kangaroo12_256·p0.9999: 5185536,000 ns/op
kangaroo12_256·p1.00:   5185536,000 ns/op


# Run progress: 85,67% complete, ETA 02:12:55
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 4768439,695 ±(99.9%) 126130,744 ns/op
# Warmup Iteration   2: 4737718,320 ±(99.9%) 2826,219 ns/op
# Warmup Iteration   3: 4751924,831 ±(99.9%) 3806,688 ns/op
# Warmup Iteration   4: 4745937,565 ±(99.9%) 1873,366 ns/op
# Warmup Iteration   5: 4746054,260 ±(99.9%) 1941,075 ns/op
Iteration   1: 4746440,908 ±(99.9%) 4068,956 ns/op
kangaroo12_256·p0.00:   4661248,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4800512,000 ns/op
kangaroo12_256·p0.999:  5378670,592 ns/op
kangaroo12_256·p0.9999: 7102464,000 ns/op
kangaroo12_256·p1.00:   7102464,000 ns/op

Iteration   2: 4753682,755 ±(99.9%) 2811,435 ns/op
kangaroo12_256·p0.00:   4694016,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4775936,000 ns/op
kangaroo12_256·p0.95:   4800512,000 ns/op
kangaroo12_256·p0.99:   4931338,240 ns/op
kangaroo12_256·p0.999:  5345509,376 ns/op
kangaroo12_256·p0.9999: 5373952,000 ns/op
kangaroo12_256·p1.00:   5373952,000 ns/op

Iteration   3: 4744813,402 ±(99.9%) 1230,920 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4792320,000 ns/op
kangaroo12_256·p0.999:  4910817,280 ns/op
kangaroo12_256·p0.9999: 5226496,000 ns/op
kangaroo12_256·p1.00:   5226496,000 ns/op

Iteration   4: 4748293,351 ±(99.9%) 9722,646 ns/op
kangaroo12_256·p0.00:   4710400,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4800512,000 ns/op
kangaroo12_256·p0.999:  5350506,496 ns/op
kangaroo12_256·p0.9999: 10878976,000 ns/op
kangaroo12_256·p1.00:   10878976,000 ns/op

Iteration   5: 4745953,124 ±(99.9%) 1811,056 ns/op
kangaroo12_256·p0.00:   4718592,000 ns/op
kangaroo12_256·p0.50:   4743168,000 ns/op
kangaroo12_256·p0.90:   4759552,000 ns/op
kangaroo12_256·p0.95:   4767744,000 ns/op
kangaroo12_256·p0.99:   4792320,000 ns/op
kangaroo12_256·p0.999:  5310504,960 ns/op
kangaroo12_256·p0.9999: 5406720,000 ns/op
kangaroo12_256·p1.00:   5406720,000 ns/op



Result "org.example.Main.kangaroo12_256":
N = 21045
mean = 4748605,199 ±(99.9%) 1191,182 ns/op

Histogram, ns/op:
[ 4000000,000,  4500000,000) = 0
[ 4500000,000,  5000000,000) = 20998
[ 5000000,000,  5500000,000) = 44
[ 5500000,000,  6000000,000) = 1
[ 6000000,000,  6500000,000) = 0
[ 6500000,000,  7000000,000) = 0
[ 7000000,000,  7500000,000) = 1
[ 7500000,000,  8000000,000) = 0
[ 8000000,000,  8500000,000) = 0
[ 8500000,000,  9000000,000) = 0
[ 9000000,000,  9500000,000) = 0
[ 9500000,000, 10000000,000) = 0
[10000000,000, 10500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 4644864,000 ns/op
p(50,0000) = 4743168,000 ns/op
p(90,0000) = 4767744,000 ns/op
p(95,0000) = 4775936,000 ns/op
p(99,0000) = 4825088,000 ns/op
p(99,9000) = 5127438,336 ns/op
p(99,9900) = 6945654,374 ns/op
p(99,9990) = 10878976,000 ns/op
p(99,9999) = 10878976,000 ns/op
p(100,0000) = 10878976,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 20M)

# Run progress: 85,83% complete, ETA 02:11:23
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23845819,733 ±(99.9%) 629083,546 ns/op
# Warmup Iteration   2: 23692894,635 ±(99.9%) 17173,623 ns/op
# Warmup Iteration   3: 23721469,573 ±(99.9%) 12679,490 ns/op
# Warmup Iteration   4: 23731719,280 ±(99.9%) 11055,933 ns/op
# Warmup Iteration   5: 23786454,651 ±(99.9%) 63175,515 ns/op
Iteration   1: 23708036,246 ±(99.9%) 9630,389 ns/op
kangaroo12_256·p0.00:   23527424,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   23887872,000 ns/op
kangaroo12_256·p0.999:  24018944,000 ns/op
kangaroo12_256·p0.9999: 24018944,000 ns/op
kangaroo12_256·p1.00:   24018944,000 ns/op

Iteration   2: 23706949,156 ±(99.9%) 12770,471 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23756800,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   24018944,000 ns/op
kangaroo12_256·p0.999:  24608768,000 ns/op
kangaroo12_256·p0.9999: 24608768,000 ns/op
kangaroo12_256·p1.00:   24608768,000 ns/op

Iteration   3: 23718596,550 ±(99.9%) 17216,916 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24061870,080 ns/op
kangaroo12_256·p0.999:  25231360,000 ns/op
kangaroo12_256·p0.9999: 25231360,000 ns/op
kangaroo12_256·p1.00:   25231360,000 ns/op

Iteration   4: 23783029,967 ±(99.9%) 47299,585 ns/op
kangaroo12_256·p0.00:   23494656,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23920640,000 ns/op
kangaroo12_256·p0.95:   24117248,000 ns/op
kangaroo12_256·p0.99:   25672417,280 ns/op
kangaroo12_256·p0.999:  26640384,000 ns/op
kangaroo12_256·p0.9999: 26640384,000 ns/op
kangaroo12_256·p1.00:   26640384,000 ns/op

Iteration   5: 23738042,071 ±(99.9%) 43984,296 ns/op
kangaroo12_256·p0.00:   23527424,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   24011735,040 ns/op
kangaroo12_256·p0.999:  29163520,000 ns/op
kangaroo12_256·p0.9999: 29163520,000 ns/op
kangaroo12_256·p1.00:   29163520,000 ns/op


# Run progress: 86,00% complete, ETA 02:09:52
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23787388,656 ±(99.9%) 644534,673 ns/op
# Warmup Iteration   2: 23685052,057 ±(99.9%) 13599,805 ns/op
# Warmup Iteration   3: 23794405,181 ±(99.9%) 33544,362 ns/op
# Warmup Iteration   4: 23744580,105 ±(99.9%) 9454,564 ns/op
# Warmup Iteration   5: 23739287,411 ±(99.9%) 20833,623 ns/op
Iteration   1: 23752052,143 ±(99.9%) 32576,759 ns/op
kangaroo12_256·p0.00:   23592960,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23822336,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24044503,040 ns/op
kangaroo12_256·p0.999:  27623424,000 ns/op
kangaroo12_256·p0.9999: 27623424,000 ns/op
kangaroo12_256·p1.00:   27623424,000 ns/op

Iteration   2: 23805093,790 ±(99.9%) 43253,436 ns/op
kangaroo12_256·p0.00:   23625728,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23920640,000 ns/op
kangaroo12_256·p0.95:   24182784,000 ns/op
kangaroo12_256·p0.99:   24915804,160 ns/op
kangaroo12_256·p0.999:  27328512,000 ns/op
kangaroo12_256·p0.9999: 27328512,000 ns/op
kangaroo12_256·p1.00:   27328512,000 ns/op

Iteration   3: 23736641,064 ±(99.9%) 10126,201 ns/op
kangaroo12_256·p0.00:   23625728,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   23953408,000 ns/op
kangaroo12_256·p0.999:  24182784,000 ns/op
kangaroo12_256·p0.9999: 24182784,000 ns/op
kangaroo12_256·p1.00:   24182784,000 ns/op

Iteration   4: 23728302,711 ±(99.9%) 10843,971 ns/op
kangaroo12_256·p0.00:   23592960,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24069406,720 ns/op
kangaroo12_256·p0.999:  24215552,000 ns/op
kangaroo12_256·p0.9999: 24215552,000 ns/op
kangaroo12_256·p1.00:   24215552,000 ns/op

Iteration   5: 23726982,673 ±(99.9%) 10479,022 ns/op
kangaroo12_256·p0.00:   23527424,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23850188,800 ns/op
kangaroo12_256·p0.99:   23978639,360 ns/op
kangaroo12_256·p0.999:  24182784,000 ns/op
kangaroo12_256·p0.9999: 24182784,000 ns/op
kangaroo12_256·p1.00:   24182784,000 ns/op


# Run progress: 86,17% complete, ETA 02:08:20
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23872621,976 ±(99.9%) 654583,380 ns/op
# Warmup Iteration   2: 23688934,521 ±(99.9%) 14156,994 ns/op
# Warmup Iteration   3: 23733194,616 ±(99.9%) 13158,747 ns/op
# Warmup Iteration   4: 23726206,180 ±(99.9%) 13004,359 ns/op
# Warmup Iteration   5: 23790735,506 ±(99.9%) 49357,765 ns/op
Iteration   1: 23714248,190 ±(99.9%) 30536,631 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23756800,000 ns/op
kangaroo12_256·p0.95:   23789568,000 ns/op
kangaroo12_256·p0.99:   23880335,360 ns/op
kangaroo12_256·p0.999:  27426816,000 ns/op
kangaroo12_256·p0.9999: 27426816,000 ns/op
kangaroo12_256·p1.00:   27426816,000 ns/op

Iteration   2: 23707492,701 ±(99.9%) 7622,595 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23756800,000 ns/op
kangaroo12_256·p0.95:   23789568,000 ns/op
kangaroo12_256·p0.99:   23855104,000 ns/op
kangaroo12_256·p0.999:  23920640,000 ns/op
kangaroo12_256·p0.9999: 23920640,000 ns/op
kangaroo12_256·p1.00:   23920640,000 ns/op

Iteration   3: 23715024,682 ±(99.9%) 13700,157 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   24029102,080 ns/op
kangaroo12_256·p0.999:  24969216,000 ns/op
kangaroo12_256·p0.9999: 24969216,000 ns/op
kangaroo12_256·p1.00:   24969216,000 ns/op

Iteration   4: 23746992,950 ±(99.9%) 23679,353 ns/op
kangaroo12_256·p0.00:   23527424,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23855104,000 ns/op
kangaroo12_256·p0.95:   24051712,000 ns/op
kangaroo12_256·p0.99:   24313856,000 ns/op
kangaroo12_256·p0.999:  25296896,000 ns/op
kangaroo12_256·p0.9999: 25296896,000 ns/op
kangaroo12_256·p1.00:   25296896,000 ns/op

Iteration   5: 23723410,806 ±(99.9%) 36519,959 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24044175,360 ns/op
kangaroo12_256·p0.999:  28180480,000 ns/op
kangaroo12_256·p0.9999: 28180480,000 ns/op
kangaroo12_256·p1.00:   28180480,000 ns/op


# Run progress: 86,33% complete, ETA 02:06:49
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23781161,957 ±(99.9%) 628159,833 ns/op
# Warmup Iteration   2: 23684663,810 ±(99.9%) 20363,078 ns/op
# Warmup Iteration   3: 23782796,466 ±(99.9%) 35003,082 ns/op
# Warmup Iteration   4: 23727759,166 ±(99.9%) 9051,691 ns/op
# Warmup Iteration   5: 23718518,900 ±(99.9%) 11107,675 ns/op
Iteration   1: 23725662,635 ±(99.9%) 14843,735 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24182784,000 ns/op
kangaroo12_256·p0.999:  24576000,000 ns/op
kangaroo12_256·p0.9999: 24576000,000 ns/op
kangaroo12_256·p1.00:   24576000,000 ns/op

Iteration   2: 23749717,131 ±(99.9%) 25113,097 ns/op
kangaroo12_256·p0.00:   23625728,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23848550,400 ns/op
kangaroo12_256·p0.95:   23982899,200 ns/op
kangaroo12_256·p0.99:   24339415,040 ns/op
kangaroo12_256·p0.999:  25919488,000 ns/op
kangaroo12_256·p0.9999: 25919488,000 ns/op
kangaroo12_256·p1.00:   25919488,000 ns/op

Iteration   3: 23727370,919 ±(99.9%) 14929,919 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24044175,360 ns/op
kangaroo12_256·p0.999:  24739840,000 ns/op
kangaroo12_256·p0.9999: 24739840,000 ns/op
kangaroo12_256·p1.00:   24739840,000 ns/op

Iteration   4: 23730010,995 ±(99.9%) 23309,780 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   24142479,360 ns/op
kangaroo12_256·p0.999:  25886720,000 ns/op
kangaroo12_256·p0.9999: 25886720,000 ns/op
kangaroo12_256·p1.00:   25886720,000 ns/op

Iteration   5: 23718596,550 ±(99.9%) 11348,056 ns/op
kangaroo12_256·p0.00:   23625728,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   24142479,360 ns/op
kangaroo12_256·p0.999:  24215552,000 ns/op
kangaroo12_256·p0.9999: 24215552,000 ns/op
kangaroo12_256·p1.00:   24215552,000 ns/op


# Run progress: 86,50% complete, ETA 02:05:17
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23794249,143 ±(99.9%) 633762,988 ns/op
# Warmup Iteration   2: 23716267,071 ±(99.9%) 23286,070 ns/op
# Warmup Iteration   3: 23715024,682 ±(99.9%) 15542,991 ns/op
# Warmup Iteration   4: 23726050,882 ±(99.9%) 8253,441 ns/op
# Warmup Iteration   5: 23733272,265 ±(99.9%) 16642,722 ns/op
Iteration   1: 23811569,371 ±(99.9%) 62432,302 ns/op
kangaroo12_256·p0.00:   23592960,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23920640,000 ns/op
kangaroo12_256·p0.95:   24115609,600 ns/op
kangaroo12_256·p0.99:   25367674,880 ns/op
kangaroo12_256·p0.999:  28508160,000 ns/op
kangaroo12_256·p0.9999: 28508160,000 ns/op
kangaroo12_256·p1.00:   28508160,000 ns/op

Iteration   2: 23718907,147 ±(99.9%) 8757,809 ns/op
kangaroo12_256·p0.00:   23592960,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23779737,600 ns/op
kangaroo12_256·p0.95:   23789568,000 ns/op
kangaroo12_256·p0.99:   23920640,000 ns/op
kangaroo12_256·p0.999:  24150016,000 ns/op
kangaroo12_256·p0.9999: 24150016,000 ns/op
kangaroo12_256·p1.00:   24150016,000 ns/op

Iteration   3: 23740688,418 ±(99.9%) 31465,785 ns/op
kangaroo12_256·p0.00:   23625728,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23822336,000 ns/op
kangaroo12_256·p0.99:   24044503,040 ns/op
kangaroo12_256·p0.999:  27394048,000 ns/op
kangaroo12_256·p0.9999: 27394048,000 ns/op
kangaroo12_256·p1.00:   27394048,000 ns/op

Iteration   4: 23712306,957 ±(99.9%) 12538,824 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23691264,000 ns/op
kangaroo12_256·p0.90:   23789568,000 ns/op
kangaroo12_256·p0.95:   23855104,000 ns/op
kangaroo12_256·p0.99:   24102174,720 ns/op
kangaroo12_256·p0.999:  24313856,000 ns/op
kangaroo12_256·p0.9999: 24313856,000 ns/op
kangaroo12_256·p1.00:   24313856,000 ns/op

Iteration   5: 23762793,197 ±(99.9%) 23940,699 ns/op
kangaroo12_256·p0.00:   23560192,000 ns/op
kangaroo12_256·p0.50:   23724032,000 ns/op
kangaroo12_256·p0.90:   23914086,400 ns/op
kangaroo12_256·p0.95:   24051712,000 ns/op
kangaroo12_256·p0.99:   24379392,000 ns/op
kangaroo12_256·p0.999:  24707072,000 ns/op
kangaroo12_256·p0.9999: 24707072,000 ns/op
kangaroo12_256·p1.00:   24707072,000 ns/op



Result "org.example.Main.kangaroo12_256":
N = 4215
mean = 23739720,214 ±(99.9%) 8662,560 ns/op

Histogram, ns/op:
[23000000,000, 23500000,000) = 0
[23500000,000, 24000000,000) = 4101
[24000000,000, 24500000,000) = 91
[24500000,000, 25000000,000) = 14
[25000000,000, 25500000,000) = 3
[25500000,000, 26000000,000) = 2
[26000000,000, 26500000,000) = 0
[26500000,000, 27000000,000) = 1
[27000000,000, 27500000,000) = 1
[27500000,000, 28000000,000) = 1
[28000000,000, 28500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 23560192,000 ns/op
p(50,0000) = 23724032,000 ns/op
p(90,0000) = 23822336,000 ns/op
p(95,0000) = 23887872,000 ns/op
p(99,0000) = 24243077,120 ns/op
p(99,9000) = 26664501,248 ns/op
p(99,9900) = 28508160,000 ns/op
p(99,9990) = 28508160,000 ns/op
p(99,9999) = 28508160,000 ns/op
p(100,0000) = 28508160,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 64K)

# Run progress: 86,67% complete, ETA 02:03:46
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 9791,046 ±(99.9%) 40,038 ns/op
# Warmup Iteration   2: 9928,440 ±(99.9%) 7,732 ns/op
# Warmup Iteration   3: 9963,455 ±(99.9%) 4,518 ns/op
# Warmup Iteration   4: 9967,166 ±(99.9%) 5,417 ns/op
# Warmup Iteration   5: 9909,845 ±(99.9%) 5,260 ns/op
Iteration   1: 9910,945 ±(99.9%) 5,026 ns/op
murmur64·p0.00:   8944,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9952,000 ns/op
murmur64·p0.95:   9984,000 ns/op
murmur64·p0.99:   12496,000 ns/op
murmur64·p0.999:  14224,000 ns/op
murmur64·p0.9999: 27735,910 ns/op
murmur64·p1.00:   91392,000 ns/op

Iteration   2: 9906,213 ±(99.9%) 4,912 ns/op
murmur64·p0.00:   8864,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9952,000 ns/op
murmur64·p0.95:   9984,000 ns/op
murmur64·p0.99:   12480,000 ns/op
murmur64·p0.999:  14256,000 ns/op
murmur64·p0.9999: 25452,205 ns/op
murmur64·p1.00:   88192,000 ns/op

Iteration   3: 9951,104 ±(99.9%) 17,569 ns/op
murmur64·p0.00:   8944,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10048,000 ns/op
murmur64·p0.99:   12560,000 ns/op
murmur64·p0.999:  14560,000 ns/op
murmur64·p0.9999: 38819,226 ns/op
murmur64·p1.00:   1292288,000 ns/op

Iteration   4: 9922,852 ±(99.9%) 5,374 ns/op
murmur64·p0.00:   9488,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  14032,000 ns/op
murmur64·p0.9999: 37200,730 ns/op
murmur64·p1.00:   91264,000 ns/op

Iteration   5: 9921,839 ±(99.9%) 5,090 ns/op
murmur64·p0.00:   9392,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  14048,000 ns/op
murmur64·p0.9999: 25547,136 ns/op
murmur64·p1.00:   91264,000 ns/op


# Run progress: 86,83% complete, ETA 02:02:14
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 9786,890 ±(99.9%) 40,324 ns/op
# Warmup Iteration   2: 9728,894 ±(99.9%) 7,843 ns/op
# Warmup Iteration   3: 9969,284 ±(99.9%) 5,906 ns/op
# Warmup Iteration   4: 9948,355 ±(99.9%) 4,941 ns/op
# Warmup Iteration   5: 9910,299 ±(99.9%) 5,446 ns/op
Iteration   1: 9922,949 ±(99.9%) 5,113 ns/op
murmur64·p0.00:   8976,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10016,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  15061,696 ns/op
murmur64·p0.9999: 32614,566 ns/op
murmur64·p1.00:   91904,000 ns/op

Iteration   2: 9904,355 ±(99.9%) 5,743 ns/op
murmur64·p0.00:   8912,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9936,000 ns/op
murmur64·p0.95:   9984,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14317,936 ns/op
murmur64·p0.9999: 41045,478 ns/op
murmur64·p1.00:   122368,000 ns/op

Iteration   3: 9917,120 ±(99.9%) 5,548 ns/op
murmur64·p0.00:   8944,000 ns/op
murmur64·p0.50:   9840,000 ns/op
murmur64·p0.90:   9952,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12560,000 ns/op
murmur64·p0.999:  14347,088 ns/op
murmur64·p0.9999: 38953,357 ns/op
murmur64·p1.00:   94592,000 ns/op

Iteration   4: 9918,627 ±(99.9%) 5,254 ns/op
murmur64·p0.00:   9056,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14064,000 ns/op
murmur64·p0.9999: 29757,581 ns/op
murmur64·p1.00:   95360,000 ns/op

Iteration   5: 9934,939 ±(99.9%) 5,875 ns/op
murmur64·p0.00:   9008,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10048,000 ns/op
murmur64·p0.99:   12544,000 ns/op
murmur64·p0.999:  15002,160 ns/op
murmur64·p0.9999: 49476,928 ns/op
murmur64·p1.00:   92416,000 ns/op


# Run progress: 87,00% complete, ETA 02:00:42
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 9776,608 ±(99.9%) 50,780 ns/op
# Warmup Iteration   2: 9875,979 ±(99.9%) 6,764 ns/op
# Warmup Iteration   3: 9964,483 ±(99.9%) 4,289 ns/op
# Warmup Iteration   4: 9966,971 ±(99.9%) 5,307 ns/op
# Warmup Iteration   5: 9926,270 ±(99.9%) 5,171 ns/op
Iteration   1: 9919,632 ±(99.9%) 5,075 ns/op
murmur64·p0.00:   9056,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14032,000 ns/op
murmur64·p0.9999: 24086,016 ns/op
murmur64·p1.00:   92416,000 ns/op

Iteration   2: 9918,581 ±(99.9%) 5,663 ns/op
murmur64·p0.00:   9328,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14080,000 ns/op
murmur64·p0.9999: 38903,373 ns/op
murmur64·p1.00:   119936,000 ns/op

Iteration   3: 9930,442 ±(99.9%) 17,037 ns/op
murmur64·p0.00:   8944,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10016,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  15488,000 ns/op
murmur64·p0.9999: 31675,059 ns/op
murmur64·p1.00:   1253376,000 ns/op

Iteration   4: 9923,009 ±(99.9%) 5,222 ns/op
murmur64·p0.00:   9056,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14016,000 ns/op
murmur64·p0.9999: 24616,272 ns/op
murmur64·p1.00:   92288,000 ns/op

Iteration   5: 9924,968 ±(99.9%) 4,942 ns/op
murmur64·p0.00:   9424,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10016,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  14032,000 ns/op
murmur64·p0.9999: 26835,136 ns/op
murmur64·p1.00:   92160,000 ns/op


# Run progress: 87,17% complete, ETA 01:59:11
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 9772,614 ±(99.9%) 40,171 ns/op
# Warmup Iteration   2: 9914,132 ±(99.9%) 7,951 ns/op
# Warmup Iteration   3: 9953,987 ±(99.9%) 6,534 ns/op
# Warmup Iteration   4: 9945,544 ±(99.9%) 5,476 ns/op
# Warmup Iteration   5: 9906,607 ±(99.9%) 5,312 ns/op
Iteration   1: 9928,762 ±(99.9%) 6,114 ns/op
murmur64·p0.00:   8944,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10032,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14952,384 ns/op
murmur64·p0.9999: 31414,438 ns/op
murmur64·p1.00:   248320,000 ns/op

Iteration   2: 9930,119 ±(99.9%) 5,114 ns/op
murmur64·p0.00:   9408,000 ns/op
murmur64·p0.50:   9888,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10016,000 ns/op
murmur64·p0.99:   12544,000 ns/op
murmur64·p0.999:  14048,000 ns/op
murmur64·p0.9999: 25543,875 ns/op
murmur64·p1.00:   90880,000 ns/op

Iteration   3: 9941,462 ±(99.9%) 5,263 ns/op
murmur64·p0.00:   9072,000 ns/op
murmur64·p0.50:   9888,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10032,000 ns/op
murmur64·p0.99:   12560,000 ns/op
murmur64·p0.999:  14048,000 ns/op
murmur64·p0.9999: 24503,347 ns/op
murmur64·p1.00:   90496,000 ns/op

Iteration   4: 9925,458 ±(99.9%) 4,981 ns/op
murmur64·p0.00:   8928,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10016,000 ns/op
murmur64·p0.99:   12544,000 ns/op
murmur64·p0.999:  14048,000 ns/op
murmur64·p0.9999: 25141,978 ns/op
murmur64·p1.00:   90752,000 ns/op

Iteration   5: 9939,977 ±(99.9%) 5,242 ns/op
murmur64·p0.00:   8896,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10048,000 ns/op
murmur64·p0.99:   12544,000 ns/op
murmur64·p0.999:  14204,976 ns/op
murmur64·p0.9999: 31478,742 ns/op
murmur64·p1.00:   91392,000 ns/op


# Run progress: 87,33% complete, ETA 01:57:39
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 9777,982 ±(99.9%) 40,219 ns/op
# Warmup Iteration   2: 9915,695 ±(99.9%) 7,678 ns/op
# Warmup Iteration   3: 9963,061 ±(99.9%) 4,350 ns/op
# Warmup Iteration   4: 9981,810 ±(99.9%) 20,103 ns/op
# Warmup Iteration   5: 9931,989 ±(99.9%) 5,213 ns/op
Iteration   1: 9901,986 ±(99.9%) 5,558 ns/op
murmur64·p0.00:   8976,000 ns/op
murmur64·p0.50:   9840,000 ns/op
murmur64·p0.90:   9936,000 ns/op
murmur64·p0.95:   9968,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  14440,096 ns/op
murmur64·p0.9999: 37565,968 ns/op
murmur64·p1.00:   94592,000 ns/op

Iteration   2: 9911,128 ±(99.9%) 5,257 ns/op
murmur64·p0.00:   8944,000 ns/op
murmur64·p0.50:   9856,000 ns/op
murmur64·p0.90:   9952,000 ns/op
murmur64·p0.95:   9984,000 ns/op
murmur64·p0.99:   12512,000 ns/op
murmur64·p0.999:  14112,000 ns/op
murmur64·p0.9999: 27878,371 ns/op
murmur64·p1.00:   94848,000 ns/op

Iteration   3: 9946,302 ±(99.9%) 18,751 ns/op
murmur64·p0.00:   9008,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10032,000 ns/op
murmur64·p0.99:   12544,000 ns/op
murmur64·p0.999:  14112,000 ns/op
murmur64·p0.9999: 30086,240 ns/op
murmur64·p1.00:   1386496,000 ns/op

Iteration   4: 9940,541 ±(99.9%) 5,462 ns/op
murmur64·p0.00:   8960,000 ns/op
murmur64·p0.50:   9888,000 ns/op
murmur64·p0.90:   9984,000 ns/op
murmur64·p0.95:   10032,000 ns/op
murmur64·p0.99:   12560,000 ns/op
murmur64·p0.999:  14156,608 ns/op
murmur64·p0.9999: 38326,387 ns/op
murmur64·p1.00:   91392,000 ns/op

Iteration   5: 9920,941 ±(99.9%) 4,852 ns/op
murmur64·p0.00:   9376,000 ns/op
murmur64·p0.50:   9872,000 ns/op
murmur64·p0.90:   9968,000 ns/op
murmur64·p0.95:   10000,000 ns/op
murmur64·p0.99:   12528,000 ns/op
murmur64·p0.999:  14032,000 ns/op
murmur64·p0.9999: 23564,954 ns/op
murmur64·p1.00:   91008,000 ns/op



Result "org.example.Main.murmur64":
N = 2515032
mean =   9928,649 ±(99.9%) 2,462 ns/op

Histogram, ns/op:
[      0,000,  125000,000) = 2515030
[ 125000,000,  250000,000) = 1
[ 250000,000,  375000,000) = 0
[ 375000,000,  500000,000) = 0
[ 500000,000,  625000,000) = 0
[ 625000,000,  750000,000) = 0
[ 750000,000,  875000,000) = 0
[ 875000,000, 1000000,000) = 0
[1000000,000, 1125000,000) = 0
[1125000,000, 1250000,000) = 0
[1250000,000, 1375000,000) = 0
[1375000,000, 1500000,000) = 1
[1500000,000, 1625000,000) = 0
[1625000,000, 1750000,000) = 0
[1750000,000, 1875000,000) = 0

Percentiles, ns/op:
p(0,0000) =   8896,000 ns/op
p(50,0000) =   9872,000 ns/op
p(90,0000) =   9968,000 ns/op
p(95,0000) =  10016,000 ns/op
p(99,0000) =  12544,000 ns/op
p(99,9000) =  14096,000 ns/op
p(99,9900) =  27599,894 ns/op
p(99,9990) =  90496,000 ns/op
p(99,9999) = 169276,855 ns/op
p(100,0000) = 1386496,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 512K)

# Run progress: 87,50% complete, ETA 01:56:07
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 63912,658 ±(99.9%) 107,137 ns/op
# Warmup Iteration   2: 62747,983 ±(99.9%) 61,124 ns/op
# Warmup Iteration   3: 64271,434 ±(99.9%) 31,033 ns/op
# Warmup Iteration   4: 64194,087 ±(99.9%) 28,244 ns/op
# Warmup Iteration   5: 64071,714 ±(99.9%) 22,996 ns/op
Iteration   1: 64200,904 ±(99.9%) 24,255 ns/op
murmur64·p0.00:   62592,000 ns/op
murmur64·p0.50:   63744,000 ns/op
murmur64·p0.90:   66176,000 ns/op
murmur64·p0.95:   67200,000 ns/op
murmur64·p0.99:   68608,000 ns/op
murmur64·p0.999:  108849,152 ns/op
murmur64·p0.9999: 161904,230 ns/op
murmur64·p1.00:   347648,000 ns/op

Iteration   2: 64202,902 ±(99.9%) 29,773 ns/op
murmur64·p0.00:   62016,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65664,000 ns/op
murmur64·p0.95:   67072,000 ns/op
murmur64·p0.99:   73088,000 ns/op
murmur64·p0.999:  112256,000 ns/op
murmur64·p0.9999: 162048,000 ns/op
murmur64·p1.00:   524288,000 ns/op

Iteration   3: 64079,331 ±(99.9%) 29,087 ns/op
murmur64·p0.00:   61952,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65408,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   69376,000 ns/op
murmur64·p0.999:  112000,000 ns/op
murmur64·p0.9999: 161896,704 ns/op
murmur64·p1.00:   728064,000 ns/op

Iteration   4: 64012,992 ±(99.9%) 27,794 ns/op
murmur64·p0.00:   62784,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   64960,000 ns/op
murmur64·p0.95:   66816,000 ns/op
murmur64·p0.99:   68864,000 ns/op
murmur64·p0.999:  111223,296 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   607232,000 ns/op

Iteration   5: 64020,084 ±(99.9%) 24,581 ns/op
murmur64·p0.00:   61952,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65216,000 ns/op
murmur64·p0.95:   66816,000 ns/op
murmur64·p0.99:   69248,000 ns/op
murmur64·p0.999:  110336,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   289792,000 ns/op


# Run progress: 87,67% complete, ETA 01:54:35
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 63884,887 ±(99.9%) 106,559 ns/op
# Warmup Iteration   2: 62870,174 ±(99.9%) 64,983 ns/op
# Warmup Iteration   3: 63936,609 ±(99.9%) 23,535 ns/op
# Warmup Iteration   4: 64144,040 ±(99.9%) 25,858 ns/op
# Warmup Iteration   5: 64124,633 ±(99.9%) 30,892 ns/op
Iteration   1: 63992,006 ±(99.9%) 24,633 ns/op
murmur64·p0.00:   62848,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   64960,000 ns/op
murmur64·p0.95:   66816,000 ns/op
murmur64·p0.99:   67968,000 ns/op
murmur64·p0.999:  110080,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   283136,000 ns/op

Iteration   2: 64058,379 ±(99.9%) 22,444 ns/op
murmur64·p0.00:   62528,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65472,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68480,000 ns/op
murmur64·p0.999:  108288,000 ns/op
murmur64·p0.9999: 161536,000 ns/op
murmur64·p1.00:   213504,000 ns/op

Iteration   3: 64014,343 ±(99.9%) 25,579 ns/op
murmur64·p0.00:   61184,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65216,000 ns/op
murmur64·p0.95:   66816,000 ns/op
murmur64·p0.99:   68480,000 ns/op
murmur64·p0.999:  110976,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   382976,000 ns/op

Iteration   4: 64130,392 ±(99.9%) 30,420 ns/op
murmur64·p0.00:   62848,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65280,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   72832,000 ns/op
murmur64·p0.999:  113408,000 ns/op
murmur64·p0.9999: 161899,878 ns/op
murmur64·p1.00:   529408,000 ns/op

Iteration   5: 64003,573 ±(99.9%) 22,800 ns/op
murmur64·p0.00:   61632,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65344,000 ns/op
murmur64·p0.95:   66816,000 ns/op
murmur64·p0.99:   68608,000 ns/op
murmur64·p0.999:  108160,000 ns/op
murmur64·p0.9999: 161536,000 ns/op
murmur64·p1.00:   276480,000 ns/op


# Run progress: 87,83% complete, ETA 01:53:03
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 62589,840 ±(99.9%) 103,308 ns/op
# Warmup Iteration   2: 62721,736 ±(99.9%) 58,901 ns/op
# Warmup Iteration   3: 64093,269 ±(99.9%) 26,969 ns/op
# Warmup Iteration   4: 64015,600 ±(99.9%) 25,760 ns/op
# Warmup Iteration   5: 64006,432 ±(99.9%) 23,707 ns/op
Iteration   1: 63996,970 ±(99.9%) 25,643 ns/op
murmur64·p0.00:   62016,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65472,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68224,000 ns/op
murmur64·p0.999:  109425,408 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   536576,000 ns/op

Iteration   2: 64292,234 ±(99.9%) 29,645 ns/op
murmur64·p0.00:   60352,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   66304,000 ns/op
murmur64·p0.95:   67328,000 ns/op
murmur64·p0.99:   71808,000 ns/op
murmur64·p0.999:  110797,824 ns/op
murmur64·p0.9999: 162048,000 ns/op
murmur64·p1.00:   537600,000 ns/op

Iteration   3: 64193,377 ±(99.9%) 22,800 ns/op
murmur64·p0.00:   62592,000 ns/op
murmur64·p0.50:   63744,000 ns/op
murmur64·p0.90:   66048,000 ns/op
murmur64·p0.95:   67200,000 ns/op
murmur64·p0.99:   68736,000 ns/op
murmur64·p0.999:  109568,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   212480,000 ns/op

Iteration   4: 64036,480 ±(99.9%) 24,300 ns/op
murmur64·p0.00:   61760,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65664,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   70272,000 ns/op
murmur64·p0.999:  107648,000 ns/op
murmur64·p0.9999: 161536,000 ns/op
murmur64·p1.00:   380416,000 ns/op

Iteration   5: 64032,288 ±(99.9%) 24,165 ns/op
murmur64·p0.00:   62528,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65472,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   69760,000 ns/op
murmur64·p0.999:  110080,000 ns/op
murmur64·p0.9999: 161637,811 ns/op
murmur64·p1.00:   280064,000 ns/op


# Run progress: 88,00% complete, ETA 01:51:31
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 64115,533 ±(99.9%) 110,687 ns/op
# Warmup Iteration   2: 63080,302 ±(99.9%) 61,834 ns/op
# Warmup Iteration   3: 64175,833 ±(99.9%) 27,966 ns/op
# Warmup Iteration   4: 64107,086 ±(99.9%) 29,948 ns/op
# Warmup Iteration   5: 64296,018 ±(99.9%) 33,382 ns/op
Iteration   1: 64096,992 ±(99.9%) 22,932 ns/op
murmur64·p0.00:   61760,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65216,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   69376,000 ns/op
murmur64·p0.999:  108177,536 ns/op
murmur64·p0.9999: 161641,907 ns/op
murmur64·p1.00:   207872,000 ns/op

Iteration   2: 64129,640 ±(99.9%) 27,607 ns/op
murmur64·p0.00:   62272,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65536,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   69248,000 ns/op
murmur64·p0.999:  110848,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   702464,000 ns/op

Iteration   3: 64083,965 ±(99.9%) 23,862 ns/op
murmur64·p0.00:   61760,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65088,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68480,000 ns/op
murmur64·p0.999:  111244,928 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   210688,000 ns/op

Iteration   4: 64341,030 ±(99.9%) 27,454 ns/op
murmur64·p0.00:   60992,000 ns/op
murmur64·p0.50:   63808,000 ns/op
murmur64·p0.90:   66304,000 ns/op
murmur64·p0.95:   67328,000 ns/op
murmur64·p0.99:   71040,000 ns/op
murmur64·p0.999:  112512,000 ns/op
murmur64·p0.9999: 162424,960 ns/op
murmur64·p1.00:   422912,000 ns/op

Iteration   5: 64093,414 ±(99.9%) 28,500 ns/op
murmur64·p0.00:   62336,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65152,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68864,000 ns/op
murmur64·p0.999:  110464,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   701440,000 ns/op


# Run progress: 88,17% complete, ETA 01:50:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 63989,139 ±(99.9%) 99,112 ns/op
# Warmup Iteration   2: 63139,170 ±(99.9%) 64,061 ns/op
# Warmup Iteration   3: 64093,349 ±(99.9%) 33,634 ns/op
# Warmup Iteration   4: 64058,375 ±(99.9%) 28,323 ns/op
# Warmup Iteration   5: 64028,654 ±(99.9%) 24,252 ns/op
Iteration   1: 64022,553 ±(99.9%) 24,142 ns/op
murmur64·p0.00:   62848,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65088,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68608,000 ns/op
murmur64·p0.999:  108032,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   316416,000 ns/op

Iteration   2: 64164,827 ±(99.9%) 27,624 ns/op
murmur64·p0.00:   62592,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65792,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   70912,000 ns/op
murmur64·p0.999:  112512,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   286208,000 ns/op

Iteration   3: 64049,943 ±(99.9%) 27,677 ns/op
murmur64·p0.00:   62912,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65024,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   69248,000 ns/op
murmur64·p0.999:  108032,000 ns/op
murmur64·p0.9999: 163330,560 ns/op
murmur64·p1.00:   702464,000 ns/op

Iteration   4: 64039,010 ±(99.9%) 26,224 ns/op
murmur64·p0.00:   62912,000 ns/op
murmur64·p0.50:   63488,000 ns/op
murmur64·p0.90:   65152,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68736,000 ns/op
murmur64·p0.999:  112000,000 ns/op
murmur64·p0.9999: 161792,000 ns/op
murmur64·p1.00:   506880,000 ns/op

Iteration   5: 64065,504 ±(99.9%) 28,844 ns/op
murmur64·p0.00:   62016,000 ns/op
murmur64·p0.50:   63552,000 ns/op
murmur64·p0.90:   65536,000 ns/op
murmur64·p0.95:   66944,000 ns/op
murmur64·p0.99:   68480,000 ns/op
murmur64·p0.999:  108679,552 ns/op
murmur64·p0.9999: 161895,910 ns/op
murmur64·p1.00:   608256,000 ns/op



Result "org.example.Main.murmur64":
N = 1558331
mean =  64108,569 ±(99.9%) 8,402 ns/op

Histogram, ns/op:
[     0,000,  50000,000) = 0
[ 50000,000, 100000,000) = 1556102
[100000,000, 150000,000) = 1970
[150000,000, 200000,000) = 199
[200000,000, 250000,000) = 36
[250000,000, 300000,000) = 12
[300000,000, 350000,000) = 3
[350000,000, 400000,000) = 0
[400000,000, 450000,000) = 3
[450000,000, 500000,000) = 0
[500000,000, 550000,000) = 2
[550000,000, 600000,000) = 0
[600000,000, 650000,000) = 1
[650000,000, 700000,000) = 0
[700000,000, 750000,000) = 3

Percentiles, ns/op:
p(0,0000) =  60992,000 ns/op
p(50,0000) =  63552,000 ns/op
p(90,0000) =  65408,000 ns/op
p(95,0000) =  66944,000 ns/op
p(99,0000) =  69248,000 ns/op
p(99,9000) = 110592,000 ns/op
p(99,9900) = 161792,000 ns/op
p(99,9990) = 283050,680 ns/op
p(99,9999) = 702464,000 ns/op
p(100,0000) = 702464,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 4M)

# Run progress: 88,33% complete, ETA 01:48:28
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 532861,761 ±(99.9%) 2008,473 ns/op
# Warmup Iteration   2: 531624,732 ±(99.9%) 1599,575 ns/op
# Warmup Iteration   3: 460114,151 ±(99.9%) 931,131 ns/op
# Warmup Iteration   4: 514149,694 ±(99.9%) 967,647 ns/op
# Warmup Iteration   5: 513856,757 ±(99.9%) 480,726 ns/op
Iteration   1: 514367,901 ±(99.9%) 511,071 ns/op
murmur64·p0.00:   500736,000 ns/op
murmur64·p0.50:   512512,000 ns/op
murmur64·p0.90:   517632,000 ns/op
murmur64·p0.95:   520192,000 ns/op
murmur64·p0.99:   541696,000 ns/op
murmur64·p0.999:  872589,312 ns/op
murmur64·p0.9999: 1330579,866 ns/op
murmur64·p1.00:   1693696,000 ns/op

Iteration   2: 513287,218 ±(99.9%) 874,503 ns/op
murmur64·p0.00:   494080,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   516096,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   537600,000 ns/op
murmur64·p0.999:  904306,688 ns/op
murmur64·p0.9999: 1494129,050 ns/op
murmur64·p1.00:   4857856,000 ns/op

Iteration   3: 513707,737 ±(99.9%) 492,659 ns/op
murmur64·p0.00:   505856,000 ns/op
murmur64·p0.50:   512512,000 ns/op
murmur64·p0.90:   517120,000 ns/op
murmur64·p0.95:   518656,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  866860,032 ns/op
murmur64·p0.9999: 1323101,184 ns/op
murmur64·p1.00:   1681408,000 ns/op

Iteration   4: 513495,280 ±(99.9%) 444,754 ns/op
murmur64·p0.00:   499200,000 ns/op
murmur64·p0.50:   512512,000 ns/op
murmur64·p0.90:   517120,000 ns/op
murmur64·p0.95:   518656,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  795760,640 ns/op
murmur64·p0.9999: 1320969,216 ns/op
murmur64·p1.00:   1683456,000 ns/op

Iteration   5: 512952,287 ±(99.9%) 782,668 ns/op
murmur64·p0.00:   491008,000 ns/op
murmur64·p0.50:   510976,000 ns/op
murmur64·p0.90:   516096,000 ns/op
murmur64·p0.95:   519680,000 ns/op
murmur64·p0.99:   545792,000 ns/op
murmur64·p0.999:  863790,080 ns/op
murmur64·p0.9999: 1447613,440 ns/op
murmur64·p1.00:   4157440,000 ns/op


# Run progress: 88,50% complete, ETA 01:46:56
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 529167,975 ±(99.9%) 1825,045 ns/op
# Warmup Iteration   2: 528317,611 ±(99.9%) 1559,575 ns/op
# Warmup Iteration   3: 460994,276 ±(99.9%) 717,107 ns/op
# Warmup Iteration   4: 514638,619 ±(99.9%) 469,049 ns/op
# Warmup Iteration   5: 513832,866 ±(99.9%) 539,158 ns/op
Iteration   1: 513919,895 ±(99.9%) 542,316 ns/op
murmur64·p0.00:   503296,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   516608,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  896417,792 ns/op
murmur64·p0.9999: 1327951,667 ns/op
murmur64·p1.00:   1693696,000 ns/op

Iteration   2: 513344,865 ±(99.9%) 569,347 ns/op
murmur64·p0.00:   494592,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   516096,000 ns/op
murmur64·p0.95:   518656,000 ns/op
murmur64·p0.99:   540672,000 ns/op
murmur64·p0.999:  933406,720 ns/op
murmur64·p0.9999: 1294661,632 ns/op
murmur64·p1.00:   1300480,000 ns/op

Iteration   3: 514987,682 ±(99.9%) 874,589 ns/op
murmur64·p0.00:   498688,000 ns/op
murmur64·p0.50:   512512,000 ns/op
murmur64·p0.90:   517632,000 ns/op
murmur64·p0.95:   521216,000 ns/op
murmur64·p0.99:   543744,000 ns/op
murmur64·p0.999:  978501,632 ns/op
murmur64·p0.9999: 1852768,256 ns/op
murmur64·p1.00:   4087808,000 ns/op

Iteration   4: 513426,057 ±(99.9%) 456,596 ns/op
murmur64·p0.00:   501248,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   516608,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  866849,792 ns/op
murmur64·p0.9999: 1297038,950 ns/op
murmur64·p1.00:   1308672,000 ns/op

Iteration   5: 512673,387 ±(99.9%) 762,382 ns/op
murmur64·p0.00:   489984,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   514560,000 ns/op
murmur64·p0.95:   518656,000 ns/op
murmur64·p0.99:   537600,000 ns/op
murmur64·p0.999:  866820,096 ns/op
murmur64·p0.9999: 1442666,906 ns/op
murmur64·p1.00:   4005888,000 ns/op


# Run progress: 88,67% complete, ETA 01:45:24
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 529659,792 ±(99.9%) 2146,624 ns/op
# Warmup Iteration   2: 528828,893 ±(99.9%) 1520,099 ns/op
# Warmup Iteration   3: 459403,833 ±(99.9%) 772,383 ns/op
# Warmup Iteration   4: 511932,102 ±(99.9%) 496,580 ns/op
# Warmup Iteration   5: 513423,216 ±(99.9%) 551,018 ns/op
Iteration   1: 514377,783 ±(99.9%) 505,204 ns/op
murmur64·p0.00:   494592,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   517120,000 ns/op
murmur64·p0.95:   521728,000 ns/op
murmur64·p0.99:   550594,560 ns/op
murmur64·p0.999:  871424,000 ns/op
murmur64·p0.9999: 1300829,594 ns/op
murmur64·p1.00:   1306624,000 ns/op

Iteration   2: 512046,560 ±(99.9%) 530,454 ns/op
murmur64·p0.00:   501248,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   513024,000 ns/op
murmur64·p0.95:   517120,000 ns/op
murmur64·p0.99:   534528,000 ns/op
murmur64·p0.999:  963379,200 ns/op
murmur64·p0.9999: 1321107,456 ns/op
murmur64·p1.00:   1689600,000 ns/op

Iteration   3: 512146,477 ±(99.9%) 613,235 ns/op
murmur64·p0.00:   501248,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   513536,000 ns/op
murmur64·p0.95:   517632,000 ns/op
murmur64·p0.99:   534528,000 ns/op
murmur64·p0.999:  940040,192 ns/op
murmur64·p0.9999: 1713720,525 ns/op
murmur64·p1.00:   2228224,000 ns/op

Iteration   4: 511847,863 ±(99.9%) 471,529 ns/op
murmur64·p0.00:   500736,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   513024,000 ns/op
murmur64·p0.95:   516096,000 ns/op
murmur64·p0.99:   534528,000 ns/op
murmur64·p0.999:  890921,984 ns/op
murmur64·p0.9999: 1296577,741 ns/op
murmur64·p1.00:   1300480,000 ns/op

Iteration   5: 513274,925 ±(99.9%) 765,526 ns/op
murmur64·p0.00:   501248,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   516096,000 ns/op
murmur64·p0.95:   525312,000 ns/op
murmur64·p0.99:   543744,000 ns/op
murmur64·p0.999:  868946,944 ns/op
murmur64·p0.9999: 1447366,861 ns/op
murmur64·p1.00:   4014080,000 ns/op


# Run progress: 88,83% complete, ETA 01:43:52
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 531791,355 ±(99.9%) 1919,143 ns/op
# Warmup Iteration   2: 530453,938 ±(99.9%) 1429,003 ns/op
# Warmup Iteration   3: 459235,201 ±(99.9%) 716,432 ns/op
# Warmup Iteration   4: 514618,289 ±(99.9%) 559,095 ns/op
# Warmup Iteration   5: 513662,072 ±(99.9%) 473,928 ns/op
Iteration   1: 513834,603 ±(99.9%) 590,705 ns/op
murmur64·p0.00:   503296,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   516608,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  887443,456 ns/op
murmur64·p0.9999: 1723661,517 ns/op
murmur64·p1.00:   2240512,000 ns/op

Iteration   2: 513639,463 ±(99.9%) 401,980 ns/op
murmur64·p0.00:   500736,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   516608,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  871977,984 ns/op
murmur64·p0.9999: 1091694,797 ns/op
murmur64·p1.00:   1093632,000 ns/op

Iteration   3: 514509,288 ±(99.9%) 432,619 ns/op
murmur64·p0.00:   505344,000 ns/op
murmur64·p0.50:   513024,000 ns/op
murmur64·p0.90:   517120,000 ns/op
murmur64·p0.95:   520192,000 ns/op
murmur64·p0.99:   543744,000 ns/op
murmur64·p0.999:  793751,552 ns/op
murmur64·p0.9999: 1103927,296 ns/op
murmur64·p1.00:   1306624,000 ns/op

Iteration   4: 513837,630 ±(99.9%) 458,552 ns/op
murmur64·p0.00:   504832,000 ns/op
murmur64·p0.50:   512512,000 ns/op
murmur64·p0.90:   516608,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  888819,712 ns/op
murmur64·p0.9999: 1302640,230 ns/op
murmur64·p1.00:   1304576,000 ns/op

Iteration   5: 513557,758 ±(99.9%) 959,318 ns/op
murmur64·p0.00:   500224,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   516096,000 ns/op
murmur64·p0.95:   517632,000 ns/op
murmur64·p0.99:   536576,000 ns/op
murmur64·p0.999:  849668,096 ns/op
murmur64·p0.9999: 3967754,240 ns/op
murmur64·p1.00:   4161536,000 ns/op


# Run progress: 89,00% complete, ETA 01:42:19
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 529070,707 ±(99.9%) 1868,321 ns/op
# Warmup Iteration   2: 528805,730 ±(99.9%) 1379,133 ns/op
# Warmup Iteration   3: 461472,208 ±(99.9%) 990,003 ns/op
# Warmup Iteration   4: 513320,813 ±(99.9%) 527,578 ns/op
# Warmup Iteration   5: 512934,870 ±(99.9%) 373,791 ns/op
Iteration   1: 514375,675 ±(99.9%) 493,794 ns/op
murmur64·p0.00:   505856,000 ns/op
murmur64·p0.50:   512000,000 ns/op
murmur64·p0.90:   517632,000 ns/op
murmur64·p0.95:   521216,000 ns/op
murmur64·p0.99:   547840,000 ns/op
murmur64·p0.999:  868352,000 ns/op
murmur64·p0.9999: 1306740,531 ns/op
murmur64·p1.00:   1308672,000 ns/op

Iteration   2: 512770,850 ±(99.9%) 559,913 ns/op
murmur64·p0.00:   481280,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   515584,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   540672,000 ns/op
murmur64·p0.999:  911880,192 ns/op
murmur64·p0.9999: 1302632,038 ns/op
murmur64·p1.00:   1304576,000 ns/op

Iteration   3: 512065,292 ±(99.9%) 450,915 ns/op
murmur64·p0.00:   494080,000 ns/op
murmur64·p0.50:   510976,000 ns/op
murmur64·p0.90:   514560,000 ns/op
murmur64·p0.95:   518144,000 ns/op
murmur64·p0.99:   538624,000 ns/op
murmur64·p0.999:  867328,000 ns/op
murmur64·p0.9999: 1296581,018 ns/op
murmur64·p1.00:   1300480,000 ns/op

Iteration   4: 511583,266 ±(99.9%) 455,313 ns/op
murmur64·p0.00:   496128,000 ns/op
murmur64·p0.50:   510976,000 ns/op
murmur64·p0.90:   513024,000 ns/op
murmur64·p0.95:   517120,000 ns/op
murmur64·p0.99:   537600,000 ns/op
murmur64·p0.999:  885532,672 ns/op
murmur64·p0.9999: 1296573,645 ns/op
murmur64·p1.00:   1300480,000 ns/op

Iteration   5: 513897,017 ±(99.9%) 780,400 ns/op
murmur64·p0.00:   493568,000 ns/op
murmur64·p0.50:   511488,000 ns/op
murmur64·p0.90:   517632,000 ns/op
murmur64·p0.95:   526336,000 ns/op
murmur64·p0.99:   549386,240 ns/op
murmur64·p0.999:  869480,448 ns/op
murmur64·p0.9999: 2185199,821 ns/op
murmur64·p1.00:   3870720,000 ns/op



Result "org.example.Main.murmur64":
N = 194669
mean = 513405,452 ±(99.9%) 184,597 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 25
[ 500000,000, 1000000,000) = 194543
[1000000,000, 1500000,000) = 94
[1500000,000, 2000000,000) = 2
[2000000,000, 2500000,000) = 2
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 2
[4000000,000, 4500000,000) = 1

Percentiles, ns/op:
p(0,0000) = 481280,000 ns/op
p(50,0000) = 511488,000 ns/op
p(90,0000) = 516608,000 ns/op
p(95,0000) = 518656,000 ns/op
p(99,0000) = 539648,000 ns/op
p(99,9000) = 871424,000 ns/op
p(99,9900) = 1300480,000 ns/op
p(99,9990) = 3967651,840 ns/op
p(99,9999) = 4161536,000 ns/op
p(100,0000) = 4161536,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 20M)

# Run progress: 89,17% complete, ETA 01:40:47
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 2282244,795 ±(99.9%) 11159,713 ns/op
# Warmup Iteration   2: 2249926,067 ±(99.9%) 6893,068 ns/op
# Warmup Iteration   3: 2234030,941 ±(99.9%) 8086,277 ns/op
# Warmup Iteration   4: 2238538,798 ±(99.9%) 7378,490 ns/op
# Warmup Iteration   5: 2234471,064 ±(99.9%) 9292,216 ns/op
Iteration   1: 2232015,271 ±(99.9%) 5858,258 ns/op
murmur64·p0.00:   2199552,000 ns/op
murmur64·p0.50:   2228224,000 ns/op
murmur64·p0.90:   2232320,000 ns/op
murmur64·p0.95:   2240512,000 ns/op
murmur64·p0.99:   2269184,000 ns/op
murmur64·p0.999:  3911868,416 ns/op
murmur64·p0.9999: 8650752,000 ns/op
murmur64·p1.00:   8650752,000 ns/op

Iteration   2: 2240924,540 ±(99.9%) 10046,283 ns/op
murmur64·p0.00:   2191360,000 ns/op
murmur64·p0.50:   2228224,000 ns/op
murmur64·p0.90:   2260992,000 ns/op
murmur64·p0.95:   2265088,000 ns/op
murmur64·p0.99:   2289664,000 ns/op
murmur64·p0.999:  5135728,640 ns/op
murmur64·p0.9999: 10223616,000 ns/op
murmur64·p1.00:   10223616,000 ns/op

Iteration   3: 2272079,513 ±(99.9%) 6240,852 ns/op
murmur64·p0.00:   2240512,000 ns/op
murmur64·p0.50:   2265088,000 ns/op
murmur64·p0.90:   2273280,000 ns/op
murmur64·p0.95:   2285568,000 ns/op
murmur64·p0.99:   2351104,000 ns/op
murmur64·p0.999:  4636901,376 ns/op
murmur64·p0.9999: 7921664,000 ns/op
murmur64·p1.00:   7921664,000 ns/op

Iteration   4: 2272470,488 ±(99.9%) 2999,155 ns/op
murmur64·p0.00:   2232320,000 ns/op
murmur64·p0.50:   2265088,000 ns/op
murmur64·p0.90:   2281472,000 ns/op
murmur64·p0.95:   2293760,000 ns/op
murmur64·p0.99:   2359377,920 ns/op
murmur64·p0.999:  2787745,792 ns/op
murmur64·p0.9999: 4849664,000 ns/op
murmur64·p1.00:   4849664,000 ns/op

Iteration   5: 2268958,925 ±(99.9%) 5176,258 ns/op
murmur64·p0.00:   2244608,000 ns/op
murmur64·p0.50:   2265088,000 ns/op
murmur64·p0.90:   2273280,000 ns/op
murmur64·p0.95:   2277376,000 ns/op
murmur64·p0.99:   2301952,000 ns/op
murmur64·p0.999:  3484405,760 ns/op
murmur64·p0.9999: 8011776,000 ns/op
murmur64·p1.00:   8011776,000 ns/op


# Run progress: 89,33% complete, ETA 01:39:15
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 2278191,278 ±(99.9%) 10720,615 ns/op
# Warmup Iteration   2: 2253802,517 ±(99.9%) 7264,539 ns/op
# Warmup Iteration   3: 2236277,541 ±(99.9%) 7155,107 ns/op
# Warmup Iteration   4: 2231530,443 ±(99.9%) 6913,516 ns/op
# Warmup Iteration   5: 2233799,213 ±(99.9%) 9462,684 ns/op
Iteration   1: 2230405,058 ±(99.9%) 4431,636 ns/op
murmur64·p0.00:   2187264,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2232320,000 ns/op
murmur64·p0.95:   2236416,000 ns/op
murmur64·p0.99:   2278195,200 ns/op
murmur64·p0.999:  3662315,520 ns/op
murmur64·p0.9999: 6569984,000 ns/op
murmur64·p1.00:   6569984,000 ns/op

Iteration   2: 2247946,369 ±(99.9%) 14971,180 ns/op
murmur64·p0.00:   2183168,000 ns/op
murmur64·p0.50:   2228224,000 ns/op
murmur64·p0.90:   2273280,000 ns/op
murmur64·p0.95:   2277376,000 ns/op
murmur64·p0.99:   2492620,800 ns/op
murmur64·p0.999:  3917578,240 ns/op
murmur64·p0.9999: 21495808,000 ns/op
murmur64·p1.00:   21495808,000 ns/op

Iteration   3: 2276357,833 ±(99.9%) 3829,207 ns/op
murmur64·p0.00:   2236416,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2293760,000 ns/op
murmur64·p0.999:  3172474,880 ns/op
murmur64·p0.9999: 5840896,000 ns/op
murmur64·p1.00:   5840896,000 ns/op

Iteration   4: 2279398,301 ±(99.9%) 6853,402 ns/op
murmur64·p0.00:   2248704,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2302443,520 ns/op
murmur64·p0.999:  4739956,736 ns/op
murmur64·p0.9999: 8011776,000 ns/op
murmur64·p1.00:   8011776,000 ns/op

Iteration   5: 2279630,996 ±(99.9%) 7586,539 ns/op
murmur64·p0.00:   2240512,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2351104,000 ns/op
murmur64·p0.999:  5340790,784 ns/op
murmur64·p0.9999: 8552448,000 ns/op
murmur64·p1.00:   8552448,000 ns/op


# Run progress: 89,50% complete, ETA 01:37:43
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 2286348,012 ±(99.9%) 8682,103 ns/op
# Warmup Iteration   2: 2255762,178 ±(99.9%) 6742,311 ns/op
# Warmup Iteration   3: 2256849,738 ±(99.9%) 3046,259 ns/op
# Warmup Iteration   4: 2275002,521 ±(99.9%) 9735,908 ns/op
# Warmup Iteration   5: 2240113,421 ±(99.9%) 8509,369 ns/op
Iteration   1: 2235603,949 ±(99.9%) 11664,696 ns/op
murmur64·p0.00:   2183168,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2228224,000 ns/op
murmur64·p0.95:   2236416,000 ns/op
murmur64·p0.99:   2270412,800 ns/op
murmur64·p0.999:  5313495,040 ns/op
murmur64·p0.9999: 11452416,000 ns/op
murmur64·p1.00:   11452416,000 ns/op

Iteration   2: 2237334,069 ±(99.9%) 10177,098 ns/op
murmur64·p0.00:   2179072,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2236416,000 ns/op
murmur64·p0.95:   2273280,000 ns/op
murmur64·p0.99:   2286919,680 ns/op
murmur64·p0.999:  5501198,336 ns/op
murmur64·p0.9999: 10665984,000 ns/op
murmur64·p1.00:   10665984,000 ns/op

Iteration   3: 2277059,559 ±(99.9%) 4282,475 ns/op
murmur64·p0.00:   2248704,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2326528,000 ns/op
murmur64·p0.999:  3401465,856 ns/op
murmur64·p0.9999: 5644288,000 ns/op
murmur64·p1.00:   5644288,000 ns/op

Iteration   4: 2279506,705 ±(99.9%) 2156,945 ns/op
murmur64·p0.00:   2256896,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2285568,000 ns/op
murmur64·p0.95:   2297856,000 ns/op
murmur64·p0.99:   2392719,360 ns/op
murmur64·p0.999:  3086811,136 ns/op
murmur64·p0.9999: 3440640,000 ns/op
murmur64·p1.00:   3440640,000 ns/op

Iteration   5: 2276635,006 ±(99.9%) 5417,113 ns/op
murmur64·p0.00:   2244608,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2277376,000 ns/op
murmur64·p0.99:   2297856,000 ns/op
murmur64·p0.999:  3298631,680 ns/op
murmur64·p0.9999: 7913472,000 ns/op
murmur64·p1.00:   7913472,000 ns/op


# Run progress: 89,67% complete, ETA 01:36:11
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 2276800,992 ±(99.9%) 6059,648 ns/op
# Warmup Iteration   2: 2249718,546 ±(99.9%) 14313,056 ns/op
# Warmup Iteration   3: 2235922,793 ±(99.9%) 7552,271 ns/op
# Warmup Iteration   4: 2246957,258 ±(99.9%) 7638,346 ns/op
# Warmup Iteration   5: 2235138,634 ±(99.9%) 9470,420 ns/op
Iteration   1: 2229250,514 ±(99.9%) 2708,276 ns/op
murmur64·p0.00:   2191360,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2232320,000 ns/op
murmur64·p0.95:   2232320,000 ns/op
murmur64·p0.99:   2281472,000 ns/op
murmur64·p0.999:  3310895,104 ns/op
murmur64·p0.9999: 4186112,000 ns/op
murmur64·p1.00:   4186112,000 ns/op

Iteration   2: 2246943,439 ±(99.9%) 8931,509 ns/op
murmur64·p0.00:   2191360,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2265088,000 ns/op
murmur64·p0.95:   2285568,000 ns/op
murmur64·p0.99:   2564096,000 ns/op
murmur64·p0.999:  4877639,680 ns/op
murmur64·p0.9999: 10682368,000 ns/op
murmur64·p1.00:   10682368,000 ns/op

Iteration   3: 2268770,122 ±(99.9%) 5735,657 ns/op
murmur64·p0.00:   2232320,000 ns/op
murmur64·p0.50:   2260992,000 ns/op
murmur64·p0.90:   2273280,000 ns/op
murmur64·p0.95:   2277376,000 ns/op
murmur64·p0.99:   2342092,800 ns/op
murmur64·p0.999:  4000296,960 ns/op
murmur64·p0.9999: 7905280,000 ns/op
murmur64·p1.00:   7905280,000 ns/op

Iteration   4: 2273868,206 ±(99.9%) 6657,857 ns/op
murmur64·p0.00:   2240512,000 ns/op
murmur64·p0.50:   2269184,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2277376,000 ns/op
murmur64·p0.99:   2330624,000 ns/op
murmur64·p0.999:  3500871,680 ns/op
murmur64·p0.9999: 7970816,000 ns/op
murmur64·p1.00:   7970816,000 ns/op

Iteration   5: 2278802,686 ±(99.9%) 6023,592 ns/op
murmur64·p0.00:   2244608,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2330624,000 ns/op
murmur64·p0.999:  4736860,160 ns/op
murmur64·p0.9999: 7938048,000 ns/op
murmur64·p1.00:   7938048,000 ns/op


# Run progress: 89,83% complete, ETA 01:34:39
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 2290981,745 ±(99.9%) 11886,953 ns/op
# Warmup Iteration   2: 2253083,598 ±(99.9%) 5590,682 ns/op
# Warmup Iteration   3: 2229523,534 ±(99.9%) 7984,787 ns/op
# Warmup Iteration   4: 2233190,652 ±(99.9%) 8282,461 ns/op
# Warmup Iteration   5: 2239986,683 ±(99.9%) 8550,638 ns/op
Iteration   1: 2230968,082 ±(99.9%) 5177,683 ns/op
murmur64·p0.00:   2187264,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2232320,000 ns/op
murmur64·p0.95:   2236416,000 ns/op
murmur64·p0.99:   2270044,160 ns/op
murmur64·p0.999:  3961376,768 ns/op
murmur64·p0.9999: 6578176,000 ns/op
murmur64·p1.00:   6578176,000 ns/op

Iteration   2: 2233649,620 ±(99.9%) 3195,237 ns/op
murmur64·p0.00:   2203648,000 ns/op
murmur64·p0.50:   2224128,000 ns/op
murmur64·p0.90:   2269184,000 ns/op
murmur64·p0.95:   2273280,000 ns/op
murmur64·p0.99:   2281472,000 ns/op
murmur64·p0.999:  3165519,872 ns/op
murmur64·p0.9999: 5087232,000 ns/op
murmur64·p1.00:   5087232,000 ns/op

Iteration   3: 2278351,194 ±(99.9%) 5027,493 ns/op
murmur64·p0.00:   2236416,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2301952,000 ns/op
murmur64·p0.999:  4377657,344 ns/op
murmur64·p0.9999: 5865472,000 ns/op
murmur64·p1.00:   5865472,000 ns/op

Iteration   4: 2288435,012 ±(99.9%) 8447,105 ns/op
murmur64·p0.00:   2240512,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2289664,000 ns/op
murmur64·p0.95:   2318336,000 ns/op
murmur64·p0.99:   2518999,040 ns/op
murmur64·p0.999:  5637447,680 ns/op
murmur64·p0.9999: 7954432,000 ns/op
murmur64·p1.00:   7954432,000 ns/op

Iteration   5: 2277865,353 ±(99.9%) 8009,132 ns/op
murmur64·p0.00:   2228224,000 ns/op
murmur64·p0.50:   2273280,000 ns/op
murmur64·p0.90:   2277376,000 ns/op
murmur64·p0.95:   2281472,000 ns/op
murmur64·p0.99:   2327060,480 ns/op
murmur64·p0.999:  5541240,832 ns/op
murmur64·p0.9999: 7938048,000 ns/op
murmur64·p1.00:   7938048,000 ns/op



Result "org.example.Main.murmur64":
N = 44197
mean = 2260480,985 ±(99.9%) 2017,886 ns/op

Histogram, ns/op:
[ 2000000,000,  2500000,000) = 43996
[ 2500000,000,  3000000,000) = 107
[ 3000000,000,  3500000,000) = 40
[ 3500000,000,  4000000,000) = 12
[ 4000000,000,  4500000,000) = 4
[ 4500000,000,  5000000,000) = 10
[ 5000000,000,  5500000,000) = 9
[ 5500000,000,  6000000,000) = 8
[ 6000000,000,  6500000,000) = 0
[ 6500000,000,  7000000,000) = 2
[ 7000000,000,  7500000,000) = 0
[ 7500000,000,  8000000,000) = 8
[ 8000000,000,  8500000,000) = 0
[ 8500000,000,  9000000,000) = 0
[ 9000000,000,  9500000,000) = 0
[ 9500000,000, 10000000,000) = 0
[10000000,000, 10500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 2187264,000 ns/op
p(50,0000) = 2265088,000 ns/op
p(90,0000) = 2277376,000 ns/op
p(95,0000) = 2281472,000 ns/op
p(99,0000) = 2351104,000 ns/op
p(99,9000) = 3898744,832 ns/op
p(99,9900) = 7938048,000 ns/op
p(99,9990) = 10682368,000 ns/op
p(99,9999) = 10682368,000 ns/op
p(100,0000) = 10682368,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 64K)

# Run progress: 90,00% complete, ETA 01:33:06
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 90,17% complete, ETA 01:31:23
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 90,33% complete, ETA 01:29:40
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 90,50% complete, ETA 01:27:58
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 90,67% complete, ETA 01:26:16
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 512K)

# Run progress: 90,83% complete, ETA 01:24:34
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 91,00% complete, ETA 01:22:53
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 91,17% complete, ETA 01:21:12
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 91,33% complete, ETA 01:19:31
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 91,50% complete, ETA 01:17:51
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 4M)

# Run progress: 91,67% complete, ETA 01:16:11
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 91,83% complete, ETA 01:14:32
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 92,00% complete, ETA 01:12:52
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 92,17% complete, ETA 01:11:14
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 92,33% complete, ETA 01:09:35
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 20M)

# Run progress: 92,50% complete, ETA 01:07:57
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 92,67% complete, ETA 01:06:19
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 92,83% complete, ETA 01:04:42
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 93,00% complete, ETA 01:03:05
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 93,17% complete, ETA 01:01:28
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_sample_jmhStub(Main_sha128_jmhTest.java:333)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SampleTime(Main_sha128_jmhTest.java:267)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 64K)

# Run progress: 93,33% complete, ETA 00:59:52
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23545,670 ±(99.9%) 67,290 ns/op
# Warmup Iteration   2: 23550,923 ±(99.9%) 10,252 ns/op
# Warmup Iteration   3: 23479,986 ±(99.9%) 5,776 ns/op
# Warmup Iteration   4: 23487,478 ±(99.9%) 5,380 ns/op
# Warmup Iteration   5: 23490,306 ±(99.9%) 5,368 ns/op
Iteration   1: 23516,819 ±(99.9%) 5,236 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   24256,000 ns/op
sha256·p0.95:   24480,000 ns/op
sha256·p0.99:   27200,000 ns/op
sha256·p0.999:  28832,000 ns/op
sha256·p0.9999: 36382,208 ns/op
sha256·p1.00:   63744,000 ns/op

Iteration   2: 23496,626 ±(99.9%) 22,606 ns/op
sha256·p0.00:   23104,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23776,000 ns/op
sha256·p0.95:   24448,000 ns/op
sha256·p0.99:   26624,000 ns/op
sha256·p0.999:  28640,000 ns/op
sha256·p0.9999: 36447,501 ns/op
sha256·p1.00:   1447936,000 ns/op

Iteration   3: 23400,434 ±(99.9%) 4,186 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23360,000 ns/op
sha256·p0.95:   23712,000 ns/op
sha256·p0.99:   26464,000 ns/op
sha256·p0.999:  27456,000 ns/op
sha256·p0.9999: 32661,200 ns/op
sha256·p1.00:   57600,000 ns/op

Iteration   4: 23401,440 ±(99.9%) 4,109 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23392,000 ns/op
sha256·p0.95:   23712,000 ns/op
sha256·p0.99:   26496,000 ns/op
sha256·p0.999:  27456,000 ns/op
sha256·p0.9999: 32916,941 ns/op
sha256·p1.00:   41088,000 ns/op

Iteration   5: 23400,291 ±(99.9%) 4,165 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23424,000 ns/op
sha256·p0.95:   23712,000 ns/op
sha256·p0.99:   26464,000 ns/op
sha256·p0.999:  27456,000 ns/op
sha256·p0.9999: 31967,123 ns/op
sha256·p1.00:   38080,000 ns/op


# Run progress: 93,50% complete, ETA 00:58:23
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23593,198 ±(99.9%) 66,721 ns/op
# Warmup Iteration   2: 23470,276 ±(99.9%) 5,986 ns/op
# Warmup Iteration   3: 23462,970 ±(99.9%) 6,036 ns/op
# Warmup Iteration   4: 23463,416 ±(99.9%) 5,666 ns/op
# Warmup Iteration   5: 23525,178 ±(99.9%) 6,194 ns/op
Iteration   1: 23463,857 ±(99.9%) 5,607 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   24064,000 ns/op
sha256·p0.95:   24384,000 ns/op
sha256·p0.99:   27296,000 ns/op
sha256·p0.999:  29029,696 ns/op
sha256·p0.9999: 39141,696 ns/op
sha256·p1.00:   87808,000 ns/op

Iteration   2: 23435,579 ±(99.9%) 21,872 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23424,000 ns/op
sha256·p0.95:   24256,000 ns/op
sha256·p0.99:   27296,000 ns/op
sha256·p0.999:  28540,672 ns/op
sha256·p0.9999: 37318,554 ns/op
sha256·p1.00:   1398784,000 ns/op

Iteration   3: 23394,061 ±(99.9%) 4,946 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23328,000 ns/op
sha256·p0.95:   23712,000 ns/op
sha256·p0.99:   27296,000 ns/op
sha256·p0.999:  28081,216 ns/op
sha256·p0.9999: 38941,491 ns/op
sha256·p1.00:   67200,000 ns/op

Iteration   4: 23480,738 ±(99.9%) 4,746 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23808,000 ns/op
sha256·p0.95:   24256,000 ns/op
sha256·p0.99:   26464,000 ns/op
sha256·p0.999:  28384,000 ns/op
sha256·p0.9999: 35677,965 ns/op
sha256·p1.00:   82176,000 ns/op

Iteration   5: 23394,613 ±(99.9%) 3,852 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23328,000 ns/op
sha256·p0.95:   23616,000 ns/op
sha256·p0.99:   26336,000 ns/op
sha256·p0.999:  27392,000 ns/op
sha256·p0.9999: 32149,021 ns/op
sha256·p1.00:   47040,000 ns/op


# Run progress: 93,67% complete, ETA 00:56:54
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23544,627 ±(99.9%) 65,431 ns/op
# Warmup Iteration   2: 23454,554 ±(99.9%) 5,605 ns/op
# Warmup Iteration   3: 23554,529 ±(99.9%) 6,411 ns/op
# Warmup Iteration   4: 23459,443 ±(99.9%) 5,576 ns/op
# Warmup Iteration   5: 23463,976 ±(99.9%) 5,640 ns/op
Iteration   1: 23462,685 ±(99.9%) 5,533 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23744,000 ns/op
sha256·p0.95:   24352,000 ns/op
sha256·p0.99:   27328,000 ns/op
sha256·p0.999:  28384,000 ns/op
sha256·p0.9999: 40725,293 ns/op
sha256·p1.00:   85888,000 ns/op

Iteration   2: 23566,825 ±(99.9%) 5,578 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   24288,000 ns/op
sha256·p0.95:   24608,000 ns/op
sha256·p0.99:   26656,000 ns/op
sha256·p0.999:  28704,000 ns/op
sha256·p0.9999: 40238,771 ns/op
sha256·p1.00:   94720,000 ns/op

Iteration   3: 23458,444 ±(99.9%) 19,820 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23616,000 ns/op
sha256·p0.95:   24384,000 ns/op
sha256·p0.99:   26368,000 ns/op
sha256·p0.999:  27744,000 ns/op
sha256·p0.9999: 32150,336 ns/op
sha256·p1.00:   1275904,000 ns/op

Iteration   4: 23408,079 ±(99.9%) 3,748 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23424,000 ns/op
sha256·p0.95:   23744,000 ns/op
sha256·p0.99:   26304,000 ns/op
sha256·p0.999:  27424,000 ns/op
sha256·p0.9999: 31434,944 ns/op
sha256·p1.00:   43968,000 ns/op

Iteration   5: 23402,849 ±(99.9%) 3,800 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23424,000 ns/op
sha256·p0.95:   23712,000 ns/op
sha256·p0.99:   26304,000 ns/op
sha256·p0.999:  27392,000 ns/op
sha256·p0.9999: 33322,214 ns/op
sha256·p1.00:   45952,000 ns/op


# Run progress: 93,83% complete, ETA 00:55:25
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23614,590 ±(99.9%) 66,205 ns/op
# Warmup Iteration   2: 23471,277 ±(99.9%) 5,071 ns/op
# Warmup Iteration   3: 23472,996 ±(99.9%) 4,910 ns/op
# Warmup Iteration   4: 23474,895 ±(99.9%) 5,429 ns/op
# Warmup Iteration   5: 23553,885 ±(99.9%) 5,179 ns/op
Iteration   1: 23474,327 ±(99.9%) 5,265 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23744,000 ns/op
sha256·p0.95:   24352,000 ns/op
sha256·p0.99:   26432,000 ns/op
sha256·p0.999:  27712,000 ns/op
sha256·p0.9999: 33355,718 ns/op
sha256·p1.00:   149504,000 ns/op

Iteration   2: 23470,519 ±(99.9%) 4,727 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23744,000 ns/op
sha256·p0.95:   24352,000 ns/op
sha256·p0.99:   26432,000 ns/op
sha256·p0.999:  27648,000 ns/op
sha256·p0.9999: 34944,000 ns/op
sha256·p1.00:   85120,000 ns/op

Iteration   3: 23425,661 ±(99.9%) 20,650 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23424,000 ns/op
sha256·p0.95:   23936,000 ns/op
sha256·p0.99:   26368,000 ns/op
sha256·p0.999:  27552,000 ns/op
sha256·p0.9999: 34007,706 ns/op
sha256·p1.00:   1333248,000 ns/op

Iteration   4: 23491,962 ±(99.9%) 4,976 ns/op
sha256·p0.00:   23168,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23840,000 ns/op
sha256·p0.95:   24544,000 ns/op
sha256·p0.99:   26560,000 ns/op
sha256·p0.999:  28640,000 ns/op
sha256·p0.9999: 37167,706 ns/op
sha256·p1.00:   81280,000 ns/op

Iteration   5: 23401,722 ±(99.9%) 4,619 ns/op
sha256·p0.00:   23104,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23392,000 ns/op
sha256·p0.95:   23712,000 ns/op
sha256·p0.99:   26560,000 ns/op
sha256·p0.999:  27744,000 ns/op
sha256·p0.9999: 35776,000 ns/op
sha256·p1.00:   69376,000 ns/op


# Run progress: 94,00% complete, ETA 00:53:56
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 23550,360 ±(99.9%) 65,728 ns/op
# Warmup Iteration   2: 23505,378 ±(99.9%) 5,226 ns/op
# Warmup Iteration   3: 23556,940 ±(99.9%) 6,537 ns/op
# Warmup Iteration   4: 23476,402 ±(99.9%) 6,108 ns/op
# Warmup Iteration   5: 23475,371 ±(99.9%) 6,237 ns/op
Iteration   1: 23476,709 ±(99.9%) 5,491 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   23968,000 ns/op
sha256·p0.95:   24416,000 ns/op
sha256·p0.99:   27328,000 ns/op
sha256·p0.999:  28480,000 ns/op
sha256·p0.9999: 36055,898 ns/op
sha256·p1.00:   81920,000 ns/op

Iteration   2: 23523,530 ±(99.9%) 21,289 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23296,000 ns/op
sha256·p0.90:   24160,000 ns/op
sha256·p0.95:   24448,000 ns/op
sha256·p0.99:   27296,000 ns/op
sha256·p0.999:  28821,280 ns/op
sha256·p0.9999: 40170,560 ns/op
sha256·p1.00:   1347584,000 ns/op

Iteration   3: 23430,694 ±(99.9%) 4,080 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23328,000 ns/op
sha256·p0.90:   23456,000 ns/op
sha256·p0.95:   23840,000 ns/op
sha256·p0.99:   26336,000 ns/op
sha256·p0.999:  27584,000 ns/op
sha256·p0.9999: 34944,000 ns/op
sha256·p1.00:   92544,000 ns/op

Iteration   4: 23438,117 ±(99.9%) 3,982 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23328,000 ns/op
sha256·p0.90:   23520,000 ns/op
sha256·p0.95:   23840,000 ns/op
sha256·p0.99:   26336,000 ns/op
sha256·p0.999:  27520,000 ns/op
sha256·p0.9999: 32758,170 ns/op
sha256·p1.00:   51264,000 ns/op

Iteration   5: 23410,473 ±(99.9%) 3,737 ns/op
sha256·p0.00:   23200,000 ns/op
sha256·p0.50:   23328,000 ns/op
sha256·p0.90:   23360,000 ns/op
sha256·p0.95:   23616,000 ns/op
sha256·p0.99:   26304,000 ns/op
sha256·p0.999:  27392,000 ns/op
sha256·p0.9999: 32341,677 ns/op
sha256·p1.00:   42816,000 ns/op



Result "org.example.Main.sha256":
N = 2129119
mean =  23454,314 ±(99.9%) 3,243 ns/op

Histogram, ns/op:
[      0,000,  125000,000) = 2129115
[ 125000,000,  250000,000) = 2
[ 250000,000,  375000,000) = 0
[ 375000,000,  500000,000) = 0
[ 500000,000,  625000,000) = 0
[ 625000,000,  750000,000) = 0
[ 750000,000,  875000,000) = 0
[ 875000,000, 1000000,000) = 0
[1000000,000, 1125000,000) = 0
[1125000,000, 1250000,000) = 0
[1250000,000, 1375000,000) = 2
[1375000,000, 1500000,000) = 0
[1500000,000, 1625000,000) = 0
[1625000,000, 1750000,000) = 0
[1750000,000, 1875000,000) = 0

Percentiles, ns/op:
p(0,0000) =  23104,000 ns/op
p(50,0000) =  23296,000 ns/op
p(90,0000) =  23616,000 ns/op
p(95,0000) =  24288,000 ns/op
p(99,0000) =  26464,000 ns/op
p(99,9000) =  28064,000 ns/op
p(99,9900) =  35136,000 ns/op
p(99,9990) =  73232,179 ns/op
p(99,9999) = 1180402,975 ns/op
p(100,0000) = 1347584,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 512K)

# Run progress: 94,17% complete, ETA 00:52:26
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 189015,014 ±(99.9%) 487,287 ns/op
# Warmup Iteration   2: 186758,173 ±(99.9%) 26,007 ns/op
# Warmup Iteration   3: 186898,612 ±(99.9%) 31,733 ns/op
# Warmup Iteration   4: 186764,860 ±(99.9%) 151,145 ns/op
# Warmup Iteration   5: 187459,234 ±(99.9%) 45,795 ns/op
Iteration   1: 186833,552 ±(99.9%) 28,231 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   196608,000 ns/op
sha256·p0.999:  200960,000 ns/op
sha256·p0.9999: 205478,656 ns/op
sha256·p1.00:   209664,000 ns/op

Iteration   2: 186842,919 ±(99.9%) 29,551 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   197120,000 ns/op
sha256·p0.999:  201216,000 ns/op
sha256·p0.9999: 203008,000 ns/op
sha256·p1.00:   205056,000 ns/op

Iteration   3: 186673,374 ±(99.9%) 22,431 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189184,000 ns/op
sha256·p0.99:   192256,000 ns/op
sha256·p0.999:  197376,000 ns/op
sha256·p0.9999: 201381,504 ns/op
sha256·p1.00:   209920,000 ns/op

Iteration   4: 187079,101 ±(99.9%) 33,675 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189440,000 ns/op
sha256·p0.95:   191488,000 ns/op
sha256·p0.99:   196608,000 ns/op
sha256·p0.999:  201216,000 ns/op
sha256·p0.9999: 221002,240 ns/op
sha256·p1.00:   284672,000 ns/op

Iteration   5: 187031,269 ±(99.9%) 35,132 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   190720,000 ns/op
sha256·p0.99:   196096,000 ns/op
sha256·p0.999:  203776,000 ns/op
sha256·p0.9999: 250265,344 ns/op
sha256·p1.00:   258048,000 ns/op


# Run progress: 94,33% complete, ETA 00:50:57
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188538,263 ±(99.9%) 401,944 ns/op
# Warmup Iteration   2: 186790,044 ±(99.9%) 28,089 ns/op
# Warmup Iteration   3: 187072,107 ±(99.9%) 34,247 ns/op
# Warmup Iteration   4: 187349,154 ±(99.9%) 143,578 ns/op
# Warmup Iteration   5: 186678,016 ±(99.9%) 22,838 ns/op
Iteration   1: 186656,084 ±(99.9%) 22,483 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189184,000 ns/op
sha256·p0.99:   192256,000 ns/op
sha256·p0.999:  197376,000 ns/op
sha256·p0.9999: 203008,000 ns/op
sha256·p1.00:   208384,000 ns/op

Iteration   2: 186672,265 ±(99.9%) 22,963 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189184,000 ns/op
sha256·p0.99:   192768,000 ns/op
sha256·p0.999:  196864,000 ns/op
sha256·p0.9999: 201803,008 ns/op
sha256·p1.00:   204288,000 ns/op

Iteration   3: 187371,711 ±(99.9%) 41,047 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   190720,000 ns/op
sha256·p0.95:   193536,000 ns/op
sha256·p0.99:   197888,000 ns/op
sha256·p0.999:  203776,000 ns/op
sha256·p0.9999: 216234,624 ns/op
sha256·p1.00:   340992,000 ns/op

Iteration   4: 186723,023 ±(99.9%) 38,122 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   192768,000 ns/op
sha256·p0.999:  200047,872 ns/op
sha256·p0.9999: 281088,000 ns/op
sha256·p1.00:   303104,000 ns/op

Iteration   5: 186718,010 ±(99.9%) 26,719 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189440,000 ns/op
sha256·p0.99:   192000,000 ns/op
sha256·p0.999:  197376,000 ns/op
sha256·p0.9999: 256220,083 ns/op
sha256·p1.00:   291328,000 ns/op


# Run progress: 94,50% complete, ETA 00:49:28
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188479,611 ±(99.9%) 434,870 ns/op
# Warmup Iteration   2: 187634,478 ±(99.9%) 71,572 ns/op
# Warmup Iteration   3: 186703,066 ±(99.9%) 22,303 ns/op
# Warmup Iteration   4: 186697,897 ±(99.9%) 146,501 ns/op
# Warmup Iteration   5: 186713,825 ±(99.9%) 23,738 ns/op
Iteration   1: 187145,627 ±(99.9%) 33,735 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189696,000 ns/op
sha256·p0.95:   192256,000 ns/op
sha256·p0.99:   196864,000 ns/op
sha256·p0.999:  201728,000 ns/op
sha256·p0.9999: 205312,000 ns/op
sha256·p1.00:   215808,000 ns/op

Iteration   2: 186626,854 ±(99.9%) 21,520 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189184,000 ns/op
sha256·p0.99:   191488,000 ns/op
sha256·p0.999:  196352,000 ns/op
sha256·p0.9999: 202570,394 ns/op
sha256·p1.00:   218880,000 ns/op

Iteration   3: 186798,265 ±(99.9%) 30,325 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   194063,360 ns/op
sha256·p0.999:  200065,536 ns/op
sha256·p0.9999: 204454,554 ns/op
sha256·p1.00:   373248,000 ns/op

Iteration   4: 186808,719 ±(99.9%) 26,029 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189952,000 ns/op
sha256·p0.99:   192524,800 ns/op
sha256·p0.999:  198144,000 ns/op
sha256·p0.9999: 203597,056 ns/op
sha256·p1.00:   314880,000 ns/op

Iteration   5: 187265,981 ±(99.9%) 38,135 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189952,000 ns/op
sha256·p0.95:   192512,000 ns/op
sha256·p0.99:   197376,000 ns/op
sha256·p0.999:  201984,000 ns/op
sha256·p0.9999: 278528,000 ns/op
sha256·p1.00:   289280,000 ns/op


# Run progress: 94,67% complete, ETA 00:47:58
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188440,075 ±(99.9%) 471,219 ns/op
# Warmup Iteration   2: 186714,067 ±(99.9%) 30,255 ns/op
# Warmup Iteration   3: 186743,119 ±(99.9%) 31,960 ns/op
# Warmup Iteration   4: 187352,432 ±(99.9%) 160,394 ns/op
# Warmup Iteration   5: 186630,315 ±(99.9%) 26,006 ns/op
Iteration   1: 186718,527 ±(99.9%) 29,332 ns/op
sha256·p0.00:   184832,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   194304,000 ns/op
sha256·p0.999:  200704,000 ns/op
sha256·p0.9999: 203670,630 ns/op
sha256·p1.00:   208384,000 ns/op

Iteration   2: 186994,639 ±(99.9%) 37,467 ns/op
sha256·p0.00:   184064,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189440,000 ns/op
sha256·p0.95:   190976,000 ns/op
sha256·p0.99:   197120,000 ns/op
sha256·p0.999:  201728,000 ns/op
sha256·p0.9999: 254631,731 ns/op
sha256·p1.00:   287744,000 ns/op

Iteration   3: 187180,044 ±(99.9%) 41,161 ns/op
sha256·p0.00:   184832,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189696,000 ns/op
sha256·p0.95:   192512,000 ns/op
sha256·p0.99:   197120,000 ns/op
sha256·p0.999:  203264,000 ns/op
sha256·p0.9999: 280557,670 ns/op
sha256·p1.00:   327680,000 ns/op

Iteration   4: 186631,524 ±(99.9%) 26,761 ns/op
sha256·p0.00:   184064,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   192768,000 ns/op
sha256·p0.999:  196978,176 ns/op
sha256·p0.9999: 209812,070 ns/op
sha256·p1.00:   281088,000 ns/op

Iteration   5: 186772,443 ±(99.9%) 29,066 ns/op
sha256·p0.00:   184064,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   192512,000 ns/op
sha256·p0.999:  198656,000 ns/op
sha256·p0.9999: 274755,123 ns/op
sha256·p1.00:   285184,000 ns/op


# Run progress: 94,83% complete, ETA 00:46:29
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 188590,943 ±(99.9%) 456,046 ns/op
# Warmup Iteration   2: 187459,018 ±(99.9%) 44,302 ns/op
# Warmup Iteration   3: 186716,803 ±(99.9%) 22,391 ns/op
# Warmup Iteration   4: 186742,031 ±(99.9%) 147,338 ns/op
# Warmup Iteration   5: 186744,224 ±(99.9%) 30,119 ns/op
Iteration   1: 187200,236 ±(99.9%) 37,200 ns/op
sha256·p0.00:   184832,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189696,000 ns/op
sha256·p0.95:   193024,000 ns/op
sha256·p0.99:   197632,000 ns/op
sha256·p0.999:  202396,672 ns/op
sha256·p0.9999: 212975,206 ns/op
sha256·p1.00:   236288,000 ns/op

Iteration   2: 186619,483 ±(99.9%) 28,056 ns/op
sha256·p0.00:   184064,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   192512,000 ns/op
sha256·p0.999:  197376,000 ns/op
sha256·p0.9999: 229836,698 ns/op
sha256·p1.00:   282624,000 ns/op

Iteration   3: 186626,376 ±(99.9%) 27,483 ns/op
sha256·p0.00:   184832,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189184,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   192768,000 ns/op
sha256·p0.999:  196096,000 ns/op
sha256·p0.9999: 216798,106 ns/op
sha256·p1.00:   278016,000 ns/op

Iteration   4: 186762,795 ±(99.9%) 26,217 ns/op
sha256·p0.00:   184064,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   188928,000 ns/op
sha256·p0.95:   189696,000 ns/op
sha256·p0.99:   192512,000 ns/op
sha256·p0.999:  196864,000 ns/op
sha256·p0.9999: 217572,250 ns/op
sha256·p1.00:   279552,000 ns/op

Iteration   5: 187358,304 ±(99.9%) 40,803 ns/op
sha256·p0.00:   185088,000 ns/op
sha256·p0.50:   185856,000 ns/op
sha256·p0.90:   189952,000 ns/op
sha256·p0.95:   193536,000 ns/op
sha256·p0.99:   198912,000 ns/op
sha256·p0.999:  204032,000 ns/op
sha256·p0.9999: 231168,000 ns/op
sha256·p1.00:   245504,000 ns/op



Result "org.example.Main.sha256":
N = 534777
mean = 186886,069 ±(99.9%) 10,452 ns/op

Histogram, ns/op:
[100000,000, 125000,000) = 0
[125000,000, 150000,000) = 0
[150000,000, 175000,000) = 0
[175000,000, 200000,000) = 533788
[200000,000, 225000,000) = 920
[225000,000, 250000,000) = 34
[250000,000, 275000,000) = 12
[275000,000, 300000,000) = 21
[300000,000, 325000,000) = 1
[325000,000, 350000,000) = 1
[350000,000, 375000,000) = 0

Percentiles, ns/op:
p(0,0000) = 184064,000 ns/op
p(50,0000) = 185856,000 ns/op
p(90,0000) = 189184,000 ns/op
p(95,0000) = 190464,000 ns/op
p(99,0000) = 195328,000 ns/op
p(99,9000) = 201472,000 ns/op
p(99,9900) = 235008,000 ns/op
p(99,9990) = 284827,873 ns/op
p(99,9999) = 327680,000 ns/op
p(100,0000) = 327680,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 4M)

# Run progress: 95,00% complete, ETA 00:45:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1583833,945 ±(99.9%) 6012,123 ns/op
# Warmup Iteration   2: 1497991,060 ±(99.9%) 1122,278 ns/op
# Warmup Iteration   3: 1494321,914 ±(99.9%) 379,375 ns/op
# Warmup Iteration   4: 1498465,310 ±(99.9%) 715,757 ns/op
# Warmup Iteration   5: 1494007,580 ±(99.9%) 249,275 ns/op
Iteration   1: 1493836,915 ±(99.9%) 253,114 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1519616,000 ns/op
sha256·p0.999:  1557745,664 ns/op
sha256·p0.9999: 1591296,000 ns/op
sha256·p1.00:   1591296,000 ns/op

Iteration   2: 1493892,018 ±(99.9%) 272,793 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1523712,000 ns/op
sha256·p0.999:  1556480,000 ns/op
sha256·p0.9999: 1574912,000 ns/op
sha256·p1.00:   1574912,000 ns/op

Iteration   3: 1498552,217 ±(99.9%) 726,005 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1509376,000 ns/op
sha256·p0.95:   1550336,000 ns/op
sha256·p0.99:   1576960,000 ns/op
sha256·p0.999:  1595392,000 ns/op
sha256·p0.9999: 1603584,000 ns/op
sha256·p1.00:   1603584,000 ns/op

Iteration   4: 1494153,625 ±(99.9%) 340,168 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1527808,000 ns/op
sha256·p0.999:  1558241,280 ns/op
sha256·p0.9999: 1746944,000 ns/op
sha256·p1.00:   1746944,000 ns/op

Iteration   5: 1494263,732 ±(99.9%) 310,175 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1503232,000 ns/op
sha256·p0.99:   1529856,000 ns/op
sha256·p0.999:  1558528,000 ns/op
sha256·p0.9999: 1685504,000 ns/op
sha256·p1.00:   1685504,000 ns/op


# Run progress: 95,17% complete, ETA 00:43:30
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1582860,368 ±(99.9%) 5615,799 ns/op
# Warmup Iteration   2: 1501739,244 ±(99.9%) 1294,540 ns/op
# Warmup Iteration   3: 1494298,947 ±(99.9%) 318,169 ns/op
# Warmup Iteration   4: 1493709,152 ±(99.9%) 248,467 ns/op
# Warmup Iteration   5: 1493947,876 ±(99.9%) 330,913 ns/op
Iteration   1: 1497458,383 ±(99.9%) 739,495 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1503232,000 ns/op
sha256·p0.95:   1525760,000 ns/op
sha256·p0.99:   1591296,000 ns/op
sha256·p0.999:  1622016,000 ns/op
sha256·p0.9999: 1796096,000 ns/op
sha256·p1.00:   1796096,000 ns/op

Iteration   2: 1499212,500 ±(99.9%) 732,575 ns/op
sha256·p0.00:   1488896,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1513472,000 ns/op
sha256·p0.95:   1544192,000 ns/op
sha256·p0.99:   1585152,000 ns/op
sha256·p0.999:  1595392,000 ns/op
sha256·p0.9999: 1632256,000 ns/op
sha256·p1.00:   1632256,000 ns/op

Iteration   3: 1493763,635 ±(99.9%) 315,428 ns/op
sha256·p0.00:   1488896,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1495040,000 ns/op
sha256·p0.95:   1503232,000 ns/op
sha256·p0.99:   1525760,000 ns/op
sha256·p0.999:  1550966,784 ns/op
sha256·p0.9999: 1875968,000 ns/op
sha256·p1.00:   1875968,000 ns/op

Iteration   4: 1493747,412 ±(99.9%) 261,433 ns/op
sha256·p0.00:   1488896,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1495040,000 ns/op
sha256·p0.95:   1503232,000 ns/op
sha256·p0.99:   1523875,840 ns/op
sha256·p0.999:  1554432,000 ns/op
sha256·p0.9999: 1568768,000 ns/op
sha256·p1.00:   1568768,000 ns/op

Iteration   5: 1494113,517 ±(99.9%) 306,992 ns/op
sha256·p0.00:   1488896,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1507328,000 ns/op
sha256·p0.99:   1531904,000 ns/op
sha256·p0.999:  1561210,880 ns/op
sha256·p0.9999: 1574912,000 ns/op
sha256·p1.00:   1574912,000 ns/op


# Run progress: 95,33% complete, ETA 00:42:01
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1591446,037 ±(99.9%) 6238,517 ns/op
# Warmup Iteration   2: 1497728,000 ±(99.9%) 1207,006 ns/op
# Warmup Iteration   3: 1493408,579 ±(99.9%) 231,516 ns/op
# Warmup Iteration   4: 1493600,584 ±(99.9%) 259,855 ns/op
# Warmup Iteration   5: 1499188,536 ±(99.9%) 811,774 ns/op
Iteration   1: 1493244,787 ±(99.9%) 221,815 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1515663,360 ns/op
sha256·p0.999:  1546868,736 ns/op
sha256·p0.9999: 1572864,000 ns/op
sha256·p1.00:   1572864,000 ns/op

Iteration   2: 1493328,641 ±(99.9%) 220,698 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1499852,800 ns/op
sha256·p0.99:   1515520,000 ns/op
sha256·p0.999:  1544192,000 ns/op
sha256·p0.9999: 1566720,000 ns/op
sha256·p1.00:   1566720,000 ns/op

Iteration   3: 1493345,473 ±(99.9%) 230,280 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1515520,000 ns/op
sha256·p0.999:  1551593,472 ns/op
sha256·p0.9999: 1562624,000 ns/op
sha256·p1.00:   1562624,000 ns/op

Iteration   4: 1499657,834 ±(99.9%) 903,085 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1517568,000 ns/op
sha256·p0.95:   1552384,000 ns/op
sha256·p0.99:   1572864,000 ns/op
sha256·p0.999:  1718968,320 ns/op
sha256·p0.9999: 2277376,000 ns/op
sha256·p1.00:   2277376,000 ns/op

Iteration   5: 1493764,668 ±(99.9%) 484,057 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1503232,000 ns/op
sha256·p0.99:   1527808,000 ns/op
sha256·p0.999:  1570666,496 ns/op
sha256·p0.9999: 1910784,000 ns/op
sha256·p1.00:   1910784,000 ns/op


# Run progress: 95,50% complete, ETA 00:40:31
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1583308,768 ±(99.9%) 5796,189 ns/op
# Warmup Iteration   2: 1497873,686 ±(99.9%) 1081,856 ns/op
# Warmup Iteration   3: 1501001,286 ±(99.9%) 942,691 ns/op
# Warmup Iteration   4: 1494415,923 ±(99.9%) 269,699 ns/op
# Warmup Iteration   5: 1494635,729 ±(99.9%) 294,515 ns/op
Iteration   1: 1495042,757 ±(99.9%) 515,412 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1499136,000 ns/op
sha256·p0.95:   1507328,000 ns/op
sha256·p0.99:   1528074,240 ns/op
sha256·p0.999:  1584527,360 ns/op
sha256·p0.9999: 1912832,000 ns/op
sha256·p1.00:   1912832,000 ns/op

Iteration   2: 1499280,684 ±(99.9%) 692,803 ns/op
sha256·p0.00:   1488896,000 ns/op
sha256·p0.50:   1495040,000 ns/op
sha256·p0.90:   1515520,000 ns/op
sha256·p0.95:   1544192,000 ns/op
sha256·p0.99:   1572864,000 ns/op
sha256·p0.999:  1591975,936 ns/op
sha256·p0.9999: 1677312,000 ns/op
sha256·p1.00:   1677312,000 ns/op

Iteration   3: 1495476,318 ±(99.9%) 521,295 ns/op
sha256·p0.00:   1484800,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1509376,000 ns/op
sha256·p0.99:   1548288,000 ns/op
sha256·p0.999:  1617920,000 ns/op
sha256·p0.9999: 1931264,000 ns/op
sha256·p1.00:   1931264,000 ns/op

Iteration   4: 1494369,784 ±(99.9%) 295,177 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1503232,000 ns/op
sha256·p0.99:   1523712,000 ns/op
sha256·p0.999:  1571450,880 ns/op
sha256·p0.9999: 1716224,000 ns/op
sha256·p1.00:   1716224,000 ns/op

Iteration   5: 1494961,891 ±(99.9%) 420,932 ns/op
sha256·p0.00:   1476608,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1499136,000 ns/op
sha256·p0.95:   1507328,000 ns/op
sha256·p0.99:   1529856,000 ns/op
sha256·p0.999:  1588123,648 ns/op
sha256·p0.9999: 1900544,000 ns/op
sha256·p1.00:   1900544,000 ns/op


# Run progress: 95,67% complete, ETA 00:39:02
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 1589106,343 ±(99.9%) 5951,366 ns/op
# Warmup Iteration   2: 1498342,166 ±(99.9%) 1323,615 ns/op
# Warmup Iteration   3: 1493778,444 ±(99.9%) 284,527 ns/op
# Warmup Iteration   4: 1493906,849 ±(99.9%) 349,525 ns/op
# Warmup Iteration   5: 1497749,180 ±(99.9%) 662,025 ns/op
Iteration   1: 1494917,457 ±(99.9%) 508,944 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1499136,000 ns/op
sha256·p0.95:   1507328,000 ns/op
sha256·p0.99:   1572864,000 ns/op
sha256·p0.999:  1594630,144 ns/op
sha256·p0.9999: 1738752,000 ns/op
sha256·p1.00:   1738752,000 ns/op

Iteration   2: 1495561,655 ±(99.9%) 584,758 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1499136,000 ns/op
sha256·p0.95:   1509376,000 ns/op
sha256·p0.99:   1576960,000 ns/op
sha256·p0.999:  1596041,216 ns/op
sha256·p0.9999: 1757184,000 ns/op
sha256·p1.00:   1757184,000 ns/op

Iteration   3: 1493590,698 ±(99.9%) 253,022 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1521664,000 ns/op
sha256·p0.999:  1554432,000 ns/op
sha256·p0.9999: 1570816,000 ns/op
sha256·p1.00:   1570816,000 ns/op

Iteration   4: 1499879,833 ±(99.9%) 1025,154 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1515520,000 ns/op
sha256·p0.95:   1551974,400 ns/op
sha256·p0.99:   1606369,280 ns/op
sha256·p0.999:  1715552,256 ns/op
sha256·p0.9999: 2183168,000 ns/op
sha256·p1.00:   2183168,000 ns/op

Iteration   5: 1493534,685 ±(99.9%) 260,327 ns/op
sha256·p0.00:   1482752,000 ns/op
sha256·p0.50:   1492992,000 ns/op
sha256·p0.90:   1497088,000 ns/op
sha256·p0.95:   1501184,000 ns/op
sha256·p0.99:   1519616,000 ns/op
sha256·p0.999:  1552384,000 ns/op
sha256·p0.9999: 1693696,000 ns/op
sha256·p1.00:   1693696,000 ns/op



Result "org.example.Main.sha256":
N = 66824
mean = 1495658,746 ±(99.9%) 176,772 ns/op

Histogram, ns/op:
[1400000,000, 1450000,000) = 0
[1450000,000, 1500000,000) = 60275
[1500000,000, 1550000,000) = 5531
[1550000,000, 1600000,000) = 868
[1600000,000, 1650000,000) = 116
[1650000,000, 1700000,000) = 11
[1700000,000, 1750000,000) = 11
[1750000,000, 1800000,000) = 1
[1800000,000, 1850000,000) = 2
[1850000,000, 1900000,000) = 3
[1900000,000, 1950000,000) = 3
[1950000,000, 2000000,000) = 1
[2000000,000, 2050000,000) = 1
[2050000,000, 2100000,000) = 0
[2100000,000, 2150000,000) = 0

Percentiles, ns/op:
p(0,0000) = 1476608,000 ns/op
p(50,0000) = 1492992,000 ns/op
p(90,0000) = 1499136,000 ns/op
p(95,0000) = 1511424,000 ns/op
p(99,0000) = 1562624,000 ns/op
p(99,9000) = 1618278,400 ns/op
p(99,9900) = 1883770,880 ns/op
p(99,9990) = 2183168,000 ns/op
p(99,9999) = 2183168,000 ns/op
p(100,0000) = 2183168,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 20M)

# Run progress: 95,83% complete, ETA 00:37:32
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8490433,794 ±(99.9%) 31916,459 ns/op
# Warmup Iteration   2: 8468167,593 ±(99.9%) 13989,683 ns/op
# Warmup Iteration   3: 7750165,433 ±(99.9%) 39882,243 ns/op
# Warmup Iteration   4: 7471875,444 ±(99.9%) 2343,929 ns/op
# Warmup Iteration   5: 7471808,096 ±(99.9%) 2837,977 ns/op
Iteration   1: 7474361,208 ±(99.9%) 4275,468 ns/op
sha256·p0.00:   7430144,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7487488,000 ns/op
sha256·p0.95:   7528448,000 ns/op
sha256·p0.99:   7677706,240 ns/op
sha256·p0.999:  8207966,208 ns/op
sha256·p0.9999: 8232960,000 ns/op
sha256·p1.00:   8232960,000 ns/op

Iteration   2: 7497923,121 ±(99.9%) 8987,294 ns/op
sha256·p0.00:   7430144,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7566131,200 ns/op
sha256·p0.95:   7784857,600 ns/op
sha256·p0.99:   7913472,000 ns/op
sha256·p0.999:  8126365,696 ns/op
sha256·p0.9999: 8175616,000 ns/op
sha256·p1.00:   8175616,000 ns/op

Iteration   3: 7476422,366 ±(99.9%) 4511,918 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7495680,000 ns/op
sha256·p0.95:   7553024,000 ns/op
sha256·p0.99:   7743406,080 ns/op
sha256·p0.999:  8041775,104 ns/op
sha256·p0.9999: 8044544,000 ns/op
sha256·p1.00:   8044544,000 ns/op

Iteration   4: 7472218,308 ±(99.9%) 3481,284 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7528857,600 ns/op
sha256·p0.99:   7651328,000 ns/op
sha256·p0.999:  7962066,944 ns/op
sha256·p0.9999: 7995392,000 ns/op
sha256·p1.00:   7995392,000 ns/op

Iteration   5: 7471306,045 ±(99.9%) 2938,626 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7471104,000 ns/op
sha256·p0.95:   7536640,000 ns/op
sha256·p0.99:   7648133,120 ns/op
sha256·p0.999:  7738662,912 ns/op
sha256·p0.9999: 7741440,000 ns/op
sha256·p1.00:   7741440,000 ns/op


# Run progress: 96,00% complete, ETA 00:36:02
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8524139,468 ±(99.9%) 28987,726 ns/op
# Warmup Iteration   2: 8471541,586 ±(99.9%) 15422,383 ns/op
# Warmup Iteration   3: 7729997,810 ±(99.9%) 41229,599 ns/op
# Warmup Iteration   4: 7474067,324 ±(99.9%) 3409,267 ns/op
# Warmup Iteration   5: 7499570,125 ±(99.9%) 8775,205 ns/op
Iteration   1: 7470865,220 ±(99.9%) 2298,558 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7520256,000 ns/op
sha256·p0.99:   7602176,000 ns/op
sha256·p0.999:  7673126,912 ns/op
sha256·p0.9999: 7675904,000 ns/op
sha256·p1.00:   7675904,000 ns/op

Iteration   2: 7477390,456 ±(99.9%) 5457,009 ns/op
sha256·p0.00:   7438336,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7553024,000 ns/op
sha256·p0.99:   7853015,040 ns/op
sha256·p0.999:  8052621,312 ns/op
sha256·p0.9999: 8060928,000 ns/op
sha256·p1.00:   8060928,000 ns/op

Iteration   3: 7475846,414 ±(99.9%) 4465,742 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7495680,000 ns/op
sha256·p0.95:   7569408,000 ns/op
sha256·p0.99:   7716864,000 ns/op
sha256·p0.999:  7927087,104 ns/op
sha256·p0.9999: 7929856,000 ns/op
sha256·p1.00:   7929856,000 ns/op

Iteration   4: 7480766,516 ±(99.9%) 6123,852 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7503872,000 ns/op
sha256·p0.95:   7577600,000 ns/op
sha256·p0.99:   7876444,160 ns/op
sha256·p0.999:  8117927,936 ns/op
sha256·p0.9999: 8142848,000 ns/op
sha256·p1.00:   8142848,000 ns/op

Iteration   5: 7487132,093 ±(99.9%) 6865,182 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7528448,000 ns/op
sha256·p0.95:   7626752,000 ns/op
sha256·p0.99:   7872512,000 ns/op
sha256·p0.999:  7978942,464 ns/op
sha256·p0.9999: 7987200,000 ns/op
sha256·p1.00:   7987200,000 ns/op


# Run progress: 96,17% complete, ETA 00:34:33
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8484825,752 ±(99.9%) 24291,641 ns/op
# Warmup Iteration   2: 8478205,829 ±(99.9%) 15777,668 ns/op
# Warmup Iteration   3: 7733666,153 ±(99.9%) 41182,702 ns/op
# Warmup Iteration   4: 7501124,945 ±(99.9%) 8938,543 ns/op
# Warmup Iteration   5: 7469757,034 ±(99.9%) 2231,001 ns/op
Iteration   1: 7474373,453 ±(99.9%) 4207,966 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7520256,000 ns/op
sha256·p0.99:   7675904,000 ns/op
sha256·p0.999:  7962484,736 ns/op
sha256·p0.9999: 7970816,000 ns/op
sha256·p1.00:   7970816,000 ns/op

Iteration   2: 7480539,812 ±(99.9%) 5937,437 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7495680,000 ns/op
sha256·p0.95:   7569408,000 ns/op
sha256·p0.99:   7863173,120 ns/op
sha256·p0.999:  7954432,000 ns/op
sha256·p0.9999: 7954432,000 ns/op
sha256·p1.00:   7954432,000 ns/op

Iteration   3: 7502274,161 ±(99.9%) 8998,041 ns/op
sha256·p0.00:   7430144,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7607091,200 ns/op
sha256·p0.95:   7790592,000 ns/op
sha256·p0.99:   7905280,000 ns/op
sha256·p0.999:  8052719,616 ns/op
sha256·p0.9999: 8060928,000 ns/op
sha256·p1.00:   8060928,000 ns/op

Iteration   4: 7471508,090 ±(99.9%) 3509,734 ns/op
sha256·p0.00:   7421952,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7520256,000 ns/op
sha256·p0.99:   7634944,000 ns/op
sha256·p0.999:  8040652,800 ns/op
sha256·p0.9999: 8110080,000 ns/op
sha256·p1.00:   8110080,000 ns/op

Iteration   5: 7469806,015 ±(99.9%) 2791,689 ns/op
sha256·p0.00:   7421952,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7496089,600 ns/op
sha256·p0.99:   7628554,240 ns/op
sha256·p0.999:  7914995,712 ns/op
sha256·p0.9999: 7987200,000 ns/op
sha256·p1.00:   7987200,000 ns/op


# Run progress: 96,33% complete, ETA 00:33:03
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8483198,479 ±(99.9%) 24731,446 ns/op
# Warmup Iteration   2: 8528375,263 ±(99.9%) 19626,228 ns/op
# Warmup Iteration   3: 7732981,903 ±(99.9%) 41366,137 ns/op
# Warmup Iteration   4: 7471795,851 ±(99.9%) 2688,432 ns/op
# Warmup Iteration   5: 7474281,614 ±(99.9%) 3324,489 ns/op
Iteration   1: 7502944,024 ±(99.9%) 8968,220 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7610368,000 ns/op
sha256·p0.95:   7776665,600 ns/op
sha256·p0.99:   7894302,720 ns/op
sha256·p0.999:  8137375,744 ns/op
sha256·p0.9999: 8142848,000 ns/op
sha256·p1.00:   8142848,000 ns/op

Iteration   2: 7472463,211 ±(99.9%) 2994,257 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7528448,000 ns/op
sha256·p0.99:   7656325,120 ns/op
sha256·p0.999:  7771430,912 ns/op
sha256·p0.9999: 7774208,000 ns/op
sha256·p1.00:   7774208,000 ns/op

Iteration   3: 7470626,439 ±(99.9%) 2594,524 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7471104,000 ns/op
sha256·p0.95:   7520256,000 ns/op
sha256·p0.99:   7626752,000 ns/op
sha256·p0.999:  7730331,648 ns/op
sha256·p0.9999: 7741440,000 ns/op
sha256·p1.00:   7741440,000 ns/op

Iteration   4: 7473197,919 ±(99.9%) 3410,682 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7536640,000 ns/op
sha256·p0.99:   7656325,120 ns/op
sha256·p0.999:  7852933,120 ns/op
sha256·p0.9999: 7880704,000 ns/op
sha256·p1.00:   7880704,000 ns/op

Iteration   5: 7498046,032 ±(99.9%) 8605,905 ns/op
sha256·p0.00:   7430144,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7561216,000 ns/op
sha256·p0.95:   7760281,600 ns/op
sha256·p0.99:   7935262,720 ns/op
sha256·p0.999:  8194621,440 ns/op
sha256·p0.9999: 8249344,000 ns/op
sha256·p1.00:   8249344,000 ns/op


# Run progress: 96,50% complete, ETA 00:31:33
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: 8483414,058 ±(99.9%) 31039,836 ns/op
# Warmup Iteration   2: 8469278,373 ±(99.9%) 15468,647 ns/op
# Warmup Iteration   3: 7728382,218 ±(99.9%) 40292,036 ns/op
# Warmup Iteration   4: 7499041,608 ±(99.9%) 8450,234 ns/op
# Warmup Iteration   5: 7470871,342 ±(99.9%) 2608,284 ns/op
Iteration   1: 7469787,647 ±(99.9%) 2655,835 ns/op
sha256·p0.00:   7421952,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7495680,000 ns/op
sha256·p0.99:   7593984,000 ns/op
sha256·p0.999:  7929438,208 ns/op
sha256·p0.9999: 7954432,000 ns/op
sha256·p1.00:   7954432,000 ns/op

Iteration   2: 7471942,792 ±(99.9%) 3406,875 ns/op
sha256·p0.00:   7454720,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7544832,000 ns/op
sha256·p0.99:   7651328,000 ns/op
sha256·p0.999:  7847518,208 ns/op
sha256·p0.9999: 7872512,000 ns/op
sha256·p1.00:   7872512,000 ns/op

Iteration   3: 7503785,898 ±(99.9%) 9413,417 ns/op
sha256·p0.00:   7446528,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7610368,000 ns/op
sha256·p0.95:   7774208,000 ns/op
sha256·p0.99:   7946240,000 ns/op
sha256·p0.999:  8129200,128 ns/op
sha256·p0.9999: 8134656,000 ns/op
sha256·p1.00:   8134656,000 ns/op

Iteration   4: 7472665,256 ±(99.9%) 4481,941 ns/op
sha256·p0.00:   7438336,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7520256,000 ns/op
sha256·p0.99:   7648133,120 ns/op
sha256·p0.999:  8256839,680 ns/op
sha256·p0.9999: 8298496,000 ns/op
sha256·p1.00:   8298496,000 ns/op

Iteration   5: 7469689,686 ±(99.9%) 2170,312 ns/op
sha256·p0.00:   7430144,000 ns/op
sha256·p0.50:   7462912,000 ns/op
sha256·p0.90:   7479296,000 ns/op
sha256·p0.95:   7496089,600 ns/op
sha256·p0.99:   7602176,000 ns/op
sha256·p0.999:  7673126,912 ns/op
sha256·p0.9999: 7675904,000 ns/op
sha256·p1.00:   7675904,000 ns/op



Result "org.example.Main.sha256":
N = 13364
mean = 7480489,492 ±(99.9%) 1808,034 ns/op

Histogram, ns/op:
[7400000,000, 7450000,000) = 24
[7450000,000, 7500000,000) = 12041
[7500000,000, 7550000,000) = 489
[7550000,000, 7600000,000) = 250
[7600000,000, 7650000,000) = 157
[7650000,000, 7700000,000) = 91
[7700000,000, 7750000,000) = 71
[7750000,000, 7800000,000) = 77
[7800000,000, 7850000,000) = 59
[7850000,000, 7900000,000) = 45
[7900000,000, 7950000,000) = 30
[7950000,000, 8000000,000) = 15
[8000000,000, 8050000,000) = 4
[8050000,000, 8100000,000) = 2
[8100000,000, 8150000,000) = 6
[8150000,000, 8200000,000) = 1
[8200000,000, 8250000,000) = 1

Percentiles, ns/op:
p(0,0000) = 7421952,000 ns/op
p(50,0000) = 7462912,000 ns/op
p(90,0000) = 7495680,000 ns/op
p(95,0000) = 7569408,000 ns/op
p(99,0000) = 7823360,000 ns/op
p(99,9000) = 8013987,840 ns/op
p(99,9900) = 8281956,352 ns/op
p(99,9990) = 8298496,000 ns/op
p(99,9999) = 8298496,000 ns/op
p(100,0000) = 8298496,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 64K)

# Run progress: 96,67% complete, ETA 00:30:04
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4892,356 ±(99.9%) 2068,429 ns/op
# Warmup Iteration   2: 4239,823 ±(99.9%) 3,329 ns/op
# Warmup Iteration   3: 4253,111 ±(99.9%) 2,360 ns/op
# Warmup Iteration   4: 5149,749 ±(99.9%) 2790,794 ns/op
# Warmup Iteration   5: 5513,243 ±(99.9%) 4191,427 ns/op
Iteration   1: 4278,353 ±(99.9%) 3,107 ns/op
xxhash64·p0.00:   4096,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4312,000 ns/op
xxhash64·p0.95:   5184,000 ns/op
xxhash64·p0.99:   6368,000 ns/op
xxhash64·p0.999:  8168,000 ns/op
xxhash64·p0.9999: 13027,642 ns/op
xxhash64·p1.00:   83328,000 ns/op

Iteration   2: 5668,778 ±(99.9%) 4822,836 ns/op
xxhash64·p0.00:   4064,000 ns/op
xxhash64·p0.50:   4128,000 ns/op
xxhash64·p0.90:   4216,000 ns/op
xxhash64·p0.95:   4496,000 ns/op
xxhash64·p0.99:   5480,000 ns/op
xxhash64·p0.999:  7607,808 ns/op
xxhash64·p0.9999: 14749,888 ns/op
xxhash64·p1.00:   416284672,000 ns/op

Iteration   3: 4195,641 ±(99.9%) 2,415 ns/op
xxhash64·p0.00:   4044,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4176,000 ns/op
xxhash64·p0.95:   4256,000 ns/op
xxhash64·p0.99:   6184,000 ns/op
xxhash64·p0.999:  7648,000 ns/op
xxhash64·p0.9999: 12285,227 ns/op
xxhash64·p1.00:   40448,000 ns/op

Iteration   4: 4217,298 ±(99.9%) 2,402 ns/op
xxhash64·p0.00:   4056,000 ns/op
xxhash64·p0.50:   4144,000 ns/op
xxhash64·p0.90:   4208,000 ns/op
xxhash64·p0.95:   4232,000 ns/op
xxhash64·p0.99:   6232,000 ns/op
xxhash64·p0.999:  7481,776 ns/op
xxhash64·p0.9999: 10237,510 ns/op
xxhash64·p1.00:   42304,000 ns/op

Iteration   5: 4259,031 ±(99.9%) 2,964 ns/op
xxhash64·p0.00:   4112,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4352,000 ns/op
xxhash64·p0.95:   4448,000 ns/op
xxhash64·p0.99:   6160,000 ns/op
xxhash64·p0.999:  7713,728 ns/op
xxhash64·p0.9999: 13014,477 ns/op
xxhash64·p1.00:   152576,000 ns/op


# Run progress: 96,83% complete, ETA 00:28:34
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4252,349 ±(99.9%) 61,538 ns/op
# Warmup Iteration   2: 4204,371 ±(99.9%) 3,114 ns/op
# Warmup Iteration   3: 4326,946 ±(99.9%) 2,931 ns/op
# Warmup Iteration   4: 4198,350 ±(99.9%) 2,009 ns/op
# Warmup Iteration   5: 4211,973 ±(99.9%) 2,697 ns/op
Iteration   1: 4251,688 ±(99.9%) 2,960 ns/op
xxhash64·p0.00:   4068,000 ns/op
xxhash64·p0.50:   4144,000 ns/op
xxhash64·p0.90:   4184,000 ns/op
xxhash64·p0.95:   5136,000 ns/op
xxhash64·p0.99:   6360,000 ns/op
xxhash64·p0.999:  7784,000 ns/op
xxhash64·p0.9999: 10687,485 ns/op
xxhash64·p1.00:   43264,000 ns/op

Iteration   2: 4212,804 ±(99.9%) 2,225 ns/op
xxhash64·p0.00:   4104,000 ns/op
xxhash64·p0.50:   4144,000 ns/op
xxhash64·p0.90:   4224,000 ns/op
xxhash64·p0.95:   4376,000 ns/op
xxhash64·p0.99:   5464,000 ns/op
xxhash64·p0.999:  7611,504 ns/op
xxhash64·p0.9999: 11615,907 ns/op
xxhash64·p1.00:   39552,000 ns/op

Iteration   3: 4230,379 ±(99.9%) 2,298 ns/op
xxhash64·p0.00:   4064,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4248,000 ns/op
xxhash64·p0.95:   4464,000 ns/op
xxhash64·p0.99:   6152,000 ns/op
xxhash64·p0.999:  7672,000 ns/op
xxhash64·p0.9999: 10568,829 ns/op
xxhash64·p1.00:   34432,000 ns/op

Iteration   4: 4208,837 ±(99.9%) 1,789 ns/op
xxhash64·p0.00:   4096,000 ns/op
xxhash64·p0.50:   4144,000 ns/op
xxhash64·p0.90:   4224,000 ns/op
xxhash64·p0.95:   4344,000 ns/op
xxhash64·p0.99:   5248,000 ns/op
xxhash64·p0.999:  7389,272 ns/op
xxhash64·p0.9999: 9015,454 ns/op
xxhash64·p1.00:   25568,000 ns/op

Iteration   5: 5457,714 ±(99.9%) 3918,619 ns/op
xxhash64·p0.00:   4112,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4384,000 ns/op
xxhash64·p0.95:   4432,000 ns/op
xxhash64·p0.99:   6192,000 ns/op
xxhash64·p0.999:  7801,952 ns/op
xxhash64·p0.9999: 12470,323 ns/op
xxhash64·p1.00:   322437120,000 ns/op


# Run progress: 97,00% complete, ETA 00:27:04
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4874,534 ±(99.9%) 2079,474 ns/op
# Warmup Iteration   2: 4237,791 ±(99.9%) 3,708 ns/op
# Warmup Iteration   3: 5117,254 ±(99.9%) 3047,664 ns/op
# Warmup Iteration   4: 4283,939 ±(99.9%) 2,558 ns/op
# Warmup Iteration   5: 4197,024 ±(99.9%) 2,237 ns/op
Iteration   1: 4250,281 ±(99.9%) 2,838 ns/op
xxhash64·p0.00:   4084,000 ns/op
xxhash64·p0.50:   4144,000 ns/op
xxhash64·p0.90:   4248,000 ns/op
xxhash64·p0.95:   5128,000 ns/op
xxhash64·p0.99:   6256,000 ns/op
xxhash64·p0.999:  7915,920 ns/op
xxhash64·p0.9999: 12488,784 ns/op
xxhash64·p1.00:   53376,000 ns/op

Iteration   2: 5877,576 ±(99.9%) 5103,591 ns/op
xxhash64·p0.00:   4112,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4864,000 ns/op
xxhash64·p0.95:   4992,000 ns/op
xxhash64·p0.99:   5296,000 ns/op
xxhash64·p0.999:  7744,000 ns/op
xxhash64·p0.9999: 11666,555 ns/op
xxhash64·p1.00:   437780480,000 ns/op

Iteration   3: 5683,030 ±(99.9%) 4877,023 ns/op
xxhash64·p0.00:   4056,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4216,000 ns/op
xxhash64·p0.95:   4296,000 ns/op
xxhash64·p0.99:   6072,000 ns/op
xxhash64·p0.999:  7552,000 ns/op
xxhash64·p0.9999: 11474,618 ns/op
xxhash64·p1.00:   421003264,000 ns/op

Iteration   4: 4202,150 ±(99.9%) 2,598 ns/op
xxhash64·p0.00:   4056,000 ns/op
xxhash64·p0.50:   4128,000 ns/op
xxhash64·p0.90:   4184,000 ns/op
xxhash64·p0.95:   4248,000 ns/op
xxhash64·p0.99:   6256,000 ns/op
xxhash64·p0.999:  7598,312 ns/op
xxhash64·p0.9999: 11195,421 ns/op
xxhash64·p1.00:   39744,000 ns/op

Iteration   5: 4252,193 ±(99.9%) 2,944 ns/op
xxhash64·p0.00:   4096,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4344,000 ns/op
xxhash64·p0.95:   4424,000 ns/op
xxhash64·p0.99:   6168,000 ns/op
xxhash64·p0.999:  7886,168 ns/op
xxhash64·p0.9999: 15002,870 ns/op
xxhash64·p1.00:   102528,000 ns/op


# Run progress: 97,17% complete, ETA 00:25:34
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4280,651 ±(99.9%) 61,790 ns/op
# Warmup Iteration   2: 6068,191 ±(99.9%) 6095,789 ns/op
# Warmup Iteration   3: 5060,037 ±(99.9%) 2787,696 ns/op
# Warmup Iteration   4: 5043,499 ±(99.9%) 2695,861 ns/op
# Warmup Iteration   5: 4205,807 ±(99.9%) 2,536 ns/op
Iteration   1: 4229,479 ±(99.9%) 2,669 ns/op
xxhash64·p0.00:   4112,000 ns/op
xxhash64·p0.50:   4144,000 ns/op
xxhash64·p0.90:   4192,000 ns/op
xxhash64·p0.95:   5120,000 ns/op
xxhash64·p0.99:   6128,000 ns/op
xxhash64·p0.999:  7704,000 ns/op
xxhash64·p0.9999: 11048,218 ns/op
xxhash64·p1.00:   54208,000 ns/op

Iteration   2: 5728,405 ±(99.9%) 4987,017 ns/op
xxhash64·p0.00:   4044,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4216,000 ns/op
xxhash64·p0.95:   4344,000 ns/op
xxhash64·p0.99:   6176,000 ns/op
xxhash64·p0.999:  7698,848 ns/op
xxhash64·p0.9999: 14474,902 ns/op
xxhash64·p1.00:   429391872,000 ns/op

Iteration   3: 4327,970 ±(99.9%) 3,212 ns/op
xxhash64·p0.00:   4064,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4824,000 ns/op
xxhash64·p0.95:   5056,000 ns/op
xxhash64·p0.99:   6416,000 ns/op
xxhash64·p0.999:  8464,752 ns/op
xxhash64·p0.9999: 17171,501 ns/op
xxhash64·p1.00:   56896,000 ns/op

Iteration   4: 4266,131 ±(99.9%) 3,103 ns/op
xxhash64·p0.00:   4112,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4352,000 ns/op
xxhash64·p0.95:   4896,000 ns/op
xxhash64·p0.99:   6152,000 ns/op
xxhash64·p0.999:  9466,112 ns/op
xxhash64·p0.9999: 19541,222 ns/op
xxhash64·p1.00:   46592,000 ns/op

Iteration   5: 6013,879 ±(99.9%) 5801,884 ns/op
xxhash64·p0.00:   4084,000 ns/op
xxhash64·p0.50:   4152,000 ns/op
xxhash64·p0.90:   4328,000 ns/op
xxhash64·p0.95:   4384,000 ns/op
xxhash64·p0.99:   6192,000 ns/op
xxhash64·p0.999:  8064,000 ns/op
xxhash64·p0.9999: 18432,970 ns/op
xxhash64·p1.00:   475529216,000 ns/op


# Run progress: 97,33% complete, ETA 00:24:04
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

4279,411 ±(99.9%) 58,859 ns/op
# Warmup Iteration   2: 6481,432 ±(99.9%) 7189,236 ns/op
# Warmup Iteration   3: 4200,995 ±(99.9%) 2,971 ns/op
# Warmup Iteration   4: 5159,691 ±(99.9%) 3117,429 ns/op
# Warmup Iteration   5: 4204,680 ±(99.9%) 2,623 ns/op
Iteration   1: 5605,364 ±(99.9%) 4576,875 ns/op
xxhash64·p0.00:   4028,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4208,000 ns/op
xxhash64·p0.95:   4416,000 ns/op
xxhash64·p0.99:   6192,000 ns/op
xxhash64·p0.999:  7736,704 ns/op
xxhash64·p0.9999: 17256,704 ns/op
xxhash64·p1.00:   394264576,000 ns/op

Iteration   2: 4226,478 ±(99.9%) 3,077 ns/op
xxhash64·p0.00:   4064,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4256,000 ns/op
xxhash64·p0.95:   4392,000 ns/op
xxhash64·p0.99:   6248,000 ns/op
xxhash64·p0.999:  8024,000 ns/op
xxhash64·p0.9999: 15570,669 ns/op
xxhash64·p1.00:   60736,000 ns/op

Iteration   3: 4196,374 ±(99.9%) 2,278 ns/op
xxhash64·p0.00:   4084,000 ns/op
xxhash64·p0.50:   4128,000 ns/op
xxhash64·p0.90:   4176,000 ns/op
xxhash64·p0.95:   4224,000 ns/op
xxhash64·p0.99:   6208,000 ns/op
xxhash64·p0.999:  7480,000 ns/op
xxhash64·p0.9999: 10232,522 ns/op
xxhash64·p1.00:   23200,000 ns/op

Iteration   4: 4276,672 ±(99.9%) 2,798 ns/op
xxhash64·p0.00:   4084,000 ns/op
xxhash64·p0.50:   4136,000 ns/op
xxhash64·p0.90:   4592,000 ns/op
xxhash64·p0.95:   4792,000 ns/op
xxhash64·p0.99:   6168,000 ns/op
xxhash64·p0.999:  7992,000 ns/op
xxhash64·p0.9999: 12606,912 ns/op
xxhash64·p1.00:   49152,000 ns/op

Iteration   5: 4364,377 ±(99.9%) 2,350 ns/op
xxhash64·p0.00:   4084,000 ns/op
xxhash64·p0.50:   4208,000 ns/op
xxhash64·p0.90:   4832,000 ns/op
xxhash64·p0.95:   4976,000 ns/op
xxhash64·p0.99:   5368,000 ns/op
xxhash64·p0.999:  7704,000 ns/op
xxhash64·p0.9999: 9836,485 ns/op
xxhash64·p1.00:   37952,000 ns/op



Result "org.example.Main.xxhash64":
N = 2846654
mean =   4712,640 ±(99.9%) 869,593 ns/op

Histogram, ns/op:
[        0,000,  50000000,000) = 2846651
[ 50000000,000, 100000000,000) = 0
[100000000,000, 150000000,000) = 0
[150000000,000, 200000000,000) = 0
[200000000,000, 250000000,000) = 0
[250000000,000, 300000000,000) = 0
[300000000,000, 350000000,000) = 0
[350000000,000, 400000000,000) = 1
[400000000,000, 450000000,000) = 1

Percentiles, ns/op:
p(0,0000) =   4028,000 ns/op
p(50,0000) =   4144,000 ns/op
p(90,0000) =   4432,000 ns/op
p(95,0000) =   4856,000 ns/op
p(99,0000) =   6200,000 ns/op
p(99,9000) =   8008,000 ns/op
p(99,9900) =  15978,704 ns/op
p(99,9990) =  45030,422 ns/op
p(99,9999) = 399651171,205 ns/op
p(100,0000) = 475529216,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 512K)

# Run progress: 97,50% complete, ETA 00:22:34
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32547,589 ±(99.9%) 124,817 ns/op
# Warmup Iteration   2: 32362,434 ±(99.9%) 7,872 ns/op
# Warmup Iteration   3: 33200,928 ±(99.9%) 2877,991 ns/op
# Warmup Iteration   4: 32288,408 ±(99.9%) 6,433 ns/op
# Warmup Iteration   5: 32555,693 ±(99.9%) 9,074 ns/op
Iteration   1: 32457,212 ±(99.9%) 6,583 ns/op
xxhash64·p0.00:   32064,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32544,000 ns/op
xxhash64·p0.95:   34368,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37632,000 ns/op
xxhash64·p0.9999: 44231,872 ns/op
xxhash64·p1.00:   91264,000 ns/op

Iteration   2: 32473,804 ±(99.9%) 6,894 ns/op
xxhash64·p0.00:   31936,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32704,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37696,000 ns/op
xxhash64·p0.9999: 47939,853 ns/op
xxhash64·p1.00:   95616,000 ns/op

Iteration   3: 32473,675 ±(99.9%) 7,026 ns/op
xxhash64·p0.00:   32192,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32672,000 ns/op
xxhash64·p0.95:   34368,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37632,000 ns/op
xxhash64·p0.9999: 45107,987 ns/op
xxhash64·p1.00:   105856,000 ns/op

Iteration   4: 32565,398 ±(99.9%) 8,409 ns/op
xxhash64·p0.00:   32192,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   33216,000 ns/op
xxhash64·p0.95:   34496,000 ns/op
xxhash64·p0.99:   36224,000 ns/op
xxhash64·p0.999:  39462,912 ns/op
xxhash64·p0.9999: 59858,330 ns/op
xxhash64·p1.00:   109056,000 ns/op

Iteration   5: 32436,713 ±(99.9%) 6,708 ns/op
xxhash64·p0.00:   32192,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32512,000 ns/op
xxhash64·p0.95:   34304,000 ns/op
xxhash64·p0.99:   35648,000 ns/op
xxhash64·p0.999:  37504,000 ns/op
xxhash64·p0.9999: 45235,430 ns/op
xxhash64·p1.00:   104448,000 ns/op


# Run progress: 97,67% complete, ETA 00:21:04
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32521,292 ±(99.9%) 121,674 ns/op
# Warmup Iteration   2: 32487,168 ±(99.9%) 9,007 ns/op
# Warmup Iteration   3: 33495,967 ±(99.9%) 3123,255 ns/op
# Warmup Iteration   4: 32439,484 ±(99.9%) 7,384 ns/op
# Warmup Iteration   5: 32457,408 ±(99.9%) 6,644 ns/op
Iteration   1: 32494,507 ±(99.9%) 6,926 ns/op
xxhash64·p0.00:   32064,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   33024,000 ns/op
xxhash64·p0.95:   34496,000 ns/op
xxhash64·p0.99:   35776,000 ns/op
xxhash64·p0.999:  37824,000 ns/op
xxhash64·p0.9999: 45361,690 ns/op
xxhash64·p1.00:   93824,000 ns/op

Iteration   2: 32585,580 ±(99.9%) 7,882 ns/op
xxhash64·p0.00:   32064,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   33280,000 ns/op
xxhash64·p0.95:   34560,000 ns/op
xxhash64·p0.99:   36288,000 ns/op
xxhash64·p0.999:  39360,000 ns/op
xxhash64·p0.9999: 55660,109 ns/op
xxhash64·p1.00:   112512,000 ns/op

Iteration   3: 32454,236 ±(99.9%) 6,361 ns/op
xxhash64·p0.00:   32064,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32576,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37760,000 ns/op
xxhash64·p0.9999: 44625,459 ns/op
xxhash64·p1.00:   78976,000 ns/op

Iteration   4: 32454,541 ±(99.9%) 7,823 ns/op
xxhash64·p0.00:   31520,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   32704,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35776,000 ns/op
xxhash64·p0.999:  39048,512 ns/op
xxhash64·p0.9999: 57406,266 ns/op
xxhash64·p1.00:   107264,000 ns/op

Iteration   5: 32475,280 ±(99.9%) 6,592 ns/op
xxhash64·p0.00:   32064,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   32672,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37632,000 ns/op
xxhash64·p0.9999: 43765,254 ns/op
xxhash64·p1.00:   103808,000 ns/op


# Run progress: 97,83% complete, ETA 00:19:34
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32571,468 ±(99.9%) 115,750 ns/op
# Warmup Iteration   2: 32344,703 ±(99.9%) 8,102 ns/op
# Warmup Iteration   3: 33162,376 ±(99.9%) 2529,069 ns/op
# Warmup Iteration   4: 32391,850 ±(99.9%) 6,514 ns/op
# Warmup Iteration   5: 32500,395 ±(99.9%) 8,883 ns/op
Iteration   1: 32416,959 ±(99.9%) 7,351 ns/op
xxhash64·p0.00:   32000,000 ns/op
xxhash64·p0.50:   32192,000 ns/op
xxhash64·p0.90:   32704,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35648,000 ns/op
xxhash64·p0.999:  38208,000 ns/op
xxhash64·p0.9999: 51159,475 ns/op
xxhash64·p1.00:   104448,000 ns/op

Iteration   2: 32449,281 ±(99.9%) 7,712 ns/op
xxhash64·p0.00:   31840,000 ns/op
xxhash64·p0.50:   32192,000 ns/op
xxhash64·p0.90:   32768,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  39232,000 ns/op
xxhash64·p0.9999: 58347,610 ns/op
xxhash64·p1.00:   106880,000 ns/op

Iteration   3: 32414,957 ±(99.9%) 7,291 ns/op
xxhash64·p0.00:   31968,000 ns/op
xxhash64·p0.50:   32192,000 ns/op
xxhash64·p0.90:   32672,000 ns/op
xxhash64·p0.95:   34368,000 ns/op
xxhash64·p0.99:   35648,000 ns/op
xxhash64·p0.999:  38336,000 ns/op
xxhash64·p0.9999: 48352,698 ns/op
xxhash64·p1.00:   107264,000 ns/op

Iteration   4: 32574,776 ±(99.9%) 8,423 ns/op
xxhash64·p0.00:   31872,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   33344,000 ns/op
xxhash64·p0.95:   34560,000 ns/op
xxhash64·p0.99:   36288,000 ns/op
xxhash64·p0.999:  40106,880 ns/op
xxhash64·p0.9999: 56554,752 ns/op
xxhash64·p1.00:   102144,000 ns/op

Iteration   5: 32577,733 ±(99.9%) 7,196 ns/op
xxhash64·p0.00:   32128,000 ns/op
xxhash64·p0.50:   32352,000 ns/op
xxhash64·p0.90:   32896,000 ns/op
xxhash64·p0.95:   34560,000 ns/op
xxhash64·p0.99:   35840,000 ns/op
xxhash64·p0.999:  38124,032 ns/op
xxhash64·p0.9999: 45547,622 ns/op
xxhash64·p1.00:   104448,000 ns/op


# Run progress: 98,00% complete, ETA 00:18:04
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32385,009 ±(99.9%) 111,928 ns/op
# Warmup Iteration   2: 32465,981 ±(99.9%) 8,512 ns/op
# Warmup Iteration   3: 33643,410 ±(99.9%) 3815,167 ns/op
# Warmup Iteration   4: 32369,597 ±(99.9%) 7,420 ns/op
# Warmup Iteration   5: 32330,926 ±(99.9%) 6,521 ns/op
Iteration   1: 32455,673 ±(99.9%) 7,331 ns/op
xxhash64·p0.00:   31776,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32672,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37952,000 ns/op
xxhash64·p0.9999: 49501,389 ns/op
xxhash64·p1.00:   129408,000 ns/op

Iteration   2: 32490,420 ±(99.9%) 10,496 ns/op
xxhash64·p0.00:   31936,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   33408,000 ns/op
xxhash64·p0.95:   34496,000 ns/op
xxhash64·p0.99:   36224,000 ns/op
xxhash64·p0.999:  40128,000 ns/op
xxhash64·p0.9999: 59005,875 ns/op
xxhash64·p1.00:   325632,000 ns/op

Iteration   3: 32349,861 ±(99.9%) 7,214 ns/op
xxhash64·p0.00:   31776,000 ns/op
xxhash64·p0.50:   32096,000 ns/op
xxhash64·p0.90:   32512,000 ns/op
xxhash64·p0.95:   34304,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  38312,128 ns/op
xxhash64·p0.9999: 47716,013 ns/op
xxhash64·p1.00:   111360,000 ns/op

Iteration   4: 32450,562 ±(99.9%) 6,981 ns/op
xxhash64·p0.00:   31648,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32672,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35648,000 ns/op
xxhash64·p0.999:  38080,000 ns/op
xxhash64·p0.9999: 50589,402 ns/op
xxhash64·p1.00:   102912,000 ns/op

Iteration   5: 32448,719 ±(99.9%) 6,928 ns/op
xxhash64·p0.00:   31936,000 ns/op
xxhash64·p0.50:   32224,000 ns/op
xxhash64·p0.90:   32672,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35648,000 ns/op
xxhash64·p0.999:  37696,000 ns/op
xxhash64·p0.9999: 48069,184 ns/op
xxhash64·p1.00:   105600,000 ns/op


# Run progress: 98,17% complete, ETA 00:16:34
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

32569,562 ±(99.9%) 124,696 ns/op
# Warmup Iteration   2: 32327,040 ±(99.9%) 8,834 ns/op
# Warmup Iteration   3: 33052,887 ±(99.9%) 2398,129 ns/op
# Warmup Iteration   4: 32373,465 ±(99.9%) 7,759 ns/op
# Warmup Iteration   5: 32543,118 ±(99.9%) 7,748 ns/op
Iteration   1: 32550,961 ±(99.9%) 7,859 ns/op
xxhash64·p0.00:   31680,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   33280,000 ns/op
xxhash64·p0.95:   34496,000 ns/op
xxhash64·p0.99:   36032,000 ns/op
xxhash64·p0.999:  39488,000 ns/op
xxhash64·p0.9999: 51475,866 ns/op
xxhash64·p1.00:   101120,000 ns/op

Iteration   2: 32489,897 ±(99.9%) 6,984 ns/op
xxhash64·p0.00:   31680,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   32768,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35712,000 ns/op
xxhash64·p0.999:  37888,000 ns/op
xxhash64·p0.9999: 50290,150 ns/op
xxhash64·p1.00:   96640,000 ns/op

Iteration   3: 32487,267 ±(99.9%) 7,769 ns/op
xxhash64·p0.00:   31680,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   32768,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   35776,000 ns/op
xxhash64·p0.999:  38656,000 ns/op
xxhash64·p0.9999: 51696,973 ns/op
xxhash64·p1.00:   134144,000 ns/op

Iteration   4: 32497,739 ±(99.9%) 8,038 ns/op
xxhash64·p0.00:   31808,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   33216,000 ns/op
xxhash64·p0.95:   34496,000 ns/op
xxhash64·p0.99:   35904,000 ns/op
xxhash64·p0.999:  40980,608 ns/op
xxhash64·p0.9999: 56289,843 ns/op
xxhash64·p1.00:   98432,000 ns/op

Iteration   5: 32495,300 ±(99.9%) 8,353 ns/op
xxhash64·p0.00:   31840,000 ns/op
xxhash64·p0.50:   32256,000 ns/op
xxhash64·p0.90:   33280,000 ns/op
xxhash64·p0.95:   34432,000 ns/op
xxhash64·p0.99:   36224,000 ns/op
xxhash64·p0.999:  40384,000 ns/op
xxhash64·p0.9999: 55299,072 ns/op
xxhash64·p1.00:   97792,000 ns/op



Result "org.example.Main.xxhash64":
N = 1538154
mean =  32471,566 ±(99.9%) 2,489 ns/op

Histogram, ns/op:
[     0,000,  25000,000) = 0
[ 25000,000,  50000,000) = 1537970
[ 50000,000,  75000,000) = 142
[ 75000,000, 100000,000) = 29
[100000,000, 125000,000) = 10
[125000,000, 150000,000) = 2
[150000,000, 175000,000) = 0
[175000,000, 200000,000) = 0
[200000,000, 225000,000) = 0
[225000,000, 250000,000) = 0
[250000,000, 275000,000) = 0
[275000,000, 300000,000) = 0
[300000,000, 325000,000) = 0
[325000,000, 350000,000) = 1
[350000,000, 375000,000) = 0

Percentiles, ns/op:
p(0,0000) =  31648,000 ns/op
p(50,0000) =  32256,000 ns/op
p(90,0000) =  33024,000 ns/op
p(95,0000) =  34432,000 ns/op
p(99,0000) =  35776,000 ns/op
p(99,9000) =  39168,000 ns/op
p(99,9900) =  51968,000 ns/op
p(99,9990) =  97498,970 ns/op
p(99,9999) = 222581,775 ns/op
p(100,0000) = 325632,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 4M)

# Run progress: 98,33% complete, ETA 00:15:04
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

258093,192 ±(99.9%) 445,759 ns/op
# Warmup Iteration   2: 257691,578 ±(99.9%) 38,353 ns/op
# Warmup Iteration   3: 257777,677 ±(99.9%) 44,610 ns/op
# Warmup Iteration   4: 258712,612 ±(99.9%) 68,643 ns/op
# Warmup Iteration   5: 257690,434 ±(99.9%) 38,777 ns/op
Iteration   1: 257880,324 ±(99.9%) 49,618 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   260864,000 ns/op
xxhash64·p0.95:   261888,000 ns/op
xxhash64·p0.99:   265456,640 ns/op
xxhash64·p0.999:  275582,464 ns/op
xxhash64·p0.9999: 380285,850 ns/op
xxhash64·p1.00:   451072,000 ns/op

Iteration   2: 257919,815 ±(99.9%) 41,570 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   260864,000 ns/op
xxhash64·p0.95:   261888,000 ns/op
xxhash64·p0.99:   265216,000 ns/op
xxhash64·p0.999:  274432,000 ns/op
xxhash64·p0.9999: 317441,229 ns/op
xxhash64·p1.00:   339968,000 ns/op

Iteration   3: 259138,275 ±(99.9%) 93,636 ns/op
xxhash64·p0.00:   254720,000 ns/op
xxhash64·p0.50:   257280,000 ns/op
xxhash64·p0.90:   262656,000 ns/op
xxhash64·p0.95:   265728,000 ns/op
xxhash64·p0.99:   276480,000 ns/op
xxhash64·p0.999:  327904,256 ns/op
xxhash64·p0.9999: 361843,507 ns/op
xxhash64·p1.00:   618496,000 ns/op

Iteration   4: 257742,712 ±(99.9%) 39,222 ns/op
xxhash64·p0.00:   256000,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   260864,000 ns/op
xxhash64·p0.95:   261376,000 ns/op
xxhash64·p0.99:   264704,000 ns/op
xxhash64·p0.999:  269824,000 ns/op
xxhash64·p0.9999: 280946,586 ns/op
xxhash64·p1.00:   353792,000 ns/op

Iteration   5: 257626,307 ±(99.9%) 40,144 ns/op
xxhash64·p0.00:   256000,000 ns/op
xxhash64·p0.50:   256256,000 ns/op
xxhash64·p0.90:   260608,000 ns/op
xxhash64·p0.95:   261120,000 ns/op
xxhash64·p0.99:   264192,000 ns/op
xxhash64·p0.999:  270336,000 ns/op
xxhash64·p0.9999: 290427,699 ns/op
xxhash64·p1.00:   445440,000 ns/op


# Run progress: 98,50% complete, ETA 00:13:34
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

259238,803 ±(99.9%) 467,605 ns/op
# Warmup Iteration   2: 259061,773 ±(99.9%) 67,988 ns/op
# Warmup Iteration   3: 258979,183 ±(99.9%) 52,365 ns/op
# Warmup Iteration   4: 258348,010 ±(99.9%) 47,898 ns/op
# Warmup Iteration   5: 259290,247 ±(99.9%) 47,618 ns/op
Iteration   1: 260013,837 ±(99.9%) 53,781 ns/op
xxhash64·p0.00:   256000,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   263168,000 ns/op
xxhash64·p0.95:   265216,000 ns/op
xxhash64·p0.99:   269824,000 ns/op
xxhash64·p0.999:  289057,792 ns/op
xxhash64·p0.9999: 322516,480 ns/op
xxhash64·p1.00:   344576,000 ns/op

Iteration   2: 259072,677 ±(99.9%) 47,899 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   262144,000 ns/op
xxhash64·p0.95:   262656,000 ns/op
xxhash64·p0.99:   266869,760 ns/op
xxhash64·p0.999:  272896,000 ns/op
xxhash64·p0.9999: 373600,307 ns/op
xxhash64·p1.00:   408064,000 ns/op

Iteration   3: 257956,050 ±(99.9%) 39,442 ns/op
xxhash64·p0.00:   256000,000 ns/op
xxhash64·p0.50:   257280,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   261632,000 ns/op
xxhash64·p0.99:   264704,000 ns/op
xxhash64·p0.999:  271872,000 ns/op
xxhash64·p0.9999: 289344,410 ns/op
xxhash64·p1.00:   307200,000 ns/op

Iteration   4: 258219,114 ±(99.9%) 50,586 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257280,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   262144,000 ns/op
xxhash64·p0.99:   265216,000 ns/op
xxhash64·p0.999:  273048,064 ns/op
xxhash64·p0.9999: 385602,406 ns/op
xxhash64·p1.00:   403968,000 ns/op

Iteration   5: 259778,095 ±(99.9%) 66,805 ns/op
xxhash64·p0.00:   254976,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   264192,000 ns/op
xxhash64·p0.95:   266240,000 ns/op
xxhash64·p0.99:   273408,000 ns/op
xxhash64·p0.999:  295184,384 ns/op
xxhash64·p0.9999: 338704,384 ns/op
xxhash64·p1.00:   385536,000 ns/op


# Run progress: 98,67% complete, ETA 00:12:03
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

259345,818 ±(99.9%) 465,562 ns/op
# Warmup Iteration   2: 259147,127 ±(99.9%) 44,345 ns/op
# Warmup Iteration   3: 259179,145 ±(99.9%) 44,015 ns/op
# Warmup Iteration   4: 259358,492 ±(99.9%) 59,795 ns/op
# Warmup Iteration   5: 258322,576 ±(99.9%) 45,686 ns/op
Iteration   1: 258174,922 ±(99.9%) 51,049 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   262656,000 ns/op
xxhash64·p0.99:   270336,000 ns/op
xxhash64·p0.999:  278016,000 ns/op
xxhash64·p0.9999: 323310,080 ns/op
xxhash64·p1.00:   398848,000 ns/op

Iteration   2: 258291,051 ±(99.9%) 46,972 ns/op
xxhash64·p0.00:   252672,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   262144,000 ns/op
xxhash64·p0.99:   265216,000 ns/op
xxhash64·p0.999:  273920,000 ns/op
xxhash64·p0.9999: 371097,088 ns/op
xxhash64·p1.00:   410624,000 ns/op

Iteration   3: 259698,487 ±(99.9%) 78,674 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   263680,000 ns/op
xxhash64·p0.95:   266752,000 ns/op
xxhash64·p0.99:   275968,000 ns/op
xxhash64·p0.999:  305175,552 ns/op
xxhash64·p0.9999: 385925,888 ns/op
xxhash64·p1.00:   434176,000 ns/op

Iteration   4: 258045,528 ±(99.9%) 41,982 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   261888,000 ns/op
xxhash64·p0.99:   264704,000 ns/op
xxhash64·p0.999:  271360,000 ns/op
xxhash64·p0.9999: 286156,186 ns/op
xxhash64·p1.00:   407040,000 ns/op

Iteration   5: 257939,913 ±(99.9%) 41,734 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   261632,000 ns/op
xxhash64·p0.99:   264704,000 ns/op
xxhash64·p0.999:  273408,000 ns/op
xxhash64·p0.9999: 327296,819 ns/op
xxhash64·p1.00:   360448,000 ns/op


# Run progress: 98,83% complete, ETA 00:10:33
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

258039,853 ±(99.9%) 471,507 ns/op
# Warmup Iteration   2: 259258,044 ±(99.9%) 68,398 ns/op
# Warmup Iteration   3: 257874,299 ±(99.9%) 39,141 ns/op
# Warmup Iteration   4: 258956,704 ±(99.9%) 45,901 ns/op
# Warmup Iteration   5: 259169,229 ±(99.9%) 37,669 ns/op
Iteration   1: 259859,146 ±(99.9%) 55,952 ns/op
xxhash64·p0.00:   257024,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   263168,000 ns/op
xxhash64·p0.95:   265216,000 ns/op
xxhash64·p0.99:   269824,000 ns/op
xxhash64·p0.999:  288256,000 ns/op
xxhash64·p0.9999: 328809,216 ns/op
xxhash64·p1.00:   399872,000 ns/op

Iteration   2: 258966,414 ±(99.9%) 41,208 ns/op
xxhash64·p0.00:   254720,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   262144,000 ns/op
xxhash64·p0.95:   262656,000 ns/op
xxhash64·p0.99:   265728,000 ns/op
xxhash64·p0.999:  271360,000 ns/op
xxhash64·p0.9999: 321144,832 ns/op
xxhash64·p1.00:   356352,000 ns/op

Iteration   3: 258805,034 ±(99.9%) 53,315 ns/op
xxhash64·p0.00:   252672,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   261888,000 ns/op
xxhash64·p0.95:   262144,000 ns/op
xxhash64·p0.99:   265728,000 ns/op
xxhash64·p0.999:  273920,000 ns/op
xxhash64·p0.9999: 384512,000 ns/op
xxhash64·p1.00:   398336,000 ns/op

Iteration   4: 259072,783 ±(99.9%) 48,310 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   262144,000 ns/op
xxhash64·p0.95:   263168,000 ns/op
xxhash64·p0.99:   266240,000 ns/op
xxhash64·p0.999:  273408,000 ns/op
xxhash64·p0.9999: 385243,341 ns/op
xxhash64·p1.00:   390656,000 ns/op

Iteration   5: 259811,638 ±(99.9%) 51,699 ns/op
xxhash64·p0.00:   257024,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   263168,000 ns/op
xxhash64·p0.95:   265216,000 ns/op
xxhash64·p0.99:   269824,000 ns/op
xxhash64·p0.999:  283411,456 ns/op
xxhash64·p0.9999: 317676,237 ns/op
xxhash64·p1.00:   325120,000 ns/op


# Run progress: 99,00% complete, ETA 00:09:03
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

259450,934 ±(99.9%) 459,246 ns/op
# Warmup Iteration   2: 258924,857 ±(99.9%) 49,382 ns/op
# Warmup Iteration   3: 259161,961 ±(99.9%) 50,350 ns/op
# Warmup Iteration   4: 259752,901 ±(99.9%) 68,039 ns/op
# Warmup Iteration   5: 259050,246 ±(99.9%) 46,548 ns/op
Iteration   1: 259065,198 ±(99.9%) 37,471 ns/op
xxhash64·p0.00:   256000,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   262144,000 ns/op
xxhash64·p0.95:   262144,000 ns/op
xxhash64·p0.99:   265728,000 ns/op
xxhash64·p0.999:  270336,000 ns/op
xxhash64·p0.9999: 278600,909 ns/op
xxhash64·p1.00:   356352,000 ns/op

Iteration   2: 259270,800 ±(99.9%) 48,631 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   262144,000 ns/op
xxhash64·p0.95:   263168,000 ns/op
xxhash64·p0.99:   267264,000 ns/op
xxhash64·p0.999:  273408,000 ns/op
xxhash64·p0.9999: 364538,266 ns/op
xxhash64·p1.00:   392192,000 ns/op

Iteration   3: 259887,119 ±(99.9%) 74,797 ns/op
xxhash64·p0.00:   251648,000 ns/op
xxhash64·p0.50:   258304,000 ns/op
xxhash64·p0.90:   263680,000 ns/op
xxhash64·p0.95:   266752,000 ns/op
xxhash64·p0.99:   273408,000 ns/op
xxhash64·p0.999:  311577,088 ns/op
xxhash64·p0.9999: 385773,926 ns/op
xxhash64·p1.00:   403456,000 ns/op

Iteration   4: 258301,492 ±(99.9%) 51,890 ns/op
xxhash64·p0.00:   253696,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   261120,000 ns/op
xxhash64·p0.95:   262144,000 ns/op
xxhash64·p0.99:   265216,000 ns/op
xxhash64·p0.999:  280064,000 ns/op
xxhash64·p0.9999: 382380,442 ns/op
xxhash64·p1.00:   397312,000 ns/op

Iteration   5: 257875,761 ±(99.9%) 41,834 ns/op
xxhash64·p0.00:   254720,000 ns/op
xxhash64·p0.50:   257024,000 ns/op
xxhash64·p0.90:   260864,000 ns/op
xxhash64·p0.95:   261376,000 ns/op
xxhash64·p0.99:   264704,000 ns/op
xxhash64·p0.999:  271872,000 ns/op
xxhash64·p0.9999: 321151,795 ns/op
xxhash64·p1.00:   386560,000 ns/op



Result "org.example.Main.xxhash64":
N = 385690
mean = 259089,997 ±(99.9%) 16,603 ns/op

Histogram, ns/op:
[200000,000, 225000,000) = 0
[225000,000, 250000,000) = 0
[250000,000, 275000,000) = 385065
[275000,000, 300000,000) = 490
[300000,000, 325000,000) = 64
[325000,000, 350000,000) = 32
[350000,000, 375000,000) = 10
[375000,000, 400000,000) = 28
[400000,000, 425000,000) = 1
[425000,000, 450000,000) = 0
[450000,000, 475000,000) = 0

Percentiles, ns/op:
p(0,0000) = 251648,000 ns/op
p(50,0000) = 258304,000 ns/op
p(90,0000) = 262144,000 ns/op
p(95,0000) = 263680,000 ns/op
p(99,0000) = 268288,000 ns/op
p(99,9000) = 280064,000 ns/op
p(99,9900) = 354965,862 ns/op
p(99,9990) = 397458,524 ns/op
p(99,9999) = 403456,000 ns/op
p(100,0000) = 403456,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 20M)

# Run progress: 99,17% complete, ETA 00:07:33
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1293601,181 ±(99.9%) 2755,776 ns/op
# Warmup Iteration   2: 1291784,871 ±(99.9%) 721,185 ns/op
# Warmup Iteration   3: 1300501,061 ±(99.9%) 1373,376 ns/op
# Warmup Iteration   4: 1295508,979 ±(99.9%) 183,835 ns/op
# Warmup Iteration   5: 1296511,020 ±(99.9%) 364,179 ns/op
Iteration   1: 1296867,227 ±(99.9%) 318,705 ns/op
xxhash64·p0.00:   1288192,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1302528,000 ns/op
xxhash64·p0.95:   1306624,000 ns/op
xxhash64·p0.99:   1339392,000 ns/op
xxhash64·p0.999:  1361920,000 ns/op
xxhash64·p0.9999: 1370112,000 ns/op
xxhash64·p1.00:   1370112,000 ns/op

Iteration   2: 1300406,438 ±(99.9%) 868,420 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1296384,000 ns/op
xxhash64·p0.90:   1310720,000 ns/op
xxhash64·p0.95:   1329152,000 ns/op
xxhash64·p0.99:   1368064,000 ns/op
xxhash64·p0.999:  1602826,240 ns/op
xxhash64·p0.9999: 2058240,000 ns/op
xxhash64·p1.00:   2058240,000 ns/op

Iteration   3: 1295924,727 ±(99.9%) 173,915 ns/op
xxhash64·p0.00:   1288192,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1302528,000 ns/op
xxhash64·p0.99:   1310720,000 ns/op
xxhash64·p0.999:  1329743,872 ns/op
xxhash64·p0.9999: 1345536,000 ns/op
xxhash64·p1.00:   1345536,000 ns/op

Iteration   4: 1294345,020 ±(99.9%) 279,139 ns/op
xxhash64·p0.00:   1277952,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1302528,000 ns/op
xxhash64·p0.99:   1314816,000 ns/op
xxhash64·p0.999:  1376493,568 ns/op
xxhash64·p0.9999: 1474560,000 ns/op
xxhash64·p1.00:   1474560,000 ns/op

Iteration   5: 1295956,868 ±(99.9%) 203,032 ns/op
xxhash64·p0.00:   1286144,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1304576,000 ns/op
xxhash64·p0.99:   1316864,000 ns/op
xxhash64·p0.999:  1335887,872 ns/op
xxhash64·p0.9999: 1355776,000 ns/op
xxhash64·p1.00:   1355776,000 ns/op


# Run progress: 99,33% complete, ETA 00:06:02
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1297631,846 ±(99.9%) 2552,816 ns/op
# Warmup Iteration   2: 1294125,098 ±(99.9%) 332,462 ns/op
# Warmup Iteration   3: 1295136,456 ±(99.9%) 225,082 ns/op
# Warmup Iteration   4: 1295487,054 ±(99.9%) 265,279 ns/op
# Warmup Iteration   5: 1299262,544 ±(99.9%) 1175,540 ns/op
Iteration   1: 1289030,118 ±(99.9%) 209,802 ns/op
xxhash64·p0.00:   1282048,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1296384,000 ns/op
xxhash64·p0.99:   1304576,000 ns/op
xxhash64·p0.999:  1333248,000 ns/op
xxhash64·p0.9999: 1449984,000 ns/op
xxhash64·p1.00:   1449984,000 ns/op

Iteration   2: 1289043,594 ±(99.9%) 225,764 ns/op
xxhash64·p0.00:   1282048,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1296384,000 ns/op
xxhash64·p0.99:   1305559,040 ns/op
xxhash64·p0.999:  1339392,000 ns/op
xxhash64·p0.9999: 1497088,000 ns/op
xxhash64·p1.00:   1497088,000 ns/op

Iteration   3: 1289430,737 ±(99.9%) 209,824 ns/op
xxhash64·p0.00:   1282048,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1296384,000 ns/op
xxhash64·p0.99:   1310720,000 ns/op
xxhash64·p0.999:  1332224,000 ns/op
xxhash64·p0.9999: 1386496,000 ns/op
xxhash64·p1.00:   1386496,000 ns/op

Iteration   4: 1298872,055 ±(99.9%) 1016,148 ns/op
xxhash64·p0.00:   1277952,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1308672,000 ns/op
xxhash64·p0.95:   1331200,000 ns/op
xxhash64·p0.99:   1370112,000 ns/op
xxhash64·p0.999:  1689264,128 ns/op
xxhash64·p0.9999: 2021376,000 ns/op
xxhash64·p1.00:   2021376,000 ns/op

Iteration   5: 1295118,996 ±(99.9%) 178,712 ns/op
xxhash64·p0.00:   1286144,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1302528,000 ns/op
xxhash64·p0.99:   1308672,000 ns/op
xxhash64·p0.999:  1332938,752 ns/op
xxhash64·p0.9999: 1343488,000 ns/op
xxhash64·p1.00:   1343488,000 ns/op


# Run progress: 99,50% complete, ETA 00:04:32
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1296734,060 ±(99.9%) 2712,920 ns/op
# Warmup Iteration   2: 1292512,141 ±(99.9%) 397,269 ns/op
# Warmup Iteration   3: 1298848,949 ±(99.9%) 1361,646 ns/op
# Warmup Iteration   4: 1290510,121 ±(99.9%) 331,849 ns/op
# Warmup Iteration   5: 1290363,785 ±(99.9%) 364,861 ns/op
Iteration   1: 1289336,766 ±(99.9%) 271,125 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1296384,000 ns/op
xxhash64·p0.99:   1308672,000 ns/op
xxhash64·p0.999:  1335296,000 ns/op
xxhash64·p0.9999: 1673216,000 ns/op
xxhash64·p1.00:   1673216,000 ns/op

Iteration   2: 1300195,119 ±(99.9%) 1023,489 ns/op
xxhash64·p0.00:   1277952,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1316864,000 ns/op
xxhash64·p0.95:   1333248,000 ns/op
xxhash64·p0.99:   1372160,000 ns/op
xxhash64·p0.999:  1668120,576 ns/op
xxhash64·p0.9999: 2054144,000 ns/op
xxhash64·p1.00:   2054144,000 ns/op

Iteration   3: 1295869,742 ±(99.9%) 193,718 ns/op
xxhash64·p0.00:   1288192,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1304576,000 ns/op
xxhash64·p0.99:   1312768,000 ns/op
xxhash64·p0.999:  1333248,000 ns/op
xxhash64·p0.9999: 1345536,000 ns/op
xxhash64·p1.00:   1345536,000 ns/op

Iteration   4: 1295785,350 ±(99.9%) 183,430 ns/op
xxhash64·p0.00:   1288192,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1302528,000 ns/op
xxhash64·p0.99:   1312768,000 ns/op
xxhash64·p0.999:  1331789,824 ns/op
xxhash64·p0.9999: 1343488,000 ns/op
xxhash64·p1.00:   1343488,000 ns/op

Iteration   5: 1292379,393 ±(99.9%) 326,729 ns/op
xxhash64·p0.00:   1282048,000 ns/op
xxhash64·p0.50:   1292288,000 ns/op
xxhash64·p0.90:   1298432,000 ns/op
xxhash64·p0.95:   1302528,000 ns/op
xxhash64·p0.99:   1316864,000 ns/op
xxhash64·p0.999:  1420361,728 ns/op
xxhash64·p0.9999: 1603584,000 ns/op
xxhash64·p1.00:   1603584,000 ns/op


# Run progress: 99,67% complete, ETA 00:03:01
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1296707,215 ±(99.9%) 2520,643 ns/op
# Warmup Iteration   2: 1289904,483 ±(99.9%) 194,455 ns/op
# Warmup Iteration   3: 1289084,813 ±(99.9%) 186,215 ns/op
# Warmup Iteration   4: 1290325,168 ±(99.9%) 298,330 ns/op
# Warmup Iteration   5: 1299819,002 ±(99.9%) 1199,473 ns/op
Iteration   1: 1297331,951 ±(99.9%) 404,701 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1296384,000 ns/op
xxhash64·p0.90:   1302528,000 ns/op
xxhash64·p0.95:   1308672,000 ns/op
xxhash64·p0.99:   1347584,000 ns/op
xxhash64·p0.999:  1424576,512 ns/op
xxhash64·p0.9999: 1533952,000 ns/op
xxhash64·p1.00:   1533952,000 ns/op

Iteration   2: 1295478,292 ±(99.9%) 340,139 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1304576,000 ns/op
xxhash64·p0.99:   1318912,000 ns/op
xxhash64·p0.999:  1407569,920 ns/op
xxhash64·p0.9999: 1601536,000 ns/op
xxhash64·p1.00:   1601536,000 ns/op

Iteration   3: 1295074,236 ±(99.9%) 488,500 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1302937,600 ns/op
xxhash64·p0.99:   1318912,000 ns/op
xxhash64·p0.999:  1449099,264 ns/op
xxhash64·p0.9999: 1972224,000 ns/op
xxhash64·p1.00:   1972224,000 ns/op

Iteration   4: 1299254,130 ±(99.9%) 894,299 ns/op
xxhash64·p0.00:   1282048,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1308672,000 ns/op
xxhash64·p0.95:   1333248,000 ns/op
xxhash64·p0.99:   1368064,000 ns/op
xxhash64·p0.999:  1639032,832 ns/op
xxhash64·p0.9999: 2109440,000 ns/op
xxhash64·p1.00:   2109440,000 ns/op

Iteration   5: 1289731,965 ±(99.9%) 297,113 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1296384,000 ns/op
xxhash64·p0.95:   1298432,000 ns/op
xxhash64·p0.99:   1314816,000 ns/op
xxhash64·p0.999:  1357824,000 ns/op
xxhash64·p0.9999: 1568768,000 ns/op
xxhash64·p1.00:   1568768,000 ns/op


# Run progress: 99,83% complete, ETA 00:01:31
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

1289579,892 ±(99.9%) 2520,998 ns/op
# Warmup Iteration   2: 1289049,407 ±(99.9%) 214,648 ns/op
# Warmup Iteration   3: 1296623,221 ±(99.9%) 1563,976 ns/op
# Warmup Iteration   4: 1290439,721 ±(99.9%) 437,875 ns/op
# Warmup Iteration   5: 1294648,321 ±(99.9%) 314,196 ns/op
Iteration   1: 1295275,187 ±(99.9%) 185,872 ns/op
xxhash64·p0.00:   1286144,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1300480,000 ns/op
xxhash64·p0.95:   1302528,000 ns/op
xxhash64·p0.99:   1310720,000 ns/op
xxhash64·p0.999:  1329152,000 ns/op
xxhash64·p0.9999: 1337344,000 ns/op
xxhash64·p1.00:   1337344,000 ns/op

Iteration   2: 1298855,017 ±(99.9%) 936,787 ns/op
xxhash64·p0.00:   1273856,000 ns/op
xxhash64·p0.50:   1294336,000 ns/op
xxhash64·p0.90:   1304576,000 ns/op
xxhash64·p0.95:   1323008,000 ns/op
xxhash64·p0.99:   1364090,880 ns/op
xxhash64·p0.999:  1627779,072 ns/op
xxhash64·p0.9999: 2101248,000 ns/op
xxhash64·p1.00:   2101248,000 ns/op

Iteration   3: 1289214,943 ±(99.9%) 307,160 ns/op
xxhash64·p0.00:   1275904,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1298432,000 ns/op
xxhash64·p0.99:   1312768,000 ns/op
xxhash64·p0.999:  1339901,952 ns/op
xxhash64·p0.9999: 1562624,000 ns/op
xxhash64·p1.00:   1562624,000 ns/op

Iteration   4: 1288721,368 ±(99.9%) 292,408 ns/op
xxhash64·p0.00:   1271808,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1296384,000 ns/op
xxhash64·p0.99:   1304576,000 ns/op
xxhash64·p0.999:  1341911,040 ns/op
xxhash64·p0.9999: 1650688,000 ns/op
xxhash64·p1.00:   1650688,000 ns/op

Iteration   5: 1288581,051 ±(99.9%) 230,175 ns/op
xxhash64·p0.00:   1282048,000 ns/op
xxhash64·p0.50:   1288192,000 ns/op
xxhash64·p0.90:   1294336,000 ns/op
xxhash64·p0.95:   1296384,000 ns/op
xxhash64·p0.99:   1307545,600 ns/op
xxhash64·p0.999:  1335296,000 ns/op
xxhash64·p0.9999: 1482752,000 ns/op
xxhash64·p1.00:   1482752,000 ns/op



Result "org.example.Main.xxhash64":
N = 77233
mean = 1293739,072 ±(99.9%) 166,348 ns/op

Histogram, ns/op:
[1200000,000, 1300000,000) = 68190
[1300000,000, 1400000,000) = 8928
[1400000,000, 1500000,000) = 62
[1500000,000, 1600000,000) = 27
[1600000,000, 1700000,000) = 19
[1700000,000, 1800000,000) = 0
[1800000,000, 1900000,000) = 2
[1900000,000, 2000000,000) = 2
[2000000,000, 2100000,000) = 1

Percentiles, ns/op:
p(0,0000) = 1271808,000 ns/op
p(50,0000) = 1292288,000 ns/op
p(90,0000) = 1300480,000 ns/op
p(95,0000) = 1304576,000 ns/op
p(99,0000) = 1337344,000 ns/op
p(99,9000) = 1464320,000 ns/op
p(99,9900) = 1735484,621 ns/op
p(99,9990) = 2109440,000 ns/op
p(99,9999) = 2109440,000 ns/op
p(100,0000) = 2109440,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77686809,000 ns/op
Iteration   2: 331480,000 ns/op
Iteration   3: 288257,000 ns/op
Iteration   4: 299078,000 ns/op
Iteration   5: 294510,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79249548,000 ns/op
Iteration   2: 410039,000 ns/op
Iteration   3: 348452,000 ns/op
Iteration   4: 308977,000 ns/op
Iteration   5: 300330,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 76193121,000 ns/op
Iteration   2: 336119,000 ns/op
Iteration   3: 287576,000 ns/op
Iteration   4: 291343,000 ns/op
Iteration   5: 285763,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77244018,000 ns/op
Iteration   2: 302395,000 ns/op
Iteration   3: 287676,000 ns/op
Iteration   4: 291684,000 ns/op
Iteration   5: 284450,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77046080,000 ns/op
Iteration   2: 310139,000 ns/op
Iteration   3: 292987,000 ns/op
Iteration   4: 360244,000 ns/op
Iteration   5: 290472,000 ns/op


Result "org.example.Main.blake2b_128":
N = 10
mean = 15671014,500 ±(99.9%) 48983726,114 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 284450,000 ns/op
p(50,0000) = 297691,000 ns/op
p(90,0000) = 77224224,200 ns/op
p(95,0000) = 77244018,000 ns/op
p(99,0000) = 77244018,000 ns/op
p(99,9000) = 77244018,000 ns/op
p(99,9900) = 77244018,000 ns/op
p(99,9990) = 77244018,000 ns/op
p(99,9999) = 77244018,000 ns/op
p(100,0000) = 77244018,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 80078794,000 ns/op
Iteration   2: 2458822,000 ns/op
Iteration   3: 2247480,000 ns/op
Iteration   4: 2243463,000 ns/op
Iteration   5: 2246789,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79831874,000 ns/op
Iteration   2: 2305671,000 ns/op
Iteration   3: 2264162,000 ns/op
Iteration   4: 2250657,000 ns/op
Iteration   5: 2267548,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 81460378,000 ns/op
Iteration   2: 2258872,000 ns/op
Iteration   3: 2246539,000 ns/op
Iteration   4: 2241269,000 ns/op
Iteration   5: 2245767,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 83295726,000 ns/op
Iteration   2: 2278590,000 ns/op
Iteration   3: 2389961,000 ns/op
Iteration   4: 2276646,000 ns/op
Iteration   5: 2239726,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79567612,000 ns/op
Iteration   2: 2297977,000 ns/op
Iteration   3: 2273239,000 ns/op
Iteration   4: 2267739,000 ns/op
Iteration   5: 2246820,000 ns/op


Result "org.example.Main.blake2b_128":
N = 10
mean = 18113403,600 ±(99.9%) 50470708,050 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0
[75000000,000, 80000000,000) = 1
[80000000,000, 85000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 2239726,000 ns/op
p(50,0000) = 2277618,000 ns/op
p(90,0000) = 82922914,600 ns/op
p(95,0000) = 83295726,000 ns/op
p(99,0000) = 83295726,000 ns/op
p(99,9000) = 83295726,000 ns/op
p(99,9900) = 83295726,000 ns/op
p(99,9990) = 83295726,000 ns/op
p(99,9999) = 83295726,000 ns/op
p(100,0000) = 83295726,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 97319151,000 ns/op
Iteration   2: 14275705,000 ns/op
Iteration   3: 9474182,000 ns/op
Iteration   4: 9415189,000 ns/op
Iteration   5: 9259073,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 97548927,000 ns/op
Iteration   2: 14271026,000 ns/op
Iteration   3: 9427733,000 ns/op
Iteration   4: 9405281,000 ns/op
Iteration   5: 9202585,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 95952884,000 ns/op
Iteration   2: 14396664,000 ns/op
Iteration   3: 9287937,000 ns/op
Iteration   4: 9370945,000 ns/op
Iteration   5: 9322002,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 97545771,000 ns/op
Iteration   2: 13180583,000 ns/op
Iteration   3: 9337262,000 ns/op
Iteration   4: 9269442,000 ns/op
Iteration   5: 9305822,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 95754768,000 ns/op
Iteration   2: 14655476,000 ns/op
Iteration   3: 9245447,000 ns/op
Iteration   4: 9563651,000 ns/op
Iteration   5: 9229727,000 ns/op


Result "org.example.Main.blake2b_128":
N = 10
mean = 27708794,900 ±(99.9%) 55013340,519 ns/op

Histogram, ns/op:
[        0,000,  10000000,000) = 6
[ 10000000,000,  20000000,000) = 2
[ 20000000,000,  30000000,000) = 0
[ 30000000,000,  40000000,000) = 0
[ 40000000,000,  50000000,000) = 0
[ 50000000,000,  60000000,000) = 0
[ 60000000,000,  70000000,000) = 0
[ 70000000,000,  80000000,000) = 0
[ 80000000,000,  90000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 9229727,000 ns/op
p(50,0000) = 9450456,500 ns/op
p(90,0000) = 97366670,700 ns/op
p(95,0000) = 97545771,000 ns/op
p(99,0000) = 97545771,000 ns/op
p(99,9000) = 97545771,000 ns/op
p(99,9900) = 97545771,000 ns/op
p(99,9990) = 97545771,000 ns/op
p(99,9999) = 97545771,000 ns/op
p(100,0000) = 97545771,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_128
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 158821017,000 ns/op
Iteration   2: 48415161,000 ns/op
Iteration   3: 42799341,000 ns/op
Iteration   4: 40017334,000 ns/op
Iteration   5: 46120761,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 150596259,000 ns/op
Iteration   2: 47862210,000 ns/op
Iteration   3: 41846510,000 ns/op
Iteration   4: 40163272,000 ns/op
Iteration   5: 45585554,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 140398854,000 ns/op
Iteration   2: 46361528,000 ns/op
Iteration   3: 41562190,000 ns/op
Iteration   4: 39748323,000 ns/op
Iteration   5: 45383139,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 139846123,000 ns/op
Iteration   2: 47031322,000 ns/op
Iteration   3: 41482268,000 ns/op
Iteration   4: 39781948,000 ns/op
Iteration   5: 45180906,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 140281240,000 ns/op
Iteration   2: 46851299,000 ns/op
Iteration   3: 40781627,000 ns/op
Iteration   4: 40107596,000 ns/op
Iteration   5: 45860206,000 ns/op


Result "org.example.Main.blake2b_128":
N = 10
mean = 62720453,500 ±(99.9%) 61770295,295 ns/op

Histogram, ns/op:
[        0,000,  12500000,000) = 0
[ 12500000,000,  25000000,000) = 0
[ 25000000,000,  37500000,000) = 0
[ 37500000,000,  50000000,000) = 8
[ 50000000,000,  62500000,000) = 0
[ 62500000,000,  75000000,000) = 0
[ 75000000,000,  87500000,000) = 0
[ 87500000,000, 100000000,000) = 0
[100000000,000, 112500000,000) = 0
[112500000,000, 125000000,000) = 0
[125000000,000, 137500000,000) = 0
[137500000,000, 150000000,000) = 2
[150000000,000, 162500000,000) = 0
[162500000,000, 175000000,000) = 0
[175000000,000, 187500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 39781948,000 ns/op
p(50,0000) = 45520556,000 ns/op
p(90,0000) = 140237728,300 ns/op
p(95,0000) = 140281240,000 ns/op
p(99,0000) = 140281240,000 ns/op
p(99,9000) = 140281240,000 ns/op
p(99,9900) = 140281240,000 ns/op
p(99,9990) = 140281240,000 ns/op
p(99,9999) = 140281240,000 ns/op
p(100,0000) = 140281240,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 76829880,000 ns/op
Iteration   2: 325489,000 ns/op
Iteration   3: 292686,000 ns/op
Iteration   4: 286043,000 ns/op
Iteration   5: 283258,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78599532,000 ns/op
Iteration   2: 307535,000 ns/op
Iteration   3: 290973,000 ns/op
Iteration   4: 291875,000 ns/op
Iteration   5: 374782,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77529770,000 ns/op
Iteration   2: 329897,000 ns/op
Iteration   3: 299259,000 ns/op
Iteration   4: 291735,000 ns/op
Iteration   5: 297104,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 76238776,000 ns/op
Iteration   2: 309378,000 ns/op
Iteration   3: 300741,000 ns/op
Iteration   4: 301973,000 ns/op
Iteration   5: 290973,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 81331282,000 ns/op
Iteration   2: 333334,000 ns/op
Iteration   3: 287837,000 ns/op
Iteration   4: 290462,000 ns/op
Iteration   5: 288869,000 ns/op


Result "org.example.Main.blake2b_256":
N = 10
mean = 15997362,500 ±(99.9%) 50063295,741 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0
[75000000,000, 80000000,000) = 1
[80000000,000, 85000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 287837,000 ns/op
p(50,0000) = 301357,000 ns/op
p(90,0000) = 80822031,400 ns/op
p(95,0000) = 81331282,000 ns/op
p(99,0000) = 81331282,000 ns/op
p(99,9000) = 81331282,000 ns/op
p(99,9900) = 81331282,000 ns/op
p(99,9990) = 81331282,000 ns/op
p(99,9999) = 81331282,000 ns/op
p(100,0000) = 81331282,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79238947,000 ns/op
Iteration   2: 2398908,000 ns/op
Iteration   3: 2253412,000 ns/op
Iteration   4: 2237722,000 ns/op
Iteration   5: 2230218,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79598180,000 ns/op
Iteration   2: 2265574,000 ns/op
Iteration   3: 2288639,000 ns/op
Iteration   4: 2238814,000 ns/op
Iteration   5: 2229135,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 81066119,000 ns/op
Iteration   2: 2404308,000 ns/op
Iteration   3: 2219517,000 ns/op
Iteration   4: 2230298,000 ns/op
Iteration   5: 2269432,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 82352874,000 ns/op
Iteration   2: 2418175,000 ns/op
Iteration   3: 2273290,000 ns/op
Iteration   4: 2242060,000 ns/op
Iteration   5: 2245145,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 80259606,000 ns/op
Iteration   2: 2282216,000 ns/op
Iteration   3: 2268500,000 ns/op
Iteration   4: 2270925,000 ns/op
Iteration   5: 2286153,000 ns/op


Result "org.example.Main.blake2b_256":
N = 10
mean = 18089894,400 ±(99.9%) 50377548,042 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0
[75000000,000, 80000000,000) = 0
[80000000,000, 85000000,000) = 2

Percentiles, ns/op:
p(0,0000) = 2242060,000 ns/op
p(50,0000) = 2277753,000 ns/op
p(90,0000) = 82143547,200 ns/op
p(95,0000) = 82352874,000 ns/op
p(99,0000) = 82352874,000 ns/op
p(99,9000) = 82352874,000 ns/op
p(99,9900) = 82352874,000 ns/op
p(99,9990) = 82352874,000 ns/op
p(99,9999) = 82352874,000 ns/op
p(100,0000) = 82352874,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 96331072,000 ns/op
Iteration   2: 14480373,000 ns/op
Iteration   3: 9332322,000 ns/op
Iteration   4: 9363691,000 ns/op
Iteration   5: 9330839,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 94622265,000 ns/op
Iteration   2: 14220469,000 ns/op
Iteration   3: 9376416,000 ns/op
Iteration   4: 9348192,000 ns/op
Iteration   5: 9298938,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 96326804,000 ns/op
Iteration   2: 14484932,000 ns/op
Iteration   3: 9305130,000 ns/op
Iteration   4: 9464903,000 ns/op
Iteration   5: 9379431,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 96135741,000 ns/op
Iteration   2: 14623345,000 ns/op
Iteration   3: 9317664,000 ns/op
Iteration   4: 9233955,000 ns/op
Iteration   5: 9173300,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 95183853,000 ns/op
Iteration   2: 14484121,000 ns/op
Iteration   3: 9338023,000 ns/op
Iteration   4: 9551007,000 ns/op
Iteration   5: 9400691,000 ns/op


Result "org.example.Main.blake2b_256":
N = 10
mean = 27644170,000 ±(99.9%) 54293022,336 ns/op

Histogram, ns/op:
[        0,000,  10000000,000) = 6
[ 10000000,000,  20000000,000) = 2
[ 20000000,000,  30000000,000) = 0
[ 30000000,000,  40000000,000) = 0
[ 40000000,000,  50000000,000) = 0
[ 50000000,000,  60000000,000) = 0
[ 60000000,000,  70000000,000) = 0
[ 70000000,000,  80000000,000) = 0
[ 80000000,000,  90000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 9173300,000 ns/op
p(50,0000) = 9475849,000 ns/op
p(90,0000) = 96040552,200 ns/op
p(95,0000) = 96135741,000 ns/op
p(99,0000) = 96135741,000 ns/op
p(99,9000) = 96135741,000 ns/op
p(99,9900) = 96135741,000 ns/op
p(99,9990) = 96135741,000 ns/op
p(99,9999) = 96135741,000 ns/op
p(100,0000) = 96135741,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.blake2b_256
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 139148968,000 ns/op
Iteration   2: 47186315,000 ns/op
Iteration   3: 41490493,000 ns/op
Iteration   4: 40068662,000 ns/op
Iteration   5: 45502726,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 139179075,000 ns/op
Iteration   2: 46843956,000 ns/op
Iteration   3: 41299771,000 ns/op
Iteration   4: 39933385,000 ns/op
Iteration   5: 45451349,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 139687811,000 ns/op
Iteration   2: 46615351,000 ns/op
Iteration   3: 41043955,000 ns/op
Iteration   4: 39880214,000 ns/op
Iteration   5: 45289642,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 139477321,000 ns/op
Iteration   2: 46579202,000 ns/op
Iteration   3: 41540839,000 ns/op
Iteration   4: 39687888,000 ns/op
Iteration   5: 45266308,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 140940481,000 ns/op
Iteration   2: 47059184,000 ns/op
Iteration   3: 41490182,000 ns/op
Iteration   4: 39674974,000 ns/op
Iteration   5: 45251570,000 ns/op


Result "org.example.Main.blake2b_256":
N = 10
mean = 62696794,900 ±(99.9%) 61899027,403 ns/op

Histogram, ns/op:
[        0,000,  12500000,000) = 0
[ 12500000,000,  25000000,000) = 0
[ 25000000,000,  37500000,000) = 0
[ 37500000,000,  50000000,000) = 8
[ 50000000,000,  62500000,000) = 0
[ 62500000,000,  75000000,000) = 0
[ 75000000,000,  87500000,000) = 0
[ 87500000,000, 100000000,000) = 0
[100000000,000, 112500000,000) = 0
[112500000,000, 125000000,000) = 0
[125000000,000, 137500000,000) = 0
[137500000,000, 150000000,000) = 2
[150000000,000, 162500000,000) = 0
[162500000,000, 175000000,000) = 0
[175000000,000, 187500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 39674974,000 ns/op
p(50,0000) = 45258939,000 ns/op
p(90,0000) = 140794165,000 ns/op
p(95,0000) = 140940481,000 ns/op
p(99,0000) = 140940481,000 ns/op
p(99,9000) = 140940481,000 ns/op
p(99,9900) = 140940481,000 ns/op
p(99,9990) = 140940481,000 ns/op
p(99,9999) = 140940481,000 ns/op
p(100,0000) = 140940481,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 237391,000 ns/op
Iteration   2: 2215,000 ns/op
Iteration   3: 1633,000 ns/op
Iteration   4: 1473,000 ns/op
Iteration   5: 1613,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 251578,000 ns/op
Iteration   2: 2365,000 ns/op
Iteration   3: 1603,000 ns/op
Iteration   4: 1473,000 ns/op
Iteration   5: 1362,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 227642,000 ns/op
Iteration   2: 2435,000 ns/op
Iteration   3: 1674,000 ns/op
Iteration   4: 1483,000 ns/op
Iteration   5: 1563,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 261386,000 ns/op
Iteration   2: 2625,000 ns/op
Iteration   3: 2635,000 ns/op
Iteration   4: 1913,000 ns/op
Iteration   5: 1963,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 264062,000 ns/op
Iteration   2: 2395,000 ns/op
Iteration   3: 1663,000 ns/op
Iteration   4: 1633,000 ns/op
Iteration   5: 1573,000 ns/op


Result "org.example.Main.crc32":
N = 10
mean =  54184,800 ±(99.9%) 166171,730 ns/op

Histogram, ns/op:
[     0,000,  25000,000) = 8
[ 25000,000,  50000,000) = 0
[ 50000,000,  75000,000) = 0
[ 75000,000, 100000,000) = 0
[100000,000, 125000,000) = 0
[125000,000, 150000,000) = 0
[150000,000, 175000,000) = 0
[175000,000, 200000,000) = 0
[200000,000, 225000,000) = 0
[225000,000, 250000,000) = 0
[250000,000, 275000,000) = 2

Percentiles, ns/op:
p(0,0000) =   1573,000 ns/op
p(50,0000) =   2179,000 ns/op
p(90,0000) = 263794,400 ns/op
p(95,0000) = 264062,000 ns/op
p(99,0000) = 264062,000 ns/op
p(99,9000) = 264062,000 ns/op
p(99,9900) = 264062,000 ns/op
p(99,9990) = 264062,000 ns/op
p(99,9999) = 264062,000 ns/op
p(100,0000) = 264062,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 257269,000 ns/op
Iteration   2: 8446,000 ns/op
Iteration   3: 8195,000 ns/op
Iteration   4: 8326,000 ns/op
Iteration   5: 7635,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 274772,000 ns/op
Iteration   2: 7895,000 ns/op
Iteration   3: 7404,000 ns/op
Iteration   4: 7374,000 ns/op
Iteration   5: 7303,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 256868,000 ns/op
Iteration   2: 8145,000 ns/op
Iteration   3: 7555,000 ns/op
Iteration   4: 10510,000 ns/op
Iteration   5: 7454,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 230929,000 ns/op
Iteration   2: 7755,000 ns/op
Iteration   3: 7364,000 ns/op
Iteration   4: 7214,000 ns/op
Iteration   5: 7183,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 232492,000 ns/op
Iteration   2: 7634,000 ns/op
Iteration   3: 9017,000 ns/op
Iteration   4: 8796,000 ns/op
Iteration   5: 9007,000 ns/op


Result "org.example.Main.crc32":
N = 10
mean =  52739,100 ±(99.9%) 142612,923 ns/op

Histogram, ns/op:
[     0,000,  25000,000) = 8
[ 25000,000,  50000,000) = 0
[ 50000,000,  75000,000) = 0
[ 75000,000, 100000,000) = 0
[100000,000, 125000,000) = 0
[125000,000, 150000,000) = 0
[150000,000, 175000,000) = 0
[175000,000, 200000,000) = 0
[200000,000, 225000,000) = 0
[225000,000, 250000,000) = 2
[250000,000, 275000,000) = 0

Percentiles, ns/op:
p(0,0000) =   7183,000 ns/op
p(50,0000) =   8275,500 ns/op
p(90,0000) = 232335,700 ns/op
p(95,0000) = 232492,000 ns/op
p(99,0000) = 232492,000 ns/op
p(99,9000) = 232492,000 ns/op
p(99,9900) = 232492,000 ns/op
p(99,9990) = 232492,000 ns/op
p(99,9999) = 232492,000 ns/op
p(100,0000) = 232492,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 305851,000 ns/op
Iteration   2: 53873,000 ns/op
Iteration   3: 150005,000 ns/op
Iteration   4: 51117,000 ns/op
Iteration   5: 50195,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 305610,000 ns/op
Iteration   2: 53261,000 ns/op
Iteration   3: 53842,000 ns/op
Iteration   4: 53542,000 ns/op
Iteration   5: 52771,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 291574,000 ns/op
Iteration   2: 51849,000 ns/op
Iteration   3: 51137,000 ns/op
Iteration   4: 50355,000 ns/op
Iteration   5: 50897,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 350756,000 ns/op
Iteration   2: 60304,000 ns/op
Iteration   3: 64021,000 ns/op
Iteration   4: 63811,000 ns/op
Iteration   5: 51658,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 303366,000 ns/op
Iteration   2: 150385,000 ns/op
Iteration   3: 50967,000 ns/op
Iteration   4: 51378,000 ns/op
Iteration   5: 50546,000 ns/op


Result "org.example.Main.crc32":
N = 10
mean = 119719,200 ±(99.9%) 172096,154 ns/op

Histogram, ns/op:
[     0,000,  25000,000) = 0
[ 25000,000,  50000,000) = 0
[ 50000,000,  75000,000) = 7
[ 75000,000, 100000,000) = 0
[100000,000, 125000,000) = 0
[125000,000, 150000,000) = 0
[150000,000, 175000,000) = 1
[175000,000, 200000,000) = 0
[200000,000, 225000,000) = 0
[225000,000, 250000,000) = 0
[250000,000, 275000,000) = 0
[275000,000, 300000,000) = 0
[300000,000, 325000,000) = 1
[325000,000, 350000,000) = 0
[350000,000, 375000,000) = 1

Percentiles, ns/op:
p(0,0000) =  50546,000 ns/op
p(50,0000) =  62057,500 ns/op
p(90,0000) = 346017,000 ns/op
p(95,0000) = 350756,000 ns/op
p(99,0000) = 350756,000 ns/op
p(99,9000) = 350756,000 ns/op
p(99,9900) = 350756,000 ns/op
p(99,9990) = 350756,000 ns/op
p(99,9999) = 350756,000 ns/op
p(100,0000) = 350756,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc32
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 623886,000 ns/op
Iteration   2: 734315,000 ns/op
Iteration   3: 418936,000 ns/op
Iteration   4: 270133,000 ns/op
Iteration   5: 261477,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 715940,000 ns/op
Iteration   2: 426020,000 ns/op
Iteration   3: 470213,000 ns/op
Iteration   4: 356998,000 ns/op
Iteration   5: 278840,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 774221,000 ns/op
Iteration   2: 473149,000 ns/op
Iteration   3: 414878,000 ns/op
Iteration   4: 290351,000 ns/op
Iteration   5: 269211,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 775734,000 ns/op
Iteration   2: 344414,000 ns/op
Iteration   3: 296443,000 ns/op
Iteration   4: 284791,000 ns/op
Iteration   5: 263951,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 657530,000 ns/op
Iteration   2: 309738,000 ns/op
Iteration   3: 290031,000 ns/op
Iteration   4: 672819,000 ns/op
Iteration   5: 499710,000 ns/op


Result "org.example.Main.crc32":
N = 10
mean = 439516,100 ±(99.9%) 294754,675 ns/op

Histogram, ns/op:
[200000,000, 250000,000) = 0
[250000,000, 300000,000) = 4
[300000,000, 350000,000) = 2
[350000,000, 400000,000) = 0
[400000,000, 450000,000) = 0
[450000,000, 500000,000) = 1
[500000,000, 550000,000) = 0
[550000,000, 600000,000) = 0
[600000,000, 650000,000) = 0
[650000,000, 700000,000) = 2
[700000,000, 750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 263951,000 ns/op
p(50,0000) = 327076,000 ns/op
p(90,0000) = 765442,500 ns/op
p(95,0000) = 775734,000 ns/op
p(99,0000) = 775734,000 ns/op
p(99,9000) = 775734,000 ns/op
p(99,9900) = 775734,000 ns/op
p(99,9990) = 775734,000 ns/op
p(99,9999) = 775734,000 ns/op
p(100,0000) = 775734,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 1409999,000 ns/op
Iteration   2: 152580,000 ns/op
Iteration   3: 115840,000 ns/op
Iteration   4: 113365,000 ns/op
Iteration   5: 113856,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 1408637,000 ns/op
Iteration   2: 162800,000 ns/op
Iteration   3: 123816,000 ns/op
Iteration   4: 115930,000 ns/op
Iteration   5: 111512,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 1369242,000 ns/op
Iteration   2: 138503,000 ns/op
Iteration   3: 109669,000 ns/op
Iteration   4: 113075,000 ns/op
Iteration   5: 109528,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 1461447,000 ns/op
Iteration   2: 154593,000 ns/op
Iteration   3: 140847,000 ns/op
Iteration   4: 139095,000 ns/op
Iteration   5: 139295,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 1473670,000 ns/op
Iteration   2: 149775,000 ns/op
Iteration   3: 142420,000 ns/op
Iteration   4: 141178,000 ns/op
Iteration   5: 155015,000 ns/op


Result "org.example.Main.crc64_ecma":
N = 10
mean = 409733,500 ±(99.9%) 842954,336 ns/op

Histogram, ns/op:
[      0,000,  125000,000) = 0
[ 125000,000,  250000,000) = 8
[ 250000,000,  375000,000) = 0
[ 375000,000,  500000,000) = 0
[ 500000,000,  625000,000) = 0
[ 625000,000,  750000,000) = 0
[ 750000,000,  875000,000) = 0
[ 875000,000, 1000000,000) = 0
[1000000,000, 1125000,000) = 0
[1125000,000, 1250000,000) = 0
[1250000,000, 1375000,000) = 0
[1375000,000, 1500000,000) = 2
[1500000,000, 1625000,000) = 0
[1625000,000, 1750000,000) = 0
[1750000,000, 1875000,000) = 0

Percentiles, ns/op:
p(0,0000) = 139095,000 ns/op
p(50,0000) = 146097,500 ns/op
p(90,0000) = 1472447,700 ns/op
p(95,0000) = 1473670,000 ns/op
p(99,0000) = 1473670,000 ns/op
p(99,9000) = 1473670,000 ns/op
p(99,9900) = 1473670,000 ns/op
p(99,9990) = 1473670,000 ns/op
p(99,9999) = 1473670,000 ns/op
p(100,0000) = 1473670,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2289480,000 ns/op
Iteration   2: 813566,000 ns/op
Iteration   3: 881705,000 ns/op
Iteration   4: 786144,000 ns/op
Iteration   5: 782417,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2220760,000 ns/op
Iteration   2: 821390,000 ns/op
Iteration   3: 931620,000 ns/op
Iteration   4: 784932,000 ns/op
Iteration   5: 784762,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2271526,000 ns/op
Iteration   2: 811422,000 ns/op
Iteration   3: 878530,000 ns/op
Iteration   4: 778569,000 ns/op
Iteration   5: 779521,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2353601,000 ns/op
Iteration   2: 1044505,000 ns/op
Iteration   3: 912013,000 ns/op
Iteration   4: 801422,000 ns/op
Iteration   5: 804488,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2313997,000 ns/op
Iteration   2: 822403,000 ns/op
Iteration   3: 889530,000 ns/op
Iteration   4: 780874,000 ns/op
Iteration   5: 779842,000 ns/op


Result "org.example.Main.crc64_ecma":
N = 10
mean = 1150267,500 ±(99.9%) 950939,845 ns/op

Histogram, ns/op:
[      0,000,  250000,000) = 0
[ 250000,000,  500000,000) = 0
[ 500000,000,  750000,000) = 0
[ 750000,000, 1000000,000) = 7
[1000000,000, 1250000,000) = 1
[1250000,000, 1500000,000) = 0
[1500000,000, 1750000,000) = 0
[1750000,000, 2000000,000) = 0
[2000000,000, 2250000,000) = 0
[2250000,000, 2500000,000) = 2
[2500000,000, 2750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 779842,000 ns/op
p(50,0000) = 855966,500 ns/op
p(90,0000) = 2349640,600 ns/op
p(95,0000) = 2353601,000 ns/op
p(99,0000) = 2353601,000 ns/op
p(99,9000) = 2353601,000 ns/op
p(99,9900) = 2353601,000 ns/op
p(99,9990) = 2353601,000 ns/op
p(99,9999) = 2353601,000 ns/op
p(100,0000) = 2353601,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7972538,000 ns/op
Iteration   2: 6368030,000 ns/op
Iteration   3: 6065284,000 ns/op
Iteration   4: 6079582,000 ns/op
Iteration   5: 6032131,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7798617,000 ns/op
Iteration   2: 6400852,000 ns/op
Iteration   3: 6115971,000 ns/op
Iteration   4: 6052610,000 ns/op
Iteration   5: 6055986,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 8212774,000 ns/op
Iteration   2: 6417984,000 ns/op
Iteration   3: 6431660,000 ns/op
Iteration   4: 6090812,000 ns/op
Iteration   5: 6099729,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7955746,000 ns/op
Iteration   2: 6501583,000 ns/op
Iteration   3: 6150155,000 ns/op
Iteration   4: 6120729,000 ns/op
Iteration   5: 6078770,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7863060,000 ns/op
Iteration   2: 6382687,000 ns/op
Iteration   3: 6502575,000 ns/op
Iteration   4: 6585823,000 ns/op
Iteration   5: 6351217,000 ns/op


Result "org.example.Main.crc64_ecma":
N = 10
mean = 6649234,500 ±(99.9%) 1037868,696 ns/op

Histogram, ns/op:
[6000000,000, 6125000,000) = 2
[6125000,000, 6250000,000) = 1
[6250000,000, 6375000,000) = 1
[6375000,000, 6500000,000) = 1
[6500000,000, 6625000,000) = 3
[6625000,000, 6750000,000) = 0
[6750000,000, 6875000,000) = 0
[6875000,000, 7000000,000) = 0
[7000000,000, 7125000,000) = 0
[7125000,000, 7250000,000) = 0
[7250000,000, 7375000,000) = 0
[7375000,000, 7500000,000) = 0
[7500000,000, 7625000,000) = 0
[7625000,000, 7750000,000) = 0
[7750000,000, 7875000,000) = 1

Percentiles, ns/op:
p(0,0000) = 6078770,000 ns/op
p(50,0000) = 6442135,000 ns/op
p(90,0000) = 7946477,400 ns/op
p(95,0000) = 7955746,000 ns/op
p(99,0000) = 7955746,000 ns/op
p(99,9000) = 7955746,000 ns/op
p(99,9900) = 7955746,000 ns/op
p(99,9990) = 7955746,000 ns/op
p(99,9999) = 7955746,000 ns/op
p(100,0000) = 7955746,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.crc64_ecma
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 32351168,000 ns/op
Iteration   2: 30583950,000 ns/op
Iteration   3: 29863191,000 ns/op
Iteration   4: 29771517,000 ns/op
Iteration   5: 29775204,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 33075334,000 ns/op
Iteration   2: 30325940,000 ns/op
Iteration   3: 30162870,000 ns/op
Iteration   4: 30357169,000 ns/op
Iteration   5: 29840617,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 31914638,000 ns/op
Iteration   2: 30489872,000 ns/op
Iteration   3: 29843784,000 ns/op
Iteration   4: 29793158,000 ns/op
Iteration   5: 29757239,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 32067138,000 ns/op
Iteration   2: 30348612,000 ns/op
Iteration   3: 30233594,000 ns/op
Iteration   4: 29801172,000 ns/op
Iteration   5: 30122864,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 32184652,000 ns/op
Iteration   2: 30252891,000 ns/op
Iteration   3: 30126862,000 ns/op
Iteration   4: 29819147,000 ns/op
Iteration   5: 29753663,000 ns/op


Result "org.example.Main.crc64_ecma":
N = 10
mean = 30471059,500 ±(99.9%) 1355150,075 ns/op

Histogram, ns/op:
[29000000,000, 29250000,000) = 0
[29250000,000, 29500000,000) = 0
[29500000,000, 29750000,000) = 0
[29750000,000, 30000000,000) = 3
[30000000,000, 30250000,000) = 3
[30250000,000, 30500000,000) = 2
[30500000,000, 30750000,000) = 0
[30750000,000, 31000000,000) = 0
[31000000,000, 31250000,000) = 0
[31250000,000, 31500000,000) = 0
[31500000,000, 31750000,000) = 0
[31750000,000, 32000000,000) = 0
[32000000,000, 32250000,000) = 2
[32250000,000, 32500000,000) = 0
[32500000,000, 32750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 29753663,000 ns/op
p(50,0000) = 30180228,000 ns/op
p(90,0000) = 32172900,600 ns/op
p(95,0000) = 32184652,000 ns/op
p(99,0000) = 32184652,000 ns/op
p(99,9000) = 32184652,000 ns/op
p(99,9900) = 32184652,000 ns/op
p(99,9990) = 32184652,000 ns/op
p(99,9999) = 32184652,000 ns/op
p(100,0000) = 32184652,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78902496,000 ns/op
Iteration   2: 202716,000 ns/op
Iteration   3: 292937,000 ns/op
Iteration   4: 304228,000 ns/op
Iteration   5: 251157,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77528656,000 ns/op
Iteration   2: 201513,000 ns/op
Iteration   3: 196603,000 ns/op
Iteration   4: 203306,000 ns/op
Iteration   5: 186564,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78373560,000 ns/op
Iteration   2: 206993,000 ns/op
Iteration   3: 182967,000 ns/op
Iteration   4: 192335,000 ns/op
Iteration   5: 185082,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79410551,000 ns/op
Iteration   2: 242060,000 ns/op
Iteration   3: 183488,000 ns/op
Iteration   4: 201934,000 ns/op
Iteration   5: 180644,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 76135759,000 ns/op
Iteration   2: 197395,000 ns/op
Iteration   3: 182286,000 ns/op
Iteration   4: 189611,000 ns/op
Iteration   5: 180663,000 ns/op


Result "org.example.Main.kangaroo12_128":
N = 10
mean = 15710439,100 ±(99.9%) 49466511,190 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 180644,000 ns/op
p(50,0000) = 193503,000 ns/op
p(90,0000) = 79083071,800 ns/op
p(95,0000) = 79410551,000 ns/op
p(99,0000) = 79410551,000 ns/op
p(99,9000) = 79410551,000 ns/op
p(99,9900) = 79410551,000 ns/op
p(99,9990) = 79410551,000 ns/op
p(99,9999) = 79410551,000 ns/op
p(100,0000) = 79410551,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79480094,000 ns/op
Iteration   2: 1123575,000 ns/op
Iteration   3: 778138,000 ns/op
Iteration   4: 705631,000 ns/op
Iteration   5: 629336,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79771998,000 ns/op
Iteration   2: 848342,000 ns/op
Iteration   3: 615058,000 ns/op
Iteration   4: 641519,000 ns/op
Iteration   5: 616953,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 80142452,000 ns/op
Iteration   2: 901202,000 ns/op
Iteration   3: 615589,000 ns/op
Iteration   4: 624506,000 ns/op
Iteration   5: 615560,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77737923,000 ns/op
Iteration   2: 827873,000 ns/op
Iteration   3: 651097,000 ns/op
Iteration   4: 732402,000 ns/op
Iteration   5: 624677,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 80228566,000 ns/op
Iteration   2: 814086,000 ns/op
Iteration   3: 622733,000 ns/op
Iteration   4: 631931,000 ns/op
Iteration   5: 607344,000 ns/op


Result "org.example.Main.kangaroo12_128":
N = 10
mean = 16347863,200 ±(99.9%) 49917082,320 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0
[75000000,000, 80000000,000) = 1
[80000000,000, 85000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 607344,000 ns/op
p(50,0000) = 691749,500 ns/op
p(90,0000) = 79979501,700 ns/op
p(95,0000) = 80228566,000 ns/op
p(99,0000) = 80228566,000 ns/op
p(99,9000) = 80228566,000 ns/op
p(99,9900) = 80228566,000 ns/op
p(99,9990) = 80228566,000 ns/op
p(99,9999) = 80228566,000 ns/op
p(100,0000) = 80228566,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 86942201,000 ns/op
Iteration   2: 4657690,000 ns/op
Iteration   3: 4548161,000 ns/op
Iteration   4: 4560986,000 ns/op
Iteration   5: 4547961,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 83800833,000 ns/op
Iteration   2: 4688468,000 ns/op
Iteration   3: 4592566,000 ns/op
Iteration   4: 4513686,000 ns/op
Iteration   5: 4501523,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 99374693,000 ns/op
Iteration   2: 4853311,000 ns/op
Iteration   3: 4640587,000 ns/op
Iteration   4: 4600992,000 ns/op
Iteration   5: 4643533,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 84158432,000 ns/op
Iteration   2: 4664673,000 ns/op
Iteration   3: 4571937,000 ns/op
Iteration   4: 4543954,000 ns/op
Iteration   5: 4726991,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 85696253,000 ns/op
Iteration   2: 4681355,000 ns/op
Iteration   3: 4597575,000 ns/op
Iteration   4: 4588468,000 ns/op
Iteration   5: 4584300,000 ns/op


Result "org.example.Main.kangaroo12_128":
N = 10
mean = 20681393,800 ±(99.9%) 51195380,091 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0
[75000000,000, 80000000,000) = 0
[80000000,000, 85000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 4543954,000 ns/op
p(50,0000) = 4631124,000 ns/op
p(90,0000) = 85542470,900 ns/op
p(95,0000) = 85696253,000 ns/op
p(99,0000) = 85696253,000 ns/op
p(99,9000) = 85696253,000 ns/op
p(99,9900) = 85696253,000 ns/op
p(99,9990) = 85696253,000 ns/op
p(99,9999) = 85696253,000 ns/op
p(100,0000) = 85696253,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_128
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 104199440,000 ns/op
Iteration   2: 22771256,000 ns/op
Iteration   3: 22732953,000 ns/op
Iteration   4: 22751207,000 ns/op
Iteration   5: 23092125,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 106042602,000 ns/op
Iteration   2: 22589841,000 ns/op
Iteration   3: 22628484,000 ns/op
Iteration   4: 22861897,000 ns/op
Iteration   5: 22579872,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 102897115,000 ns/op
Iteration   2: 22948722,000 ns/op
Iteration   3: 22835047,000 ns/op
Iteration   4: 22611332,000 ns/op
Iteration   5: 22594450,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 101586665,000 ns/op
Iteration   2: 22584902,000 ns/op
Iteration   3: 22734115,000 ns/op
Iteration   4: 22820259,000 ns/op
Iteration   5: 22604609,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 104998157,000 ns/op
Iteration   2: 22531680,000 ns/op
Iteration   3: 22707375,000 ns/op
Iteration   4: 22725338,000 ns/op
Iteration   5: 22649634,000 ns/op


Result "org.example.Main.kangaroo12_128":
N = 10
mean = 38794273,400 ±(99.9%) 51407856,051 ns/op

Histogram, ns/op:
[ 20000000,000,  25000000,000) = 8
[ 25000000,000,  30000000,000) = 0
[ 30000000,000,  35000000,000) = 0
[ 35000000,000,  40000000,000) = 0
[ 40000000,000,  45000000,000) = 0
[ 45000000,000,  50000000,000) = 0
[ 50000000,000,  55000000,000) = 0
[ 55000000,000,  60000000,000) = 0
[ 60000000,000,  65000000,000) = 0
[ 65000000,000,  70000000,000) = 0
[ 70000000,000,  75000000,000) = 0
[ 75000000,000,  80000000,000) = 0
[ 80000000,000,  85000000,000) = 0
[ 85000000,000,  90000000,000) = 0
[ 90000000,000,  95000000,000) = 0
[ 95000000,000, 100000000,000) = 0
[100000000,000, 105000000,000) = 2

Percentiles, ns/op:
p(0,0000) = 22531680,000 ns/op
p(50,0000) = 22716356,500 ns/op
p(90,0000) = 104657007,800 ns/op
p(95,0000) = 104998157,000 ns/op
p(99,0000) = 104998157,000 ns/op
p(99,9000) = 104998157,000 ns/op
p(99,9900) = 104998157,000 ns/op
p(99,9990) = 104998157,000 ns/op
p(99,9999) = 104998157,000 ns/op
p(100,0000) = 104998157,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77148603,000 ns/op
Iteration   2: 209999,000 ns/op
Iteration   3: 199780,000 ns/op
Iteration   4: 239095,000 ns/op
Iteration   5: 197445,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79103427,000 ns/op
Iteration   2: 199349,000 ns/op
Iteration   3: 189199,000 ns/op
Iteration   4: 186304,000 ns/op
Iteration   5: 185883,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 77353813,000 ns/op
Iteration   2: 203878,000 ns/op
Iteration   3: 189250,000 ns/op
Iteration   4: 196583,000 ns/op
Iteration   5: 189881,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78826371,000 ns/op
Iteration   2: 202896,000 ns/op
Iteration   3: 182567,000 ns/op
Iteration   4: 191113,000 ns/op
Iteration   5: 183929,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78777718,000 ns/op
Iteration   2: 207555,000 ns/op
Iteration   3: 223996,000 ns/op
Iteration   4: 227623,000 ns/op
Iteration   5: 192035,000 ns/op


Result "org.example.Main.kangaroo12_256":
N = 10
mean = 15921580,300 ±(99.9%) 50104342,085 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 182567,000 ns/op
p(50,0000) = 205225,500 ns/op
p(90,0000) = 78821505,700 ns/op
p(95,0000) = 78826371,000 ns/op
p(99,0000) = 78826371,000 ns/op
p(99,9000) = 78826371,000 ns/op
p(99,9900) = 78826371,000 ns/op
p(99,9990) = 78826371,000 ns/op
p(99,9999) = 78826371,000 ns/op
p(100,0000) = 78826371,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79687467,000 ns/op
Iteration   2: 817493,000 ns/op
Iteration   3: 634235,000 ns/op
Iteration   4: 651719,000 ns/op
Iteration   5: 609468,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 79667238,000 ns/op
Iteration   2: 859463,000 ns/op
Iteration   3: 618996,000 ns/op
Iteration   4: 740276,000 ns/op
Iteration   5: 615950,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 80641219,000 ns/op
Iteration   2: 844915,000 ns/op
Iteration   3: 614838,000 ns/op
Iteration   4: 649474,000 ns/op
Iteration   5: 612123,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78370274,000 ns/op
Iteration   2: 918345,000 ns/op
Iteration   3: 627963,000 ns/op
Iteration   4: 688508,000 ns/op
Iteration   5: 619347,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 78611582,000 ns/op
Iteration   2: 979601,000 ns/op
Iteration   3: 617653,000 ns/op
Iteration   4: 641969,000 ns/op
Iteration   5: 615198,000 ns/op


Result "org.example.Main.kangaroo12_256":
N = 10
mean = 16269044,000 ±(99.9%) 49580032,549 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0

Percentiles, ns/op:
p(0,0000) = 615198,000 ns/op
p(50,0000) = 665238,500 ns/op
p(90,0000) = 78587451,200 ns/op
p(95,0000) = 78611582,000 ns/op
p(99,0000) = 78611582,000 ns/op
p(99,9000) = 78611582,000 ns/op
p(99,9900) = 78611582,000 ns/op
p(99,9990) = 78611582,000 ns/op
p(99,9999) = 78611582,000 ns/op
p(100,0000) = 78611582,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 87653743,000 ns/op
Iteration   2: 4684681,000 ns/op
Iteration   3: 4578539,000 ns/op
Iteration   4: 4539505,000 ns/op
Iteration   5: 4526630,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 84538594,000 ns/op
Iteration   2: 4715319,000 ns/op
Iteration   3: 4617774,000 ns/op
Iteration   4: 4582506,000 ns/op
Iteration   5: 4578900,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 85888749,000 ns/op
Iteration   2: 4683168,000 ns/op
Iteration   3: 4803267,000 ns/op
Iteration   4: 4521831,000 ns/op
Iteration   5: 4522844,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 84276736,000 ns/op
Iteration   2: 4689250,000 ns/op
Iteration   3: 4590632,000 ns/op
Iteration   4: 4548492,000 ns/op
Iteration   5: 4544995,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 84766516,000 ns/op
Iteration   2: 4700771,000 ns/op
Iteration   3: 4588018,000 ns/op
Iteration   4: 4531770,000 ns/op
Iteration   5: 4557229,000 ns/op


Result "org.example.Main.kangaroo12_256":
N = 10
mean = 20579440,900 ±(99.9%) 50950707,161 ns/op

Histogram, ns/op:
[       0,000,  5000000,000) = 8
[ 5000000,000, 10000000,000) = 0
[10000000,000, 15000000,000) = 0
[15000000,000, 20000000,000) = 0
[20000000,000, 25000000,000) = 0
[25000000,000, 30000000,000) = 0
[30000000,000, 35000000,000) = 0
[35000000,000, 40000000,000) = 0
[40000000,000, 45000000,000) = 0
[45000000,000, 50000000,000) = 0
[50000000,000, 55000000,000) = 0
[55000000,000, 60000000,000) = 0
[60000000,000, 65000000,000) = 0
[65000000,000, 70000000,000) = 0
[70000000,000, 75000000,000) = 0
[75000000,000, 80000000,000) = 0
[80000000,000, 85000000,000) = 2

Percentiles, ns/op:
p(0,0000) = 4531770,000 ns/op
p(50,0000) = 4589325,000 ns/op
p(90,0000) = 84717538,000 ns/op
p(95,0000) = 84766516,000 ns/op
p(99,0000) = 84766516,000 ns/op
p(99,9000) = 84766516,000 ns/op
p(99,9900) = 84766516,000 ns/op
p(99,9990) = 84766516,000 ns/op
p(99,9999) = 84766516,000 ns/op
p(100,0000) = 84766516,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.kangaroo12_256
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 103025839,000 ns/op
Iteration   2: 22546017,000 ns/op
Iteration   3: 22483328,000 ns/op
Iteration   4: 26914538,000 ns/op
Iteration   5: 22607754,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 105256307,000 ns/op
Iteration   2: 22648732,000 ns/op
Iteration   3: 22615039,000 ns/op
Iteration   4: 22697225,000 ns/op
Iteration   5: 22527994,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 102144295,000 ns/op
Iteration   2: 22681826,000 ns/op
Iteration   3: 22632141,000 ns/op
Iteration   4: 22589530,000 ns/op
Iteration   5: 22607013,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 103371336,000 ns/op
Iteration   2: 22663009,000 ns/op
Iteration   3: 22626461,000 ns/op
Iteration   4: 22770393,000 ns/op
Iteration   5: 22698317,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 105027061,000 ns/op
Iteration   2: 22698217,000 ns/op
Iteration   3: 22582226,000 ns/op
Iteration   4: 22628464,000 ns/op
Iteration   5: 22571827,000 ns/op


Result "org.example.Main.kangaroo12_256":
N = 10
mean = 38963731,100 ±(99.9%) 51984268,304 ns/op

Histogram, ns/op:
[ 20000000,000,  25000000,000) = 8
[ 25000000,000,  30000000,000) = 0
[ 30000000,000,  35000000,000) = 0
[ 35000000,000,  40000000,000) = 0
[ 40000000,000,  45000000,000) = 0
[ 45000000,000,  50000000,000) = 0
[ 50000000,000,  55000000,000) = 0
[ 55000000,000,  60000000,000) = 0
[ 60000000,000,  65000000,000) = 0
[ 65000000,000,  70000000,000) = 0
[ 70000000,000,  75000000,000) = 0
[ 75000000,000,  80000000,000) = 0
[ 80000000,000,  85000000,000) = 0
[ 85000000,000,  90000000,000) = 0
[ 90000000,000,  95000000,000) = 0
[ 95000000,000, 100000000,000) = 0
[100000000,000, 105000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 22571827,000 ns/op
p(50,0000) = 22680613,000 ns/op
p(90,0000) = 104861488,500 ns/op
p(95,0000) = 105027061,000 ns/op
p(99,0000) = 105027061,000 ns/op
p(99,9000) = 105027061,000 ns/op
p(99,9900) = 105027061,000 ns/op
p(99,9990) = 105027061,000 ns/op
p(99,9999) = 105027061,000 ns/op
p(100,0000) = 105027061,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2734556,000 ns/op
Iteration   2: 376515,000 ns/op
Iteration   3: 301733,000 ns/op
Iteration   4: 265224,000 ns/op
Iteration   5: 235788,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2864523,000 ns/op
Iteration   2: 307343,000 ns/op
Iteration   3: 188899,000 ns/op
Iteration   4: 171776,000 ns/op
Iteration   5: 174411,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 2787677,000 ns/op
Iteration   2: 337882,000 ns/op
Iteration   3: 199599,000 ns/op
Iteration   4: 177848,000 ns/op
Iteration   5: 177046,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3058992,000 ns/op
Iteration   2: 362258,000 ns/op
Iteration   3: 249243,000 ns/op
Iteration   4: 170644,000 ns/op
Iteration   5: 170093,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3045466,000 ns/op
Iteration   2: 335648,000 ns/op
Iteration   3: 255686,000 ns/op
Iteration   4: 208106,000 ns/op
Iteration   5: 206171,000 ns/op


Result "org.example.Main.murmur64":
N = 10
mean = 806230,700 ±(99.9%) 1792220,185 ns/op

Histogram, ns/op:
[      0,000,  250000,000) = 5
[ 250000,000,  500000,000) = 3
[ 500000,000,  750000,000) = 0
[ 750000,000, 1000000,000) = 0
[1000000,000, 1250000,000) = 0
[1250000,000, 1500000,000) = 0
[1500000,000, 1750000,000) = 0
[1750000,000, 2000000,000) = 0
[2000000,000, 2250000,000) = 0
[2250000,000, 2500000,000) = 0
[2500000,000, 2750000,000) = 0
[2750000,000, 3000000,000) = 0
[3000000,000, 3250000,000) = 2
[3250000,000, 3500000,000) = 0
[3500000,000, 3750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 170093,000 ns/op
p(50,0000) = 252464,500 ns/op
p(90,0000) = 3057639,400 ns/op
p(95,0000) = 3058992,000 ns/op
p(99,0000) = 3058992,000 ns/op
p(99,9000) = 3058992,000 ns/op
p(99,9900) = 3058992,000 ns/op
p(99,9990) = 3058992,000 ns/op
p(99,9999) = 3058992,000 ns/op
p(100,0000) = 3058992,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 4031249,000 ns/op
Iteration   2: 1121090,000 ns/op
Iteration   3: 301283,000 ns/op
Iteration   4: 287025,000 ns/op
Iteration   5: 269703,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 4419728,000 ns/op
Iteration   2: 1104549,000 ns/op
Iteration   3: 331259,000 ns/op
Iteration   4: 315860,000 ns/op
Iteration   5: 285833,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 4096333,000 ns/op
Iteration   2: 1275383,000 ns/op
Iteration   3: 303757,000 ns/op
Iteration   4: 288899,000 ns/op
Iteration   5: 273189,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 4323485,000 ns/op
Iteration   2: 1073720,000 ns/op
Iteration   3: 317794,000 ns/op
Iteration   4: 330718,000 ns/op
Iteration   5: 275363,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 4303306,000 ns/op
Iteration   2: 1100131,000 ns/op
Iteration   3: 434005,000 ns/op
Iteration   4: 306813,000 ns/op
Iteration   5: 274401,000 ns/op


Result "org.example.Main.murmur64":
N = 10
mean = 1273973,600 ±(99.9%) 2468236,550 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 6
[ 500000,000, 1000000,000) = 0
[1000000,000, 1500000,000) = 2
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 2

Percentiles, ns/op:
p(0,0000) = 274401,000 ns/op
p(50,0000) = 382361,500 ns/op
p(90,0000) = 4321467,100 ns/op
p(95,0000) = 4323485,000 ns/op
p(99,0000) = 4323485,000 ns/op
p(99,9000) = 4323485,000 ns/op
p(99,9900) = 4323485,000 ns/op
p(99,9990) = 4323485,000 ns/op
p(99,9999) = 4323485,000 ns/op
p(100,0000) = 4323485,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7324056,000 ns/op
Iteration   2: 731760,000 ns/op
Iteration   3: 2152500,000 ns/op
Iteration   4: 2134205,000 ns/op
Iteration   5: 2160896,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7005270,000 ns/op
Iteration   2: 710199,000 ns/op
Iteration   3: 2124126,000 ns/op
Iteration   4: 2144104,000 ns/op
Iteration   5: 514057,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7223203,000 ns/op
Iteration   2: 708436,000 ns/op
Iteration   3: 2237020,000 ns/op
Iteration   4: 2148412,000 ns/op
Iteration   5: 510510,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 6997916,000 ns/op
Iteration   2: 698236,000 ns/op
Iteration   3: 2096804,000 ns/op
Iteration   4: 2114858,000 ns/op
Iteration   5: 510109,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 6939586,000 ns/op
Iteration   2: 715730,000 ns/op
Iteration   3: 2126100,000 ns/op
Iteration   4: 2129926,000 ns/op
Iteration   5: 511212,000 ns/op


Result "org.example.Main.murmur64":
N = 10
mean = 2484047,700 ±(99.9%) 3733032,611 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 0
[ 500000,000, 1000000,000) = 4
[1000000,000, 1500000,000) = 0
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 4
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 0
[5500000,000, 6000000,000) = 0
[6000000,000, 6500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 510109,000 ns/op
p(50,0000) = 2105831,000 ns/op
p(90,0000) = 6992083,000 ns/op
p(95,0000) = 6997916,000 ns/op
p(99,0000) = 6997916,000 ns/op
p(99,9000) = 6997916,000 ns/op
p(99,9900) = 6997916,000 ns/op
p(99,9990) = 6997916,000 ns/op
p(99,9999) = 6997916,000 ns/op
p(100,0000) = 6997916,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.murmur64
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 10268911,000 ns/op
Iteration   2: 5478740,000 ns/op
Iteration   3: 2754313,000 ns/op
Iteration   4: 2390592,000 ns/op
Iteration   5: 2359644,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 9753432,000 ns/op
Iteration   2: 6149283,000 ns/op
Iteration   3: 2800691,000 ns/op
Iteration   4: 2395481,000 ns/op
Iteration   5: 2371145,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 9913566,000 ns/op
Iteration   2: 6215981,000 ns/op
Iteration   3: 2762669,000 ns/op
Iteration   4: 2404539,000 ns/op
Iteration   5: 2425248,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 9777858,000 ns/op
Iteration   2: 6072698,000 ns/op
Iteration   3: 2795842,000 ns/op
Iteration   4: 2399299,000 ns/op
Iteration   5: 2533333,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 9842510,000 ns/op
Iteration   2: 6181345,000 ns/op
Iteration   3: 2779772,000 ns/op
Iteration   4: 2412363,000 ns/op
Iteration   5: 2379220,000 ns/op


Result "org.example.Main.murmur64":
N = 10
mean = 4717424,000 ±(99.9%) 4625003,123 ns/op

Histogram, ns/op:
[ 2000000,000,  2500000,000) = 3
[ 2500000,000,  3000000,000) = 3
[ 3000000,000,  3500000,000) = 0
[ 3500000,000,  4000000,000) = 0
[ 4000000,000,  4500000,000) = 0
[ 4500000,000,  5000000,000) = 0
[ 5000000,000,  5500000,000) = 0
[ 5500000,000,  6000000,000) = 0
[ 6000000,000,  6500000,000) = 2
[ 6500000,000,  7000000,000) = 0
[ 7000000,000,  7500000,000) = 0
[ 7500000,000,  8000000,000) = 0
[ 8000000,000,  8500000,000) = 0
[ 8500000,000,  9000000,000) = 0
[ 9000000,000,  9500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 2379220,000 ns/op
p(50,0000) = 2787807,000 ns/op
p(90,0000) = 9836044,800 ns/op
p(95,0000) = 9842510,000 ns/op
p(99,0000) = 9842510,000 ns/op
p(99,9000) = 9842510,000 ns/op
p(99,9900) = 9842510,000 ns/op
p(99,9990) = 9842510,000 ns/op
p(99,9999) = 9842510,000 ns/op
p(100,0000) = 9842510,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha128
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more



# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: <failure>

java.lang.IllegalStateException: MessageDigest SHA-128 not available
at org.example.Hashers.sha128(Hashers.java:96)
at org.example.Main.sha128(Main.java:108)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_ss_jmhStub(Main_sha128_jmhTest.java:412)
at org.example.jmh_generated.Main_sha128_jmhTest.sha128_SingleShotTime(Main_sha128_jmhTest.java:368)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
at java.base/java.lang.reflect.Method.invoke(Method.java:565)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1095)
at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:619)
at java.base/java.lang.Thread.run(Thread.java:1447)
Caused by: java.security.NoSuchAlgorithmException: SHA-128 MessageDigest not available
at java.base/sun.security.jca.GetInstance.getInstance(GetInstance.java:147)
at java.base/java.security.MessageDigest.getInstance(MessageDigest.java:185)
at org.example.Hashers.sha128(Hashers.java:92)
... 13 more




# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3541770,000 ns/op
Iteration   2: 679160,000 ns/op
Iteration   3: 678499,000 ns/op
Iteration   4: 672758,000 ns/op
Iteration   5: 850075,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3325137,000 ns/op
Iteration   2: 734536,000 ns/op
Iteration   3: 735979,000 ns/op
Iteration   4: 766376,000 ns/op
Iteration   5: 778159,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3117714,000 ns/op
Iteration   2: 734746,000 ns/op
Iteration   3: 717393,000 ns/op
Iteration   4: 753041,000 ns/op
Iteration   5: 735788,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3241369,000 ns/op
Iteration   2: 735447,000 ns/op
Iteration   3: 757779,000 ns/op
Iteration   4: 755095,000 ns/op
Iteration   5: 779191,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 3109658,000 ns/op
Iteration   2: 724757,000 ns/op
Iteration   3: 695051,000 ns/op
Iteration   4: 666136,000 ns/op
Iteration   5: 668801,000 ns/op


Result "org.example.Main.sha256":
N = 10
mean = 1213328,400 ±(99.9%) 1565225,214 ns/op

Histogram, ns/op:
[      0,000,  250000,000) = 0
[ 250000,000,  500000,000) = 0
[ 500000,000,  750000,000) = 5
[ 750000,000, 1000000,000) = 3
[1000000,000, 1250000,000) = 0
[1250000,000, 1500000,000) = 0
[1500000,000, 1750000,000) = 0
[1750000,000, 2000000,000) = 0
[2000000,000, 2250000,000) = 0
[2250000,000, 2500000,000) = 0
[2500000,000, 2750000,000) = 0
[2750000,000, 3000000,000) = 0
[3000000,000, 3250000,000) = 2
[3250000,000, 3500000,000) = 0
[3500000,000, 3750000,000) = 0

Percentiles, ns/op:
p(0,0000) = 666136,000 ns/op
p(50,0000) = 745271,000 ns/op
p(90,0000) = 3228197,900 ns/op
p(95,0000) = 3241369,000 ns/op
p(99,0000) = 3241369,000 ns/op
p(99,9000) = 3241369,000 ns/op
p(99,9900) = 3241369,000 ns/op
p(99,9990) = 3241369,000 ns/op
p(99,9999) = 3241369,000 ns/op
p(100,0000) = 3241369,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 6961667,000 ns/op
Iteration   2: 267147,000 ns/op
Iteration   3: 319297,000 ns/op
Iteration   4: 260745,000 ns/op
Iteration   5: 274291,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7590793,000 ns/op
Iteration   2: 266266,000 ns/op
Iteration   3: 294189,000 ns/op
Iteration   4: 286615,000 ns/op
Iteration   5: 281816,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 6709268,000 ns/op
Iteration   2: 263611,000 ns/op
Iteration   3: 327843,000 ns/op
Iteration   4: 326270,000 ns/op
Iteration   5: 251498,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 6563781,000 ns/op
Iteration   2: 285352,000 ns/op
Iteration   3: 292906,000 ns/op
Iteration   4: 275684,000 ns/op
Iteration   5: 283318,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 7947751,000 ns/op
Iteration   2: 273079,000 ns/op
Iteration   3: 279000,000 ns/op
Iteration   4: 272158,000 ns/op
Iteration   5: 294610,000 ns/op


Result "org.example.Main.sha256":
N = 10
mean = 1676763,900 ±(99.9%) 4472740,797 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 8
[ 500000,000, 1000000,000) = 0
[1000000,000, 1500000,000) = 0
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 0
[5500000,000, 6000000,000) = 0
[6000000,000, 6500000,000) = 0
[6500000,000, 7000000,000) = 1
[7000000,000, 7500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 272158,000 ns/op
p(50,0000) = 284335,000 ns/op
p(90,0000) = 7809354,000 ns/op
p(95,0000) = 7947751,000 ns/op
p(99,0000) = 7947751,000 ns/op
p(99,9000) = 7947751,000 ns/op
p(99,9900) = 7947751,000 ns/op
p(99,9990) = 7947751,000 ns/op
p(99,9999) = 7947751,000 ns/op
p(100,0000) = 7947751,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 9346829,000 ns/op
Iteration   2: 1812944,000 ns/op
Iteration   3: 1809969,000 ns/op
Iteration   4: 1786274,000 ns/op
Iteration   5: 1771787,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 10212925,000 ns/op
Iteration   2: 1866025,000 ns/op
Iteration   3: 1869111,000 ns/op
Iteration   4: 1834175,000 ns/op
Iteration   5: 2017263,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 8558531,000 ns/op
Iteration   2: 1790242,000 ns/op
Iteration   3: 1792927,000 ns/op
Iteration   4: 1766496,000 ns/op
Iteration   5: 1758691,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 8045346,000 ns/op
Iteration   2: 1776285,000 ns/op
Iteration   3: 1793237,000 ns/op
Iteration   4: 1739215,000 ns/op
Iteration   5: 1967829,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 8301983,000 ns/op
Iteration   2: 1774611,000 ns/op
Iteration   3: 1797074,000 ns/op
Iteration   4: 1769222,000 ns/op
Iteration   5: 1761698,000 ns/op


Result "org.example.Main.sha256":
N = 10
mean = 3072650,000 ±(99.9%) 4066720,872 ns/op

Histogram, ns/op:
[1000000,000, 1500000,000) = 0
[1500000,000, 2000000,000) = 8
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 0
[5500000,000, 6000000,000) = 0
[6000000,000, 6500000,000) = 0
[6500000,000, 7000000,000) = 0
[7000000,000, 7500000,000) = 0
[7500000,000, 8000000,000) = 0
[8000000,000, 8500000,000) = 2

Percentiles, ns/op:
p(0,0000) = 1739215,000 ns/op
p(50,0000) = 1784761,000 ns/op
p(90,0000) = 8276319,300 ns/op
p(95,0000) = 8301983,000 ns/op
p(99,0000) = 8301983,000 ns/op
p(99,9000) = 8301983,000 ns/op
p(99,9900) = 8301983,000 ns/op
p(99,9990) = 8301983,000 ns/op
p(99,9999) = 8301983,000 ns/op
p(100,0000) = 8301983,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.sha256
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 15833002,000 ns/op
Iteration   2: 8936660,000 ns/op
Iteration   3: 8941889,000 ns/op
Iteration   4: 8895170,000 ns/op
Iteration   5: 8928034,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 15852960,000 ns/op
Iteration   2: 8838873,000 ns/op
Iteration   3: 8777076,000 ns/op
Iteration   4: 8729075,000 ns/op
Iteration   5: 8674491,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 17180503,000 ns/op
Iteration   2: 9097175,000 ns/op
Iteration   3: 8903506,000 ns/op
Iteration   4: 8875794,000 ns/op
Iteration   5: 8848461,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 17954524,000 ns/op
Iteration   2: 8842991,000 ns/op
Iteration   3: 8792024,000 ns/op
Iteration   4: 8771185,000 ns/op
Iteration   5: 8738894,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: 16634785,000 ns/op
Iteration   2: 8795161,000 ns/op
Iteration   3: 8737701,000 ns/op
Iteration   4: 8687015,000 ns/op
Iteration   5: 8686925,000 ns/op


Result "org.example.Main.sha256":
N = 10
mean = 10464120,500 ±(99.9%) 5463460,999 ns/op

Histogram, ns/op:
[ 8000000,000,  9000000,000) = 8
[ 9000000,000, 10000000,000) = 0
[10000000,000, 11000000,000) = 0
[11000000,000, 12000000,000) = 0
[12000000,000, 13000000,000) = 0
[13000000,000, 14000000,000) = 0
[14000000,000, 15000000,000) = 0
[15000000,000, 16000000,000) = 0
[16000000,000, 17000000,000) = 1

Percentiles, ns/op:
p(0,0000) = 8686925,000 ns/op
p(50,0000) = 8781604,500 ns/op
p(90,0000) = 17822550,100 ns/op
p(95,0000) = 17954524,000 ns/op
p(99,0000) = 17954524,000 ns/op
p(99,9000) = 17954524,000 ns/op
p(99,9900) = 17954524,000 ns/op
p(99,9990) = 17954524,000 ns/op
p(99,9999) = 17954524,000 ns/op
p(100,0000) = 17954524,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 64K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5331590,000 ns/op
Iteration   2: 7384,000 ns/op
Iteration   3: 5581,000 ns/op
Iteration   4: 6782,000 ns/op
Iteration   5: 6632,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5605210,000 ns/op
Iteration   2: 7714,000 ns/op
Iteration   3: 7324,000 ns/op
Iteration   4: 7133,000 ns/op
Iteration   5: 7074,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5598768,000 ns/op
Iteration   2: 8176,000 ns/op
Iteration   3: 6322,000 ns/op
Iteration   4: 5941,000 ns/op
Iteration   5: 7575,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5644083,000 ns/op
Iteration   2: 8296,000 ns/op
Iteration   3: 6171,000 ns/op
Iteration   4: 5931,000 ns/op
Iteration   5: 6021,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5633784,000 ns/op
Iteration   2: 7384,000 ns/op
Iteration   3: 6062,000 ns/op
Iteration   4: 5721,000 ns/op
Iteration   5: 5611,000 ns/op


Result "org.example.Main.xxhash64":
N = 10
mean = 1132906,400 ±(99.9%) 3590489,040 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 8
[ 500000,000, 1000000,000) = 0
[1000000,000, 1500000,000) = 0
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 0

Percentiles, ns/op:
p(0,0000) =   5611,000 ns/op
p(50,0000) =   6116,500 ns/op
p(90,0000) = 5643053,100 ns/op
p(95,0000) = 5644083,000 ns/op
p(99,0000) = 5644083,000 ns/op
p(99,9000) = 5644083,000 ns/op
p(99,9900) = 5644083,000 ns/op
p(99,9990) = 5644083,000 ns/op
p(99,9999) = 5644083,000 ns/op
p(100,0000) = 5644083,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 512K)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5815269,000 ns/op
Iteration   2: 42411,000 ns/op
Iteration   3: 45997,000 ns/op
Iteration   4: 46017,000 ns/op
Iteration   5: 45958,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5753872,000 ns/op
Iteration   2: 36680,000 ns/op
Iteration   3: 34987,000 ns/op
Iteration   4: 34686,000 ns/op
Iteration   5: 34666,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5223324,000 ns/op
Iteration   2: 40417,000 ns/op
Iteration   3: 34816,000 ns/op
Iteration   4: 34596,000 ns/op
Iteration   5: 34686,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5288528,000 ns/op
Iteration   2: 36659,000 ns/op
Iteration   3: 35187,000 ns/op
Iteration   4: 34857,000 ns/op
Iteration   5: 34726,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5794360,000 ns/op
Iteration   2: 37041,000 ns/op
Iteration   3: 35047,000 ns/op
Iteration   4: 34907,000 ns/op
Iteration   5: 34726,000 ns/op


Result "org.example.Main.xxhash64":
N = 10
mean = 1136603,800 ±(99.9%) 3514485,009 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 8
[ 500000,000, 1000000,000) = 0
[1000000,000, 1500000,000) = 0
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 1

Percentiles, ns/op:
p(0,0000) =  34726,000 ns/op
p(50,0000) =  35117,000 ns/op
p(90,0000) = 5743776,800 ns/op
p(95,0000) = 5794360,000 ns/op
p(99,0000) = 5794360,000 ns/op
p(99,9000) = 5794360,000 ns/op
p(99,9900) = 5794360,000 ns/op
p(99,9990) = 5794360,000 ns/op
p(99,9999) = 5794360,000 ns/op
p(100,0000) = 5794360,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 4M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5818055,000 ns/op
Iteration   2: 339766,000 ns/op
Iteration   3: 328454,000 ns/op
Iteration   4: 268600,000 ns/op
Iteration   5: 267248,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5808406,000 ns/op
Iteration   2: 283829,000 ns/op
Iteration   3: 275032,000 ns/op
Iteration   4: 269512,000 ns/op
Iteration   5: 269532,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5995571,000 ns/op
Iteration   2: 273589,000 ns/op
Iteration   3: 274161,000 ns/op
Iteration   4: 271375,000 ns/op
Iteration   5: 271075,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5529886,000 ns/op
Iteration   2: 270935,000 ns/op
Iteration   3: 338273,000 ns/op
Iteration   4: 338282,000 ns/op
Iteration   5: 271195,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

5648352,000 ns/op
Iteration   2: 312764,000 ns/op
Iteration   3: 339304,000 ns/op
Iteration   4: 307815,000 ns/op
Iteration   5: 269492,000 ns/op


Result "org.example.Main.xxhash64":
N = 10
mean = 1362629,800 ±(99.9%) 3368274,978 ns/op

Histogram, ns/op:
[      0,000,  500000,000) = 8
[ 500000,000, 1000000,000) = 0
[1000000,000, 1500000,000) = 0
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 269492,000 ns/op
p(50,0000) = 325518,500 ns/op
p(90,0000) = 5636505,400 ns/op
p(95,0000) = 5648352,000 ns/op
p(99,0000) = 5648352,000 ns/op
p(99,9000) = 5648352,000 ns/op
p(99,9900) = 5648352,000 ns/op
p(99,9990) = 5648352,000 ns/op
p(99,9999) = 5648352,000 ns/op
p(100,0000) = 5648352,000 ns/op


# JMH version: 1.35
# VM version: JDK 24.0.1, OpenJDK 64-Bit Server VM, 24.0.1+9-FR
# VM invoker: /home/hwak/.jdks/corretto-24.0.1/bin/java
# VM options: -javaagent:/home/hwak/snap/idea-IU-251.26094.121/lib/idea_rt.jar=44739 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 5 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.xxhash64
# Parameters: (size = 20M)

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

7014517,000 ns/op
Iteration   2: 1325669,000 ns/op
Iteration   3: 1333413,000 ns/op
Iteration   4: 1330238,000 ns/op
Iteration   5: 1329917,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 2 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

7827482,000 ns/op
Iteration   2: 1397906,000 ns/op
Iteration   3: 1389130,000 ns/op
Iteration   4: 1396564,000 ns/op
Iteration   5: 1383669,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 3 of 3
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

7454042,000 ns/op
Iteration   2: 1347771,000 ns/op
Iteration   3: 1347670,000 ns/op
Iteration   4: 1336399,000 ns/op
Iteration   5: 1339124,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

7547741,000 ns/op
Iteration   2: 1372878,000 ns/op
Iteration   3: 1388108,000 ns/op
Iteration   4: 1314638,000 ns/op
Iteration   5: 1313926,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 2
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
Iteration   1: WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::loadLibrary has been called by net.jpountz.util.Native in an unnamed module (file:/home/hwak/.m2/repository/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

6903767,000 ns/op
Iteration   2: 1332461,000 ns/op
Iteration   3: 1346879,000 ns/op
Iteration   4: 1326962,000 ns/op
Iteration   5: 1336940,000 ns/op


Result "org.example.Main.xxhash64":
N = 10
mean = 2518430,000 ±(99.9%) 3758065,621 ns/op

Histogram, ns/op:
[1000000,000, 1500000,000) = 8
[1500000,000, 2000000,000) = 0
[2000000,000, 2500000,000) = 0
[2500000,000, 3000000,000) = 0
[3000000,000, 3500000,000) = 0
[3500000,000, 4000000,000) = 0
[4000000,000, 4500000,000) = 0
[4500000,000, 5000000,000) = 0
[5000000,000, 5500000,000) = 0
[5500000,000, 6000000,000) = 0
[6000000,000, 6500000,000) = 0
[6500000,000, 7000000,000) = 1
[7000000,000, 7500000,000) = 0

Percentiles, ns/op:
p(0,0000) = 1313926,000 ns/op
p(50,0000) = 1341909,500 ns/op
p(90,0000) = 7483343,600 ns/op
p(95,0000) = 7547741,000 ns/op
p(99,0000) = 7547741,000 ns/op
p(99,9000) = 7547741,000 ns/op
p(99,9900) = 7547741,000 ns/op
p(99,9990) = 7547741,000 ns/op
p(99,9999) = 7547741,000 ns/op
p(100,0000) = 7547741,000 ns/op


# Run complete. Total time: 15:06:45

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                   (size)    Mode      Cnt          Score          Error   Units
Main.blake2b_128                               64K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.blake2b_128                              512K   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.blake2b_128                                4M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.blake2b_128                               20M   thrpt       10         ≈ 10⁻⁸                 ops/ns
Main.blake2b_256                               64K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.blake2b_256                              512K   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.blake2b_256                                4M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.blake2b_256                               20M   thrpt       10         ≈ 10⁻⁸                 ops/ns
Main.crc32                                     64K   thrpt       10          0,001 ±        0,001  ops/ns
Main.crc32                                    512K   thrpt       10         ≈ 10⁻⁴                 ops/ns
Main.crc32                                      4M   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.crc32                                     20M   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.crc64_ecma                                64K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.crc64_ecma                               512K   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.crc64_ecma                                 4M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.crc64_ecma                                20M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.kangaroo12_128                            64K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.kangaroo12_128                           512K   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.kangaroo12_128                             4M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.kangaroo12_128                            20M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.kangaroo12_256                            64K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.kangaroo12_256                           512K   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.kangaroo12_256                             4M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.kangaroo12_256                            20M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.murmur64                                  64K   thrpt       10         ≈ 10⁻⁴                 ops/ns
Main.murmur64                                 512K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.murmur64                                   4M   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.murmur64                                  20M   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.sha256                                    64K   thrpt       10         ≈ 10⁻⁴                 ops/ns
Main.sha256                                   512K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.sha256                                     4M   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.sha256                                    20M   thrpt       10         ≈ 10⁻⁷                 ops/ns
Main.xxhash64                                  64K   thrpt       10         ≈ 10⁻⁴                 ops/ns
Main.xxhash64                                 512K   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.xxhash64                                   4M   thrpt       10         ≈ 10⁻⁵                 ops/ns
Main.xxhash64                                  20M   thrpt       10         ≈ 10⁻⁶                 ops/ns
Main.blake2b_128                               64K    avgt       10     124337,342 ±      430,339   ns/op
Main.blake2b_128                              512K    avgt       10    1002756,722 ±    16879,774   ns/op
Main.blake2b_128                                4M    avgt       10    7956152,488 ±    17331,084   ns/op
Main.blake2b_128                               20M    avgt       10   39803930,784 ±   295909,749   ns/op
Main.blake2b_256                               64K    avgt       10     124049,213 ±      179,406   ns/op
Main.blake2b_256                              512K    avgt       10     994826,132 ±     2243,924   ns/op
Main.blake2b_256                                4M    avgt       10    7964348,020 ±    17746,659   ns/op
Main.blake2b_256                               20M    avgt       10   39862122,662 ±   257661,212   ns/op
Main.crc32                                     64K    avgt       10        783,985 ±        2,154   ns/op
Main.crc32                                    512K    avgt       10       6375,348 ±      113,229   ns/op
Main.crc32                                      4M    avgt       10      51312,485 ±      270,168   ns/op
Main.crc32                                     20M    avgt       10     262401,012 ±     3451,377   ns/op
Main.crc64_ecma                                64K    avgt       10      92506,916 ±      250,320   ns/op
Main.crc64_ecma                               512K    avgt       10     742388,032 ±     2760,907   ns/op
Main.crc64_ecma                                 4M    avgt       10    5949368,765 ±    16243,953   ns/op
Main.crc64_ecma                                20M    avgt       10   29765035,667 ±    87655,180   ns/op
Main.kangaroo12_128                            64K    avgt       10      69929,620 ±      198,023   ns/op
Main.kangaroo12_128                           512K    avgt       10     557338,652 ±     1325,176   ns/op
Main.kangaroo12_128                             4M    avgt       10    4755771,055 ±    18107,740   ns/op
Main.kangaroo12_128                            20M    avgt       10   23704545,379 ±    43537,892   ns/op
Main.kangaroo12_256                            64K    avgt       10      69699,067 ±       97,670   ns/op
Main.kangaroo12_256                           512K    avgt       10     555872,511 ±      933,805   ns/op
Main.kangaroo12_256                             4M    avgt       10    4746988,631 ±     9796,385   ns/op
Main.kangaroo12_256                            20M    avgt       10   23732701,868 ±    27513,737   ns/op
Main.murmur64                                  64K    avgt       10       9623,663 ±       15,228   ns/op
Main.murmur64                                 512K    avgt       10      66977,952 ±     3949,033   ns/op
Main.murmur64                                   4M    avgt       10     524294,283 ±    44936,053   ns/op
Main.murmur64                                  20M    avgt       10    2231296,267 ±     8244,468   ns/op
Main.sha256                                    64K    avgt       10      23435,392 ±       87,236   ns/op
Main.sha256                                   512K    avgt       10     186903,019 ±      466,298   ns/op
Main.sha256                                     4M    avgt       10    1495651,476 ±     2802,829   ns/op
Main.sha256                                    20M    avgt       10    7481262,637 ±    15439,953   ns/op
Main.xxhash64                                  64K    avgt       10       4410,198 ±      273,438   ns/op
Main.xxhash64                                 512K    avgt       10      32458,786 ±       78,058   ns/op
Main.xxhash64                                   4M    avgt       10     258566,473 ±     1197,327   ns/op
Main.xxhash64                                  20M    avgt       10    1293855,363 ±     5521,864   ns/op
Main.blake2b_128                               64K  sample   806110     123964,168 ±       27,586   ns/op
Main.blake2b_128:blake2b_128·p0.00             64K  sample              118272,000                  ns/op
Main.blake2b_128:blake2b_128·p0.50             64K  sample              122880,000                  ns/op
Main.blake2b_128:blake2b_128·p0.90             64K  sample              126464,000                  ns/op
Main.blake2b_128:blake2b_128·p0.95             64K  sample              127616,000                  ns/op
Main.blake2b_128:blake2b_128·p0.99             64K  sample              130816,000                  ns/op
Main.blake2b_128:blake2b_128·p0.999            64K  sample              152576,000                  ns/op
Main.blake2b_128:blake2b_128·p0.9999           64K  sample              610702,234                  ns/op
Main.blake2b_128:blake2b_128·p1.00             64K  sample              961536,000                  ns/op
Main.blake2b_128                              512K  sample   100686     992697,246 ±      460,456   ns/op
Main.blake2b_128:blake2b_128·p0.00            512K  sample              959488,000                  ns/op
Main.blake2b_128:blake2b_128·p0.50            512K  sample              989184,000                  ns/op
Main.blake2b_128:blake2b_128·p0.90            512K  sample             1001472,000                  ns/op
Main.blake2b_128:blake2b_128·p0.95            512K  sample             1006592,000                  ns/op
Main.blake2b_128:blake2b_128·p0.99            512K  sample             1026048,000                  ns/op
Main.blake2b_128:blake2b_128·p0.999           512K  sample             1454721,024                  ns/op
Main.blake2b_128:blake2b_128·p0.9999          512K  sample             3058023,629                  ns/op
Main.blake2b_128:blake2b_128·p1.00            512K  sample             6406144,000                  ns/op
Main.blake2b_128                                4M  sample    12582    7947286,300 ±    11349,564   ns/op
Main.blake2b_128:blake2b_128·p0.00              4M  sample             7757824,000                  ns/op
Main.blake2b_128:blake2b_128·p0.50              4M  sample             7921664,000                  ns/op
Main.blake2b_128:blake2b_128·p0.90              4M  sample             8003584,000                  ns/op
Main.blake2b_128:blake2b_128·p0.95              4M  sample             8044544,000                  ns/op
Main.blake2b_128:blake2b_128·p0.99              4M  sample             8347648,000                  ns/op
Main.blake2b_128:blake2b_128·p0.999             4M  sample             9287008,256                  ns/op
Main.blake2b_128:blake2b_128·p0.9999            4M  sample            38377770,189                  ns/op
Main.blake2b_128:blake2b_128·p1.00              4M  sample            41746432,000                  ns/op
Main.blake2b_128                               20M  sample     2517   39796729,491 ±    26618,930   ns/op
Main.blake2b_128:blake2b_128·p0.00             20M  sample            39387136,000                  ns/op
Main.blake2b_128:blake2b_128·p0.50             20M  sample            39714816,000                  ns/op
Main.blake2b_128:blake2b_128·p0.90             20M  sample            40042496,000                  ns/op
Main.blake2b_128:blake2b_128·p0.95             20M  sample            40304640,000                  ns/op
Main.blake2b_128:blake2b_128·p0.99             20M  sample            41067479,040                  ns/op
Main.blake2b_128:blake2b_128·p0.999            20M  sample            47047770,112                  ns/op
Main.blake2b_128:blake2b_128·p0.9999           20M  sample            48889856,000                  ns/op
Main.blake2b_128:blake2b_128·p1.00             20M  sample            48889856,000                  ns/op
Main.blake2b_256                               64K  sample   805713     124025,635 ±       27,310   ns/op
Main.blake2b_256:blake2b_256·p0.00             64K  sample              116096,000                  ns/op
Main.blake2b_256:blake2b_256·p0.50             64K  sample              123008,000                  ns/op
Main.blake2b_256:blake2b_256·p0.90             64K  sample              126592,000                  ns/op
Main.blake2b_256:blake2b_256·p0.95             64K  sample              127744,000                  ns/op
Main.blake2b_256:blake2b_256·p0.99             64K  sample              130688,000                  ns/op
Main.blake2b_256:blake2b_256·p0.999            64K  sample              150784,000                  ns/op
Main.blake2b_256:blake2b_256·p0.9999           64K  sample              606354,432                  ns/op
Main.blake2b_256:blake2b_256·p1.00             64K  sample             1015808,000                  ns/op
Main.blake2b_256                              512K  sample   100631     993226,241 ±      420,255   ns/op
Main.blake2b_256:blake2b_256·p0.00            512K  sample              954368,000                  ns/op
Main.blake2b_256:blake2b_256·p0.50            512K  sample              990208,000                  ns/op
Main.blake2b_256:blake2b_256·p0.90            512K  sample             1003520,000                  ns/op
Main.blake2b_256:blake2b_256·p0.95            512K  sample             1007616,000                  ns/op
Main.blake2b_256:blake2b_256·p0.99            512K  sample             1026048,000                  ns/op
Main.blake2b_256:blake2b_256·p0.999           512K  sample             1311473,664                  ns/op
Main.blake2b_256:blake2b_256·p0.9999          512K  sample             3125215,232                  ns/op
Main.blake2b_256:blake2b_256·p1.00            512K  sample             5832704,000                  ns/op
Main.blake2b_256                                4M  sample    12589    7942140,421 ±    10396,951   ns/op
Main.blake2b_256:blake2b_256·p0.00              4M  sample             7774208,000                  ns/op
Main.blake2b_256:blake2b_256·p0.50              4M  sample             7913472,000                  ns/op
Main.blake2b_256:blake2b_256·p0.90              4M  sample             7995392,000                  ns/op
Main.blake2b_256:blake2b_256·p0.95              4M  sample             8036352,000                  ns/op
Main.blake2b_256:blake2b_256·p0.99              4M  sample             8364851,200                  ns/op
Main.blake2b_256:blake2b_256·p0.999             4M  sample             9356083,200                  ns/op
Main.blake2b_256:blake2b_256·p0.9999            4M  sample            36413898,752                  ns/op
Main.blake2b_256:blake2b_256·p1.00              4M  sample            38993920,000                  ns/op
Main.blake2b_256                               20M  sample     2521   39702623,860 ±    21141,378   ns/op
Main.blake2b_256:blake2b_256·p0.00             20M  sample            39321600,000                  ns/op
Main.blake2b_256:blake2b_256·p0.50             20M  sample            39649280,000                  ns/op
Main.blake2b_256:blake2b_256·p0.90             20M  sample            39976960,000                  ns/op
Main.blake2b_256:blake2b_256·p0.95             20M  sample            40173568,000                  ns/op
Main.blake2b_256:blake2b_256·p0.99             20M  sample            40763392,000                  ns/op
Main.blake2b_256:blake2b_256·p0.999            20M  sample            43313528,832                  ns/op
Main.blake2b_256:blake2b_256·p0.9999           20M  sample            46661632,000                  ns/op
Main.blake2b_256:blake2b_256·p1.00             20M  sample            46661632,000                  ns/op
Main.crc32                                     64K  sample  3922619        802,756 ±        0,172   ns/op
Main.crc32:crc32·p0.00                         64K  sample                 741,000                  ns/op
Main.crc32:crc32·p0.50                         64K  sample                 801,000                  ns/op
Main.crc32:crc32·p0.90                         64K  sample                 812,000                  ns/op
Main.crc32:crc32·p0.95                         64K  sample                 822,000                  ns/op
Main.crc32:crc32·p0.99                         64K  sample                 832,000                  ns/op
Main.crc32:crc32·p0.999                        64K  sample                2472,000                  ns/op
Main.crc32:crc32·p0.9999                       64K  sample                4288,000                  ns/op
Main.crc32:crc32·p1.00                         64K  sample               29600,000                  ns/op
Main.crc32                                    512K  sample  1991926       6214,500 ±        0,781   ns/op
Main.crc32:crc32·p0.00                        512K  sample                5808,000                  ns/op
Main.crc32:crc32·p0.50                        512K  sample                6216,000                  ns/op
Main.crc32:crc32·p0.90                        512K  sample                6392,000                  ns/op
Main.crc32:crc32·p0.95                        512K  sample                6416,000                  ns/op
Main.crc32:crc32·p0.99                        512K  sample                6720,000                  ns/op
Main.crc32:crc32·p0.999                       512K  sample                9776,000                  ns/op
Main.crc32:crc32·p0.9999                      512K  sample               14988,917                  ns/op
Main.crc32:crc32·p1.00                        512K  sample               52992,000                  ns/op
Main.crc32                                      4M  sample  1958928      50979,429 ±        4,050   ns/op
Main.crc32:crc32·p0.00                          4M  sample               47872,000                  ns/op
Main.crc32:crc32·p0.50                          4M  sample               50752,000                  ns/op
Main.crc32:crc32·p0.90                          4M  sample               51520,000                  ns/op
Main.crc32:crc32·p0.95                          4M  sample               54272,000                  ns/op
Main.crc32:crc32·p0.99                          4M  sample               56896,000                  ns/op
Main.crc32:crc32·p0.999                         4M  sample               68736,000                  ns/op
Main.crc32:crc32·p0.9999                        4M  sample               85376,000                  ns/op
Main.crc32:crc32·p1.00                          4M  sample              168192,000                  ns/op
Main.crc32                                     20M  sample   381112     262132,704 ±       77,028   ns/op
Main.crc32:crc32·p0.00                         20M  sample              246784,000                  ns/op
Main.crc32:crc32·p0.50                         20M  sample              261120,000                  ns/op
Main.crc32:crc32·p0.90                         20M  sample              268288,000                  ns/op
Main.crc32:crc32·p0.95                         20M  sample              272384,000                  ns/op
Main.crc32:crc32·p0.99                         20M  sample              294912,000                  ns/op
Main.crc32:crc32·p0.999                        20M  sample              425984,000                  ns/op
Main.crc32:crc32·p0.9999                       20M  sample              750818,202                  ns/op
Main.crc32:crc32·p1.00                         20M  sample             2686976,000                  ns/op
Main.crc64_ecma                                64K  sample  1079085      92600,387 ±        4,376   ns/op
Main.crc64_ecma:crc64_ecma·p0.00               64K  sample               91392,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.50               64K  sample               92288,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.90               64K  sample               94848,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.95               64K  sample               95744,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.99               64K  sample               96896,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.999              64K  sample              100736,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.9999             64K  sample              120064,000                  ns/op
Main.crc64_ecma:crc64_ecma·p1.00               64K  sample              157184,000                  ns/op
Main.crc64_ecma                               512K  sample   134908     740884,866 ±       60,204   ns/op
Main.crc64_ecma:crc64_ecma·p0.00              512K  sample              732160,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.50              512K  sample              739328,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.90              512K  sample              744448,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.95              512K  sample              747520,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.99              512K  sample              772096,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.999             512K  sample              787456,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.9999            512K  sample              949787,955                  ns/op
Main.crc64_ecma:crc64_ecma·p1.00              512K  sample             1153024,000                  ns/op
Main.crc64_ecma                                 4M  sample    16790    5953452,324 ±     1223,503   ns/op
Main.crc64_ecma:crc64_ecma·p0.00                4M  sample             5914624,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.50                4M  sample             5947392,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.90                4M  sample             5963776,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.95                4M  sample             5988352,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.99                4M  sample             6225920,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.999               4M  sample             6496256,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.9999              4M  sample             6751003,443                  ns/op
Main.crc64_ecma:crc64_ecma·p1.00                4M  sample             6856704,000                  ns/op
Main.crc64_ecma                                20M  sample     3362   29770761,137 ±    11297,150   ns/op
Main.crc64_ecma:crc64_ecma·p0.00               20M  sample            29622272,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.50               20M  sample            29753344,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.90               20M  sample            29786112,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.95               20M  sample            29949952,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.99               20M  sample            31031296,000                  ns/op
Main.crc64_ecma:crc64_ecma·p0.999              20M  sample            32023314,432                  ns/op
Main.crc64_ecma:crc64_ecma·p0.9999             20M  sample            32440320,000                  ns/op
Main.crc64_ecma:crc64_ecma·p1.00               20M  sample            32440320,000                  ns/op
Main.kangaroo12_128                            64K  sample  1426844      69997,999 ±        6,216   ns/op
Main.kangaroo12_128:kangaroo12_128·p0.00       64K  sample               66432,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.50       64K  sample               69632,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.90       64K  sample               70912,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.95       64K  sample               72960,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.99       64K  sample               73984,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.999      64K  sample               84608,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.9999     64K  sample              101544,384                  ns/op
Main.kangaroo12_128:kangaroo12_128·p1.00       64K  sample             1665024,000                  ns/op
Main.kangaroo12_128                           512K  sample   179367     556997,734 ±       59,981   ns/op
Main.kangaroo12_128:kangaroo12_128·p0.00      512K  sample              536576,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.50      512K  sample              556032,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.90      512K  sample              560128,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.95      512K  sample              562176,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.99      512K  sample              571392,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.999     512K  sample              628736,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.9999    512K  sample              734337,434                  ns/op
Main.kangaroo12_128:kangaroo12_128·p1.00      512K  sample             2105344,000                  ns/op
Main.kangaroo12_128                             4M  sample    21027    4752878,639 ±     1131,197   ns/op
Main.kangaroo12_128:kangaroo12_128·p0.00        4M  sample             4653056,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.50        4M  sample             4751360,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.90        4M  sample             4767744,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.95        4M  sample             4775936,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.99        4M  sample             4841472,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.999       4M  sample             5570560,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.9999      4M  sample             6537216,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p1.00        4M  sample             6864896,000                  ns/op
Main.kangaroo12_128                            20M  sample     4213   23749294,394 ±     6615,402   ns/op
Main.kangaroo12_128:kangaroo12_128·p0.00       20M  sample            23560192,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.50       20M  sample            23724032,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.90       20M  sample            23822336,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.95       20M  sample            23887872,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.99       20M  sample            24210964,480                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.999      20M  sample            25332088,832                  ns/op
Main.kangaroo12_128:kangaroo12_128·p0.9999     20M  sample            26640384,000                  ns/op
Main.kangaroo12_128:kangaroo12_128·p1.00       20M  sample            26640384,000                  ns/op
Main.kangaroo12_256                            64K  sample  1429793      69853,891 ±        6,223   ns/op
Main.kangaroo12_256:kangaroo12_256·p0.00       64K  sample               67328,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.50       64K  sample               69504,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.90       64K  sample               70528,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.95       64K  sample               72704,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.99       64K  sample               73984,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.999      64K  sample               82970,368                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.9999     64K  sample               96768,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p1.00       64K  sample             1638400,000                  ns/op
Main.kangaroo12_256                           512K  sample   179142     557702,432 ±       68,814   ns/op
Main.kangaroo12_256:kangaroo12_256·p0.00      512K  sample              534528,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.50      512K  sample              557056,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.90      512K  sample              561152,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.95      512K  sample              563200,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.99      512K  sample              572416,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.999     512K  sample              657261,568                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.9999    512K  sample              845824,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p1.00      512K  sample             2166784,000                  ns/op
Main.kangaroo12_256                             4M  sample    21045    4748605,199 ±     1191,182   ns/op
Main.kangaroo12_256:kangaroo12_256·p0.00        4M  sample             4644864,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.50        4M  sample             4743168,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.90        4M  sample             4767744,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.95        4M  sample             4775936,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.99        4M  sample             4825088,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.999       4M  sample             5127438,336                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.9999      4M  sample             6945654,374                  ns/op
Main.kangaroo12_256:kangaroo12_256·p1.00        4M  sample            10878976,000                  ns/op
Main.kangaroo12_256                            20M  sample     4215   23739720,214 ±     8662,560   ns/op
Main.kangaroo12_256:kangaroo12_256·p0.00       20M  sample            23560192,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.50       20M  sample            23724032,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.90       20M  sample            23822336,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.95       20M  sample            23887872,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.99       20M  sample            24243077,120                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.999      20M  sample            26664501,248                  ns/op
Main.kangaroo12_256:kangaroo12_256·p0.9999     20M  sample            28508160,000                  ns/op
Main.kangaroo12_256:kangaroo12_256·p1.00       20M  sample            28508160,000                  ns/op
Main.murmur64                                  64K  sample  2515032       9928,649 ±        2,462   ns/op
Main.murmur64:murmur64·p0.00                   64K  sample                8896,000                  ns/op
Main.murmur64:murmur64·p0.50                   64K  sample                9872,000                  ns/op
Main.murmur64:murmur64·p0.90                   64K  sample                9968,000                  ns/op
Main.murmur64:murmur64·p0.95                   64K  sample               10016,000                  ns/op
Main.murmur64:murmur64·p0.99                   64K  sample               12544,000                  ns/op
Main.murmur64:murmur64·p0.999                  64K  sample               14096,000                  ns/op
Main.murmur64:murmur64·p0.9999                 64K  sample               27599,894                  ns/op
Main.murmur64:murmur64·p1.00                   64K  sample             1386496,000                  ns/op
Main.murmur64                                 512K  sample  1558331      64108,569 ±        8,402   ns/op
Main.murmur64:murmur64·p0.00                  512K  sample               60992,000                  ns/op
Main.murmur64:murmur64·p0.50                  512K  sample               63552,000                  ns/op
Main.murmur64:murmur64·p0.90                  512K  sample               65408,000                  ns/op
Main.murmur64:murmur64·p0.95                  512K  sample               66944,000                  ns/op
Main.murmur64:murmur64·p0.99                  512K  sample               69248,000                  ns/op
Main.murmur64:murmur64·p0.999                 512K  sample              110592,000                  ns/op
Main.murmur64:murmur64·p0.9999                512K  sample              161792,000                  ns/op
Main.murmur64:murmur64·p1.00                  512K  sample              702464,000                  ns/op
Main.murmur64                                   4M  sample   194669     513405,452 ±      184,597   ns/op
Main.murmur64:murmur64·p0.00                    4M  sample              481280,000                  ns/op
Main.murmur64:murmur64·p0.50                    4M  sample              511488,000                  ns/op
Main.murmur64:murmur64·p0.90                    4M  sample              516608,000                  ns/op
Main.murmur64:murmur64·p0.95                    4M  sample              518656,000                  ns/op
Main.murmur64:murmur64·p0.99                    4M  sample              539648,000                  ns/op
Main.murmur64:murmur64·p0.999                   4M  sample              871424,000                  ns/op
Main.murmur64:murmur64·p0.9999                  4M  sample             1300480,000                  ns/op
Main.murmur64:murmur64·p1.00                    4M  sample             4161536,000                  ns/op
Main.murmur64                                  20M  sample    44197    2260480,985 ±     2017,886   ns/op
Main.murmur64:murmur64·p0.00                   20M  sample             2187264,000                  ns/op
Main.murmur64:murmur64·p0.50                   20M  sample             2265088,000                  ns/op
Main.murmur64:murmur64·p0.90                   20M  sample             2277376,000                  ns/op
Main.murmur64:murmur64·p0.95                   20M  sample             2281472,000                  ns/op
Main.murmur64:murmur64·p0.99                   20M  sample             2351104,000                  ns/op
Main.murmur64:murmur64·p0.999                  20M  sample             3898744,832                  ns/op
Main.murmur64:murmur64·p0.9999                 20M  sample             7938048,000                  ns/op
Main.murmur64:murmur64·p1.00                   20M  sample            10682368,000                  ns/op
Main.sha256                                    64K  sample  2129119      23454,314 ±        3,243   ns/op
Main.sha256:sha256·p0.00                       64K  sample               23104,000                  ns/op
Main.sha256:sha256·p0.50                       64K  sample               23296,000                  ns/op
Main.sha256:sha256·p0.90                       64K  sample               23616,000                  ns/op
Main.sha256:sha256·p0.95                       64K  sample               24288,000                  ns/op
Main.sha256:sha256·p0.99                       64K  sample               26464,000                  ns/op
Main.sha256:sha256·p0.999                      64K  sample               28064,000                  ns/op
Main.sha256:sha256·p0.9999                     64K  sample               35136,000                  ns/op
Main.sha256:sha256·p1.00                       64K  sample             1347584,000                  ns/op
Main.sha256                                   512K  sample   534777     186886,069 ±       10,452   ns/op
Main.sha256:sha256·p0.00                      512K  sample              184064,000                  ns/op
Main.sha256:sha256·p0.50                      512K  sample              185856,000                  ns/op
Main.sha256:sha256·p0.90                      512K  sample              189184,000                  ns/op
Main.sha256:sha256·p0.95                      512K  sample              190464,000                  ns/op
Main.sha256:sha256·p0.99                      512K  sample              195328,000                  ns/op
Main.sha256:sha256·p0.999                     512K  sample              201472,000                  ns/op
Main.sha256:sha256·p0.9999                    512K  sample              235008,000                  ns/op
Main.sha256:sha256·p1.00                      512K  sample              327680,000                  ns/op
Main.sha256                                     4M  sample    66824    1495658,746 ±      176,772   ns/op
Main.sha256:sha256·p0.00                        4M  sample             1476608,000                  ns/op
Main.sha256:sha256·p0.50                        4M  sample             1492992,000                  ns/op
Main.sha256:sha256·p0.90                        4M  sample             1499136,000                  ns/op
Main.sha256:sha256·p0.95                        4M  sample             1511424,000                  ns/op
Main.sha256:sha256·p0.99                        4M  sample             1562624,000                  ns/op
Main.sha256:sha256·p0.999                       4M  sample             1618278,400                  ns/op
Main.sha256:sha256·p0.9999                      4M  sample             1883770,880                  ns/op
Main.sha256:sha256·p1.00                        4M  sample             2183168,000                  ns/op
Main.sha256                                    20M  sample    13364    7480489,492 ±     1808,034   ns/op
Main.sha256:sha256·p0.00                       20M  sample             7421952,000                  ns/op
Main.sha256:sha256·p0.50                       20M  sample             7462912,000                  ns/op
Main.sha256:sha256·p0.90                       20M  sample             7495680,000                  ns/op
Main.sha256:sha256·p0.95                       20M  sample             7569408,000                  ns/op
Main.sha256:sha256·p0.99                       20M  sample             7823360,000                  ns/op
Main.sha256:sha256·p0.999                      20M  sample             8013987,840                  ns/op
Main.sha256:sha256·p0.9999                     20M  sample             8281956,352                  ns/op
Main.sha256:sha256·p1.00                       20M  sample             8298496,000                  ns/op
Main.xxhash64                                  64K  sample  2846654       4712,640 ±      869,593   ns/op
Main.xxhash64:xxhash64·p0.00                   64K  sample                4028,000                  ns/op
Main.xxhash64:xxhash64·p0.50                   64K  sample                4144,000                  ns/op
Main.xxhash64:xxhash64·p0.90                   64K  sample                4432,000                  ns/op
Main.xxhash64:xxhash64·p0.95                   64K  sample                4856,000                  ns/op
Main.xxhash64:xxhash64·p0.99                   64K  sample                6200,000                  ns/op
Main.xxhash64:xxhash64·p0.999                  64K  sample                8008,000                  ns/op
Main.xxhash64:xxhash64·p0.9999                 64K  sample               15978,704                  ns/op
Main.xxhash64:xxhash64·p1.00                   64K  sample           475529216,000                  ns/op
Main.xxhash64                                 512K  sample  1538154      32471,566 ±        2,489   ns/op
Main.xxhash64:xxhash64·p0.00                  512K  sample               31648,000                  ns/op
Main.xxhash64:xxhash64·p0.50                  512K  sample               32256,000                  ns/op
Main.xxhash64:xxhash64·p0.90                  512K  sample               33024,000                  ns/op
Main.xxhash64:xxhash64·p0.95                  512K  sample               34432,000                  ns/op
Main.xxhash64:xxhash64·p0.99                  512K  sample               35776,000                  ns/op
Main.xxhash64:xxhash64·p0.999                 512K  sample               39168,000                  ns/op
Main.xxhash64:xxhash64·p0.9999                512K  sample               51968,000                  ns/op
Main.xxhash64:xxhash64·p1.00                  512K  sample              325632,000                  ns/op
Main.xxhash64                                   4M  sample   385690     259089,997 ±       16,603   ns/op
Main.xxhash64:xxhash64·p0.00                    4M  sample              251648,000                  ns/op
Main.xxhash64:xxhash64·p0.50                    4M  sample              258304,000                  ns/op
Main.xxhash64:xxhash64·p0.90                    4M  sample              262144,000                  ns/op
Main.xxhash64:xxhash64·p0.95                    4M  sample              263680,000                  ns/op
Main.xxhash64:xxhash64·p0.99                    4M  sample              268288,000                  ns/op
Main.xxhash64:xxhash64·p0.999                   4M  sample              280064,000                  ns/op
Main.xxhash64:xxhash64·p0.9999                  4M  sample              354965,862                  ns/op
Main.xxhash64:xxhash64·p1.00                    4M  sample              403456,000                  ns/op
Main.xxhash64                                  20M  sample    77233    1293739,072 ±      166,348   ns/op
Main.xxhash64:xxhash64·p0.00                   20M  sample             1271808,000                  ns/op
Main.xxhash64:xxhash64·p0.50                   20M  sample             1292288,000                  ns/op
Main.xxhash64:xxhash64·p0.90                   20M  sample             1300480,000                  ns/op
Main.xxhash64:xxhash64·p0.95                   20M  sample             1304576,000                  ns/op
Main.xxhash64:xxhash64·p0.99                   20M  sample             1337344,000                  ns/op
Main.xxhash64:xxhash64·p0.999                  20M  sample             1464320,000                  ns/op
Main.xxhash64:xxhash64·p0.9999                 20M  sample             1735484,621                  ns/op
Main.xxhash64:xxhash64·p1.00                   20M  sample             2109440,000                  ns/op
Main.blake2b_128                               64K      ss       10   15671014,500 ± 48983726,114   ns/op
Main.blake2b_128                              512K      ss       10   18113403,600 ± 50470708,050   ns/op
Main.blake2b_128                                4M      ss       10   27708794,900 ± 55013340,519   ns/op
Main.blake2b_128                               20M      ss       10   62720453,500 ± 61770295,295   ns/op
Main.blake2b_256                               64K      ss       10   15997362,500 ± 50063295,741   ns/op
Main.blake2b_256                              512K      ss       10   18089894,400 ± 50377548,042   ns/op
Main.blake2b_256                                4M      ss       10   27644170,000 ± 54293022,336   ns/op
Main.blake2b_256                               20M      ss       10   62696794,900 ± 61899027,403   ns/op
Main.crc32                                     64K      ss       10      54184,800 ±   166171,730   ns/op
Main.crc32                                    512K      ss       10      52739,100 ±   142612,923   ns/op
Main.crc32                                      4M      ss       10     119719,200 ±   172096,154   ns/op
Main.crc32                                     20M      ss       10     439516,100 ±   294754,675   ns/op
Main.crc64_ecma                                64K      ss       10     409733,500 ±   842954,336   ns/op
Main.crc64_ecma                               512K      ss       10    1150267,500 ±   950939,845   ns/op
Main.crc64_ecma                                 4M      ss       10    6649234,500 ±  1037868,696   ns/op
Main.crc64_ecma                                20M      ss       10   30471059,500 ±  1355150,075   ns/op
Main.kangaroo12_128                            64K      ss       10   15710439,100 ± 49466511,190   ns/op
Main.kangaroo12_128                           512K      ss       10   16347863,200 ± 49917082,320   ns/op
Main.kangaroo12_128                             4M      ss       10   20681393,800 ± 51195380,091   ns/op
Main.kangaroo12_128                            20M      ss       10   38794273,400 ± 51407856,051   ns/op
Main.kangaroo12_256                            64K      ss       10   15921580,300 ± 50104342,085   ns/op
Main.kangaroo12_256                           512K      ss       10   16269044,000 ± 49580032,549   ns/op
Main.kangaroo12_256                             4M      ss       10   20579440,900 ± 50950707,161   ns/op
Main.kangaroo12_256                            20M      ss       10   38963731,100 ± 51984268,304   ns/op
Main.murmur64                                  64K      ss       10     806230,700 ±  1792220,185   ns/op
Main.murmur64                                 512K      ss       10    1273973,600 ±  2468236,550   ns/op
Main.murmur64                                   4M      ss       10    2484047,700 ±  3733032,611   ns/op
Main.murmur64                                  20M      ss       10    4717424,000 ±  4625003,123   ns/op
Main.sha256                                    64K      ss       10    1213328,400 ±  1565225,214   ns/op
Main.sha256                                   512K      ss       10    1676763,900 ±  4472740,797   ns/op
Main.sha256                                     4M      ss       10    3072650,000 ±  4066720,872   ns/op
Main.sha256                                    20M      ss       10   10464120,500 ±  5463460,999   ns/op
Main.xxhash64                                  64K      ss       10    1132906,400 ±  3590489,040   ns/op
Main.xxhash64                                 512K      ss       10    1136603,800 ±  3514485,009   ns/op
Main.xxhash64                                   4M      ss       10    1362629,800 ±  3368274,978   ns/op
Main.xxhash64                                  20M      ss       10    2518430,000 ±  3758065,621   ns/op

Process finished with exit code 0
