(ns leiningen.new.scalding-cdh
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "scalding-cdh"))

(defn scalding-cdh
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["project.clj" (render "project.clj" data)]
["README.md" (render "README.md" data)]
[".gitignore" (render "gitignore" data)]
["data/input.txt" (render "data/input.txt")]
["src/scala/{{sanitized}}/ReadWriteFile.scala" (render "ReadWriteFile.scala" data)]
)))
