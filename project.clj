(defproject anbf "0.1.0-SNAPSHOT"
  :description "A Nethack Bot Framework"
  :url "https://github.com/krajj7/ANBF"
  :license {:name "GPLv2"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :resource-paths ["jta26/jar/jta26.jar"]
  ;:global-vars {*warn-on-reflection* true}
  :aot [anbf.term] ; force compilation of the JTA plugin
  :main anbf.main)
