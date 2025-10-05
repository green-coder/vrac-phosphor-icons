# Phosphor icons as Vrac components

[![Clojars Project](https://img.shields.io/clojars/v/taipei.404.vrac/phosphor-icons.svg)](https://clojars.org/taipei.404.vrac/phosphor-icons)
[![Slack](https://img.shields.io/badge/slack-vrac-orange.svg?logo=slack)](https://clojurians.slack.com/app_redirect?channel=vrac)

## Usage

```clojure
(require '[vrac.web :refer [$]])
(require '[phosphor.icon :as pi])

($ pi/heart {:style {:color "red"}})
($ pi/heart-duotone {:style {:color "red"}})
($ pi/heart-fill {:width "2em"
                  :height "2em"})
```

See [example-app/](example-app/) for more usage demo.

## Bundle size

Tree shaking works well when compiling with Shadow-CLJS, which means that only the SVG icons you use will land in your released webapp.

If you want to test by yourself, try commenting the section about icon collections in the [example-app/](example-app/) and build a release.
The compiled JS code will be around 32k gzipped, including Clojurescript, Vrac, Signaali and the Phosphor icons used.

## License

This library is a derived work of [`phosphor-icons/core`](https://github.com/phosphor-icons/core)
because it is using its icons, so it is also distributed under the same MIT license.
