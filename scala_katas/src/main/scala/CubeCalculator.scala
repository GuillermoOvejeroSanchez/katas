object CubeCalculator extends App {
  def cube(x: Int) = {
    x * x * x
  }
  def main(): Unit = {
    val cubeOf10 = CubeCalculator.cube(10);
    println(cubeOf10)
  }
}