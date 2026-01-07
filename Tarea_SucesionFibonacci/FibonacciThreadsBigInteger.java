/**
 * Curso: Programación / MCA 1
 *
 * Fibonacci con BigInteger
 *
 *Referencia:
 *       Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and Datenstrukturen Eine
 *       Einführung mit Java
 *       - Buchseite: 392
 *       - Pogramm 9.4 geändert
 *
 *Temas:  Sucesiones
 *        Runnable-Threads
 *        llamadas recursivas
 *        Ciclos
 *        BigInteger
 *
 * Software: java 25
 *           IDE IntelliJ 2025.3.1
 *
 * Editor: Roberto Méndez Méndez
 * Creación: 14/Dic/21
 * Edición: 06/ Ene /26  Corrigió Error en Fibonacci
 *                       Variable global "numThread" para numeros de hilos de
 *                       ejecución
 */

import java.math.BigInteger;
public class FibonacciThreadsBigInteger implements Runnable{

    BigInteger fi;
    int num;
    private static final int numThread = 10;

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
            return f;
        } else
            return fibonacci(f.add(BigInteger.ONE.negate())).add(
                             fibonacci(f.add(BigInteger.TWO.negate())));
    }

    static void main(){

        Thread[] threads = new Thread[numThread];

        for (int i = 0; i < numThread; i++) {
            long algo = (long)(Math.random()*45) + 1;
            threads[i] = new Thread(
                    new FibonacciThreadsBigInteger(i, BigInteger.valueOf(algo)));
        }
        for(int i = 0; i < numThread; i++) threads[i].start();
    }
}
