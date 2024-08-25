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
      p("*Research:* Requirements Engineering, Software Quality")
      p(s"*Teaching:* Programming, https://cs.lth.se/pgk/ $nl Advanced RE https://cs.lth.se/krav/")
      p("Member of the Scala Committee https://www.scala-lang.org/community/#gov-sip")

  frame("Enter: The AI-Boosted Software Engineering Era"):
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

  frame("Machine Lerning (ML) deficiencies"):
    p("Everyone seem to throw ML at any problem currently, but...")
    itemize:
      p("The training process relies on randomness that gives emergent, unpredictable behavior")
      p("Models are hallucinating at random occasions")
      p("Model behavior is difficult to explain")
      p("Training needs massive amount of data")
      p("Bias in the data gives biased models")
      p("The training process consumes massive amount of energy")
      p("ML often consume more compute than symbolic AI, which can do a better job than ML in many applications")
      p("In safety-critical applications ML models need to be contained to protect humans from deadly behavior")
      p("ML drive monopolization by big tech even further")

  frame("My predictions"):
    itemize:
      p(s"AI will **NOT steal the jobs** of (junior) software engineers")
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
      p(s"$pause **Symbolic AI** will be back to help contain ML deficiencies")

  frame("Soner than you think: Symbolic AI will be back!"):
    p("Symbolic AI is made with ''normal'', explainable, reliable code that do human-like smart things with smart algoritms.")
    itemize:
      p(s"constraint programming, logic programming, search algorithms, automatic proofs, SAT solvers, expert systems, automated planing and scheduling, ...")
      p("https://en.wikipedia.org/wiki/Symbolic_artificial_intelligence")

    p("In systems that rely on ML models we need **a lot of extra code to contain it**, made with ''normal'' code and symbolic AI, esp. in **safety-critical** systems that might **kill people** and be hacked, such as self-driving cars.")

  frame("AI will be regulated! Regulations need ''normal'' code."):
    itemize:
      p("The coming EU act will force companies to deal with requirements (a.k.a implement features) that reduce the risks of AI and provide accountability and transparency.")
    image(file = "../img/eu-ai-act.png", width = 0.9)
    textSize(8,10)
    p("\\hfill Wagner, Borg, Runeson, IEEE Software (January 2024)")

  frame("Developer productivity"):
    image(file = "../img/productivity.png", width = 1.0)
    p("IEEE Transaction on Software Engineering (2021)")


  frame("My advice to **stay relevant** and get the **best jobs**"):
    textSize(10,12)
    itemize:
      p(s"Get a **good degree** in Computer Science and Software Engineering at a good university")
      p(s"$pause Learn how ML works **under the hood** (a.k.a linear algebra) ")
      itemize:
        p("Try this simple neural network to see principles and problems: https://github.com/bjornregnell/scai")
      p(s"Dig into **Symbolic AI** (will resurrect (?) during next AI winter)")
      p(s"Understand coming **AI regulation** and its implications: $nl new features -> more code -> more bugs -> more jobs")
      p(s"$pause Learn **safe** and **powerful** programming languages $nl $pause such as Scala https://www.scala-lang.org/ to boost your productivity and help you create high-quality, bug-free code")
      p(s"$pause Take responsible for understanding the **''why''** and get the **big picture** and **deep domain knowledge** and develop your **decision-making skills** $nl $pause a.k.a Requirements Engineering")
      p(s"$pause Choose an employer that lets you **learn on the job**, gives you **challenges with mandate** and is **ethical**")

  frame("THANK YOU!"):
    p("Links:")
    itemize:
      p("These slides: TODO")
      p(s"Navigating the EU AI Act (Wagner, Borg, Runeson) $nl https://ieeexplore.ieee.org/stamp/stamp.jsp?tp=&arnumber=10372509")