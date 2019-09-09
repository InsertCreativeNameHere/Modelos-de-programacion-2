# -*- coding: utf-8 -*-
"""
Editor de Spyder

Codigo realizado por
Luis Daniel Hormiga González 20172020026
Joan Sebastian Perez Mejía 20161020055
Javier Andres Aponte Quevedo 20172020036
"""

def factorial(n):
    if n == 0:
        return 1
    return n*factorial(n-1)

def cuadrado(n):
    return n*n

def infinito(n):
    return 1+infinito(n)

def tres(n):
    return 3

def sumarArray(n):
    if n == []:
        return 0
    return n[0] + sumarArray(n[1:])


        
    

