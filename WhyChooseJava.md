# Why Choose Java for a green IT REST API service provider?

I have several times heard that the choice of language *does not really matter* for green IT, beyond the choice of compiled vs. interpreted:

 - AOT compiled C/C++/Go/Graal and close behind JIT compiled like java, js V8, PHP 8 or Python+Numba, Ruby 3.0+JIT
 - vs. interpretted (pure Python, PHP 7, Perl, Ruby 2.0...). 

It is partially true, because it depends on what the choice was about, and what was meant by "does not really matter".

**Does it really matter ?**

Indeed, the choice of a lean architecture that avoids many network hops and cross tiers data synchronizations, and most importantly the quality of the design and its alignment to the business requirements int he leanest way matters more. And so do many other factors that can influence maintainability or durability, which are the most important factors to avoid obsolescence and reduce carbon footprint.

For example a C super optimized programme might run 2 times faster than the equivalent well structured java, but if it is spagetthi code it will last 2 years in production and not 15, and that will generate carbon emissions.

An over-engineered piece of java code optimally compiled with GraalVM will execute useless processing not really aligned to key business requirements and will consume more energy than a simpler version of the service, well designed and aligned to core requirements only, even if it is running in purely interpretted Python.

Of course. All that is quite obvious.

But all things being equal otherwise, would we not rather use the most carbon efficient language? Trying to design well and lean does not prevent from choosing the best language. The one that not only uses less CPU but also less memory, which is nowadays more and more important, and sometimes neglected like the network energy consumption. 

There are recent researches that allow to cleanly rank languages and C/C++/Rust are clear winners as a group of researchers in Portugal demonstrated (links [1](https://thenewstack.io/which-programming-languages-use-the-least-electricity/) and [2](https://dl.acm.org/doi/abs/10.1145/3136014.3136031)).

![ranking](/img/languages-energy-time-and-memory-usage.png)

In the specific context of this test, Java uses 2 times more energy at runtime and non compiled Python 75 times more (why did they not use Numba...)! And what's more, the carbon footprint gets even worse if you look at memory, with Java using 6 times more than C, and Python about 3 times more. Results might differ for other types of applications, and business data oriented ones that I'm more interested in also. But still, I think we would all agree that C/C++ or Rust would win, even if this is only by 30% instead of 100%, which is also what is showed by other tests like the [Techempower benchmarks](https://www.techempower.com/benchmarks/#section=data-r20&hw=ph&test=composite) over the years, or these  recent articles:
- [Compare C++, JS, Python, Python + numba, PHP7, PHP8, and Golang in “Prime Number” calculation](https://itnext.io/compare-c-js-python-python-numba-php7-php8-and-golang-in-prime-number-calculation-55e82b6f82a9).
- [Basic Comparison of Python, Julia, Matlab, IDL and Java (2019 Edition)] (https://modelingguru.nasa.gov/docs/DOC-2783)

So I do think that *the choice of language matters*, even when only looking at the pure technical characteristics and energy consumption at run time. If one can make a 30% CPU saving, and 50% memory saving, by just switching to C++ instead of AOT compiled Java with GraalVM or Numba Python, this is is certainly worth it, as the rest of the design can be otherwise the same.

**But can it really be the same design ?**

Well, unfortunately not totally. There we need to check other non functional requirements that are important, and other real life constraints.

That of course varies from one project to another, but as for Sharklang's objectives, we have:

- Security and Network protocols: can we have the same support in all languages and frameworks? Unfortunately not all languages will support the latest standards, today NIO HTTP/2 + TLS 1.3, and soon HTTP/3. That can be the same for compression (LZ4) or for database connectivity. So that means sticking to mainstream languages such as C/C++, Python or Java. Even if there are exceptions with the early availability of HTTP/3 (Quiche) in Rust.
- Proven high performance Rest API developement frameworks: when looking at the Techempower banchmarks already cited before, strangely enough Python is not present in the top list. All underlying building blocks should be there (nio, http3..) but in Python there does not seem to be a mature nio "actor like" framework like Actix in Rust or Vertx in Java. And also the top http frameworks/platforms in C and C++ (H2O, Drogon, Lithium) are not as mature, fully featured and supported as [Vertx](https://vertx.io/) or [Actix](https://actix.rs/). That really leads to either choose Java/Vertx or Rust/Actix to benefit from their performance, which is mostly coming from their underlying light threading / event loop design, and the use of non blocking ios.
- Native deployment to various devices on the frontend: the choice a native apps for front end deployment, which is quite obvious in a green IT context when compared to Web applications running in the browser, adds another constaint. Here the choice of technology is dictated by the capability to deploy to many devices with the same code base and that leads to using Flutter. Indeed it would otherwise compell to generate either Java/Kotlin for Android or Swift/Objective C for IOs or C++/C# for Windows and Linux. This is possible but would slow down the development of Sharklang a lot, with little benefits. And restricting to a single runtime (e.g. Android, or Windows) seems to limiting for Business applications, where we need at least one desktop (Windows 10) and one mobile (Android).

**Other Constraints**

- Adoption: 
	- even if the point is to hide the generated language by using DSL, we know that a good practice in code generation is to keep the code readabale, and it thus needs to be a mainstream enough language that is know by many developpers
	- looking at TIOBE that limits us to C/C++/Java and Python. For now unfortunately, Rust is thus excluded and so is Actix. The idea would be to make it a secondary code generation target after the more mainstream one is available in the Sharklang platform
- Maintainability and Durability:
	- more recent languages and platforms are to be avoided as their longevity is not proven. Again that leads to considering Java/C/C++/Python, and we should give Rust another few year probably
	- on the maintainability side, the maturity of the developement environement and surrounding tools/ecosystem is also key. Here this is about allowing clean and easy debugging from the IDE, relying on code review tools… in the particular case of Sharklang, the xText interoperability with Java in a mature eclipse environment puts Java at the top of the list
	- multiplatform on the back-end is less of a topic now with containers, but the proven portability of java accross many environments, including zSeries for example, or embedded devices, makes it also a slightly better candidates than the others
- Adequation with the usage environement:
	- we are talking developement teams in large non IT companies (banks, retailers..), or business software vendors. In this type of context, recruitment of a C/C++ or Rust expert is a lot more challenging these days than Java/Python
	- outside of older languages (RPG, COBOL) the de facto standard in such companies is the Java/SQL, with emergence of Python
	
**Conclusion**	

Even if it might be 2 times more energy hungry, Java is the only good compromise for the start of Sharklang as a code generation target. Defining a good mature / mainstream C/C++ based architecture would be a challenge, with potential candidates like Drogon, but that seem not as mature as they should be. That could lead to build around Ngnix, developping ngnix modules in C that could then call dynamic librairies native apis developped with a C++ mature actor framework like [CAF](https://actor-framework.readthedocs.io/en/stable/index.html). A lot less obvious than going for Vertx or Actix, with a generated code complexity that is also higher… So then the second generation target in a few months or years would probably be Rust / Actix.

