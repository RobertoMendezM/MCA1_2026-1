# -*- coding: utf-8 -*-
"""
Fibonacci con Memoria con cálculo hacia abajo

Curso: MCA1 2026-1

Tema: Sucesión con Memoria para evitar llamadas redundantes
   
   Dic[int, int] represents a dictionary where both keys and values are 
       integers. This means that each key in the dictionary must be an integer, 
       and the value associated with each key must also be an integer.
      
      En el diccionario se guardan las evaluaciones de la sucesión de fibonacci
      (aún cuando no se hayan evaluado explicitamente en un inico), con lo cual 
      se evita la llamada recurrente a valores ya "calculados".
   
   if __name__ == "__main__":
      Sirve para ejecutar un bloque de código solo cuando el script se 
      ejecuta directamente, y no cuando se importa como un módulo en otro 
      archivo.


Referencia: Classic Computer Science Problems with Python
            pag 10   fib3.py 


Software: Python 3.12.12

Editor: Roberto Méndez Méndez

Created on Fri Jun 14 2024
Edited: Oct 31 2025
"""

from typing import Dict

sucFib: Dict[int, int] = {0: 0, 1: 1}

def fibMem(n : int) -> int:
    if n not in sucFib:
        sucFib[n] = fibMem(n-1) + fibMem(n-2)
    return sucFib[n]

if __name__ == "__main__":
    n = int(input("¿Fibonacci en la posición?: "))
    print(f"The {n}th Fibonacci number is: {fibMem(n)}")
    print("Los valores calculados de la sucesión son: ")
    for z in sucFib:
        print(f"{z} : {sucFib[z]}")
        
