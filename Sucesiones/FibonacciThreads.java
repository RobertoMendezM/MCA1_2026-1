/**
 * Curso: Programación / MCA 1
 *
 * Referencia:
 *       Gunter Saake Kai-Uwe Sattler (2021).
 *       Algorithmen and Datenstrukturen Eine Einführung mit Java
 *       Buchseite: 392 Pogramm 9.4
 *
 * Temas: Sucesiones
 *        Runnable-Threads
 *        llamadas recursivas
 *        Ciclos
 *
 * Software: Java 25
 *           IDE IntelliJ 2025.3.1
 *
 * Editor: Roberto Méndez
 * Creación: 14/ Dic/ 21
 * Edición: 06/ Ene /26  Corrigió Error en Fibonacci
 *                       Variable global "numThread" para numeros de hilos de
 *                       ejecución
 */
public class FibonacciThreads implements Runnable{

    long fi;
    int num;
    private static final int numThread = 10;

    public FibonacciThreads(int n, long f){
        num = n;
        fi = f;
    }
    @Override
    public void run() {
        IO.println("Starte #" + num);
        long res = fibonacci(fi);
        System.out.println("Abschlussverfahren: " + num +
                            " / "+"fibonacci(" + fi + ") = " + res);
    }

    long fibonacci(long f) {
        if (f < 2)
            return f;
        else
            return fibonacci(f - 1) + fibonacci(f - 2);
    }

    static void main(){
        Thread[] threads = new Thread[numThread];

        for (int i = 0; i < numThread; i++) {
           threads[i] = new Thread(new FibonacciThreads(i,
                                 (long) (Math.random() * 50) + 1));
           // De prueba para un número de Fibonacci específico
           //threads[i] = new Thread(new FibonacciThreads(i, 54));
        }

        for(int i = 0; i < numThread; i++) threads[i].start();
    }
}
