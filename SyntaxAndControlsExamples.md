# Sharklang - Syntax and Controls Examples

These first examples come from the dd (data definition) language that is the first to be avaible within the collection of Sharklang DSLs.

## Constrained, Consize and Simple Syntax

The spirit is to be as lean and consize as possible as it contributes to simplicity, better readability and better productivity at coding time.

Key words are thus designed to be short and explicit and any superfluous language construct such as end of line termination or block delimiters are excluded.

That leads to an indentation aware syntax like python, because contrary to end of statement delimiters such as ";" in C, indentation is not superfluous to produce readable code.

Certain constructs that are neglected by other languages such as comments are on the contrary made mandatory to compile.

Here is an example of what it looks likes for the DD language:

![dd syntax Example](/img/ddExampleNoError.png)

In the example above comments are mandatory, constants have to be uppercase, Data Objects or Entities have to start with an uppercase… Many coding styles are imposed as part of the compiler, and not as a style or formatting policy implemented by another tool on the side.

The experience of large development shops, often offshore, show that having a very homogenuous coding style is helping to improve maintainability, and this is thus very oriented in that direction.

As for concision, the choice of key words (str, dec, stamp) has that objective of being both explicit and brief. Likevwise for the mandatory marker which was chosen as a '!'.

A DSL R&D team could decide to customize this and easily change '!' into a 'mandatory' key word, so there is an element of flexibility, but at the cost of having a unique syntax, and of making it more verbose.

Another norticeable element is the fact that variable max size is requested for all types. This is not only to be able to generate serializer that will have optimal performance, but also to create a very defensive and strict data structure: when creating an object, and assigning a variable from the front end, the max size will be checked, which makes the application a lot more secure and robust. Business application designers should always be able to know what the max size of a field is.

## Extensive Amounts of Controls: a Very Defensive Approach

That very strict and defensive philosophy is at the core of many of the design choices for the Sharklang DSLs: any practice that allows to detect a bug earlier, with no, or a limited tradeoff, should be used. Cost of defects, when discovered in late testing, or weeks after go live, is huge, and that is also generating CO2, as wasted effort and energy. And most importantly that type of strict practice increases maintainability and thus longevity of the software.

Here are other controls that the sharklang languages do, preventing compiliation:

 - comment in code is the real documentation, together with clean explicit code, and so comment is made part of the language and is mandatory
 - it is propagated to the generated java or C code, which is more complex, but kept as readable as possible still
 - link to requirements is mandatory with the "from" statement as showed above on the model line
 - precision, min and max sizes are compared to the default values on the fly and not only used automatically when creating or serializing objects then in the other DSL languages
 - expressions are checked against expected data types (boolean for contraints, decalred type for default values)
 - expressions are checked to control if operators are compatible with the variable or constants data types
 - the constraint with the name of the entity (here #CashAccount) can only refer to fields of this entity and no other entities

Here is another example with errors:

![dd syntax Example](/img/ddExampleNoError.png)

Business systems are simple but have a large code base that often evolve to spagetthi unless strictly managed. Here with DSLs, controls can come out of the box in the compilation process, without the cost of introducing code quality tools such as SonarQube in your nightly built and pipelines.
