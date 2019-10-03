# -*- coding: utf-8 -*-
"""
Editor de Spyder
Codigo realizado por
Luis Daniel Hormiga González 20172020026
Joan Sebastian Perez Mejía 20161020055
Javier Andres Aponte Quevedo 20172020036
"""


def fibbo(x):
    if x == 0:
        return 0
    if x == 1:
        return 1
    return fibbo(x-1) + fibbo(x-2)

def potencia(x,y):
    
    if y == 0:
        return 1
    return x * potencia(x,y-1)

def divicion(x,y):
    
    if x < y:
        return 0
    return 1 + divicion(x-y,y) 