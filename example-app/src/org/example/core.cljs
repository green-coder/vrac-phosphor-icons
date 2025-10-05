(ns org.example.core
  (:require [vrac.web :as vw :refer [$]]
            [phosphor.icon :as pi]
            [phosphor.icon-svg :as pis]))

(defn root-ui []
  ($ :<>
     ($ :div.right-section
        ($ :a.button {:href "https://github.com/green-coder/vrac-phosphor-icons"
                      :target "_blank"}
           ($ pi/github-logo-duotone)
           "Source Code")
        ($ :a.button {:href "https://phosphoricons.com"
                      :target "_blank"}
           ($ pi/phosphor-logo {:style {:color "white"
                                        :background "black"
                                        :padding "0.3em"
                                        :border-radius "0.3em"}})
           "Phosphor"))

     ($ :h1 "Phosphor icons demo")

     ($ :hr)

     ($ :article.icon-color-candy-pink
        ($ :h2 "Icon style")
        ($ :div.grid-3columns
           (for [[style-name component component-name] [["thin"    pi/heart-thin    "pi/heart-thin"]
                                                        ["light"   pi/heart-light   "pi/heart-light"]
                                                        ["regular" pi/heart         "pi/heart"]
                                                        ["bold"    pi/heart-bold    "pi/heart-bold"]
                                                        ["duotone" pi/heart-duotone "pi/heart-duotone"]
                                                        ["fill"    pi/heart-fill    "pi/heart-fill"]]]
             ($ :<>
                ($ :span.text-align-right style-name)
                ($ component)
                ($ :pre "($ " component-name ")")))))

     ($ :article.icon-color-candy-pink
        ($ :h2 "Icon size")
        ($ :div.grid-2columns
           (for [size [1 2 4 8]
                 :let [size-unit (str size "em")
                       props {:width size-unit
                              :height size-unit}]]
             ($ :<>
                ($ pi/heart-fill props)
                ($ :pre "($ pi/heart-fill " (pr-str props) ")")))))

     ($ :article
        ($ :h2 "CSS style")
        ($ :div.grid-2columns
           (for [color ["#d9ed92" "#99d98c" "#52b69a" "#168aad" "#1e6091"]
                 :let [props {:style {:color color}}]]
             ($ :<>
                ($ pi/heart-fill props)
                ($ :pre  "($ pi/heart-fill " (pr-str props) "")))))

     ($ :article
        ($ :h2 "Raw SVG text access")
        ($ :div.grid-2columns
           (let [props {:width "1em"
                        :height "1em"}]
             ($ :<>
                ($ (vw/html-text-to-dom pis/heart-regular) props)
                ($ :pre "($ (vw/html-text-to-dom pis/heart-regular) " (pr-str props) ")")
                ($ (vw/html-text-to-dom pis/heart-duotone) props)
                ($ :pre "($ (vw/html-text-to-dom pis/heart-duotone) " (pr-str props) ")")
                ($ (vw/html-text-to-dom pis/heart-fill) props)
                ($ :pre "($ (vw/html-text-to-dom pis/heart-fill) " (pr-str props) ")")))))

     ($ :article.icon-color-candy-pink
        ($ :h2 "'all-icons-[style]' raw SVG text collections")

        ($ :h3 "all-icons-regular")
        (for [svg-str (take 100 pis/all-icons-regular)]
          ($ (vw/html-text-to-dom svg-str)
             {:class ["icon"]
              :width "1em"
              :height "1em"}))
        ($ :span " etc ...")

        ($ :h3 "all-icons-duotone")
        (for [svg-str (take 100 pis/all-icons-duotone)]
          ($ (vw/html-text-to-dom svg-str)
             {:class ["icon"]
              :width "1em"
              :height "1em"}))
        ($ :span " etc ...")

        ($ :h3 "all-icons-fill")
        (for [svg-str (take 100 pis/all-icons-fill)]
          ($ (vw/html-text-to-dom svg-str)
             {:class ["icon"]
              :width "1em"
              :height "1em"}))
        ($ :span " etc ..."))))


;; -- Entry Point -------------------------------------------------------------

(defn mount-ui []
  (vw/render (js/document.getElementById "app")
             ($ root-ui)))

(defn ^:dev/after-load clear-cache-and-render! []
  (mount-ui))

(defn ^:dev/before-load shutdown! []
  (vw/dispose-render-effects))

(defn start []
  (mount-ui))
