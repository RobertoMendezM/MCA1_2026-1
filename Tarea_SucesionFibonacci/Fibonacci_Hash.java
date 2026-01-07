/**
 * Curso: MCA 1 2026-1 / Ago-Dic 2025
 *
 * Tarea: Implementación Numérica Fibonacci - Diccionario/TablaHash
 *        Actividad 4.IV.1
 *
 * Aviso: Esta implementacion genera Integer Overflow cuando se le pide
 *        93va posición en adelante y Stack Overflow con la 6126va posición
 *        en adelante
 * Computadora: MSI G66 Raider 10UE / 16 GB RAM
 *              SO Windows 11
 *
 * Temas: Sucesiones
 *         Fibonacci con Tabla Hash
 *
 * Software: java 25
 *           IDE IntelliJ 2025.3.1
 *
 * Editor: Roberto Méndez Méndez
 * Creación: 06/ Ene /26
 */
import java.util.Hashtable;

public class Fibonacci_Hash {

    private static Hashtable<Integer, Long> fiboSuc =
            new Hashtable<Integer, Long>();

    public Fibonacci_Hash() {
        fiboSuc.put(0, 0L);
        fiboSuc.put(1, 1L);
        fiboSuc.put(2, 1L);
    }

    public long fibonacci(int n)
    {
        if (!fiboSuc.containsKey(n))
            fiboSuc.put(n, fibonacci(n-1) + fibonacci(n-2));
        return fiboSuc.get(n);
    }

    static void main() {

        Fibonacci_Hash val = new Fibonacci_Hash();
        String n = IO.readln("¿De qué posición quieres el valor de Fibonacci?:  ");
        try {
            IO.println("El valor de fibonacci para la posición " + n + " es: " +
                    val.fibonacci(Integer.parseInt(n)));
        } catch (NumberFormatException e) {
            System.out.println("Error: El dato ingresado no es un entero válido.");
        }

    }
}