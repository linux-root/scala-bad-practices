import scala.collection.immutable.HashSet

object BadCaseClass {
  // mutable data in case class
  case class User(email: String, var age: Int)

  def main(args: Array[String]): Unit = {
    val mickey = User("mickey@mouse.com", 22)
    val set = HashSet(mickey)
    println(s"set contains Mickey: ${set.contains(mickey)}") // true
    mickey.age = 19
    println(s"set contains Mickey: ${set.contains(mickey)}") // false
  }

}
