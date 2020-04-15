package org.baeldung.person;

import org.baeldung.config.CoreConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;

@TestConfiguration
@Import({CoreConfiguration.class})
@EnableJpaRepositories(basePackages = "org.baeldung")
@ComponentScan(basePackages = "org.baeldung")
public class CoreTestConfiguration {

}
