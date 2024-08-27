//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala "3.5.0"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

def pause = Latex.cmd{"pause"}
def and = "\\&"
def nl = "~\\\\{}"
def arrows = "$\\Longleftrightarrow$"

@main def run = 
  import Latex.Preamble, Preamble.slideTemplate
  given Preamble(slideTemplate()
    //.replace("class{beamer}", "class[handout]{beamer}")
  )
  slides.toPdf()

def slides = document("The Future Software Engineer", author = "Björn Regnell"):
  frame("About me"):
    image(file = "../img/professor-bjorn.jpg", width = 0.2)
    itemize:
      p("Björn Regnell, Professor in Software Engineering ")
      p("Dept. of Computer Science, LTH, Lund University https://cs.lth.se/bjorn-regnell/")
      p("*Research:* Requirements Engineering, Software Quality")
      p(s"*Teaching:* Programming, https://cs.lth.se/pgk/ $nl Advanced RE https://cs.lth.se/krav/")
      p("Member of the Scala Committee https://www.scala-lang.org/community/#gov-sip")

  frame("Enter: The AI-Boosted Software Engineering Era"):
    textSize(16,20)
    p(" What every (junior) software engineer needs to know to stay relevant?")

  frame("Death of programming?"):
    image(file = "../img/nobody.png", width = 1.0)
    p("Prediction by Jensen Huang, CEO of Nvidia (February 2024)")

  frame("guess we doin prompt engineering now"):
    image(file = "../img/prompt-engineering.jpg", width = 1.0)
    p("https://www.freecodecamp.org/news/learn-prompt-engineering-full-course/")
    p("''full course''' = 41 min...")

  frame("Automatic Programming in the '50ies"):
    image(file = "../img/fortran.png", width = 1.0)
    p("Western Computer Proceedings (1957)")

  frame("Software Engineers push the limits with abstraction"):
    p(s"An eternal spiral: $nl **abstraction** $arrows **complexity**")
    itemize:
      p("More powerful abstractions allow us to build more complex systems, which require us to invent more powerful abstraction, which allow us to build more complex systems .... etc.")

  frame("Developer productivity"):
    image(file = "../img/productivity.png", width = 1.05)
    p(s"$pause **productivity** $arrows **work environment** $arrows **code quality**")

  frame("Defects get more expensive the longer they stay"):
    p("Assume we detect a req defect in the first iteration of...")
    image(file = "../img/cost.jpg", width = 0.8)
    itemize:
      p("Important to find defects in early iterations.")
      p("Focus on high-quality requirements, architecture, design, ...")


  frame("Machine Lerning (ML) deficiencies"):
    p("Everyone seem to throw ML at any problem currently, but...")
    textSize(10,12)
    itemize:
      p("The training process relies on randomness that gives emergent, unpredictable behavior")
      itemize:
        p("Models are hallucinating at random occasions")
        p("Model behavior is difficult to explain in detail")
      p("Training needs massive amount of data")
      p("Bias in training data gives biased models")
      p("Over-training hamper a generalization ability")
      p("The training process consumes massive amount of energy")
      p("ML often consume more compute than symbolic AI, which can do a better job than ML in many applications")
      p("ML is trained on the past not the future -- we still need human innovation")
      p("In safety-critical applications ML models need to be contained to protect humans from deadly behavior")
      p("ML drive monopolization by big tech even further")

  frame("My predictions"):
    itemize:
      p(s"AI will **NOT steal the jobs** of (junior) software engineers")
      p(s"$pause AI can help us **significantly raise the level of abstraction**")
      p(s"$pause AI can make us **more productive** and help us **create even more complex systems**")
      p(s"$pause AI *will* create **lots of bugs** (that will keep *senior* devs busy)")
      p(s"$pause AI might enable us to finally $nl **stop nitty-gritty, low-level, error-prone boilerplate** $nl and start concentrate on the $nl **fun \\$and difficult parts of software engineering**")
      itemize:
        p(s"$pause domain knowledge, understanding users")
        p(s"$pause good requirements prioritization")
        p(s"$pause difficult software quality trade-offs")
        p(s"$pause resilient software architecture with less planet heating")
        p(s"$pause modern safe programming languages with new powerful abstraction mechanisms")
      p(s"$pause **Symbolic AI** will be back to help contain ML deficiencies")

  frame(s"Soner than you think: $nl **Symbolic** AI will be back!"):
    p("Symbolic AI: made with ''normal'', explainable, reliable code that does human-like, smart things with understandable algoritms.")
    itemize:
      p(s"constraint programming, logic programming, search algorithms, automatic proofs, SAT solvers, expert systems, automated planing and scheduling, ...")
      p("https://en.wikipedia.org/wiki/Symbolic_artificial_intelligence")

    p("In systems that rely on ML models we need **a lot of extra code to contain it** esp. in **safety-critical** systems that might **kill humans** and be hacked, such as self-driving cars.")

  frame("AI will be regulated! Regulations need ''normal'' code."):
    itemize:
      p("The coming EU act will force companies to deal with requirements (a.k.a implement features) that reduce the risks of AI and provide accountability and transparency.")
    image(file = "../img/eu-ai-act.png", width = 0.9)
    textSize(8,10)
    p("\\hfill Wagner, Borg, Runeson, IEEE Software (January 2024)")

  frame("My advice to **stay relevant** and get the **best jobs**"):
    textSize(10,12)
    itemize:
      p(s"Get a **good degree** in Computer Science and Software Engineering at a good university; resist dropping out for a job")
      p(s"$pause Learn how ML works **under the hood** (a.k.a linear algebra) ")
      itemize:
        p("Try this simple neural network to see principles and problems: https://github.com/bjornregnell/scai")
      p(s"Check out **Symbolic AI** (may resurrect during next AI winter (?))")
      p(s"Understand coming **AI regulation** and its implications: $nl $pause new features -> more code -> more bugs -> more jobs")
      p(s"$pause Learn **safe** and **powerful** programming languages $nl $pause such as Scala https://www.scala-lang.org/ to boost your productivity and help you create high-quality, bug-free code")
      p(s"$pause Take responsibility for understanding the **''why''** and get the **big picture** and **deep domain knowledge** and develop your **decision-making skills** and **quality trade-offs** $nl $pause a.k.a Requirements Engineering")
      p(s"$pause Choose an employer that lets you **learn on the job**, gives you **challenges with mandate** and is **ethical**")

  frame("End of talk. **THANK YOU!**"):
    textSize(10,10)
    itemize:
      p(s"These slides: https://github.com/bjornregnell/the-future-software-engineer/")
      p(s"Papers on productivity by the tools research team at Google:") 
      itemize:
        p("https://web.eecs.umich.edu/~movaghar/What_Predicts_Software_Developers_Productivity%20IEEE-TSE%202019.pdf")
        p("https://dl.acm.org/doi/pdf/10.1145/3540250.3558940")
      p(s"Sofware Quality with the QUPER model (video from Öredev): https://cs.lth.se/krav/quality-requirements/")
      p(s"Papers by Björn Regnell: $nl https://scholar.google.com/citations?user=W37CtAwAAAAJ")
      p(s"Navigating the EU AI Act (Wagner, Borg, Runeson): $nl https://ieeexplore.ieee.org/stamp/stamp.jsp?tp=&arnumber=10372509")
      p(s"Top paid devs use Scala: $nl https://survey.stackoverflow.co/2024/work#3-salary-and-experience-by-language")