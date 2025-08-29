/********************************************************************
Caracteres como Enteros (ASCII)


Curso: Matemáticas para Ciencias Aplicadas I
Autor:   Roberto Méndez
Edición: 27 Ago 2025
********************************************************************/

#include <stdio.h>

int main()

{
   char a, b;
   int suma;
    printf("Dame dos letras separadas por un espacio: ");
    scanf("%c %c", &a, & b);
    suma = a + b;
    printf("La suma de %c + %c es: %d", a, b, suma);
    return 0;
}