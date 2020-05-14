(ns film-ratings.handler.film
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response]
            [film-ratings.boundary.film :as boundary.film]
            [film-ratings.views.film :as views.film]
            [integrant.core :as ig]))
