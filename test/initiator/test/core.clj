(ns initiator.test.core
  (:use [initiator.core]
        lazytest.describe
        [lazytest.expect :only [expect]]))

(describe "The find-vars function"
  (given [relevant-var? #(:glue (meta %))]
    (it "should only search in namespaces which are annotated with the
         metadata entry :initiator true"
      (= #{'initiator.test.b 'initiator.test.c} (into #{} (relevant-namespaces))))
    (it "should find all relevant variables"
      (= #{#'initiator.test.b/b #'initiator.test.c/c}
         (into #{} (find-vars relevant-var?))))
    (it "should only find two variables in the test case scenario"
      (= 2 (count (find-vars relevant-var?))))))
