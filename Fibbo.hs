module Main where

fibbo 1 = 1
fibbo 0 = 0 
fibbo n = fibbo(n-1)+fibbo(n-2)

main = do print(fibbo 10)