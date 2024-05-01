(ns cap2.vetores)

; Criar vetor
(vector 1 2 3 4 5)
[1 2 3 4 5]
; Dar nome a um vetor
(def numeros-vetorizados [1 2 3 4 5])

(def cantor-arretado (vector "Chico César" "Catole do Rocha" 26 "Janeiro" 1964))
(println (get cantor-arretado 0))
(println (get cantor-arretado 3))
(println (last cantor-arretado))

; Adicionar novo elemento no final
(conj cantor-arretado "MPB")
(println cantor-arretado)