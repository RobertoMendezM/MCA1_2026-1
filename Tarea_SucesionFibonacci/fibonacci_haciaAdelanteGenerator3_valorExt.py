# -*- coding: utf-8 -*-
"""
Fibonacci con función Generator versión 3 con el límite de digitos extendido

Curso: MCA1 2026-1

Tarea: Implementación Numérica Fibonacci - Diccionario/TablaHash
       Actividad 2.5.b.2

Objetivo: Calcula hacia adelante los valores de fibonacci para un número
          más grande que le usual permitido e imprimir solo el valor de la
          posición indicada 

Información:
    
    yield
       La sentencia yield suspende la ejecución de una función y devuelve 
       un valor al invocador, pero conserva suficiente estado para que la 
       función pueda reanudarse donde la dejó. Cuando la función se reanuda, 
       continúa la ejecución inmediatamente después de la última ejecución 
       de yield. Esto permite que su código genere una serie de valores a 
       lo largo del tiempo, en lugar de calcularlos de una vez y devolverlos
       como una lista.
      
    if __name__ == "__main__":
       Sirve para ejecutar un bloque de código solo cuando el script se 
       ejecuta directamente, y no cuando se importa como un módulo en otro 
       archivo.

Referencias: 
 
  Classic Computer Science Problems with Python pag 12   fib9.py
            
  https://www.geeksforgeeks.org/python/use-yield-keyword-instead-return-keyword-python/

Editor: Roberto Méndez Méndez

Created on Fri Jun 14 2024
Edited: Ene 06 2026 
"""

from typing import Generator
import sys

# Set the limit to a new, higher value
sys.set_int_max_str_digits(100000)

def fibGen(n: int) -> Generator[int, None, None]:
    yield 0
    if n > 0:
       yield 1
       penultimo: int = 0
       ultimo:    int = 1
       for _ in range(1, n):
           penultimo, ultimo = ultimo, penultimo + ultimo
           yield ultimo

if __name__ == "__main__":
    n = int(input("¿Fibonacci hasta la posición? \n"))
    fibos = list(fibGen(n))
    print(f"El  {n}-ésimo valor de Fibonacci es: \n {fibos[-1]}") 

