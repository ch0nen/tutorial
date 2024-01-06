(require '[clojure.repl :refer [doc]])

(ns tutorial.petstore
  "This is the petstore docstring")

(defn petToHumanAge
  "This function returns the age of a pet in human years."
  [x]
  (def petStore
    "The petStore docstring"
    {'dog 7, 'cat 5, 'fish 10})
  (get petStore x))

(defn age
  "This function returns the age of a pet"
  [petName petType petAge]
  (def ratio (petToHumanAge petType))
  (println petName "is" (* ratio petAge) "years old in human years"))

(age "Fido" 'dog 4)
(age "Fifi" 'cat 10)
(age "Bubbles" 'fish 1)
