# Testing graalvm

- Tested on laptop running ubuntu 20.04, 16 GB RAM and inter i5 4 core processor
- Used JAVA 11 open JDK
- Used graal vm JAVA 11 21.3.0 for linux amd

## Micronaut

### With regular JDK
- 1862 ms
- 1868 ms


### With GraalVM
- Boot time 1554 ms
- 1089 ms
- 1113 ms


### Native Image
- Boot time 172ms.
- 9258 ms



## Quarkus

### With regular JDK
- 1642


### With GraalVM
- Boot time  4.761s.
- 1642

### Native Image
- Boot time  0.123s 
- 9700 ms


