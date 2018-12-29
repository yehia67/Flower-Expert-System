; initialize objects CLIPS> (deftemplate man "relation ma" (slot name))
;CLIPS> (assert(man(name "yehia")))

(deftemplate flower_name
        (multislot name)
        )             
(deftemplate color
        (slot name)
        )
(deftemplate season
        (slot name)
        )               
(deftemplate size
        (slot no (range 0 1000)) 
        )
(deftemplate perfume
        (slot flag (range 0 1 ))
        )
(deftemplate life_type
        (slot type)
        )        
(deftemplate soil
        (slot type)
        )      
(deftemplate life_cycle
        (slot  cycle (range 1 1000))
        )
(deftemplate height
        (slot name (default none))
        )               
(deftemplate root_type
        (slot type (default none))
        )  

(defrule small_height  "rule 1"

(size(no ?X)) (test(> ?X 10)) (test(< ?X 50)) => (assert (height (name small))) (printout t "done" crlf ) )

(defrule meduim_height  "rule 2"
(size(no ?X)) (test(> ?X 50)) (test(< ?X 150)) => (assert (height (name meduim))) (printout t "done" crlf ) )

(defrule tall_height  "rule 3"
(size(no ?X)) (test(> ?X 150)) => (assert (height (name tall))) (printout t "done" crlf ) )

(defrule type_annual  "rule 4"
(life_cycle(cycle 1)) => (assert (life_type (type annual))) (printout t "done" crlf ) )

(defrule type_perennial  "rule 5"
(life_cycle(cycle ?X)) (test(> ?X 1))  => (assert (life_type (type perennial))) (printout t "done" crlf ) )

(defrule flower_iris  "rule 6"
(season(name summer)) (color (name blue))  (life_type (type perennial)) (root_type (type bulb))  => (assert (flower_name (name irise))) (printout t "done" crlf ) )

(defrule flower_iris_or1  "rule 6"
(season(name summer)) (color (name purple))  (life_type (type perennial)) (root_type (type bulb))  => (assert (flower_name (name irise))) (printout t "done" crlf ) )

(defrule flower_iris_or2  "rule 6"
(season(name summer)) (color (name yellow))  (life_type (type perennial)) (root_type (type bulb))  => (assert (flower_name (name irise))) (printout t "done" crlf ) )


(defrule flower_anemone  "rule 7"
(season(name autumn)) (color (name white))  => (assert (flower_name (name anemone))) (printout t "done" crlf ) )

(defrule flower_anemone_or1  "rule 7"
(season(name autumn)) (color (name pink))    => (assert (flower_name (name anemone))) (printout t "done" crlf ) )

(defrule flower_anemone_or2  "rule 7"
(season(name autumn)) (color (name pinkish-red)) => (assert (flower_name (name anemone))) (printout t "done" crlf ) )



(defrule flower_Chrysanthemum  "rule 8"
(season(name autumn)) (height(name medium)) (color (name yellow))  => (assert (flower_name (name Chrysanthemum))) (printout t "done" crlf ) )

(defrule flower_Chrysanthemum_or0  "rule 8"
(season(name autumn)) (height(name medium)) (color (name white)) => (assert (flower_name (name Chrysanthemum))) (printout t "done" crlf ) )

(defrule flower_Chrysanthemum_or1  "rule 8"
(season(name autumn)) (height(name medium)) (color (name purple))   => (assert (flower_name (name Chrysanthemum))) (printout t "done" crlf ) )

(defrule flower_Chrysanthemum_or2  "rule 8"
(season(name autumn)) (height(name meduim)) (color (name red)) => (assert (flower_name (name Chrysanthemum))) (printout t "done" crlf ) )



(defrule flower_Freesia  "rule 9"
(season(name spring)) (root_type (type bulb))  (color (name white)) (color (name yellow)) (perfume (flag 1)) => (assert (flower_name (name Freesia ))) (printout t "done" crlf ) )

(defrule flower_Freesia_or0  "rule 9"
(season(name spring)) (root_type (type bulb))  (color (name yellow)) (perfume (flag 1)) => (assert (flower_name (name Freesia ))) (printout t "done" crlf ) )

(defrule flower_Freesia_or1  "rule 9"
(season(name spring)) (root_type (type bulb)) (color (name white)) (color (name orange)) (perfume (flag 1))   => (assert (flower_name (name Freesia ))) (printout t "done" crlf ) )

(defrule flower_Freesia_or2  "rule 9"
(season(name spring)) (root_type (type bulb))(color (name white)) (color (name purple)) (perfume (flag 1)) => (assert (flower_name (name Freesia ))) (printout t "done" crlf ) )

(defrule flower_Freesia_or3  "rule 9"
(season(name spring)) (root_type (type bulb)) (color (name white)) (color (name red))  (perfume (flag 1))   => (assert (flower_name (name Freesia))) (printout t "done" crlf ) )

