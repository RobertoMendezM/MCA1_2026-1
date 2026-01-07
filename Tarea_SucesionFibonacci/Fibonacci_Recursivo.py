# -*- coding: utf-8 -*-
"""
Fibonacci recursivo

Tema: Sobrecarga del proceso por saturación de llamadas recursivas


Notas: Forma totalmente incorrecta de programar fibonacci

 Función: 
     fibRec(n: int ) -> int:
         Calculates the nth Fibonacci number.
         Args  n: The index of the Fibonacci number to calculate.
         Returns: The nth Fibonacci number.

Referencia: Classic Computer Science Problems with Python
            pag 8   fib2.py 

Software: Python 3.12.12

editor: Roberto Méndez
Created on Thu Jun 13 10:13:22 2024
Editado: 22 Oct 2025
"""
 
def fibRec(n: int ) -> int:
  if n == 0 or n == 1:
    return n
  else:
    return fibRec(n-1) + fibRec(n-2)

n = int(input("Da el índice de valor de Fibonacci que deseas: "))

# Calculate and print the Fibonacci number
print(f"The {n}th Fibonacci number is: {fibRec(n)}")




