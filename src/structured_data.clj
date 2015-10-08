(ns structured-data)

(defn do-a-thing [x] (let [double (+ x x)]
                       (Math/pow double double)))

(defn spiff [v] (if (< (count v) 3)nil (let [first   (get v 0)
                                             third   (get v 2)]
                                         (+ first third))))

(defn cutify [v] (if (vector? v)
                   (conj v "<3")
                   (println "please enter a vector") ))

(defn spiff-destructuring [[x y z]] (+ x z))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width   [[[x1 y1] [x2 y2]]] (- x2 x1))

(defn height  [[[x1 y1] [x2 y2]]] (- y2 y1))

(defn square? [[[x1 y1] [x2 y2]]] (if (= (- x2 x1) (- y2 y1))true false))

(defn area    [[[x1 y1] [x2 y2]]] (* (- x2 x1) (- y2 y1)))

(defn contains-point? [[[x1 y1] [x2 y2]] [x y]] (and(<= x1 x x2) (<= y1 y y2)))

;; (if (and (<= x1 x x2) (<= y1 y y2))true false)
;; note the above line didn't seem to like the if statement

(defn contains-rectangle? [[[x1 y1] [x2 y2]] [[x3 y3] [x4 y4]]] (and (<= x1 x3 x4 x2) (<= y1 y3 y4 y2)))

;; (defn contains-rectangle? [outer inner])


(defn title-length [] )

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
