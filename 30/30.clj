(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(defn compress
  ([x] (if (empty? x) x
         (remove nil? (conj (compress (rest x)) ; concat the rest of the results
            (if (= (first x) (second x)) nil (first x))))))) ; with the current char given the next one isn't the same

(deftest test30
  (is (= (apply str (compress "Leeeeeerrroyyy")) "Leroy"))
  (is (= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (is (= (compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))

(run-tests)
