package hellosubcut

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class LocationServiceTestSuite extends FunSuite with ShouldMatchers {

  test("Location service returns None for non-existent location") {
    implicit val bindingModule = ConfigurationModule
    val locationService = new LocationService()
    locationService.getCoordinates("nonexistent") should be(None)
  }

}
