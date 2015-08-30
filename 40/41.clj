(defn drop-nth [l n]
  (vec
    (flatten
      (map
        #(if (= (count %) n) (drop-last %) %)
        (partition n n [] l)))))


(assert (= (drop-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
(assert (= (drop-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
(assert (= (drop-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))
