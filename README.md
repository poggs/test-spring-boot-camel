Spring Boot 2 vs 3 Integration Test problem
===========================================

The code in `spring-boot-2-integration-test` and `spring-boot-3-integration-test` is fundamentally the same.  The only
difference is that `spring-boot-starter-test` dependency in the Spring Boot 3 example has `slf4j-api` excluded.

The version using Spring Boot 2 works, but the Spring Boot 3 version fails:

```text
2022-11-29T13:16:35.255Z ERROR 3299024 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in uk.co.poggs.test.spring3.GenericRouteBuilder required a bean of type 'org.apache.camel.CamelContext' that could not be found.


Action:

Consider defining a bean of type 'org.apache.camel.CamelContext' in your configuration.
```
