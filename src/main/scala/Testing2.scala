import zio.*

case class EmptyCaseClass()

trait Layer2 {}
//to fail, has to be the companion object of the above Layer
object Layer2 {

  // and an implicit (even if unused)
  given String = ???

}
