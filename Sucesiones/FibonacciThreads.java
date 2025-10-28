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
 *           IDE IntelliJ 2025.2.3
 *
 * Editor: Roberto Méndez
 * Creación: 14/ Dic/ 21
 * Edición: 27/ Oct /25
 */
public class FibonacciThreads implements Runnable{

    long fi;
    int num;

    public FibonacciThreads(int n, long f){
        num = n;
        fi = f;
    }

    @Override
    public void run() {
        IO.println("Starte #" + num);
        long res = fibonacci(fi);
        System.out.println("Abschlussverfahren: " + num +
                            " - "+"fibonacci(" + fi + ") =" + res);
    }

    long fibonacci(long f) {
        if (f < 2)
            return 1;
        else
            return fibonacci(f - 1) + fibonacci(f - 2);
    }

    static void main(){
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new FibonacciThreads(i,
                                 (long) (Math.random() * 50) + 1));
        }

        for(int i = 0; i < 10; i++) threads[i].start();
    }
}
