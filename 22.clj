(= ((fn c [x] (if (empty? x) 0 (+ 1 (c (rest x))))) '(1 2 3 3 1)) 5)
(= ((fn c [x] (if (empty? x) 0 (+ 1 (c (rest x))))) "Hello World") 11)
(= ((fn c [x] (if (empty? x) 0 (+ 1 (c (rest x))))) [[1 2] [3 4] [5 6]]) 3)
(= ((fn c [x] (if (empty? x) 0 (+ 1 (c (rest x))))) '(13)) 1)
(= ((fn c [x] (if (empty? x) 0 (+ 1 (c (rest x))))) '(:a :b :c)) 3)