(defrule flower_Freesia_or4  "rule 9"
(season(name spring)) (root_type (type bulb)) (color (name white)) (color (name blue))  (perfume (flag 1)) => (assert (flower_name (name Freesia ))) (printout t "done" crlf ) )



(defrule flower_Dahlia  "rule 10"
(life_type(type perennial)) (height (name tall))  (root_type (type bulb)) (season(name summer))   => (assert (flower_name (name Dahlia ))) (printout t "done" crlf ) )


(defrule flower_Narcissus  "rule 11"
(root_type (type bulb)) (color (name yellow))   => (assert (flower_name (name Narcissus ))) (printout t "done" crlf ) )
(defrule flower_Narcissus_or1  "rule 11"
(root_type (type bulb)) (color (name white))   => (assert (flower_name (name Narcissus ))) (printout t "done" crlf ) )


(defrule flower_Camellia  "rule 12"
(soil (type acidic)) (color (name white))  (life_type (type perennial))  (root_type (type roots)) => (assert (flower_name (name Camellia ))) (printout t "done" crlf ) )

(defrule flower_Camellia_or1  "rule 12"
(soil (type acidic))  (color (name pink)) (life_type (type perennial))  (root_type (type roots)) => (assert (flower_name (name Camellia ))) (printout t "done" crlf ) )

(defrule flower_Camellia_or2  "rule 12"
(soil (type acidic)) (color (name red)) (life_type (type perennial)) (root_type (type roots)) => (assert (flower_name (name Camellia ))) (printout t "done" crlf ) )


(defrule flower_Lily "rule 13"
(season(name spring)) (root_type (type bulb))  (perfume (flag 1))  (height (name small)) (life_type (type perennial))  => (assert (flower_name (name Lily))) (printout t "done" crlf ) )


(defrule flower_Begonia "rule 14"
(height (name small))  (life_type (type annual)) (season(name spring)) (soil (type rich))    => (assert (flower_name (name Begonia))) (printout t "done" crlf ) )

(defrule flower_Begonia_or1 "rule 14"
(height (name small))  (life_type (type annual)) (season(name spring)) (soil (type loose))    => (assert (flower_name (name Begonia))) (printout t "done" crlf ) )

(defrule flower_Begonia_or2 "rule 14"
(height (name small))  (life_type (type annual)) (season(name spring)) (soil (type fertile))    => (assert (flower_name (name Begonia))) (printout t "done" crlf ) )


(defrule flower_Azalea "rule 15"
 (season(name winter))  (color (name white))   => (assert (flower_name (name Azalea))) (printout t "done" crlf ) )


(defrule flower_Azalea_or1 "rule 15"
 (season(name winter))  (color (name pink))   => (assert (flower_name (name Azalea))) (printout t "done" crlf ) )

(defrule flower_Azalea_or2 "rule 15"
 (season(name winter))  (color (name red))   => (assert (flower_name (name Azalea))) (printout t "done" crlf ) )
 
 
 (defrule flower_Anemone "rule 16"
 (life_type (type perennial)) (root_type (type roots))  (color (name white))    => (assert (flower_name (name Anemone))) (printout t "done" crlf ) )
 
  (defrule flower_Anemone_or1 "rule 16"
 (life_type (type perennial)) (root_type (type roots))  (color (name red))    => (assert (flower_name (name Anemone))) (printout t "done" crlf ) )
 
  (defrule flower_Anemone_or2 "rule 16"
 (life_type (type perennial)) (root_type (type roots))  (color (name blue))    => (assert (flower_name (name Anemone))) (printout t "done" crlf ) )

 (defrule flower_Anemone_or3 "rule 16"
 (life_type (type perennial)) (root_type (type roots))  (color (name yellow))    => (assert (flower_name (name Anemone))) (printout t "done" crlf ) )




(defrule flower_Rose  "rule 17"
(life_type (type perennial)) (root_type (type roots)) (color (name white)) (perfume (flag 1)) (soil (type well-drained))  => (assert (flower_name (name Rose ))) (printout t "done" crlf ) )

(defrule flower_Rose_or1  "rule 17"
(life_type (type perennial)) (root_type (type roots)) (color (name pink)) (perfume (flag 1)) (soil (type well-drained))  => (assert (flower_name (name Rose ))) (printout t "done" crlf ) )

(defrule flower_Rose_or2  "rule 17"
(life_type (type perennial)) (root_type (type roots)) (color (name red)) (perfume (flag 1)) (soil (type well-drained))  => (assert (flower_name (name Rose ))) (printout t "done" crlf ) )

(defrule flower_Rose_or3  "rule 17"
(life_type (type perennial)) (root_type (type roots)) (color (name yellow)) (perfume (flag 1)) (soil (type well-drained))  => (assert (flower_name (name Rose ))) (printout t "done" crlf ) )


(defrule flower_white_lily "rule 17"
(flower_name (name Lily))  (perfume (flag 1))  => (assert (flower_name (name white lily ))) (printout t "done" crlf ) )


