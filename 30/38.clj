(= ((fn [& args] (reduce #(if (< %1 %2) %2 %1) args)) 1 8 3 4) 8)
(= ((fn [& args] (reduce #(if (< %1 %2) %2 %1) args))  30 20) 30)
(= ((fn [& args] (reduce #(if (< %1 %2) %2 %1) args)) 45 67 11) 67)
