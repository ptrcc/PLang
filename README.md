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
The generated Antlr4 files are located in [build/generated-src/antlr/main](build/generated-src/antlr/main).

The ANTLR files will be generated automatically when executing any tests or building the project using gradle.
To generate the files, without building the project use the gradle task `generateGrammarSource`.

## Usage 

**PLang** can be evaluated using the [`PLangEvaluator`](./src/main/kotlin/org/plang/PLangEvaluator.kt) class which has an `evaluate` method that 
takes a `String` or an `InputStream` and an optional [`PLangContext`](./src/main/kotlin/org/plang/PLangContext.kt) as input.

### PLangContext

The [`PLangContext`](./src/main/kotlin/org/plang/PLangContext.kt) is a class that holds the variables and functions.
You can set variables using the `addVariable` method and get them using the `getVariable` method. \
Functions can be set using the `addFunction` method and called using the `callFunction` method.
At the moment only functions with no, one or two arguments are supported.

### Example

```kotlin
val result = 0

val ctx = PLangContext()
ctx.addVariable("a", 1)
ctx.addVariable("b", 2)
ctx.addFunction("add", { arg1, arg2 -> result = arg1 + arg2 })

val result = PLangEvaluator().evaluate("""
    add(a, b)
""", ctx)
println(result) // 3
```

### Default Functions

At the moment there is only one default function `out`.
It prints the given argument to the console.

## Examples

You can see some examples in the `test` directory.

## Syntax

### Variables

Variables are declared with the `def` keyword. They can be assigned to with the `=` operator.

```plang
def x = "foo"
def y = 6 + 3
def z = y * 3
x = "bar"
```

### Functions 

Functions are declared with the `def` keyword.
At the moment it's possible to define functions with zero, one or two parameters.

```plang
def function_1 (arg) {
    function_2(arg)
}
def function_2 (arg) {
    out(arg)
}
function_1("argument")
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