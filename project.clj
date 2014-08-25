(defproject derived-class-lib "0.1.0-SNAPSHOT"
  :description "Test OSGi bundle for creating a derived class created with
  gen-class and creating an instance in the activator start method."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [base-class-lib "0.1.0-SNAPSHOT"]
                 ;;[org.osgi/org.osgi.core "4.3.0"]
                 [com.theoryinpractise/clojure.osgi "1.6.0-1"]]
  :manifest {"Bundle-SymbolicName" "com.example.derived"
             "Bundle-Import" "clojure.lang,com.example.base"
             "Clojure-Require" "com.example.derived"
             "Clojure-Activator" "com.example.activator"}
  :omit-source true
  :aot [com.example.derived])
