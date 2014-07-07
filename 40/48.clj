(ns com.koddsson.for-clojure
  (:use [clojure.test :only [is deftest run-tests]]))

(deftest test48
  (is (= 6 (some #{2 7 6} [5 6 7 8])))
  (is (= 6 (some #(when (even? %) %) [5 6 7 8]))))

(run-tests)
