/*
Type Abbreviation Examples:

A necessary part of the Scalaness type system are module type annotations. These annotations
contain information that is integral to the type system and are put in the code by the
programmer. They are often long, ugly, and repetitive. */

      @ModuleType("""{ checksumType <: UInt32 }
                     <;>
                     { compute_checksum(data: Array[UInt8]): checksumType,
                       startPeriodic(period: UInt32): Void;
                       booted(): Void,
                       fired(): Void }""")
      val formattingModule = MessageFormatter.instantiate(desiredSize, desiredChecksumType)
    
/* Since these annotations are often used more than once, or used multiple times with minor
differences, such as an uninstantiated module and an instantiated module, we added Type
Abbreviations, so that the long type could be written out once, and then used in its shortened
version whenever possible. */

   val formatT = new edu.uvm.scalaness.TypeAbbreviation("
                    { checksumType <: UInt32 } 
                     <;>
                     { compute_checksum(data: Array[UInt8]): checksumType,
                       startPeriodic(period: UInt32): Void;
                       booted(): Void,
                       fired(): Void }",
                       List())
         
    @TypeAbbr(formatT)         
    val formattingModule = MessageFormatter.instantiate(desiredSize, desiredChecksumType)
    
    
/* When declaring a type abbreviation, you can declare the full type to be unfinished with
parameters, so that the type abbreviation can be instantiated later. This is useful either if
you are not sure of part of the type yet, or if you want to use a similar long type, but
parameterize it with two different types. */

   val formatT = new edu.uvm.scalaness.TypeAbbreviation("
                    { checksumType <: TypeX } 
                     <;>
                     { compute_checksum(data: Array[TypeY]): checksumType,
                       startPeriodic(period: UInt32): Void;
                       booted(): Void,
                       fired(): Void }",
                       List("TypeX","TypeY"))  

    @TypeAbbr(formatT.parameterize("UInt32","UInt8"))         
    val formattingModule = MessageFormatter.instantiate(desiredSize, UInt32)

    @TypeAbbr(formatT.parameterize("UInt16","UInt8"))   
    val formattingModule2 = MessageFormatter.instantiate(desiredSize, UInt16)
    
/* We can also declare type abbreviations with parameters of other type abbreviations, thus
creating even more shortcuts and usefulness. */

    
