package uk.co.poggs.test.spring2;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GenericRouteBuilder extends RouteBuilder {

    private final CamelContext camelContext;

    public GenericRouteBuilder(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public void configure() throws Exception {

        camelContext.setManagementName("spring-boot-3");

        from("direct:start")
                .to("mock:end");

    }

}
