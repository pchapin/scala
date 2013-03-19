// This test case explores accessing external libraries.

import edu.uvm.scalaness.runtime.MininessComponent

class LibraryC extends MininessComponent {
  external("LibraryC.nc")
}
