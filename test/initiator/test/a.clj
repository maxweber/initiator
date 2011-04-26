(ns initiator.test.a)

(defn ^{:glue {:name "name.Action"}} a [msg]
  (println msg))

(defn c [])
