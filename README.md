# Sharklang - Develop business application quicker, in a sustainable way

Sharklang is a business application development platform allowing to:
  - build large scale enterprise software faster
  - with a **reduced software carbon footprint**
  - and so with very high performance 
  - but still with very good maintainability and thus sustainability
  
Following a holistic greenIT oriented approach, all phases of software lifecycle are considered.

All design decisions for the Sharklang dev platform and its runtime components are thus aiming to reduce CO2 emissions at all stages:
  - at creation time: reduce development time and cost and so the initial CO2 footprint of the build process
  - at run time: 
    - reduce CO2 footprint with better performance, energy efficiency and less hardware requirements
    - increase maintainability to extend application lifespan at most and avoid early obsolescence 
    
And even if performance, energy efficiency and carbon footprint are the most important Non Functional Requirements (NFRs) that the platform is structured around, others are not left behind such as Security, which is paramount nowadays, and also Scalability and Availability. In a greenIT approach, a software that does not have these 3 characteristics won't have a long lifespan, which is itself a waste of carbon emission.

Interestingly enough, having such objectives with a focus on being green and sustainable does also bring business benefits and profitability:

![ProfitableCarbonReduction](/img/ProfitableCarbonReduction.png)
  
Sharks are one of the most energy efficient animals.
As CO2 emissions reduction of software mostly boils down to energy efficiency across the whole software lifecycle (design, run, end of life...), sharks were chosen as the emblem of the platform. 

### But how is this achieved?

#### 1) Language Based Software Factory

