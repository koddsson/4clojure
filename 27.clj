(false? (#(if (< (count %) 2) true (if (= (first %) (last %)) (recur (butlast (rest %))) false)) '(1 2 3 4 5)))
(true? (#(if (< (count %) 2) true (if (= (first %) (last %)) (recur (butlast (rest %))) false)) "racecar"))
(true? (#(if (< (count %) 2) true (if (= (first %) (last %)) (recur (butlast (rest %))) false)) [:foo :bar :foo]))
(true? (#(if (< (count %) 2) true (if (= (first %) (last %)) (recur (butlast (rest %))) false)) '(1 1 3 3 1 1)))
(false? (#(if (< (count %) 2) true (if (= (first %) (last %)) (recur (butlast (rest %))) false)) '(:a :b :c)))
