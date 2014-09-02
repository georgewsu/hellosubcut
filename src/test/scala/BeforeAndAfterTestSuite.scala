import org.scalatest.BeforeAndAfter
import org.scalatest.BeforeAndAfterAll
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class BeforeAndAfterTestSuite extends FunSuite
    with BeforeAndAfterAll
    with BeforeAndAfter
    with ShouldMatchers {

  override def beforeAll() {
    println("beforeAll")
  }

  override def afterAll() {
    println("afterAll")
  }

  before {
    println("before")
  }

  after {
    println("after")
  }

  test("Test 1 + 1 should be 2") {
    1 + 1 should be (2)
  }

  test("Test 2 + 2 should be 4") {
    2 + 2 should be (4)
  }

}
