(ns api.view.footer)

(defn footer []
  [:footer {:class "container pt_160 pb_32"}
   [:h2 {:class "mb_60"}
    [:a {:href "/"}
     [:img {:alt "logo" :width 280 :decoding "async" :data-nimg "1" :style "color:transparent" :src "/logo/main_logo_0.svg"}]]]

   [:div {:class "footer_links mb_80"}
    [:div {:class "mb_32"}
     [:h2 {:class "mb_24"} "Unternehmen"]

     [:ul {:class "fs_14 c_light_sec"}
      [:li {:class "mb_20"}
       [:a {:href "/"} "Startseite"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Referenzen"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Impressum"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Datenschutz"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Kontakt"]]

      [:li
       [:a {:href "/"} "FAQ"]]]]

    [:div {:class "mb_32"}
     [:h2 {:class "mb_24"} "Anwendungsfälle"]

     [:ul {:class "fs_14 c_light_sec"}
      [:li {:class "mb_20"}
       [:a {:href "/"} "Marketing Automation"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Kundenzufriedenheit"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Interne Prozesse"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Mitarbeitergewinnung"]]

      [:li
       [:a {:href "/"} "KI Integration"]]]]

    [:div {:class "mb_32"}
     [:h2 {:class "mb_24"} "Dienstleistung"]

     [:ul {:class "fs_14 c_light_sec"}
      [:li {:class "mb_20"}
       [:a {:href "/"} "Softwareentwicklung"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Digitale Transformation"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "No-Code &amp; Low-Code"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "App-Entwicklung"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Web-Plattform Entwicklung"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Schnittstellen Entwicklung"]]

      [:li [:a {:href "/"} "Smarte Prozessoptimierung"]]]]

    [:div {:class "mb_32"}
     [:h2 {:class "mb_24"} "Wissen und Ressourcen"]

     [:ul {:class "fs_14 c_light_sec"}
      [:li {:class "mb_20"}
       [:a {:href "/"} "Blog"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "eBooks"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Glossar"]]

      [:li {:class "mb_20"}
       [:a {:href "/"} "Kostenlose Kurse"]]

      [:li
       [:a {:href "/"} "Downloads"]]]]]

   [:div.flex.flex_wrap.align_c.justify_sb
    [:span {:class "c_social mb_20 mr_32"} "© 2016-2023 räumungsmeister.io"]

    [:div {:class "flex align_c justify_e mb_20"}
     [:a {:class "flex c_social" :target "_blanc" :href "https://www.linkedin.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "linkedin" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M880 112H144c-17.7 0-32 14.3-32 32v736c0 17.7 14.3 32 32 32h736c17.7 0 32-14.3 32-32V144c0-17.7-14.3-32-32-32zM349.3 793.7H230.6V411.9h118.7v381.8zm-59.3-434a68.8 68.8 0 1168.8-68.8c-.1 38-30.9 68.8-68.8 68.8zm503.7 434H675.1V608c0-44.3-.8-101.2-61.7-101.2-61.7 0-71.2 48.2-71.2 98v188.9H423.7V411.9h113.8v52.2h1.6c15.8-30 54.5-61.7 112.3-61.7 120.2 0 142.3 79.1 142.3 181.9v209.4z"}]]]

     [:a {:class "flex c_social ml_20" :target "_blanc" :href "https://www.instagram.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "instagram" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M512 378.7c-73.4 0-133.3 59.9-133.3 133.3S438.6 645.3 512 645.3 645.3 585.4 645.3 512 585.4 378.7 512 378.7zM911.8 512c0-55.2.5-109.9-2.6-165-3.1-64-17.7-120.8-64.5-167.6-46.9-46.9-103.6-61.4-167.6-64.5-55.2-3.1-109.9-2.6-165-2.6-55.2 0-109.9-.5-165 2.6-64 3.1-120.8 17.7-167.6 64.5C132.6 226.3 118.1 283 115 347c-3.1 55.2-2.6 109.9-2.6 165s-.5 109.9 2.6 165c3.1 64 17.7 120.8 64.5 167.6 46.9 46.9 103.6 61.4 167.6 64.5 55.2 3.1 109.9 2.6 165 2.6 55.2 0 109.9.5 165-2.6 64-3.1 120.8-17.7 167.6-64.5 46.9-46.9 61.4-103.6 64.5-167.6 3.2-55.1 2.6-109.8 2.6-165zM512 717.1c-113.5 0-205.1-91.6-205.1-205.1S398.5 306.9 512 306.9 717.1 398.5 717.1 512 625.5 717.1 512 717.1zm213.5-370.7c-26.5 0-47.9-21.4-47.9-47.9s21.4-47.9 47.9-47.9 47.9 21.4 47.9 47.9a47.84 47.84 0 01-47.9 47.9z"}]]]

     [:a {:class "flex c_social ml_20" :target "_blanc" :href "https://twitter.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "twitter-square" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M880 112H144c-17.7 0-32 14.3-32 32v736c0 17.7 14.3 32 32 32h736c17.7 0 32-14.3 32-32V144c0-17.7-14.3-32-32-32zM727.3 401.7c.3 4.7.3 9.6.3 14.4 0 146.8-111.8 315.9-316.1 315.9-63 0-121.4-18.3-170.6-49.8 9 1 17.6 1.4 26.8 1.4 52 0 99.8-17.6 137.9-47.4-48.8-1-89.8-33-103.8-77 17.1 2.5 32.5 2.5 50.1-2a111 111 0 01-88.9-109v-1.4c14.7 8.3 32 13.4 50.1 14.1a111.13 111.13 0 01-49.5-92.4c0-20.7 5.4-39.6 15.1-56a315.28 315.28 0 00229 116.1C492 353.1 548.4 292 616.2 292c32 0 60.8 13.4 81.1 35 25.1-4.7 49.1-14.1 70.5-26.7-8.3 25.7-25.7 47.4-48.8 61.1 22.4-2.4 44-8.6 64-17.3-15.1 22.2-34 41.9-55.7 57.6z"}]]]

     [:a {:class "flex c_social ml_20" :target "_blanc" :href "https://facebook.com"}
      [:svg {:viewBox "64 64 896 896" :focusable "false" :data-icon "facebook" :width 20 :height 20 :fill "currentColor" :aria-hidden "true"}
       [:path {:d "M880 112H144c-17.7 0-32 14.3-32 32v736c0 17.7 14.3 32 32 32h736c17.7 0 32-14.3 32-32V144c0-17.7-14.3-32-32-32zm-92.4 233.5h-63.9c-50.1 0-59.8 23.8-59.8 58.8v77.1h119.6l-15.6 120.7h-104V912H539.2V602.2H434.9V481.4h104.3v-89c0-103.3 63.1-159.6 155.3-159.6 44.2 0 82.1 3.3 93.2 4.8v107.9z"}]]]]]])
