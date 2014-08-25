(ns com.example.activator
  (:require [clojure.osgi.services :as osgi]))

(defn- bundle-start [context]
  "Register OSGi service"
  (println "Starting OSGi from Clojure")
  (try (osgi/register-service* com.example.base.BaseClass {} (com.example.derived.DerivedClass.))
       (catch Exception e
         (println "Unable to register services"))))

(defn- bundle-stop [context]
  (println "bundle-stop is called"))
