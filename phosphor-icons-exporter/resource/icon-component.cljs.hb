(ns phosphor.icon
  (:refer-clojure :exclude [atom cat divide drop empty hash key list repeat shuffle])
  (:require [shadow.resource :as rc]
            [vrac.web :as vw :refer [$]]
            [phosphor.icon-svg :as svg]))

(defn icon-component [svg-str]
  (fn [props]
    ($ (vw/html-text-to-dom svg-str)
       {:class ["icon"]
        :width "1em"
        :height "1em"}
       props)))

{{#each icons}}
(def {{name}}-bold (icon-component svg/{{name}}-bold))
(def {{name}} (icon-component svg/{{name}}-regular))
(def {{name}}-light (icon-component svg/{{name}}-light))
(def {{name}}-thin (icon-component svg/{{name}}-thin))
(def {{name}}-fill (icon-component svg/{{name}}-fill))
(def {{name}}-duotone (icon-component svg/{{name}}-duotone))
{{/each}}
