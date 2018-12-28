(import javax.swing.*)
(import java.awt.*)
(import java.awt.event.*)
(import java.awt.event.WindowEvent)

;;initialize variables
(defglobal ?*frame* = (new Frame "Flower Expert System"))
(defglobal ?*submitBtn* = (new Button "Submit"))
(defglobal ?*questionLable* = (new Label "Question"))
(defglobal ?*ResultLable* = (new Label "Result"))
(defglobal ?*input* = (new TextField "Enter Your answer here"))

;;size
(?*frame* setSize 400 400)
(?*questionLable* setBounds 20 20 60 20)
(?*submitBtn* setBounds 0 80 20 20)
(?*ResultLable* setBounds 20 100 100 100)
(?*input* setBounds 20 80 150 40)

;;events
(?*submitBtn* addActionListener (implement ActionListener using (lambda (?name ?evt)
    (printout t "Hello, World!" crlf))))

;;add components
(?*frame* add ?*input*)
(?*frame* add ?*ResultLable*)
(?*frame* add ?*questionLable*)
(?*frame* add ?*submitBtn*)
 ;;(?*frame* pack)
(set ?*frame* visible TRUE)

;;exit frame
(?*frame* addWindowListener  (implement WindowListener using (lambda (?name ?event)
    (if (= (?event getID) (WindowEvent.WINDOW_CLOSING)) then
        (exit)))))
