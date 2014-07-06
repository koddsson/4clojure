(= ((fn [n list] (apply merge (map #(hash-map % n) list))) 0 [:a :b :c]) {:a 0 :b 0 :c 0})
(= ((fn [n list] (apply merge (map #(hash-map % n) list))) "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
(= ((fn [n list] (apply merge (map #(hash-map % n) list))) [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
