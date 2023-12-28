(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Jocke")
  (println "loving Clojure so far")
  (+ 2 5))


#(println "Hello," %)

;;(def increment (fn [x] (+ x 1)))

<<<<<<< HEAD
(defn increment_set [x]
  (map increment x))

=======
;; (defn increment_set [x]
;;   (map increment x))
>>>>>>> 12617e7 (Test)
(defn DataTypes []
  #_{:clj-kondo/ignore [:inline-def]}
  (def a 1)
  #_{:clj-kondo/ignore [:inline-def]}
  (def b 1.25)
  #_{:clj-kondo/ignore [:inline-def]}
  (def c 1.25e-12)
  (def d 0xfbfc)
  (println a)
  (println b)
  (println c)
  (println d))
<<<<<<< HEAD
<<<<<<< HEAD
(DataTypes)
=======
(DataTypes)
>>>>>>> 12617e7 (Test)
=======
(DataTypes)
>>>>>>> e16c785 (Second commit)
