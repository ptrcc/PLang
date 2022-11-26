# PLang

**by Patrick Arbeiter**

PLang is a simple programming language that I made for MDDEV.
It supports all the basic operations like conditionals, loops, and functions.
It also supports variables, but they are not required.
It is not meant to be used for anything serious,
but it is a fun language to play around with.

## Antlr4

**PLang** uses [Antlr4](https://www.antlr.org/) to parse the code.
The grammar is in [PLang.g4](./src/main/antlr/PLang.g4) file.
The generated Antlr4 files are located in [src/main/java](./src/main/java).

To generate the files, run `antlr4 PLang.g4 -o ../java/org/plang -package org.plang -visitor`.

## Usage 

**PLang** can be evaluated using the `PLang` class.
The `PLang` class has a `evaluate` method that 
takes a `String` or an `InputStream` and an optional`PLangContext` as input.

### PLangContext

The `PLangContext` is a class that holds the variables and functions.
You can set variables using the `setVariable` method and get them using the `getVariable` method. \
Functions can be set using the `setFunction` method and called using the `callFunction` method.
At the moment only functions with no, one or two arguments are supported.

### Example

```kotlin
val result = 0

val ctx = PLangContext()
ctx.setVariable("a", 1)
ctx.setVariable("b", 2)
ctx.setFunction("add", { arg1, arg2 -> result = arg1 + arg2 })

val result = PLang.evaluate("""
    add(a, b)
""", ctx)
println(result) // 3
```

### Default Functions

At the moment there is only one default function `out`.
It prints the given argument to the console.

## Syntax

### Variables

Variables are declared with the `def` keyword. They can be assigned to with the `=` operator.

```plang
def x = "foo"
def y = 6 + 3
def z = y * 3
x = "bar"
```

### Conditionals

Conditionals are declared with the `if` keyword.
They can be chained with the `else if` keyword.
The `else` keyword can be used to catch all other cases.

```plang
if foo == "bar" {
    do_something()
} else if foo == "baz" {
    do_something_else_if()
} else if foo == "qux" {
    do_something_else_if()
} else {
    do_something_else()
}
```

### Loops

Loops are declared with the `loop` keyword.

```plang
def i = 0

loop i < 10 {
    i = i + 1
}
```

### Comments

Comments are started with `//` and end at the end of the line.