//> using dep "taggy:taggy:0.0.5,url=https://github.com/bjornregnell/taggy/releases/download/v0.0.5/taggy_3-0.0.5.jar"
//> using scala "3.5.0"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

@main def run = slides.toPdf()

def slides = document("The Future Software Engineer"):
  frame("Slide 1"):
    itemize:
      p("TODO")

  frame("Death of programming?"):
    image(file = "../img/nobody.png", width = 1.0)
    p("Prediction by Jensen Huang, CEO of Nvidia (February 2024)")

  
  frame("Automatic Programming in the '50ies"):
    image(file = "../img/fortran.png", width = 1.0)
    p("Western Computer Proceedings (1957)")
