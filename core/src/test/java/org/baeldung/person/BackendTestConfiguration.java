package org.baeldung.person;

import org.baeldung.config.CoreConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@TestConfiguration
@Import({CoreConfiguration.class})
@EnableJpaRepositories(basePackages = "org.baeldung")
@ComponentScan
//@TestPropertySource(locations = "classpath:test.properties",
//        properties = "active-profile:test")

public class BackendTestConfiguration {

}
