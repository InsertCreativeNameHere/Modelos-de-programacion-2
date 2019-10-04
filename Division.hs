divi::Int->Int->Int
divi x y  |x < y = 0 |otherwise  = 1 + divi  (x-y) y
