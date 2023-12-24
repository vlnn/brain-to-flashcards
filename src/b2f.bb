#!/usr/bin/env bb

(ns b2f
  (:require [babashka.deps :as deps]
            [babashka.cli :as cli]
            [babashka.curl :as curl]
            [clojure.test :as t :refer [deftest is]]))

; query-tagged-thoughts-ids
(defn query-tagged-thoughts-ids
  "Create a query to TheBrain API that returns thought ids"
  [tag]
  "https://httpstat.us/200")

(defn get! [query]
  (curl/get query))

(println (get! (query-tagged-thoughts-ids "boo")))

(comment
 (def cli-options {:port {:default 80 :coerce :long}}
                  :help {:coerce :boolean}))

