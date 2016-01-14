(ns clojure-noob.core
  (:gen-class))


(defn divides-evenly
  "returns true if arg1 divides exactly by arg2"
  [arg1 arg2]
  (if (instance? String arg1)
    false
    (if (= (rem arg1 arg2) 0)
    true
    false))
   )

(defn fizz
  [x]
  (if (divides-evenly x 3)
    "fizz"
    x))

(defn buzz 
  [y]
  (if (divides-evenly y 5)
    "buzz"
    y))

(defn fizz-buzz 
  [z]
  (if (divides-evenly z 15)
    "fizz-buzz"
    z))


(defn Fizz-Buzz
  "Return fizz on a multiple of 3, buzz on a multiple off 5 and fizz-buzz on a multiple of 15"
  [& numbers]
  (map fizz (map buzz (map fizz-buzz numbers)))
  )