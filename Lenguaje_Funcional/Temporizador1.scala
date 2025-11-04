/**
 * Lamada con paramtro una Función
 *
 * Curso: MCA 1 2026-1 FCiencias
 *
 * tema: Pasod de una función
 *       Thread
 *
 * Referencia:
 * https://docs.scala-lang.org/es/tutorials/scala-for-java-programmers.html
 *
 * Editor: Roberto Méndez
 * Credo: 4 Nov 25
 */

object Temporizador1 {
  def unaVezPorSegundo(fcallback: () => Unit): Unit = {
    while(true){
      fcallback();
      Thread sleep 1000
    }
  }

  def tiempoVuela(): Unit = {
    println("The time fly and never comeback...")
  }

  def main(args: Array[String]): Unit ={
    unaVezPorSegundo(tiempoVuela)
  }
}
