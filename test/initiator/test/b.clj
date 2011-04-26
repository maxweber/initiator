(ns #^{:initiator true}
    initiator.test.b)

(defn ^{:glue {:name "name.ActionB"}} b [msg]
  (println msg))

(defn c [])
