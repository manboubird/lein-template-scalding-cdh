(defproject {{ns-name}} "0.1.0"
  :description "TODO: Project Description."
  :scala-source-path "src/scala"
  :prep-tasks ["scalac"]
  :main com.twitter.scalding.Tool
  :jvm-opts ["-Xmx768m" "-server"]
  :aot :all
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.scala-lang/scala-library "2.9.2"]
                 [com.twitter/scalding-core_2.9.2 "0.8.4"]]
  :profiles {:provided {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u2"]]}}
  :plugins [[lein-scalac "0.1.0"]]
  :repositories [["conjars.org" "http://conjars.org/repo"]
                 ["cloudera" "https://repository.cloudera.com/content/groups/public/"]]
  )
