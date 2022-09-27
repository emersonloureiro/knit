
# Knit

Knit is a scripting language for building programs based on bash commands (e.g., ls). It's a small personal project I work on sporadically as a refresher on programming language design and compilers. Given that, there's only limited functionality available. Knit uses Antlr (http://www.antlr.org) for language parsing.

## The Language

### Variables

In Knit, variables are immutable, and require no special keyword in order to be declared.

```
foo = "foo"
bar = 1
```

Notice that Knit doesn't require any specific line terminator.

### Types

There are three types in Knit, `string`, `number`, and `boolean`. `number` is represented as a floating point number.

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

### Functions

Functions are defined with the `func` keyword, and Knit programs require a `main` function, at the very least. Defining other functions and calling them is not yet supported.

```
func main {
    println("Hello World")
}
```

### Commands

As said above the whole idea behind Knit is being able to run bash commands easily within a scripting language. In Knit, this is done by putting any bash command you'd put on the command line in between `[` `]` or `\` `\``.

```
func main {
    rootFiles = [ls -al | grep 'root']
}
```

The difference is that, with `[` `]`, the output is returned as a list, where each element of the list is one line of the output of the command. With `\` `\`, the output is returned as a single string.

Using `[` `]`, plus some list comprehension, allow something like:

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

For now, `for ... do` is the only list comprehension available.

You can make reference to variables within the commands, by enclosing the variable between ``${`` and ``}``.

```
func main {
    flag = "drwx"
    dirWithAllPermissions = [ls -al | grep '${flag}']
}
```