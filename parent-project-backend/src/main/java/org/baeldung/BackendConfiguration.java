package org.baeldung;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// This configuration is also used in the test classes
@Configuration
public class BackendConfiguration {
    @Bean
    public ToUppercaseService pdfGenerationService() {
    ToUppercaseService service = new ToUppercaseServiceImpl();
    return service;
}

    @Bean
    public RandomNumberService randomNumberService() {
        RandomNumberService service = new RandomNumberServiceImpl();
        return service;
    }
}
