(defproject aleph "0.2.1-SNAPSHOT"
  :description "a framework for asynchronous communication"
  :repositories {"jboss" "http://repository.jboss.org/nexus/content/groups/public/"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.clojure/data.json "0.1.1"]
                 [org.clojure.contrib/prxml "1.3.0-alpha4"]
                 [io.netty/netty "3.3.0.Final"]
                 [clj-http "0.1.3"]
                 [lamina "0.4.1-alpha1"]
                 [gloss "0.2.1-alpha1"]
                 [user-agent-utils "1.2.3"]
                 [cheshire "2.0.4"]
                 [potemkin "0.1.1"]]
  :multi-deps {:all [[org.clojure/tools.logging "0.2.3"]
                     [org.clojure/data.json "0.1.1"]
                     [org.clojure.contrib/prxml "1.3.0-alpha4"]
                     [io.netty/netty "3.3.0.Final"]
                     [clj-http "0.1.3"]
                     [lamina "0.4.1-alpha1"]
                     [gloss "0.2.1-alpha1"]
                     [user-agent-utils "1.2.3"]
                     [potemkin "0.1.1"]]
               "1.2" [[org.clojure/clojure "1.2.1"]]}
  :jvm-opts ["-server" "-XX:+UseConcMarkSweepGC"])
