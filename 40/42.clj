(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn fact
  ([x] (reduce * (range 1 (inc x)))))

(deftest test42
  (is (= (fact 1) 1))
  (is (= (fact 3) 6))
  (is (= (fact 5) 120))
  (is (= (fact 8) 40320)))

(run-tests)
