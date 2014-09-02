package hellosubcut

trait Geocoder {

  def getCoordinates(location: String): Option[(Float, Float)]

}
