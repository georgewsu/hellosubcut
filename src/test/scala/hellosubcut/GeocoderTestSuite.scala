package hellosubcut

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class GeocoderTestSuite extends FunSuite with ShouldMatchers {

  test("Geocoder returns None for non-existent location") {
    val geocoder = new GeocoderImpl
    geocoder.getCoordinates("nonexistent") should be(None)
  }

}
