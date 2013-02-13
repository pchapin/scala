
import edu.uvm.mininess.{Declarations, MininessTypes}
import edu.uvm.scalaness._
import edu.uvm.scalaness.LiftableTypes._

object Main {

  @ModuleType("""{}
                 < addrT <: UInt32; >
                 { ; radio(message: MessageType{src: addrT, dest: addrT, data: Array[UInt8,64]}): ErrorT}""")
  class RadioC extends MininessComponent {
    
    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsAddrT: MetaType[UInt32] = null

    def instantiate(addrT: MetaType[UInt32]) = {
      sclnsAddrT = addrT
      this
    }

    // private val abstractSyntax = Parser.reparse("Radio.nc", List("addrT"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "RadioC",              // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("addrT"),          // TODO: Obtain from class MetaType parameters.
        valueParameters = Set(),                 // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("addrT" -> sclnsAddrT)
    def getValueMap = Map[String, Any]()
    ////////
    // END of Scalaness generated code.
    //////// 

    "RadioC.nc"
  }


  @ModuleType("""{}
                 < addrT <: UInt32; >
                 { radio(message: MessageType{src: addrT, dest: addrT, data: Array[UInt8,64]}): ErrorT;
                   send(s: addrT, d: addrT, data: Array[UInt8]): ErrorT }""")
  class SendC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsAddrT: MetaType[UInt32] = null

    def instantiate(addrT: MetaType[UInt32]) = {
      sclnsAddrT = addrT
      this
    }

    // private val abstractSyntax = Parser.reparse("SendC.nc", List("addrT"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "SendC",               // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("addrT"),          // TODO: Obtain from class MetaType parameters.
        valueParameters = Set(),                 // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("addrT" -> sclnsAddrT)
    def getValueMap = Map[String, Any]()
    ////////
    // END of Scalaness generated code.
    //////// 

    "SendC.nc"
  }

  @ModuleType("""{}
                 < addrT <: UInt32; self: UInt32, neighbor: UInt32 >
                 { send(s: addrT, d: addrT, data: Array[UInt8]): ErrorT;
                   main(): ErrorT }""")
  class NodeC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsAddrT   : MetaType[UInt32] = null
    private var sclnsSelf    : UInt32 = null
    private var sclnsNeighbor: UInt32 = null

    def instantiate(addrT: MetaType[UInt32], self: UInt32, neighbor: UInt32) = {
      sclnsAddrT    = addrT
      sclnsSelf     = self
      sclnsNeighbor = neighbor
      this
    }

    // private val abstractSyntax = Parser.reparse("NodeC.nc", List("addrT"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "NodeC",                 // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("addrT"),            // TODO: Obtain from class MetaType parameters.
        valueParameters = Set("self", "neighbor"), // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("addrT" -> sclnsAddrT)
    def getValueMap = Map("self" -> sclnsSelf, "neighbor" -> sclnsNeighbor)
    ////////
    // END of Scalaness generated code.
    //////// 

    "NodeC.nc"
  }

  def nodeSpecialize(
    self    : UInt32,
    neighbor: UInt32,
    nmax    : UInt32,
    @ModuleType(
      """{}< addrT <: UInt32; >{ ;
           radio(message: MessageType{src: addrT, dest: addrT, data: Array[UInt8,64]}): ErrorT}""") rawRadioC: RadioC) = {

    val addrt: MetaType[UInt32] =
      if (nmax < UInt32(256)) new MetaType[UInt32](MininessTypes.UInt8)
        else new MetaType[UInt32](MininessTypes.UInt16)

    @ModuleType("""{}
                   < addrT <: UInt32; >
                   { radio(message: MessageType{src: addrT, dest: addrT, data: Array[UInt8,64]}): ErrorT;
                     send(s: addrT, d: addrT, data: Array[UInt8]): ErrorT }""")
    val rawSendC = new SendC
    

    @ModuleType("""{ addrT <: UInt32 }<;>{
                     ;
                     send(s: addrT, d: addrT, data: Array[UInt8]): ErrorT}""")
    val scode = (rawSendC.instantiate(addrt)) +> rawRadioC.instantiate(addrt)
    // Extra parentheses around first component above intentional. Does it work?

    @ModuleType("""{}
                   < addrT <: UInt32; self: UInt32, neighbor: UInt32 >
                   { send(s: addrT, d: addrT, data: Array[UInt8]): ErrorT;
                     main(): ErrorT }""")
    val rawNodeC = new NodeC

    @ModuleType("""{ addrT <: UInt32 }
                   <;>
                   { send(s: addrT, d: addrT, data: Array[UInt8]): ErrorT;
                     main(): ErrorT}""")
    val mcode = rawNodeC.instantiate(addrt, self, neighbor)

    (mcode +> scode).image
  }

}
