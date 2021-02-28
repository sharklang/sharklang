# Sharklang - Syntax and Controls Examples

These first examples come from the dd (data definition) language that is the first to be avaible within the collection of Sharklang DSLs.

## Constrained, Concise and Simple Syntax

The spirit is to be as lean and concise as possible as it contributes to simplicity, better readability and better productivity at coding time.

Key words are thus designed to be short and explicit and any superfluous language construct such as end of line termination or block delimiters are excluded.

That leads to an indentation aware syntax like Python, because contrary to end of statement delimiters such as ";" in C, indentation is not superfluous to produce readable code.

Certain constructs that are neglected by other languages such as comments are on the contrary made mandatory to compile.

Here is an example of what it looks likes for the dd language:

![dd syntax Example](/img/ddExampleNoError.png)

In the example above, comments are mandatory, constants have to be uppercase, Data Objects/Entities have to start with an uppercase… Many coding styles are imposed as part of the compiler, and not as a style or formatting policy implemented by another tool on the side, but as a core strcuture of the language grammar. Syntax coloring is customizable in Eclipse, but the lexer is done in such a way that it allows to categorize tokens quite precisely and thus color them distinctively to facilitate reading.

The experience of large development shops, often in multiple locations, shows that having a very homogeneous coding style is helping to improve team collaboration and thus maintainability, and the languages designs are thus very oriented in that direction.

As for concision, the choice of key words (str, dec, stamp) has that objective of being both explicit and brief. Likewise for the mandatory marker which was chosen as a '!' here.

![xtext tuning example](/img/attributeDefXtext.png)

A DSL R&D team could decide to customize this and easily change '!' into a 'mandatory' key word, so there is an element of flexibility in using a set of DSLs like Sharklang. But that would be at the cost of having a different syntax, and of making it more verbose.

Another noticeable element is the fact that variable max size is requested for most types, and min size also a possibility. This is not only to be able to generate serializers that will have optimal performance, but also to create a very defensive and strict data structures: when creating an object, and assigning a variable from the front end, the max/min size will be checked, which makes the application a lot more secure and robust. Business application designers nearly always know what the max size of a field is, and in defining data structures in classical SQL databases this is always done, so let's use it at application level too. And that is made a mandatory information to capture in the dd language.

Expressions are also not using a fully standard syntax: square brackets as well as curly can be used on top of normal brackets like in scholar mathematical notations to improve readability. Also priority of operands is not trusted/possible and one should use brackets to explicit the order of the binary operations: 1+3/4 is not possible and should be written 1+(3/4) or it does not compile.

As a side note, in compliance to the DRY principle, constraints above are reused in all relevant tiers of the application: generated Dart proxy functions used on a front end to call microservices rely on FlatBuffers objects that are generated from the above and are applying all the constraints before sending the REST request to the back-end. Within the service implementation tier, the request objects are also retested using the same constraints, unless this is coming from a trusted source (ie the afore mentionned proxy), in order to not redo processing twice. A microservice and its data are a consistent unit, and the injection of data to the datastore need to go through the APIs. A bulk load API would always invoke the above constraints/checks at FlatBuffers object creation time and before storing into the database.

## Extensive Amounts of Controls: a Very Defensive Approach

That very strict and defensive philosophy is at the core of many of the design choices for the Sharklang DSLs: any practice that allows to detect a bug earlier, with no, or a limited tradeoff, should be used. For a simple data oriented business application, less flexibility for the developper is not a tradeoff, it is a garantee of efficiency and maintainability...Cost of defects, when discovered in late testing, or weeks after go live, is very high, and that is also generating CO2, as wasted effort and energy. And most importantly that type of strict coding practice increases maintainability and thus longevity of the software.

Here are other controls that the dd Sharklang languages do, preventing compilation:

 - comments in code is the real documentation, together with clean explicit code, and so comments are made part of the language and are mandatory
 - the intent is even to calculate a weight of the comment in the code in each file to estimate if the commenting is good enough
 - comments are propagated to the generated java or C code, whi	ch is more complex than the DSL, but still kept as readable as possible 
 - links to requirements are mandatory (through a test case or directly)
 - precision, min and max sizes are compared to the default values on the fly and not only used automatically when creating or serializing objects 
 - expressions are checked against expected data types (boolean for constraints, declared type for default values)
 - expressions are checked to control if operators are compatible with the variable or constants data types
 - the constraint with the name of the entity (here #CashAccount) can only refer to fields of this entity and no other entities as it is called independently from context any time such an objects is serialized/stored or received from an untrusted source

Here is another example with errors:

![dd syntax Example](/img/ddExampleError.png)

Business systems are simple but have a large code base that often evolve to "spaghetti" unless strictly managed. Here with DSLs, controls can come out of the box in the compilation process, without the cost of introducing code quality tools such as SonarQube in your nightly builts and pipelines.