Sharklang is primarily a collection of consistent and interconnected Domain Specific Languages ([DSLs on Wikipedia](https://en.wikipedia.org/wiki/Domain-specific_language)) that constitute what could be called a "Language Based Software Factory" (LBSF), hence the name Shark-lang.

These languages/DSLs are developped using [xText](https://www.eclipse.org/Xtext), interact consistently within a full featured eclipse IDE (debugging, refactoring, formatting, completion...) and allow to be *extremely* efficient to:

- design and develop enterprise micro service/API oriented business software, 
- provide full traceability from test cases, requirements and business processes down to business rules, data structures, constraints and code

The DSLs are indeed focusing on being concise and adapted to the development of business apps, which make them very productive:

- specializing on classical data and processflow oriented business applications, it hides runtime boiler plate code that gets generated
- notions are described once using one of the DSL (DRY principle) 
- each DSL is optimal for its problem space which increases robustness and productivity: requirements, data definition, service definition, business rules, process flows , MVC (forms, UI, style, data model, page flow)... all are using their specialized DSL
- text capture is used for everything (vs. gui / drag and drop tools) which is more efficient at the time of capture/coding
- everything is code which allows tight version control and reduced size
- at the same time, the plaftform provides several different graphical views generated on the fly that can be used to support design, validation, communication or collaboration processes
- development style and coding is very constrained and controlled to increase homogeneity, reduce the risk of errors, and increase future maintainablibilty 
- integration to version control, documentation management, test run and deployment comes also out of the box, which not only creates efficiency, but also increases maintainability and thus longevity
- in the end, Sharklang offers many of the same benefits as low code development solutions, but in a text based way (simple code), which allows to be more efficient and create more maintainable systems than when relying on heavyweigh graphical development tools. And furthermore, it is open source and can be customized

This focus on design and development efficiency, and on requirement rigor/tracebility, is not only reducing software design cost and increasing time to market, it is also allowing to produce solutions that are more aligned to business needs. This contributes a lot to the reduction of the IT CO2 footprint. Indeed, failed projects, software that are partially used and are not adapted, all generate a lot of carbon: they are replaced after a few years, or worse, workaround systems are used based on analytics platforms or productivity tools to compensate, which augments a lot the IT bill and the CO2 emissions. Too many IT projects still fail despite so many attempts to solve this core issue of the IT industry, and it is the first thing to tackle if we want to reduce IT carbon emissions.

The Sharklang software factory also focuses on improving the future maintainability of the resulting code: homogeneity, concision of the DSLs, links to documentation and requirements, strict version control… This allows to avoid early software obsolescence and "spagetthi code" situations and thus reduces a lot its carbon footprint.

#### 2) Carbon Optimized Runtime Stack And Design Patterns

Now that the principles of the development environment are introduced, lets talk about the runtime stack: using DLSs allows to write simple business code, but run it on the most energy efficient runtime fullstack available to reduce CO2 emissions. In other words, highly optimized code is generated from the DSLs, which would otherwise be too difficult for standard developpers to directly produce and maintain. This is the main opportunity given to us when using DSLs for GreenIT, and the reason why Sharklang relies on DSLs to reduce carbon emissions. 

So DSLs abstract from the underlying run time platform, isolating the business rules asset from technology. Not only does it allows to generate complex optmized code, but it can also offer several code generation options, and better adapt to evolving non functional requirements, and to future technologgy changes. Again another way of improving software longevity.

The first runtime stack chosen is:

- [Flutter](https://flutter.dev) on the Front End side to offer native apps on all platforms 
- [Vertx](https://vertx.io) and [RocksDB](https://rocksdb.org) on GKE/Docker on the back end side, providing REST API.
- Http/2 with compression over TLS 1.3 is used for transport (with openSSL, ALPN, HPACK, level 8 compression) until HTTP/3 is supported by Netty/Vertx 

![Logos](/img/Logos.png)

Indeed native apps are leaner than web applications running on the browser, hence the choice of Flutter. Then on the backend side, running in a container is not only more mainstream, which is required for adoption, but also more optimal in terms of hardware ressources usage in data centers. As for the choice of GKE it is mostly due to Google head start on being carbon neutral compared to competitors. 

Vertx is a mature framework with optimal usage of CPU resources due to the use of an event loop approach with a callback programming style. It is naturally combining this optimized thread ressource usage design with non blocking APIs for IOs across the board. This makes it a good candidate to reduce CO2 emissions whilst sticking to mainstream java frameworks: a lower number of kernel threads are used and are no wasting time waiting for IOs. The ranking by [the last Techempower Round 20](https://www.techempower.com/benchmarks/#section=data-r20&hw=ph&test=composite) is a good illustration of that. 

The trade-off of such a platform is that programming is complicated and would require skillfull developpers: "callback-hell" is a known maintainability anti-pattern... But in our case, Sharklang DSLs are hidding the complexity of that programming style.

The collocation with a lean database engine like RocksDB is a lot less classical, and combined with the proposal to rely on application level sharding for scalability, this is what makes the Sharklang technical architecture really lean and carbon efficient, as described in the last section. But if it is not yet mainstream, RocksBD is still a mature storage API, used by many modern frameworks like Apache Kafka, YugabyteDB or CockroachDB. And for business applications in microservice architecture, it does the job in the leanest way, with less network hops and cross nodes synchronizations than with a Cassandra or Google Spanner.

Unfortunately HTTP/3 is not yet fully available on Netty/Vertx yet, but this is being implemented. It will provide another level of network communication optimization, which is often overlooked when optimizing performance, whilst it is responsible for a large portion of the carbon footprint.

In the end, other backend runtimes will also follow as more deployment options, because innovations will continue to optimize performance and energy efficiency, and because the decoupling of the DSLs will allow it. Possible candidates could then be rust/actix or C/C++. The initial choice of Java is because it is more mainstream than Rust, and easier to manage and generate with xText than C/C++. And also because optimal Java code with the best JIT compilers options (Graal) can be close enough to C/Rust on the CPUfootprint side (less so for memory). 

#### 3) Lean and Carbon Neutral Default Deployment Approach

In a modern optimal information system, Front End native apps interact with Back End microservice APIs through a thin orchestration layer and secured API gateway, with technologies such as Ngnix or Kafka. 

Sharkland is not mandating this, but it provides a way to describe service composition in its "sf" language (service flow), that matches this approach: persisted service requests, publish and subscribe, asynchronous vs synchronous calls…  

But more importantly, Sharklang offers a default deployment approach with availability, scalability, security, API management and orchestration of services in a way that is both CO2 optimized and adapted to business applications. The core principles of this default deployment topology are:

 - Reduction or at least balance of the number of physical tiers and thus of the amount of network hops in a service invocation
 - Collocation of data and back end processing for that reason and to be a lot leaner
 - Scalability is important, but should be achieved in a way that does not increase carbon footprint too much --> application level sharding is suggested as it allow collocation of data and processing 
 
 The default Sharklang deployment approach also suggest to collocate roles like API gateway and load balancer and orchestration layer in order to limit the amount of network hops which are all using more power and thus CO2 than we realize.


Some design choices of Sharklang are very opinionated and the resulting software development factory is preset with many things. Deployment to GKE with ready to use pipeline and topology, code and requirement management processes, strict controls at compile time, code style/formatting, and then of course the generated code and the underlying runtime platform. All can be customized by a DSL specialist, but not by a developer. This makes it a ready to use, framed/constrained, and thus efficient development environment, but with what might appear like a lack of flexibilty. This is thus suited for large enterprise software development teams, that can afford to have a method and architecture R&D team that does the customization in a centralized controlled way, but that otherwise needs top standardization of code to ensure maintainability. And that allows to have all other developpers focus on business rules and alignment to requirements.

So using DSLs allows to hit several birds with the same stone:

- software dev is simpler, adapted to business applications, and so less expensive upfront, but also more maintainable which is key on the greenIT side 

- software dev is abstracted from runtime which allows to use complex dev frameworks and techniques (non blocking, event loops, systematic use of factories, flatbuffers and other memory allocation reductions, inlining...) which are key to improve performances and reduce CO2 footprint. But this is achieved without introducing complexity and the development techniques remain accessible to  standard non expert business application developers.

- this abstraction of business rules/code from runtime also allows to simply change the runtime as technology evolves in the long run, which allows to drastically augment software longevity, protect the business rules assets, and benefit from future innovations. Early software obsolescence is a key CO2 generation factor and is thus avoided.

Sharklang is currently mostly a design and concept, with first languages and code generators available in beta versions. It aims at being totally open source and it is thus using the most simple and permissive open source license (BSD Simple). Feel free steal ideas, like this mix of DSL/greenIT approach, or to get in touch at sharklang.org@gmail.com if you want to contribute to Sharklang and help limit the growth of CO2 emission that our digital world is driving. 


