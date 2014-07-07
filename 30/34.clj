(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn my-range
  ([x y] (reverse (my-range x '() y)))
  ([x l y] (if (= x y) l (my-range (inc x) (conj l x) y))))

(deftest test32
 (is (= (my-range  1 4) '(1 2 3)))
 (is (= (my-range -2 2) '(-2 -1 0 1)))
 (is (= (my-range  5 8) '(5 6 7))))

(run-tests)
