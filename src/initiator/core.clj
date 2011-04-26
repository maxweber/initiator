(ns initiator.core
  (:use clojure.contrib.find-namespaces))

(defn relevant-namespaces []
  (filter #(:initiator (meta %)) (find-namespaces-on-classpath)))

(defn get-ns [n]
  (do
    (require n)
    (find-ns n)))

(defn find-vars [relevant-var?]
  (let [namespaces (relevant-namespaces)]
    (apply concat
           (map (fn [n]
                  (filter #(relevant-var? %)
                          (map val (ns-interns (get-ns n))))) namespaces))))
