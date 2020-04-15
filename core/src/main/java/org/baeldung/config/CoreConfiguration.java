package org.baeldung.config;

import org.baeldung.ToUpperase.ToUppercaseService;
import org.baeldung.ToUpperase.ToUppercaseServiceImpl;
import org.baeldung.random.RandomNumberService;
import org.baeldung.random.RandomNumberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// This configuration is also used in the test classes
@Configuration
public class CoreConfiguration {
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
