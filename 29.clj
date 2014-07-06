(= (#(apply str (re-seq #"[A-Z]" %)) "HeLlO, WoRlD!") "HLOWRD")
(empty? (#(apply str (re-seq #"[A-Z]" %)) "nothing"))
(= (#(apply str (re-seq #"[A-Z]" %)) "$#A(*&987Zf") "AZ")
