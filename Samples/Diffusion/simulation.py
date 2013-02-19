#!/usr/bin/python

from TOSSIM import *
import sys

t = Tossim([])
r = t.radio()

print("Reading network topology...")
f = open("../topology.txt", "r")
for line in f:
    s = line.split()
    if s:
        print " ", s[0], " ", s[1], " ", s[2]
        r.add(int(s[0]), int(s[1]), float(s[2]))

print("Configuring debug output channels...")
t.addChannel("Boot", sys.stdout)
t.addChannel("Timer", sys.stdout)

print("Creating noise model for all nodes...")
noise = open("/opt/tinyos-2.1.2/tos/lib/tossim/noise/meyer-heavy.txt", "r")
lines = noise.readlines()
for line in lines:
    str1 = line.strip()
    if str1:
        val = int(str1)
        for i in range(1, 4):
            t.getNode(i).addNoiseTraceReading(val)

for i in range(1, 4):
    print "\tCreating noise model for node ", i
    t.getNode(i).createNoiseModel()

print("Configuring boot times")
t.getNode(1).bootAtTime(100000)
t.getNode(2).bootAtTime(200001)
t.getNode(3).bootAtTime(300002)

print("Done!")

for i in range(2000):
    t.runNextEvent()

# Simulates 5 seconds from first boot event.
#
# t.runNextEvent()
# time = t.time()
# while time + 50000000000 > t.time():
#     t.runNextEvent()
