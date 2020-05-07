(ns film-ratings.handler.index-test
  (:require [film-ratings.handler.index :as sut]
            [clojure.test :refer [deftest testing is]]
            [ring.mock.request :as mock]
            [integrant.core :as ig]))

(deftest check-index-handler
  (testing "Ensure that the index handler returns two links for add and list films"
    (let [handler (ig/init-key :film-ratings.handler/index {})
          response (handler (mock/request :get "/"))]
      (is (= :ataraxy.response/ok (first response))))))
