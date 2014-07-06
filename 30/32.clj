(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn duplicate
  ([l] (if (= (count l) 0) () (concat [(first l) (first l)] (duplicate (rest l))))))

(deftest test32
  (is (= (duplicate [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (duplicate [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (duplicate [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (duplicate [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))

(run-tests)
