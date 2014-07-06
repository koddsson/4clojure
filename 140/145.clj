(= '(1 5 9 13 17 21 25 29 33 37)
  (for [x (range 40)
            :when (= 1 (rem x 4))]
        x))
