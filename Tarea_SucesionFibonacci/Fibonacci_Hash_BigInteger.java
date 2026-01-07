/**
 * Curso: MCA 1 2026-1 / Ago-Dic 2025
 *
 * Tarea: Implementación Numérica Fibonacci - Diccionario/TablaHash
 *        Actividad 4.IV.2
 *
 * Aviso: Modificación de Fibonacci_Hash.java
 *        Se utiliza BigInteger para no propiciar Integer Overflow, pero
 *        como era de esperarse, se sigue produciendo Stack Overflow en 6109
 *
 * Computadora: MSI G66 Raider 10UE / 16 GB RAM
 *              SO Windows 11
 *
 * Temas: Sucesiones
 *         Fibonacci con BigInteger y Tabla Hash
 *
 * Software: java 25
 *           IDE IntelliJ 2025.3.1
 *
 * Editor: Roberto Méndez Méndez
 * Creación: 06/ Ene /26
 */
import java.util.Hashtable;
import java.math.BigInteger;

public class Fibonacci_Hash_BigInteger {

    private static Hashtable<Integer, BigInteger> fiboSuc =
            new Hashtable<Integer, BigInteger>();

    public Fibonacci_Hash_BigInteger() {
        fiboSuc.put(0, BigInteger.ZERO);
        fiboSuc.put(1, BigInteger.ONE);
        fiboSuc.put(2, BigInteger.ONE);
    }

    public BigInteger fibonacci(int n)
    {
        if (!fiboSuc.containsKey(n))
            fiboSuc.put(n, fibonacci(n-1).add(fibonacci(n-2)));
        return fiboSuc.get(n);
    }

    static void main() {

        Fibonacci_Hash_BigInteger val = new Fibonacci_Hash_BigInteger();
        String n = IO.readln("¿De qué posición quieres el valor de Fibonacci?:  ");
        try {
            IO.println("El valor de fibonacci para la posición " + n + " es: " +
                    val.fibonacci(Integer.parseInt(n)));
        } catch (NumberFormatException e) {
            System.out.println("Error: El dato ingresado no es un entero válido.");
        }
    }
}
