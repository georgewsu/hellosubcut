package hellosubcut

import com.escalatesoft.subcut.inject.NewBindingModule

object TestConfigurationModule extends NewBindingModule (module => {
  import module._
  bind [Geocoder] toSingle new GeocoderMock
})
