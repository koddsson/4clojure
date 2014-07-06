(true?  (#(and (nil? (%1 %2)) (contains? %2 %1)) :a {:a nil :b 2}))
(false? (#(and (nil? (%1 %2)) (contains? %2 %1)) :b {:a nil :b 2}))
(false? (#(and (nil? (%1 %2)) (contains? %2 %1)) :c {:a nil :b 2}))
