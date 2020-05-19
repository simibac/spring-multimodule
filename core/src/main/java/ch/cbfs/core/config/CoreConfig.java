package ch.cbfs.core.config;

import ch.cbfs.core.random.RandomNumberService;
import ch.cbfs.core.random.RandomNumberServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan("ch.cbfs.core")
@EnableJpaRepositories("ch.cbfs.core")
@EntityScan("ch.cbfs.migration")
public class CoreConfig {

    @Bean
    public RandomNumberService randomNumberService() {
        return new RandomNumberServiceImpl();
    }

}
