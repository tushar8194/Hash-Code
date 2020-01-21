package sample

object PizzaDistribution {

  def main(args: Array[String]): Unit = {

    val inputItr = io.Source.fromFile(getClass.getResource("/input/sampleTest.csv").getPath).getLines().grouped(3)

    val maxSlice = inputItr.map(_.toVector).foreach(x => {
      val line1 = x(0)
      val line2 = x(1)
      println("First Line : " + line1 + " Second Line : " + line2)
      })
  }


}
