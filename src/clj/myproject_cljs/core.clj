(ns myproject-cljs.core
  (:import myproject.cljs.Foo))

(defmacro my-baz []
  (.bar (Foo.)))
