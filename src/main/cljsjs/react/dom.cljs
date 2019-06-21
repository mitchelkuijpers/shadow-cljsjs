(ns cljsjs.react.dom
  (:require ["react" :as react]
            ["react-dom" :as react-dom]))

(js/goog.object.set react "DOM" react-dom)
