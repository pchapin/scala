
SnowStorm
=========

This folder contains a staged SpartanRPC sample based on the SnowCloud application developed at
the University of Vermont.

Unlike the Sprocket system described elsewhere, this program does all security processing
through session key negotiation in the first stage. It then specializes the node programs with
the session keys so that only MAC computation and verification (using hardware acceleration) is
done in the network.

Building and Running
--------------------

To build SnowStorm run `ant` in the SnowStorm folder. It is also possible to build SnowStorm
using IntelliJ but the details of setting that up are not described here.

After a successful execution of ant, the SnowStorm application can be run using the provided
shell script (Linux) or batch file (Windows). Two instances of SnowStorm should be run, one
owned by the Harvester domain H and the other owned by the SensorBox domain S. When SnowStorm is
run you must provide a TCP port number on which it will listen for authorization requests and a
port number where its peer is listening. At the moment the program assumes both instances are
running on the same machine (for testing purposes) but obviously in real life it would be
necessary to also provide an IP address for the peer program.

SnowStorm is menu driven. Once policies have been configured the Harvester instance can request
access to SensorBox resources. This causes session keys to be negotiated and exchanged. Both
instances can then generate the node level programs.
