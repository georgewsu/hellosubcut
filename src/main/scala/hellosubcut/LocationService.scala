package hellosubcut

import com.escalatesoft.subcut.inject.BindingModule
import com.escalatesoft.subcut.inject.Injectable

class LocationService()(implicit val bindingModule: BindingModule) extends Injectable {

  val geocoder = injectOptional [Geocoder] getOrElse { new GeocoderImpl }

  def getCoordinates(location: String): Option[(Double, Double)] = {
    geocoder.getCoordinates(location)
  }

}
