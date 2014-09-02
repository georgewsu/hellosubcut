import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class ShouldMatcherTestSuite extends FunSuite with ShouldMatchers {

  test("Test 2 + 2 should be 4") {
    2 + 2 should be (4)
  }

}
