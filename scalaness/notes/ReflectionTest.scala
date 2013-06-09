
import reflect.runtime.universe._

object ReflectionTest {

  def checkType1[A : TypeTag](item: A) {
    println("checkType1 invoked with: " + item)
    println("item.getClass     = " + item.getClass)
    println("typeOf[A]         = " + typeOf[A])

    val mirror = runtimeMirror(this.getClass.getClassLoader)
    println("via runtimeMirror = " + mirror.classSymbol(item.getClass).toType)
    println("")
  }

  def checkType2(item: Any) {
    item match {
      case _: Int           => println("Int")
      case _: String        => println("String")
      case _: List[String]  => println("List[String]")
      case _: Array[String] => println("Array[String]")
      case _                => println("Unknown type")
    }
  }

  def main(args: Array[String]) {
    val a = Array(1, "Hello", List("X", "Y", "Z"), Array("X", "Y", "Z"))
    for (item <- a) checkType1(item)

    for (item <- a) checkType2(item)
  }

}
