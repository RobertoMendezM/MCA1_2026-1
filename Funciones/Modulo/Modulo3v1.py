# -*- coding: utf-8 -*-
"""
Created on Mon Sep 11 20:46:35 2023

Programa que muestra como la operación módulo 3
genera una partición en el conjunto de enteros -99 a 99

Utiliza las funciones de python: set() y sorted()

@author: Roberto Méndez
"""

ClaseEquiv0 = set()
ClaseEquiv1 = set()
ClaseEquiv2 = set()

for i in range(100):
    if i % 3 == 0:
        ClaseEquiv0.add(i)
        ClaseEquiv0.add(-i)
    elif i % 3 == 1:
        ClaseEquiv1.add(i)
        ClaseEquiv1.add(-i)
    else:
        ClaseEquiv2.add(i)
        ClaseEquiv2.add(-i)

print("Clase [0] =", sorted(ClaseEquiv0))
print("Clase [1] =", sorted(ClaseEquiv1))
print("Clase [2] =", sorted(ClaseEquiv2))

print("La intersección de los tres conjuntos es: ", 
      ClaseEquiv0 & ClaseEquiv1 & ClaseEquiv2)

print("La unión de los tres conjuntos es: ", 
      sorted(ClaseEquiv0 | ClaseEquiv1 | ClaseEquiv2))

