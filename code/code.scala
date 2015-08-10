import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom

@JSExport
class MultiAlerter {
  val msgs = new HelloFactory

  @JSExport
  def multiAlert(n: Int) =
    for (i <- 1 to n) dom.alert(msgs.hello(i))
}

class HelloFactory {
  def hello(x: Int) = s"Hello World #$x"
  def helloDebug() = "Hello World"
}
