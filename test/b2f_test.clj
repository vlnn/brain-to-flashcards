(ns b2f-test
  (:require [clojure.test :refer [deftest is testing]]
            [b2f :as sut]))

(deftest truthy
  (is (zero? 0)))

#_(deftest query
    (is (= nil (sut/query-tagged-thoughts-ids "test-tag"))))
