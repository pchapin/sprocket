
README.txt
==========

This folder contains test programs that exercise various aspects of the SprocketRT runtime
system in (relative) isolation from each other. Some of the programs require only a single node
but others require both a client and server node. Consult the individual README files for each
program, if they exist, or read the program source code for more information.

Authorization
    This program verifies five RT_0 certificates, including at least once instance of each
    credential form, and then computes an authorization that makes use of all five certificates.
    If the program succeeds (green LED turns on), then all certificate signatures checked and
    the RT_0 authorization algorithm succeeded. Note that this program takes about 7.5 minutes
    to execute on my current test platform (Tmote Sky).

Certificates
    This program exercises the certificate sender and certificate receiver components. The same
    five certificates as used in the Authorization program are transmitted from sender to
    receiver where they are defragmented and verified. The receiver toggles its red LED for each
    new certificate received and verified. This behavior depends on certain debug settings in
    the SprocketRT runtime system (specifically in CertificateReceiverC). If those settings are
    changed or removed the behavior will be different.

SessionKey
    This program exercises the session key negotiation service. The TX program initiates the
    negotiation while the RX program completes it.
