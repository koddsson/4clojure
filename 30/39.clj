(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn inter-leave
  ([x y] (inter-leave x [] y))
  ([x l y] (if (or (= (count x) 0) (= (count y) 0))
             l ; If either list is emtpy return a empty list
             (flatten (inter-leave (rest x) (conj (conj l (first x)) (first y)) (rest y))))))

(deftest test42
  (is (= (inter-leave [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
  (is (= (inter-leave [1 2] [3 4 5 6]) '(1 3 2 4)))
  (is (= (inter-leave [1 2 3 4] [5]) [1 5]))
  (is (= (inter-leave [30 20] [25 15]) [30 25 20 15])))

(run-tests)
