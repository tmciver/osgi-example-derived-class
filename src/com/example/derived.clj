(ns com.example.derived
  (:gen-class :name com.example.derived.DerivedClass
              :extends com.example.base.BaseClass))

(defn- -doSomething
  []
  (println "Derived.doSomething()"))

