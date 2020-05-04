package ch.cbfs.core.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = "classpath:core.properties")
public class CoreProperties {

    @Value("${core.active-profile}")
    public String activeProfile;

}
