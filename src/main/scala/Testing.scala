import zio.*

object Testing {

  val layer1: URLayer[Any, Layer1] = ???
  val layer2: URLayer[Any, Layer2] = ???

  // to fail, we need to reference EmptyCaseClass1 and Layer2 from the other file, *and* have two layers needed
  val zioEffect: ZIO[Layer1 with Layer2, Nothing, EmptyCaseClass1] = ???

  // this line fails to *clean* compile - however often compiling a second time works ok.
  val error = zioEffect.provide(layer1, layer2)
  // alternatively, this one does compile
//  val compilesOk = zioEffect.provideSomeLayer[Layer2](layer1).provideSomeLayer[Any](layer2)

}

trait Layer1 {}
