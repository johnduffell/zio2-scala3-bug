import zio.*
import zio.json.*

case class EmptyCaseClass1()

case class EmptyCaseClass2()

trait Layer2 {}
//to fail, has to be the companion object of the above Layer
object Layer2 {

  // and a generated decoder needs to be inside it (even if unused)
  given JsonDecoder[EmptyCaseClass2] = DeriveJsonDecoder.gen[EmptyCaseClass2]

}
