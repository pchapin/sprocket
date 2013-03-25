
Sprocket Samples
================

This folder contains various samples that demonstrate the SprocketRT system.

+ Aggregate: An unfinished sample intended to demonstrate in-network data aggregation in a
  multi-domain WSN.

+ Benchmarks: The benchmark programs used in the MASS2010 Sprocket paper.

+ BlinkR: A remote blink application where a SpartanRPC server exports a duty that flashes an
  LED on the server system. This sample uses the full SprocketRT system (RT_0) to authorize
  clients. All four certificate forms are demonstrated. This program is similar to the Security
  bench- mark except that the benchmark program only uses a single credential form.

+ BlinkToRadio: This sample is similar to BlinkR except that each node executes both client and
  server logic (in the BlinkR sample there are distinct client and server nodes).

+ DH: A small sample that demonstrates TinyECC's features for doing DiffieHellman key exchange.
  This program does not use the radio at all.

+ Diffusion: A sample intended to demonstrate directed diffusion in a multi-domain WSN. This
  sample was discussed in the MASS2010 paper.

+ Dissemination: A simple dissemination system approximately following the style of TEP-118.

+ HardwareAES: A small example of how to use the AES hardware in the CC2420 radio chip.

+ Model: A program that exercises the minimum model computation to see how fast it is. Before
  using this program it is necessary to activate the material in CredentialStorageC.nc in the
  runtime system that preloads the credential cache with a "standard" collection of five
  interesting credentials.

+ Verify: A small sample that demonstrates TinyECC's features for doing digital signature
  verification. This program does not use the radio at all.
