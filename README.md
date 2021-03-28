# Sharklang - Develop business application quicker, in a sustainable way

### What is Sharklang?

Sharklang is a business application development platform allowing to:
  - build large-scale enterprise software faster
  - with a **reduced software carbon footprint**
  - and so with very high performance 
  - but still with very good maintainability and thus sustainability
  
Following a holistic green IT oriented approach, all phases of software lifecycle are considered.

All design decisions for the Sharklang dev platform and its runtime components are thus aiming to reduce CO2 emissions at all stages:
  - at creation time: reduce development time and cost and so the initial CO2 footprint of the build process
  - at run time: 
    - reduce carbon emissions with better performance, optimal energy efficiency and less hardware requirements
    - increase maintainability to extend application lifespan at most and avoid early obsolescence 
    
And even if performance, energy efficiency and carbon footprint are the most important Non-Functional Requirements (NFRs) that the platform is structured around, others are not left behind such as Security, which is paramount nowadays, and also Scalability and Availability. In a green IT approach, a software that does not have these 3 characteristics won't have a long lifespan anyways, which is itself a waste of carbon emission.

Interestingly enough, having such objectives with a focus on being green and sustainable does also bring business benefits and profitability:
![ProfitableCarbonReduction](/img/ProfitableCarbonReduction.png)
Sharks are one of **the most energy efficient animals**.
As CO2 emissions reduction of software mostly boils down to energy efficiency across the whole software lifecycle (design, run, end of life...), sharks were chosen as the emblem of the platform.


### But how is this achieved?

First a word on the underlying philosophy: 

*Small streams make big rivers, but let's still not forget that you cannot see the forest for the trees*

In our context it means that any small best practice that should contribute to reduce carbon emission is leveraged, providing there is no trade-off in using it. But at the same time it is important to not neglect and to focus on the most important factors of green software design, like the choice of the language, the reduction of memory usage, the limitation of network sollicitation, and of course the most important, the fact that the software is durable, maintainable and in **line with business requirements in the leanest way**. You'll see below, that with the chosen approach relying on Domain Specific Languages (DSLs), we can *both* make low level optimizations (eg. use of Boyer-Moore for string search depending on frequency of search, sizes of pattern and searched text, variability of pattern...) *and also* tackle the key factors of a green IT software design: lean designs, requirement traceability, maintainebility and durability. Indeed the suggested domain specific languages and integrated developement environment ensure that the developpers produce code with a hard link to formal requirements, and also guide them to challenge business requirements so that they take their simplest and leanest form. For example the service definition language will force the definition of the max size of a returned list, and a warning will be generated for a size calculated above 100k and won't compile above 1Mo. That encourages the list of most used items/products to be returned on screen for selection, with a "more" button, rather than returning everything all the time. This kind of guided design constraint built into de development toolset is maybe not flexible, but really encourages to be lean, while on the other side, the code generation can produce optimal code with lower level optimizations. But that's too much anticipation, let's indeed talk about DSLs...

*Traceable lean business requirements implemented via the leanest technology in a maintainable and durable way*


#### 1) Language Based Software Factory


