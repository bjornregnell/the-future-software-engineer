//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala "3.5.0"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

def pause = Latex.cmd{"pause"}
def and = "\\&"
def nl = "~\\\\{}"

@main def run = slides.toPdf()

def slides = document("The Future Software Engineer", author = "Björn Regnell"):
  frame("About me"):
    image(file = "../img/professor-bjorn.jpg", width = 0.2)
    itemize:
      p("Björn Regnell, Professor in Software Engineering ")
      p("Dept. of Computer Science, LTH, Lund University https://cs.lth.se/bjorn-regnell/")
      p("Research: Requirements Engineering, Software Quality")
      p("Teaching: Introductory Programming, RE https://cs.lth.se/pgk/ https://cs.lth.se/krav/")
      p("Member of the Scala Improvement Process Committee https://www.scala-lang.org/community/#gov-sip")

  frame("Enter: The AI-boosted software engineering era"):
    textSize(16,20)
    p(" What every (junior) software engineer needs to know to stay relevant?")

  frame("Death of programming?"):
    image(file = "../img/nobody.png", width = 1.0)
    p("Prediction by Jensen Huang, CEO of Nvidia (February 2024)")

  frame("Do we only need ''Prompt Engineering'' now?"):
    image(file = "../img/prompt-engineering.jpg", width = 1.0)
    p("https://www.freecodecamp.org/news/learn-prompt-engineering-full-course/")


  frame("Automatic Programming in the '50ies"):
    image(file = "../img/fortran.png", width = 1.0)
    p("Western Computer Proceedings (1957)")

  frame("My predictions"):
    itemize:
      p(s"AI will **NOT steal the jobs** of (junior) software engineers")
    p(s"$pause Sooner or later:")
    itemize:
      p(s"AI will help us **significantly raise the level of abstraction**")
      p(s"$pause AI will make us **more productive** and help us **create even more complex systems**")
      p(s"$pause AI will create **lots of bugs** (that will keep *senior* devs busy)")
      p(s"$pause AI will enable us to finally $nl **stop nitty-gritty, low-level, error-prone boilerplate** $nl and start concentrate on the $nl **fun \\$and difficult parts of software engineering**")
      itemize:
        p(s"$pause domain knowledge, understanding users")
        p(s"$pause good requirements prioritization")
        p(s"$pause difficult software quality trade-offs")
        p(s"$pause resilient software architecture with less planet heating")
        p(s"$pause modern safe programming languages with new powerful abstraction mechanisms")
      p(s"$pause **Symbolic AI** will come back to help contain ML shortfalls")

  frame("My advice"):
    p(s"Who gets to do the **fun \\$and difficult parts** of development?")
    space(2.0)
    p("To **stay relevant** and get the **best jobs**:")
    itemize:
      p(s"Get a **good degree** in Computer Science \\& Software Engineering at a good university")
      p(s"$pause Learn **safe** and **powerful** programming languages $nl $pause such as Scala https://www.scala-lang.org/")
      p(s"$pause Take responsible for understanding the **''why''** and get the **big picture** and **deep domain knowledge** and develop you **decision-making skills** $nl $pause a.k.a Requirements Engineering")
      p(s"$pause Choose an employer that lets you **learn on the job**, gives you **challenges with mandate** and is **ethical**")
      p(s"$pause Learn about how AI works and als dig into symbolic AI")

  frame("Developer productivity"):
    image(file = "../img/productivity.png", width = 1.0)
    p("IEEE Transaction on Software Engineering (2021)")
