import zio.*

object Testing {

  val layerSub: URLayer[Any, AnEmptyLayer] = ???
  val layerGet: URLayer[Any, MyLayer] = ???

  val zioEffect: ZIO[AnEmptyLayer with MyLayer, Nothing, Success] = ???

  def provide(): ZIO[Any, Any, Success] =
    zioEffect.provide(
      layerSub, layerGet
    )

}

trait AnEmptyLayer {}
