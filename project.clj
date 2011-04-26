(defproject initiator "0.1.0-SNAPSHOT"
  :description "The initiator searchs in namespaces for variables (e.g. functions)
                which has the specified metadata entry. Only namespaces with the
                {:initiator true} metadata entry are included in the search"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies [[com.stuartsierra/lazytest "1.1.2"]]
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"})
