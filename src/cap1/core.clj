(ns cap1.core)

(defn oi [nome]
  (str "Olá " nome "!"))
;(println (oi "Marcello"))

(defn multiplo-de-3? [dividendo]
  (= 0 (mod dividendo 3)))
;(println (multiplo-de-3? 3))

(defn par? [numero]
  (if (even? numero)
    "sim"
    "não"))
;(println (par? 4))

(defn saldo [valor]
  (cond (< valor 0) "negativo"
        (> valor 0) "positivo"
        :else "zero"))
(println (saldo 0))