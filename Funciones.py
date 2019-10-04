# -*- coding: utf-8 -*-
"""
Editor de Spyder
Codigo realizado por
Luis Daniel Hormiga González 20172020026
Joan Sebastian Perez Mejía 20161020055
Javier Andres Aponte Quevedo 20172020036
"""


def cuadrado(x):
    return x*x

def infinito():
    return 1 + infinito

def tres(x):
    return 3

def sumar(x):
    if x == []:
        return 0
    return x[0]  + sumar(x[1:])

def invertir(x):
    if x == []:
        return []
    return invertir(x[1:]) + [x[0]]

def igualLista(x,y):
    return x==y

def lista_ordenada(x):
    if x == []:
        return True
    if x == [" "]:
        return True
    return (x[0] <= x[1]) and lista_ordenada(x[1:])

def mostrarUbicacion(x,u):
    return x[u]

def mayor(x):
    if x == []:
        return 0
    if x[0] > mayor(x[1:]):
        return x[0]
    else:
        return mayor(x[1:])
    
def factorial(x):
    if x == 0:
        return 1
    return x * factorial(x-1)

def contarPares(x):
    if x==[]:
      return 0
    return  len(list(y for y in x if y%2 == 0))

def divisible(x,y):
    if x%y == 0:
        return True
    return False
def divisibles(x):
    return list(y for y in range(1,x+1) if divisible(x,y))

def esPrimo(x):
    return len(divisibles(x)) <= 2

def primos(x):
    return list(y for y in range(1,x+1) if esPrimo(y))

def cuadrados(x):
    return list(y*y for y in x)

