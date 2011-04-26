(ns #^{:initiator true}
    initiator.test.c)

(defn ^{:glue {:name "name.ActionC"}} c [msg]
  (println msg))

(defn d [])
