import MyLayer.EmptyCaseClass
import zio.*
import zio.json.*

case class Success(
  a: String,
)

trait MyLayer :
  def get(): IO[Nothing, Unit]

object MyLayer {

  case class EmptyCaseClass()

  given JsonDecoder[EmptyCaseClass] = DeriveJsonDecoder.gen[EmptyCaseClass]

}
