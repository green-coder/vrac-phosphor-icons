(ns phosphor.icon-svg
  (:require [shadow.resource :as rc]))

{{#each icons}}
(def {{name}}-bold (rc/inline "icon/phosphor/bold/{{name}}.svg"))
(def {{name}}-regular (rc/inline "icon/phosphor/regular/{{name}}.svg"))
(def {{name}}-light (rc/inline "icon/phosphor/light/{{name}}.svg"))
(def {{name}}-thin (rc/inline "icon/phosphor/thin/{{name}}.svg"))
(def {{name}}-fill (rc/inline "icon/phosphor/fill/{{name}}.svg"))
(def {{name}}-duotone (rc/inline "icon/phosphor/duotone/{{name}}.svg"))
{{/each}}

(def all-icons-bold
  #js [
{{#each icons}}
       {{name}}-bold
{{/each}}
       ,])

(def all-icons-regular
  #js [
{{#each icons}}
       {{name}}-regular
{{/each}}
       ,])

(def all-icons-light
  #js [
{{#each icons}}
       {{name}}-light
{{/each}}
       ,])

(def all-icons-thin
  #js [
{{#each icons}}
       {{name}}-thin
{{/each}}
       ,])

(def all-icons-fill
  #js [
{{#each icons}}
       {{name}}-fill
{{/each}}
       ,])

(def all-icons-duotone
  #js [
{{#each icons}}
       {{name}}-duotone
{{/each}}
       ,])
