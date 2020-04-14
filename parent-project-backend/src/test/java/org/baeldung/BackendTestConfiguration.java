package org.baeldung;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;

@TestConfiguration
@Import({BackendConfiguration.class})
@EnableJpaRepositories(basePackages = "org.baeldung")
@ComponentScan
//@TestPropertySource(locations = "classpath:test.properties",
//        properties = "active-profile:test")

public class BackendTestConfiguration {

}
