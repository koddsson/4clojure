(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn my-flatten
  ([x] (if (not (or (seq? x) (vector? x)))
           [x]                        ; If x is not a sequence nor a vector
           (mapcat my-flatten x))))   ; else recursively apply the function

(deftest test28
  (is (= (my-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (is (= (my-flatten ["a" ["b"] "c"]) '("a" "b" "c")))
  (is (= (my-flatten '((((:a))))) '(:a))))

(run-tests)
