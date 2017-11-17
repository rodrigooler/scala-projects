package examples

object Tuple extends App {
  val (int: Int, string: String) = Pair(40, "Foo"); println(int, string)
  val (int2, string2) = Pair(100, "Roo"); println(int2, string2)
}
