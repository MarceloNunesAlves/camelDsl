package br.com.mna.testes.camelDsl.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("kafka:[IP]:[porta]?topic=[topic]&groupId=group1&brokers=[IP]:[porta]&consumersCount=1&autoOffsetReset=earliest")
        .log("${body}");
    }
    
}