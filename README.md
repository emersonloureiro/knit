
# Knit

Knit is a scripting language for building programs based on bash commands (e.g., ls). It's still a working in progress, so there's very limited functionality available.

Eventually though, the idea is that you should be able to do something like:

    func main {
      val result = [ls -al | grep 'whatever']
      result.foreach {
        line -> {
          # Do something here for each line of the result
        }
      }
    }

The project is broken down roughly into three parts: 1) language definition, 2) parser, and 3) runtime environment. Antlr (http://www.antlr.org) is used for the language definition and parser. The runtime is custom-made and is composed of an embedded virtual machine with its own set of instructions - it's mostly a stack-based machine, a program builder which generates instructions out of the program code - by traversing the AST generated by Antlr - and a runner which takes the instructions out of the program builder and executes them.