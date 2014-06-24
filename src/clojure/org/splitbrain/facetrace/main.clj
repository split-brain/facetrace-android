(ns org.splitbrain.facetrace.main
  (:use [neko.activity :only [defactivity set-content-view!]]
        [neko.threading :only [on-ui]]
        [neko.ui :only [make-ui]]
        [neko.notify :only [toast]]
        [gift.core :only [make-gif]]))

(defactivity org.splitbrain.facetrace.FacetraceActivity
  :def a
  :on-create
  (fn [this bundle]
    (on-ui
     (set-content-view! a
      (make-ui [:linear-layout {:orientation :vertical}
                [:button {:text "Connect Dropbox"
                          :on-click (fn [_] (toast "Misha's working..."))}]
                [:button {:text "Make Selfie"
                          :on-click (fn [_] (toast "Dima's working..."))}]
                [:button {:text "Export Gif"
                          :on-click (fn [_] (toast "Oleg's working..."))}]
                [:button {:text "Settings"
                          :on-click (fn [_] (toast "TBD"))}]
                ])))))
