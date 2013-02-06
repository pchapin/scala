//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : The main object for the Scalaness SendReceive sample.
// AUTHOR  : (C) Copyright 2013 by Peter Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

object Main {

  import edu.uvm.mininess._
  import edu.uvm.scalaness._
  import LiftableTypes._


  /**
   * This Mininess module provides the basic blink service that is accessed via the radio.
   */
  @ModuleType("""{}
                 <;>
                 { led0On() : Void, led1On() : Void, led2On() : Void,
                   led0Off(): Void, led1Off(): Void, led2Off(): Void;
                   receive(msg: PointerTo[MessageT], payload: PointerTo[Void], len: UInt8): PointerTo[MessageT] }""")
  class ServerC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private val abstractSyntax = Parser.reparse("ServerC.nc", List())
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "ServerC",             // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set(),                 // TODO: Obtain from class MetaType parameters.
        valueParameters = Set(),                 // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map[String, MetaType[Liftable]]()
    def getValueMap = Map[String, Any]()
    ////////
    // END of Scalaness generated code.
    //////// 
           
    
    "ServerC.nc"
  }
 
    
  /**    
   * @param args The command line arguments
   */ 
  def main(args: Array[String]) {
    val serverModule = new ServerC
    serverModule.image()
  }
    
}       
