
# Knit

![](https://github.com/emersonloureiro/knit/actions/workflows/build.yml/badge.svg) ![coverage](.github/badges/jacoco.svg)
![branches coverage](.github/badges/branches.svg)

Knit is a scripting language for building programs based on bash commands (e.g., ls). It's a small personal project I work on sporadically as a refresher on programming language design and compilers. Given that, there's only limited functionality available. Knit uses Antlr (http://www.antlr.org) for language parsing.

## The Language

### Variables

In Knit, variables are immutable, and require no special keyword in order to be declared.

```
foo = "foo"
bar = 1
```

Notice that Knit doesn't require any specific line terminator.

### Functions

Functions are defined with the `func` keyword, and Knit programs require a `main` function, at the very least. Defining other functions and calling them is not yet supported.

```
func main {
    println("Hello World")
}
```

### Built-in Functions

* `println(argument)`: prints `argument` to std out;
* `assert(argument)`: checks if the boolean expression represented by `argument` is true, and exits the program with an error if it's not

### Types

There are three types in Knit, `string`, `number`, and `boolean`. `number` is represented as a floating point number.

```
func main {
    someString = "a string"
    someIntNumber = 1
    someDecimalNumber = 1.23456
    someBoolean = true
}
```

### List Comprehension

You can iterate over lists with the `for` `do` constructs:

```
func main {
    for item in items {
        println(item)
    }
}
```

### Exiting

You can exit a Knit program at any point with the `exit` construct. It takes a number representing the exit code of the process.

```
func main {
    greet = "Hello World!"
    exit 3
    # Line below is never executed
    println(greet)
}
```

### Comments

Comments - i.e., single-line comments - start with `#`.

```
# This is a comment
foo = "foo"
# Another comment
bar = 1
```

### Commands

As said above the whole idea behind Knit is being able to run CLI commands easily within a scripting language. So there are special constructs to allow the embedding of those commands in a Knit program - those being `[` `]` and `\` `\`. They differ in how the output of the command is handled or made available to the program.

#### List Output

`[` `]` is the construct for getting the output of a command as a list, where each element of the list is one line of the output of the command.

```
func main {
    rootFiles = [ls -al | grep 'root']
}
```

`rootFiles` is a list containing the lines of running command above.

You can combine `[` `]` with list comprehension:

```
func main {
    # Using a variable
    rootFiles = [ls -al | grep 'root']
    for rootFile in rootFiles do {
        println(rootFile)
    }

    # Using list output of command directly
    for rootFile in [ls -al | grep 'root'] do {
        println(rootFile)
    }
}
```

#### Single Output

With `\` `\`, the output is returned as a single string.

```
func main {
    rootFiles = \ls -al | grep 'root'\
}
```

`rootFiles` is a string containing all the output - as is - of running the command above.

#### Exit Code

The status code of the last executed command is available via the `$?` variable - similar to bash.

```
func main {
    rootFiles = [ls -al | grep 'root']
    println($?)
}
```

The above will print `0` if the command is successful, for example. Or whatever is the status code returned in case it's not successful.

`$?` is a global variable, so running a command within a scope will override it even if the last command executed was on the global scope or just a different one.

```
func main {
    rootFiles = [ls -al]
    println($?) # should print 0
    if (3 > 1) {
        \ps xxyyzz\ # should fail due to invalid flags
        println($?) # should print a non 0 value
    }
    \ls -al\
    println($?) # should print 0 again
}
```

#### Variable Reference

You can make reference to variables within the commands, by enclosing the variable between ``${`` and ``}``.

```
func main {
    flag = "drwx"
    dirWithAllPermissions = [ls -al | grep '${flag}']
}
```