Sharklang is primarily a collection of consistent and interconnected Domain Specific Languages ([DSLs on Wikipedia](https://en.wikipedia.org/wiki/Domain-specific_language)) that constitute what could be called a "Language Based Software Factory" (LBSF), hence the name Shark-lang.

These languages/DSLs are developed using [xText](https://www.eclipse.org/Xtext), interact consistently within a full featured eclipse IDE (debugging, refactoring, formatting, completion, on the fly compilation, unit testing, continuous integration & one-click deployment...) and allow to be *extremely* efficient to:

- design and develop enterprise micro service/API oriented business software, 
- provide full traceability from test cases, requirements and business processes down to business rules, data structures, constraints and code

<p align="center"><img src="/img/SharklangHow.png"></p>

The DSLs are indeed focusing on being concise and adapted to the development of business apps, which make them very productive:

- specializing on data and process flow oriented business applications, it hides runtime boiler plate code that gets generated automatically
- notions are described only once using one of the DSLs (DRY principle) 
- requirement management and test driven design is part of the factory, usnig their own DSLs, with clear line of sight from requirement to code: all code assets have to link to a requirement to compile
- each DSL is optimal for its problem space which increases robustness and productivity: requirements, data definition, service definition, business rules, process flows, MVC (forms, UI, style, data model, page flow)... all are using their specialized DSL
- text capture is used for everything (vs. gui / drag and drop tools) which is more efficient at the time of capture/coding
- everything is thus code, from requirement to infrastrucure (devops) which allows tight version control, easier impact analysis, and reduced size
- at the same time, the platform provides several graphical views that can be used to support design, validation, communication or collaboration processes
- development style and coding is very constrained and controlled to increase homogeneity, reduce the risk of errors, and increase future maintainability. **Examples are available [here](/SyntaxAndControlsExamples.md)**
- integration to version control, documentation management, test run and deployment comes also out of the box, which not only creates efficiency, but also increases maintainability and thus longevity
- in the end, Sharklang offers many of the same benefits as low code development solutions, but in a text based way (simple code), which allows to be more efficient and create more maintainable systems than when relying on heavyweight graphical development tools. And furthermore, it is open source and can be customized.

This focus on design and development efficiency, and on requirement rigor/traceability, is not only reducing software design cost and improving time to market, it is also allowing to produce solutions that are more aligned to business needs. This contributes a lot to the reduction of the IT CO2 footprint. Indeed, failed projects, software that are partially used and are not adapted, all generate a lot of carbon: they are replaced after a few years, or worse, workaround systems are used based on analytics platforms or productivity tools to compensate, which significantly augments the IT bill and the CO2 emissions. Too many IT projects still fail ([2020 stats from PMIPulse showing that project failure on either time, budget or scope is still very high](https://www.pmi.org/-/media/pmi/documents/public/pdf/learning/thought-leadership/pulse/pmi-pulse-2020-final.pdf?v=2a5fedd3-671a-44e1-9582-c31001b37b61&sc_lang_temp=en)) despite so many attempts to solve this core issue of the IT industry, and it is the first thing to tackle if we want to reduce IT carbon emissions. A good development tool is not enough for that, and you need all the other factors like good people, clear business requirements, efficient and addapted methods (agile when possible, or other)… But here Shaklang will try to help on the tooling side...

The Sharklang software factory also focuses on improving the future maintainability of the resulting code: homogeneity, concision of the DSLs, links to documentation and requirements, strict version control… This allows to avoid early software obsolescence and "spaghetti code" situations and thus reduces a lot its carbon footprint.



#### 2) Carbon Optimized Runtime Stack And Design Patterns


Now that the principles of the development environment are introduced, lets talk about the runtime stack: using DLSs allows to write simple business code, but run it on the most energy efficient runtime full stack available to reduce CO2 emissions. In other words, highly optimized code is generated from the DSLs, which would otherwise be too difficult for standard developers to directly produce and maintain. This is the main opportunity given to us when using DSLs for green IT, and the reason why Sharklang relies on DSLs to reduce carbon emissions. 

<p align="center"><img src="/img/wordcloud.png"></p>

So DSLs abstract from the underlying runtime platform, isolating the business rules asset from technology. Not only does it allow to generate complex optimized code, but it can also offer several code generation options, and better adapt to evolving non-functional requirements, and to future technology changes. Again another way of improving software longevity.

The first runtime stack chosen is:

- [Flutter](https://flutter.dev) on the Front End side to offer native apps on all platforms using dart and very usefull http object for rest service calls
- [Vertx](https://vertx.io) and [RocksDB](https://rocksdb.org) on GKE/Docker on the back end side, providing REST API developped in Java in the leanest way, using LZ4 compression
- Http/2 with compression over TLS 1.2 is used for transport until HTTP/3 is supported by Netty/Vertx and/or TLS 1.3 is supported by Flutter/Dart which will inevitably come in due time
- [FlattBuffers](https://google.github.io/flatbuffers) for serialized data, in the database and over the network
<p align="center"><img src="/img/SharkLangLogos.png"></p>
Indeed native apps are leaner than web applications running on the browser, hence the choice of Flutter, that also facilitates adoption with the largest deployment offer (IOs, Android, Desktop, Web). 

Then on the backend side, running in a container is not only more mainstream, which is required for adoption, but also more optimal in terms of hardware resources usage in data centers. As for the choice of GKE, it is mostly due to Google head start on being carbon neutral compared to competitors. 
 
Vertx is a mature framework with optimal usage of CPU resources used by very trendy Java frameworks such as Quarkus. Indeed it uses an event loop approach with a callback programming style. It is naturally combining this optimized thread resource usage design with non-blocking APIs for IOs across the board. This makes it a good candidate to reduce CO2 emissions whilst sticking to mainstream Java frameworks: a lower number of kernel threads are used and are not wasting time waiting for IOs. The ranking by [the last Techempower Round 20](https://www.techempower.com/benchmarks/#section=data-r20&hw=ph&test=composite) is a good illustration of that. 

The trade-off of such a platform is that programming is complicated and would require skilfull developers: "callback-hell" is a known maintainability anti-pattern, especially for simple business applications... But in our case, Sharklang DSLs are hiding the complexity of that programming style.

The collocation with a lean database engine like RocksDB is a lot less classical, and combined with the proposal to rely on application level sharding for scalability, this is what makes the Sharklang technical architecture really lean and carbon efficient, as described in the last section. Even if it is not yet mainstream, RocksBD is a mature storage solution, used by many modern frameworks like [Apache Kafka](https://kafka.apache.org/), [YugabyteDB](https://www.yugabyte.com/) or [CockroachDB](https://www.cockroachlabs.com/product/). And for business applications in a microservice architecture, it does the job in the leanest way, with less network hops and cross nodes synchronizations than with a Cassandra or Google Spanner.

Unfortunately, HTTP/3 is not yet fully available either on Netty/Vertx or on FlatBuffer/Dart yet, but this is being implemented. It will provide another level of network communication optimization, which is often overlooked when optimizing performance, whilst it is responsible for a large portion of the carbon footprint.

In the end, other backend runtimes will also follow in the forms of more deployment options, because innovations will continue to optimize performance and energy efficiency, and because the decoupling of the DSLs will allow it. Possible and probable leaner candidates could then be Rust/Actix or C/C++ with emerging frameworks like [Lithium](https://github.com/matt-42/lithium/). The initial choice of Java is because it is more mainstream than Rust, and easier to manage and generate with xText than C/C++. And also because optimal Java code with the best JIT compilers options (Graal) can be close enough to C/Rust on the CPU footprint side, and can also now be AOT compiled with GraaVM to provide leaner memory footprint. For more consideration on the choice of language you can read [this](/WhyChooseJava.md).

With all deployment options pre-packaged (native Kubernetes, compiled with GraalVM, relying on Vertx...), the direction is very close to the one taken by [Quarkus](https://quarkus.io/). It is still a lot narrower and more framed and opinionated, as focusing on business applications, low carbon footprint, mantainability, and using DSLs rather than maven automation and pure java code with a collection of mainstream customized annotations and frameworks.

A last word on key design patterns for the business rules generated in Java:

- limit memory allocation and garbage collection by using factories of Flatbuffers mutable Value Objects
- inline business functions depending on their size and complexity into adequately sized Vertx Verticles
- use native java types as much as possible
- use caching in a balanced way (size vs usage frequency or value added for deterministic result caching)



#### 3) Lean and Carbon Neutral Default Deployment Approach


In a modern optimal information system, Front End native apps interact with Back End microservice APIs through a thin orchestration layer and secured API gateway, with technologies such as Ngnix or Kafka. This architecture pattern is promoted by Sharklang.

Sharkland is not mandating this, but aligns to this approach. It provides for example a way to describe service composition in its "sf" language (service flow), with persisted service requests, publish and subscribe modes, asynchronous vs synchronous calls…  

But more importantly, Sharklang offers a default deployment approach with availability, scalability, security, API management and orchestration of services, in a way that is both CO2 optimized and adapted to business applications. The core principles of this default deployment topology are:

 - Reduction, or at least balance, of the number of physical tiers and thus of the amount of network hops in a service invocation as network energy cost is too often overlooked in current architectures
 - Collocation of data and back end processing for that reason, and to be a lot leaner
 - Scalability and Availability are very important, but should be achieved in a way that does not increase carbon footprint too much: application level sharding is thus suggested as it is requiring less processing at runtime, even if it increases the complexity at design time
 
That final design time complexity tradeoff is mitigated by the use of the DSLs, and the inclusion of this application level sharding aspect to the data definition and service definition languages.
 
The default Sharklang deployment approach also suggests to collocate roles like API gateway,load balancer and orchestration layer in order to limit the amount of network hops which are all using more power and thus CO2 than we realize.

In the end, the high-level deployment architecture is as follows, ensuring scalability and availability in the leanest way:
![SharkLangDeploymentArchitecture](/img/SharkLangDeploymentArchitecture.svg)
### Discover more of Sharklang opinionated design and join the work !

Some design choices of Sharklang are very opinionated and the resulting software development factory is preset with many things:

 - Deployment to GKE with ready to use pipeline and topology (people call that "cloud native" these days)
 - Code and requirement management processes
 - Strict controls at compile time
 - Code style/formatting
 - and then of course the generated code and the underlying runtime platform. 

All can be customized by a DSL specialist, but not by a developer. This makes it a ready to use, framed/constrained, and thus efficient development environment, but with what might appear like a lack of flexibility. This is thus suited for large enterprise software development teams, that can afford to have a method and architecture R&D team that does the DSL customization in a centralized controlled way. Such large teams otherwise need top standardization of code to ensure maintainability, which Sharklang offers. That allows to have developers focus on business rules and alignment to requirements, and not on technical problems. And the fact that the DSL can only be changed by a specialized team protects from architectural deviation that could occur in a more open java coding environement for example.



So using DSLs allows to hit several birds with the same stone:

- software dev is simpler, adapted to business applications, and so less expensive upfront, but also more maintainable which is key on the green IT side .

- software dev is abstracted from runtime which allows to use complex dev frameworks and techniques (non blocking, event loops, systematic use of factories, flatbuffers and other memory allocation reductions, inlining...) which are key to improve performances and reduce CO2 footprint. But this is achieved without introducing complexity and the development techniques remain accessible to  standard, non-expert, business application developers.

- this abstraction of business rules/code from runtime also allows to simply change the runtime as technology evolves in the long run, which allows to drastically augment software longevity, protect the business rules assets, and benefit from future innovations. Early software obsolescence is a key CO2 generation factor and is thus avoided.

Sharklang is currently mostly a design and concept, with first languages (data definition) and code generators available in beta versions. It aims at being totally open source and it is thus using the most simple and permissive open source license (BSD Simple). Feel free to steal ideas, like this mix of DSL/green IT approach, or to get in touch at sharklang.org@gmail.com if you want to contribute to Sharklang and help limit the growth of CO2 emission that our digital world is driving. 

Further reads/articles:

- [Why choose Java?](/WhyChooseJava.md)
- [DD language syntax examples](/SyntaxAndControlsExamples.md)
- technical design principals
...

