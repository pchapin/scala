
SpartanRPC
==========

This folder contains a staged SpartanRPC sample. This program generates a simple "remote blink"
application where a client periodically sends a count value to a server. The client and server
are in different security domains and the server wishes to restrict access to its LED display
service to only clients that meet an appropriate security policy.

Unlike the Sprocket system described elsewhere, this program does all security processing
through session key negotiation in the first stage. It then specializes the node programs with
the session keys so that only MAC computation and verification (using hardware acceleration) is
done in the network.

The first stage program is intended to be run by both security domains A and B. In this
implementation each copy of the program communicates with its counterpart to negotiate session
keys (this negotation might fail depending on security policy and available certificates, etc).
The first stage program regenerates the second stage program periodically to account for changes
in policy, certificate availability, and similar things.

Peter

NOTES
-----

To turn on IntelliJ's ability to log raw compiler output first add the following to log.xml in
IntelliJ's bin folder (where IntelliJ is installed):

    <category name="#org.jetbrains.plugins.scala.compiler.ScalacOutputParser">
        <priority value="DEBUG"/>
        <appender-ref ref="FILE"/>
    </category>

It should be added immediately above the <root> element (toward the bottom of the file).

Next, restart IntelliJ. This causes the Scala compiler output parser to log all sorts of
debugging information into IntelliJ's log file (located in ~/.IdeaIC12/system/log/idea.log). The
output is rather verbose so you'll probably want to search it for strings of interest. Note that
IntelliJ rotates log files when the active log reaches about 1 MiB in size and that doesn't take
long with this debugging feature turned on. Be sure to comment out the lines in log.xml when you
are done.

IntelliJ appears to run the Scala compiler with a working folder of IntelliJ's installation bin
folder and not, for example, any folder related to your project. This was determined by
modifying the compiler to output its working directory while running and viewing that output
using the technique described above.

IntelliJ checks to be sure the library and compiler version are consistent. If you rebuild one
and not the other it will complain. You should do 'ant quick.clean; ant' to rebuild both
versions of the 'pack' compiler to match. Note that Eclipse does not (by default) rebuild pack.
Thus building with Eclipse does not change or disrupt the compiler created by ant nor does it
change what happens in IntelliJ (since IntelliJ is using the pack compiler). This can be good
and bad, but it is important to at least understand it.

The jar artifact created by IntelliJ does not include the bouncycastle jar. That jar has a
signed manifest and the signature breaks when the jar is expanded for inclusion in the single
jar artifact. Right now it is necessary to include a class path to bouncycastle when running
SpartanRPC.jar.
