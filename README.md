# The Future Software Engineer

Talk by Prof. Björn Regnell at Foo Café 12th anniversary, 2024 August 27 

**What every junior software developer must know to stay relevant in the AI-boosted era**

### About me
I teach and do research in software engineering. Since 2015 I am responsible for the first programming course for Master students in Computer Science at the Faculty of Engineering, LTH at Lund University. I also teach an advanced-level course in Software Requirements Engineering. I am a member of the Scala Improve Process Commitee that governs the evolution of the Scala programming language.

## Intro

The "Death of Programming", was recently predicted by Jensen Huang, the top boss at NVidia, which makes many of the AI chips that currently heat up our plannet, as we speak.

Is he right that AI will take the jobs of human coders? Should I as a professor stop teaching programming to Software Engineers and instead teach "Prompt Engineering" and how to make a large language model write all the code for us, using Github Copilot, ChatGPT and similar tools that are already integrated in our development tools such as Microsoft VS Code and Jetbrains IntelliJ?

I don't think so!

We have heard the story before. Already in 1957 the ancient programming language Fortran was introduced in an academic paper entiteled "The FORTRAN Automatic Coding System". And the assembler programmers were complaining. Some cried that the compiler will take their work. Others claimed that it was better that humans write the machine code as the compiler is not smart enough to do the trickiest optimizations - the machine code will be of superios quality if us humans write it instead of the automatic compiler.

What happened? Thanks to the compiler, software engineers could start coding at a higher abstraction level and get more done. Did assembler programmers loose their jobs? No, but the needed to learn new things. And they had really good use of their deep knowledge in machine coding when writing source code. We still today teach about machine programming as every well-educated software engineer needs to understand what is actually happening at different abstraction levels.

The programming languages of the 60'ies provided abstraction mechisms that enabled the construction of much more complex software at a much higher productivity rate. And the story repeats itself on and on in the history of software engineering: powerful abstractions enable us to create more complex software, and when it gets too complex we need to create more powerful abstractions.   

## Symbolic and sub-symbolic AI

### What is good with trained, generative AI?

Thanks to AI-boosted coding we can get relived of the nitty-gritty boilerplate coding and focus on the hard stuff in Software Engineering, and we can raise the level of abstraction. Finally the experienced coders can get more time for things like requirements engineering and architecture. 

Many coders today spend much of their time on nitty-gritty coding and non-interesting boilerplate. Compare to machine engineering building a factory producing things: do the machine engineers work all day by the conveyor belt doing repetivie tasks? No. But the sure need to understand what is going on in detail on the factory floor in order to be good at optimizing the flow of goods in the production. Many software engieers are stuck with low level coding of writing nitty-gritty bolierplate and crafting while loops. AI can help us here, and the more standard and bolierplaty the code is, the more reliable is AI-generated solutions.

### What is bad with trained, generative AI?

AI-code can have bugs anywhere, even if the code looks ok. The result from a large langugage model has an inherent stochastic element, due to the way it is constructed: the training process needs randomness to be effective at gradually adjusting the parameters of the underlying neural network. 

And we can't really **explain** exactly why the AI halucinated and gave us buggy code. 

## Software engineering knowledge that help you stay stay relevant

* A deep and thurough education in computer science and engineering

* Knowledge about AI: both trained AI and symbolic AI.
* Understand the limitations of trained AI: bias, over-training, hallucination, ... 
* Use symbolic AI and "normal" code to check and balance trained AI code both statically and at runtime.
* Always set aside resources for human inspectio of AI-generated code.
* Use AI to explain, critizise and experiment with your own hand-crafted code. The goal is for you to learn more and be more productive rather than handing over the control to AI.

Software Engineering topics that are even more important in th AI-boosted era:
* Software Inspection
* Requirements Engineering
* Software Architecture
* High-level, safe programming languages with powerful abstractions and advanced type system that enables strong static checks

In 2016 we started to use Scala as the first programming language at LTH for our Master-level programs in Computer Science and Engieering, due to its simple syntax and powerful type system making  it easy to learn while helping you find bugs already at compile time.  

## Outro

### The Future Software Engineer

A well-educated, AI-boosted software engineer of the future...
* applies AI as a dev tool only when it really helps rather than pollutes the code with garbage and tricky bugs
* understands the limitations of generative AI and reviews all AI-generated code carefully
* understands when symbolic AI is better than trained AI
* is expert in software requirements and architecture and knows how to prioritize and do tradeoffs
* learns to master modern, high-level, powerful and safe programming languages, such as [Scala](https://www.scala-lang.org/), that scale with higher complexity and prevent bugs by design

## References

* https://en.wikipedia.org/wiki/Symbolic_artificial_intelligence
* https://www.scala-lang.org/
* https://www.freecodecamp.org/news/learn-prompt-engineering-full-course/
