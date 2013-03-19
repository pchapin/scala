
import edu.uvm.scalaness.LiftableTypes
import edu.uvm.scalaness.MetaType
import edu.uvm.scalaness.runtime.MininessComponent
import LiftableTypes._

object ModuleDefinition01 {
  
  class Address(val node: Int16, component: Int8) extends Liftable
  
  class ExampleM(A: MetaType[Address]) extends MininessComponent {
    "ExampleM.nc"
  }
  
  def main(args: Array[String]) {
    println("Hello, World!")
  }

}
