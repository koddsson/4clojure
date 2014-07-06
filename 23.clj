(= ((fn d [x] (if (> (count x) 2) (concat [(last x)] (d (butlast (rest x))) [(first x)]) x)) [1 2 3 4 5]) [5 4 3 2 1])
(= ((fn d [x] (if (> (count x) 2) (concat [(last x)] (d (butlast (rest x))) [(first x)]) x)) (sorted-set 5 7 2 7)) '(7 5 2)) 
(= ((fn d [x] (if (> (count x) 2) (concat [(last x)] (d (butlast (rest x))) [(first x)]) x)) [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
