
# Knit

Knit is a scripting language for building programs based on bash commands (e.g., ls). It's still a work in progress, so there's limited functionality available. Work is slow but steady on the language, so enhancements will always be on the works. Knit uses Antlr (http://www.antlr.org) for language parsing.

## The Language

In Knit, variables are immutable, and require no special keyword in order to be declared.

    foo = "foo"
    bar = 1

Functions are defined with the `func` keyword, and Knit programs require a `main` function, at the very least. Defining other functions and calling them is not yet supperted.

    func main {
        print("Hello World")
    }

Knit also doesn't require any specific line terminator.

As said above the whole idea behind Knit is being able to run bash commands easily within a scripting language. In Knit, this is done by putting any bash command you'd put on the command line in between `[` `]`.

    func main {
        rootFiles = [ls -al | grep 'root']
    }

You can make reference to variables within the commands, by enclosing the variable between ``${`` and ``}``.

    func main {
        flag = "drwx"
        dirWithAllPermissions = [ls -al | grep '${flag}']
    }

The outcome of bash commands are handled internally as a single string. You can make that a list though, where each element of the list is one line of the output of the command, by appending ```.asList``` to the command. That, plus some functional-style operations on lists allow something like:

    func main {
      rootFiles = [ls -al | grep 'root'].asList
      rootFiles.foreach {
        rootFile -> {
          print(rootFile)
        }
      }
    }

For now, `foreach` is the only function available on lists.
