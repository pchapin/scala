
object NameGenerator {
  var currentIndex = 0

  def get = {
    currentIndex = currentIndex + 1
    "_sc__" + currentIndex
  }

}
