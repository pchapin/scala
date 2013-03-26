
// import scala.reflect.runtime.universe._

import edu.uvm.mininess.MininessTypes
import edu.uvm.scalaness.LiftableTypes._
import edu.uvm.scalaness.MetaType
import language.existentials
// Might be cleaner to use the compiler option -language:existentials

object Basic {
  def main(args: Array[String]) {
    val desiredType: MetaType[Int16] = new MetaType[Int16](MininessTypes.Int16)
    val x: Int = 1
    val y: List[Int] = List(1, 2, 3, x)
    val z0: T forSome { type T <: Int16 } = Int8(42)
    
    // As of 2012-08-21 it is no longer permitted to use type values in a type context.
    // val z1: desiredType = new Int32(1)  // This should fail !(Int32 <: Int16)
    // val z2: desiredType = new Int16(1)
    // val z3: desiredType = new Int8(2)
  }
}
