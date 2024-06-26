(ns cap1.fizzBuzz)

(def lista-100 (range 1 101))

(defn divisivel-por? [dividendo divisor]
  (zero? (mod dividendo divisor)))

(defn fizzBuzz [numero]
  (cond (and (divisivel-por? numero 3)
             (divisivel-por? numero 5)) "fizzbuzz"
        (divisivel-por? numero 3) "fizz"
        (divisivel-por? numero 5) "buzz"
        :else numero))
(println (map fizzBuzz lista-100))