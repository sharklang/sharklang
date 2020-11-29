# Sharklang - Develop business application quicker, in a sustainable way

Sharklang aims at being a business application development environment allowing to:
  - build large scale enterprise software 
  - with the primary objective to limit overal software CO2 footprint
  
Following a holistic greenIT oriented approach, all phases of software lifecycle are considered.
All design decisions of the Sharklang dev platform and runtime are thus aiming to:
  - reduce development time/cost and so the initial CO2 footprint
  - increase maintainability to avoid obsolescence and extent application lifespan at most
  - reduce runtime CO2 footprint with less hradware requirements and better performance
  
Sharks are one of the most energy efficient animals, and as CO2 emissions reduction mostly boils down to energy efficiency throughout the whole software lifecycle (design, run and end of life), this was chosen as the emblem of the platform. 

### But how is this achieved?

Sharklang is primarily a collection of consistent and interconnected Domain Specific Languages (DSLs) that constitute what could be called a "Language Based Software Factory" (LBSF), hence the name Sharklang.

These languages/DSLs allow to be extremely efficient to:

- design and develop enterprise micro service / API oriented business software, 
- provide full traceability from  test cases, requirements and business processes down to business rules,constraints and code

The DSLs are indeed focusing on being concise and adapted to the development of business apps:

- specializing on classical data and processflow oriented business applications, it hides runtime boiler plate code that gets generated
- notions are described once (DRY principle) 
- each DSL is optimal for its problem space which increases robustness and productivity: requirements, data definition, service definition, business rules, process flows , MVC (forms, UI, page flow)... all are using their specialized DSL
- text capture is used for everything (vs. gui / drag and drop tools) which is more efficient at the time of capture
- everything is code which allows tight version control and reduced size
- at the same time, the plaftform provides several different graphical views of the code generated on the fly in the IDE and that can be used to support the design, validation, communication or collaboration processes
- using DSLs allow to constrain the development style, code and practice leading to better homogeneity and reducing the risk of errors: for example a certain amount of comment is mandatory, link to the requirements and test cases are mandatory, or else the code does not compile. Much of these controls adapted to a business app development process come out of the box in the DSLs, and even if it can be customized by a DSL specialist, it avoids to have hundreds of developpers working in an open java context, adding their external libraries and design patterns, without the cost of introducing code quality tools such as SonarQube in your nightly built and pipelines.
- integration to version control, documentation management, test run and deployment comes also out of the box
- in the end, Sharklang offers the same benefits for development and business teams as low code development solutions, but in a text based way (simple code), which allows to be more efficient and create more maintainable systems than when relying on heavyweigh graphical development tools.

This focus on design and development efficiency, and on requirement rigor/tracebility, is not only reducing software TCO and increasing time to market, it is also allowing to produce requirements that are more aligned to business needs and software that are better aligned to requirements. Strangely enough, this is also a large contribution to the reduction of CO2 footprint. Failed projects, software that are partially used, and are not adapted, all generate a lot of Carbon: they are replaced after a few years, or worse, workaround systems are used based on analytics platforms or productivity tools to compensate, which augments a lot the IT bill and the CO2 emissions.

Some design choices of sharklang are very opinionated and the resulting software development factory is preset with many things. Deployment to GCE with ready to use pipeline and topology, code and requirement management processes, strict controls at compile time, code style/formatting, and then of course the generated code and the underlying runtime platform, all can be customized by a DSL specialist, but not by a developer. This makes it a ready to use, framed, and thus efficient development environment, but with what might appear like a lack of flexibilty. This is thus suited for large enterprise software development teams, that can afford to have a method and architecture R&D like team that can help do the customization, but otherwise needs top standardization of code to ensure maintainability.

Now that the principles of the development environment are clarified, lets talk about the runtime stack: using DLSs allows to run this simple business code on the most energy efficient runtime fullstack available to reduce CO2 emission.

DSLs abstract indeed from the run time platform which allows to generate complex optimized code that runs on the most efficient but complex runtime stacks. The first runtime stack chosen is:

- flutter on the Front End side to offer native apps on all platform 
- and vertx/cassandra on GCE/Docker on the back end side, providing REST API. 

In a modern optimal information system, Front End and Back End microservices would maybe be orchestrated by a Kafka layer, to optimize interactions (and again produce less CO2 most likely) but sharkland is not mandating this.

In the end, other backend runtimes will also follow as deployment options: innovations will continue to optimize performance and energy efficiency of software. Possible candidates could then be rust/actix or go.

So using DSLs allows to hit several birds with the same stone:

- software dev is simpler, adapted to business applications, and so less expensive upfront, but also more maintainable which is key on the greenIT side 

- software dev is abstracted from runtime which allows to use complex dev frameworks and techniques (non blocking, event loops, systematic use of factories, flatbuffers and other memory allocation reductions, inlining...) which are key to improve performances and reduce CO2 footprint (less memory, less cpu, smaller infra...) whilst still keeping development accessible to  standard non expert business application developers, since produced code remains simpler, more readable and maintainable, and business rule focused.

- this abstraction of business rules/code from runtime also allows to simply change the runtime as technology evolves in the long run, which allows to drastically augment sofware longevity and benefit from future innovations. Early software obsolescence is a key CO2 generation factor and is thus avoided.

Sharklang is currently mostly a design and concept, with first languages and code generators available in beta versions. It aims at being totally open source and it is thus using the most simple and permissive open source license (BSD Simple). Feel free steal ideas, like this mix of DSL/greenIT approach, or to get in touch at sharklang.org@gmail.com if you want to contribute to Sharklang and help limit the growth of CO2 emission that our digital world is driving. 
