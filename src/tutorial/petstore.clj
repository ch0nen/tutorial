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

(defn greet
  "A function that greets a person by name."
  [name]
  (str "Hello, " name  "!"))

(doc greet)
(doc tutorial.petstore)
(doc petStore)
(doc petToHumanAge)
