package ch.cbfs.foundation.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@Import({FoundationConfig.class})
public class FoundationTestConfig {

}
