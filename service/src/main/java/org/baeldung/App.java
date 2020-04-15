package org.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:core/src/main/resources/application-coredb.properties")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
