COMPONENT=AppC
NESC_FLAGS += -I../.. -I../../..
NESC_FLAGS += -I/opt/tinyos-2.x/apps/TinyECC-2.0
CFLAGS     += -DSECP160K1
## NN
#CFLAGS += -DBARRETT_REDUCTION  # Barrett reduction
#CFLAGS += -DHYBRID_MULT        # Hybrid multipliation
#CFLAGS += -DHYBRID_SQR         # Hybrid squre
#CFLAGS += -DCURVE_OPT          # Optimization for secg curve
## ECC
#CFLAGS += -DPROJECTIVE         # Projective coordinate
#CFLAGS += -DSLIDING_WIN        # Sliding window method, window size is defined in ECC.h
## ECDSA
#CFLAGS += -DSHAMIR_TRICK       # Shamir trick, windows size is defined in ECDSAM.nc

# The printf library adds about 4500 bytes of ROM and 500 bytes of RAM usage.
#CFLAGS += -I$(TOSDIR)/lib/printf
MSG_SIZE=46  # Limited to 127 on CC2420. Needs to hold largest certificate fragment + checksum.
include $(MAKERULES)

