package hellosubcut

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class LocationServiceTestSuite extends FunSuite with ShouldMatchers {

  test("Location service returns None for non-existent location") {
    implicit val bindingModule = ConfigurationModule
    val locationService = new LocationService()
    locationService.getCoordinates("nonexistent") should be(None)
  }

  test("Location service returns coordinates for San Francisco") {
    implicit val bindingModule = ConfigurationModule
    val locationService = new LocationService()
    locationService.getCoordinates("San Francisco") should be(Some((37.7749295, -122.4194155)))
  }

  test("Mock location service returns coordinates for San Francisco") {
    ConfigurationModule.modifyBindings { implicit testModule =>
      testModule.bind [Geocoder] toSingle new GeocoderMock
      val locationService = new LocationService()
      locationService.getCoordinates("San Francisco") should be(Some((37.7749295, -122.4194155)))
    }
  }

  test("Mock location service returns fake coordinates for all other locations") {
    ConfigurationModule.modifyBindings { implicit testModule =>
      testModule.bind [Geocoder] toSingle new GeocoderMock
      val locationService = new LocationService()
      locationService.getCoordinates("Chicago") should be(None)
      locationService.getCoordinates("Los Angeles") should be(None)
      locationService.getCoordinates("New York") should be(None)
    }
  }

}
