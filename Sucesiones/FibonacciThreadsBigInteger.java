/**
 * Curso: Programación / MCA 1
 *
 * Fibonacci con BigInteger
 *
 *Referencia:
 *       Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and Datenstrukturen Eine
 *       Einführung mit Java
 *       - Buchseite: 392
 *       - Pogramm 9.4  geändert
 *
 *Temas:  Sucesiones
 *        Runnable-Threads
 *        llamadas recursivas
 *        Ciclos
 *        BigInteger
 *
 * Editor: Roberto Méndez Méndez
 * Creación: 14/Dic/21
 * Editado:  27/Oct/25
 */

import java.math.BigInteger;
public class FibonacciThreadsBigInteger implements Runnable{

    BigInteger fi;
    int num;

    public FibonacciThreadsBigInteger(int n, BigInteger f){
        num = n;
        fi = f;
    }

    @Override
    public void run() {
        IO.println("Starte #" + num);
        BigInteger res = fibonacci(fi);
        System.out.println("Abschlussverfahren: " + num +
                               " - "+"fibonacci(" + fi + ") =" + res);
    }

    public BigInteger fibonacci(BigInteger f) {
        if (f.compareTo(BigInteger.TWO) < 0) {
            return BigInteger.ONE;
        } else
            return fibonacci(f.add(BigInteger.ONE.negate())).add(
                             fibonacci(f.add(BigInteger.TWO.negate())));
    }

    static void main(){

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            long algo = (long)(Math.random()*50) + 1;
            threads[i] = new Thread(
                    new FibonacciThreadsBigInteger(i, BigInteger.valueOf(algo)));
        }
        for(int i = 0; i < 10; i++) threads[i].start();
    }
}
