
# Knit

Knit is a scripting language for building programs based on bash commands (e.g., ls). It's a small personal project I work on sporadically as a refresher on programming language design and compilers. Given that, there's only limited functionality available. Knit uses Antlr (http://www.antlr.org) for language parsing.

## The Language

In Knit, variables are immutable, and require no special keyword in order to be declared. Comments - i.e., single-line comments - start with `#`.

    # This is a comment
    foo = "foo"
    # Another comment
    bar = 1

Functions are defined with the `func` keyword, and Knit programs require a `main` function, at the very least. Defining other functions and calling them is not yet supported.

    func main {
        print("Hello World")
    }

Knit also doesn't require any specific line terminator.

As said above the whole idea behind Knit is being able to run bash commands easily within a scripting language. In Knit, this is done by putting any bash command you'd put on the command line in between `[` `]` or `<` `>``.

    func main {
        rootFiles = [ls -al | grep 'root']
    }

The difference is that, with `[` `]`, the output is returned as a list, where each element of the list is one line of the output of the command.

That, plus some functional-style operations on lists allow something like:

    func main {
      rootFiles = [ls -al | grep 'root'].asList
      rootFiles.foreach {
        rootFile -> {
          print(rootFile)
        }
      }
    }

For now, `foreach` is the only function available on lists. With `<` `>`, the output is returned as a single string.

You can make reference to variables within the commands, by enclosing the variable between ``${`` and ``}``.

    func main {
        flag = "drwx"
        dirWithAllPermissions = [ls -al | grep '${flag}']
    }
