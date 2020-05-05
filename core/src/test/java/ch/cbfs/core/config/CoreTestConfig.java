package ch.cbfs.core.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@Import({CoreConfig.class})
public class CoreTestConfig {

}
