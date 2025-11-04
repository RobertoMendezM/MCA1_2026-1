/**
 * Lamada con paramtro una Función
 *
 * Curso: MCA 1 2026-1 FCiencias
 *
 * tema: Paso de una función como parámetro
 *       Thread
 *
 * Referencia:
 * https://docs.scala-lang.org/es/tutorials/scala-for-java-programmers.html
 * https://docs.scala-lang.org/scala3/book/control-structures.html#the-ifthenelse-construct
 *
 * Software: Scala 3.7.3
 *
 * Editor: Roberto Méndez
 * Credo: 4 Nov 25
 */

object Temporizador1 {
  def unaVezPorSegundo(fcallback: () => Unit): Unit = {
    var n = 0
    var continue = true
    while(continue){
      fcallback();
      Thread sleep 1000
      if n == 6 then continue = false
      n += 1
    }
  }

  def tiempoVuela(): Unit = {
    println("The time fly and never comeback...")
  }

  def main(args: Array[String]): Unit ={
    unaVezPorSegundo(tiempoVuela)
  }
}
