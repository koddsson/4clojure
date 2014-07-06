(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn fib 
  ([n] (fib n '(1 1)))
  ([n l]
    (if (= n (count l))
        (reverse l)
        (fib n (conj l (reduce + (take 2 l)))))))

(deftest fib1
  (is (= (fib 3) '(1 1 2))))

(deftest fib2
  (is (= (fib 6) '(1 1 2 3 5 8))))

(deftest fib3 
  (is (= (fib 8) '(1 1 2 3 5 8 13 21))))

(run-tests)
