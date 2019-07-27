# spring-framework

## Spring Big Picture

1. Spring Boot is built on top of Spring Framework
2. Notable features of Spring Boot
	a. Auto Configuration
	b. Standalone
	c. Opinionated
3. https://start.spring.io -> url provided for Spring Initializer to download sample demo project where you can start building a complete application on your own
4. Spring Framework is like Software Framework (is a universal, reusable software environment that provides particular functionality as part of a larger software platform to facilitate development of software applications, products and solutions)
5. Spring framework is based on modular architecture
6. Spring framework consists of six key areas : Core, Web, AOP, Data access, Integration, Testing
7. Spring Core is a dependency injection container
8. Dependency injection is about dealing with the way objects fulfil their dependent objects
9. There are two ways to fulfil dependencies
	a. The object fulfils its own dependencies (Tightly Coupled)
	b. The object declares what is depends on and something else fulfils the dependency (Loosely Coupled)
10. Advantages of using Spring
	a. Rock-solid and well engineered
	b. Stood the test of time
	c. Huge community
	d. Well liked
	e. Large Talent Pool
	f. Wealth of Existing knowledge
	g. Very Actively developed
	h. Built in IDE support
	i. Scalable
11. Disadvantages of using Spring
	a. Too much magic
	b. Steep learning curve
	c. Increases the size of your deliverable
	d. Hard to debug
	e. Adds memory overhead
	f. Complexity has grown over time
	g. Spring can be too configurable
	h. Spring is big
	i. Spring community projects are hit or miss

## Spring fundamentals
1. Spring uses a template method design pattern apart from using Singleton, factory and abstract factory design pattern
2. 
3. There are two types of injections 
	a. Setter Injection
	b. Constructor Injection
4. We can use setter and construction injection together
5. Order of bean creation doesn't matter in applicationContext.xml file
6. Constructor injection is index based not name based like setter injection
7. You can create two different objects of the same class with differing in byName only (one in setter injection and one in constructor injection)
8. There are 4 types of autowiring that we can do on a bean
	a. byType
	b. byName
	c. Constructor
	d. no
9. If i have two beans of the same class but with different names, i would get an exception using this approach (byType) because it couldn't tell which bean to choose
10. If we want to use Annotations we need to include context config in applicationContext.xml
11. There are three stereotype annotations
	a. @Component - any POJO 
	b. @Service         - business logic layer
	c. @Repository  -  data layer
12. @Autowired
	a. Member variable
	b. Setter injection
	c. Constructor injection
13. Spring framework can be implemented using Java Configuration
14. @Configuration 
	a. applicationContext replaced by @Configuration
	b. At class level
15. Spring Beans defined by @Bean
16. @Bean is defined at a method level
17. Bean Scopes
	a. Singleton (default)
	b. Prototype
	c. Request
	d. Session
	e. Global Session
18. Singleton Scope
