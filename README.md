---
description: "FIXME: write description"
title: tutorial \-- Marginalia
---

+-----------------------------------+:---------------------------------:+
| ::: header                        | \                                 |
| # [tutorial](http://example.com   | \                                 |
| /FIXME) {#tutorial .project-name} | \                                 |
|                                   | (this space intentionally left    |
| ## 0.1.0-SNAP                     | almost blank)                     |
| SHOT {#snapshot .project-version} |                                   |
|                                   |                                   |
| \                                 |                                   |
|                                   |                                   |
| FIXME: write description          |                                   |
| :::                               |                                   |
|                                   |                                   |
| ::: dependencies                  |                                   |
| ### dependencies                  |                                   |
|                                   |                                   |
| +---------+---------+---------+   |                                   |
| | org.c   | -----   | 1.11.1  |   |                                   |
| | lojure/ |         |         |   |                                   |
| | clojure |         |         |   |                                   |
| +---------+---------+---------+   |                                   |
| :::                               |                                   |
+-----------------------------------+-----------------------------------+
| ::: toc                           |                                   |
| []{#toc}                          |                                   |
|                                   |                                   |
| ### namespaces                    |                                   |
|                                   |                                   |
| -   [petstore.clj](#petstore.clj) |                                   |
| -                                 |                                   |
|   [tutorial.core](#tutorial.core) |                                   |
| -   [tutoria                      |                                   |
| l.functions](#tutorial.functions) |                                   |
| :::                               |                                   |
+-----------------------------------+-----------------------------------+
| ::: docs-header                   |                                   |
| [](#petstore.clj){#petstore.clj   |                                   |
| .anchor}                          |                                   |
|                                   |                                   |
| # petstore.                       |                                   |
| clj {#petstore.clj .project-name} |                                   |
|                                   |                                   |
| [toc](#toc){.toc-link}            |                                   |
| :::                               |                                   |
+-----------------------------------+-----------------------------------+
|                                   | ``` {.brush: .clojure}            |
|                                   | (requ                             |
|                                   | ire '[clojure.repl :refer [doc]]) |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
| This is the petstore docstring    | ``` {.brush: .clojure}            |
|                                   | (ns tutorial.petstore)            |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
| This function returns the age of  | ``` {.brush: .clojure}            |
| a pet in human years.             | (defn petToHumanAge               |
|                                   |   [x]                             |
|                                   |   (def petStore                   |
|                                   |     "The petStore docstring"      |
|                                   |     {'dog 7, 'cat 5, 'fish 10})   |
|                                   |   (get petStore x))               |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
| A function that greets a person   | ``` {.brush: .clojure}            |
| by name.                          | (defn greet                       |
|                                   |   [name]                          |
|                                   |   (str "Hello, " name  "!"))      |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
|                                   | ``` {.brush: .clojure}            |
|                                   | (doc greet)                       |
|                                   | (doc tutorial.petstore)           |
|                                   | (doc petStore)                    |
|                                   | (doc petToHumanAge)               |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
|                                   |                                   |
+-----------------------------------+-----------------------------------+
| ::: docs-header                   |                                   |
| [](#tutorial.core){#tutorial.core |                                   |
| .anchor}                          |                                   |
|                                   |                                   |
| # tutorial.co                     |                                   |
| re {#tutorial.core .project-name} |                                   |
|                                   |                                   |
| [toc](#toc){.toc-link}            |                                   |
| :::                               |                                   |
+-----------------------------------+-----------------------------------+
|                                   | ``` {.brush: .clojure}            |
|                                   | (ns tutorial.core                 |
|                                   |   (:gen-class))                   |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
| I don\'t do a whole lot \... yet. | ``` {.brush: .clojure}            |
|                                   | (defn -main                       |
|                                   |   [& args]                        |
|                                   |   (println "Hello, World!"))      |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
|                                   |                                   |
+-----------------------------------+-----------------------------------+
| ::: docs-header                   |                                   |
| [](#tutori                        |                                   |
| al.functions){#tutorial.functions |                                   |
| .anchor}                          |                                   |
|                                   |                                   |
| # tutorial.functions {#           |                                   |
| tutorial.functions .project-name} |                                   |
|                                   |                                   |
| [toc](#toc){.toc-link}            |                                   |
| :::                               |                                   |
+-----------------------------------+-----------------------------------+
|                                   | ``` {.brush: .clojure}            |
|                                   | (ns tutorial.functions            |
|                                   |   (:gen-class))                   |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
| First function                    | ``` {.brush: .clojure}            |
|                                   | (defn -main                       |
|                                   |   []                              |
|                                   |   (println "My name is Jocke")    |
|                                   |                                   |
|                                   | (println "loving Clojure so far") |
|                                   |   (+ 2 5))                        |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
|                                   | ``` {.brush: .clojure}            |
|                                   | #(println "Hello," %)             |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
| (def increment (fn \[x\] (+ x     |                                   |
| 1)))                              |                                   |
+-----------------------------------+-----------------------------------+
| (defn increment_set \[x\] (map    | ``` {.brush: .clojure}            |
| increment x))                     | (defn DataTypes []                |
|                                   |   #_                              |
|                                   | {:clj-kondo/ignore [:inline-def]} |
|                                   |   (def a 1)                       |
|                                   |   #_                              |
|                                   | {:clj-kondo/ignore [:inline-def]} |
|                                   |   (def b 1.25)                    |
|                                   |   #_                              |
|                                   | {:clj-kondo/ignore [:inline-def]} |
|                                   |   (def c 1.25e-12)                |
|                                   |   (def d 0xfbfc)                  |
|                                   |   (println a)                     |
|                                   |   (println b)                     |
|                                   |   (println c)                     |
|                                   |   (println d))                    |
|                                   | (DataTypes)                       |
|                                   | ```                               |
+-----------------------------------+-----------------------------------+
|                                   |                                   |
+-----------------------------------+-----------------------------------+

::: footer
Generated by
[Marginalia](https://github.com/gdeer81/marginalia).  Syntax
highlighting provided by Alex Gorbatchev\'s
[SyntaxHighlighter](http://alexgorbatchev.com/SyntaxHighlighter/)

::: {#floating-toc}
-   [petstore.clj]{#floating-toc_petstore.clj}
-   [tutorial.core]{#floating-toc_tutorial.core}
-   [tutorial.functions]{#floating-toc_tutorial.functions}
:::
:::
