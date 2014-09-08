(defproject distillate "0.1.0-SNAPSHOT"
  :description "distillate whiskey describer"
  :url "https://github.com/jarofghosts/distillate"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic "0.8.3335"]
                 [compojure "1.1.8"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler distillate.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
