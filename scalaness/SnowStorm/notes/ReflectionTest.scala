
import reflect.runtime.universe._

object ReflectionTest {

  def checkType[A : TypeTag](item: A) {
    println("checkType invoked with: " + item)
    println("typeOf[A]: " + typeOf[A])
  }

  def main(args: Array[String]) {
    println("Hello, World!")

    val a = 0
    val b = Array(1, 2, 3)

    checkType(a)
    checkType(b)
  }

}
