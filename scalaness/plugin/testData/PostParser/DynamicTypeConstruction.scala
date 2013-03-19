
// import scala.reflect.runtime.universe._

import edu.uvm.mininess.MininessTypes
import edu.uvm.scalaness.LiftableTypes._
import edu.uvm.scalaness.MetaType
// import language.existentials
// Might be cleaner to use the compiler option -language:existentials

object DynamicTypeConstuction {
  def main(args: Array[String]) {
    
    // Dynamically constructed type value.
    val desiredType: MetaType[Int16] =
      if (args(0) == "small")
        new MetaType[Int16](MininessTypes.Int8)
      else
        new MetaType[Int16](MininessTypes.Int16)
        
    // Dynamically constructed type value that depends on the value above.
    val otherType: MetaType[Int32] =
      if (args(1) == "small")
        new MetaType[Int32](desiredType)
      else
        new MetaType[Int32](MininessTypes.Int32)
  }
}
