package hellosubcut

import com.escalatesoft.subcut.inject.NewBindingModule

object ConfigurationModule extends NewBindingModule (module => {
  import module._
  bind [Geocoder] toSingle new GeocoderImpl
})
