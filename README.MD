
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

```
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
```
Process finished with exit code 0
