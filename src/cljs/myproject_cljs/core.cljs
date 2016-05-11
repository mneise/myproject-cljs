(ns myproject-cljs.core
  (:require-macros [myproject-cljs.core :refer [my-baz]]))

(enable-console-print!)

(println (my-baz))
