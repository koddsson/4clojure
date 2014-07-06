(= (#(if(= %2 0) (first %1) (recur (rest %1) (dec %2))) '(4 5 6 7) 2) 6)
(= (#(if(= %2 0) (first %1) (recur (rest %1) (dec %2))) [:a :b :c] 0) :a)
(= (#(if(= %2 0) (first %1) (recur (rest %1) (dec %2))) [1 2 3 4] 1) 2)
(= (#(if(= %2 0) (first %1) (recur (rest %1) (dec %2))) '([1 2] [3 4] [5 6]) 2) [5 6])
