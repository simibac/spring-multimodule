package ch.cbfs.foundation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:foundation.properties")
public class FoundationProperties {

    @Value("${foundation.active-profile}")
    public String activeProfile;

}
