# -*- coding: utf-8 -*-
"""
Fibonacci hacia adelante con limite de digitos extendido

Curso: MCA1 2026-1

Tarea: Implementación Numérica Fibonacci - Diccionario/TablaHash
       Actividad 2.5.a

Objetivo: Calcular el valor n-ésimo de la suceción de Fibonacci 
          sin saturar la memoria extendiedo el límite base del 
          número de digitos "integer string conversion". 
     
Tema: Cálculo de una sucesión recursiva hacia adelante
      para evitar llamadas redundantes

Información:
    
   * sys.set_int_max_str_digits(#numeroDigitos) to increase the limit que es de
     4300 digitos (la posición 20577 máximo)  y con ello evitar el 
    "ValueError: Exceeds the limit (4300 digits) for integer string conversion"
   
   * if __name__ == "__main__":
      Sirve para ejecutar un bloque de código solo cuando el script se 
      ejecuta directamente, y no cuando se importa como un módulo en otro 
      archivo.


Referencia: Classic Computer Science Problems with Python
            pag 11   fib5.py 

Software: Python 3.12.12

Editor: Roberto Méndez Méndez

Editado:  06 Ene 2026
"""
import sys

# Set the limit to a new, higher value
sys.set_int_max_str_digits(100000)

def fibAdel(n: int) -> int:
    if n == 0: return n
    penultimo: int = 0
    ultimo:    int = 1
    for _ in range(1, n):
        penultimo, ultimo = ultimo, penultimo + ultimo
    return ultimo

if __name__ == "__main__":
    n = int(input("¿De qué posición quieres el valor de Fibonacci?  "))
    print(f"El  {n}-ésimo valor de Fibonacci es: {fibAdel(n)}") 
