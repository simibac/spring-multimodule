package org.baeldung.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value="classpath:core.properties")
//@ConfigurationProperties("core")
public class CoreProperties {
    @Value("${core.active-profile}")
    public String activeProfile;
}
