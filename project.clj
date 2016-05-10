(defproject myproject-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.51"]]
  :plugins [[lein-cljsbuild "1.1.4-SNAPSHOT"]]
  :source-paths ["src/cljs"]
  :java-source-paths ["src/java"]
  :cljsbuild {:builds {:dev {:source-paths ["src/cljs"]
                             :compiler {:output-to "out/main.js"
                                        :optimizations :whitespace
                                        :pretty-print true}}}})
