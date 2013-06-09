
import reflect.runtime.universe._

object ReflectionTest {

  def checkType[A : TypeTag](item: A) {
    println("checkType invoked with: " + item)
    println("item.getClass     = " + item.getClass)
    println("typeOf[A]         = " + typeOf[A])

    val mirror = runtimeMirror(this.getClass.getClassLoader)
    println("via runtimeMirror = " + mirror.classSymbol(item.getClass).toType)
    println("")
  }

  def main(args: Array[String]) {
    val a = Array(1, "Hello", List("X", "Y", "Z"), Array("X", "Y", "Z"))
    for (item <- a) checkType(item)
  }

}
