(ns distillate.db
  (:require [datomic.api :as d]))

(def ^:dynamic *db-uri* "datomic:mem://distillate")

(defn- connect
  "connect to datomic"
  []
  (d/connect *db-uri*))

(defn db
  "return a datomic db"
  []
  (d/db (connect)))

(defn q
  "query datomic"
  [query] (d/q query (db))
  [query & inputs] (apply d/q (concat [query (db)] inputs)))

(defn put!
  "put values into a datomic db"
  [& data]
  @(d/transact (connect) [data]))
