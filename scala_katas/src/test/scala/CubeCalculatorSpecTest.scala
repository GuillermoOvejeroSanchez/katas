import org.scalatest.GivenWhenThen
import org.scalatest.funspec.AnyFunSpec

  class CubeCalculatorSpecTest extends AnyFunSpec with GivenWhenThen {
    describe("A Cube Calculator") {

      it("should return the cube of the given number") {

        Given("a value of 3")
        val value = 3

        When("applied the 'cube' function to the value")
        val result = CubeCalculator.cube(value)

        Then("the result should be equal to 27")
        assert(result == 26)
      }
    }
}