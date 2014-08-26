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
             "Bundle-Name" "Derived Class Bundle"
             "Import-Package" "com.example,com.example.base,clojure,clojure.lang";;"com.example,com.example.base,clojure,clojure.lang,clojure.asm,clojure.asm.commons,clojure.core,clojure.lang,clojure.core.protocols,clojure.core.proxy$clojure.lang,clojure.data,clojure.inspector.proxy$java.lang,clojure.inspector.proxy$javax.swing.table,clojure.instant.proxy$java.lang,clojure.java,clojure.java.api,clojure.java.browse_ui.proxy$java.lang,clojure.java.io,clojure.lang,clojure.asm.commons,clojure.pprint,clojure.pprint.proxy$java.io,clojure.pprint,clojure.reflect,clojure.reflect.proxy$clojure.asm,clojure.lang,clojure.repl.proxy$java.io,clojure.repl.proxy$java.lang,clojure.test,clojure.xml.proxy$java.lang"
             "Clojure-Require" "com.example.activator,com.example.derived"
             "Clojure-ActivatorNamespace" "com.example.activator"
             "DynamicImport-Package" "*"}
  :omit-source true
  :jar-exclusions [#"clojure/osgi/*"]
  :prep-tasks [["compile" "com.example.derived"]
               "javac" "compile"]
  :aot :all; [com.example.derived]
  )
