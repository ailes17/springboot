package com.tx.child2;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan("com.tx.child2")
public class EnvConfig {

    @Profile({"default"})
    public static PropertySourcesPlaceholderConfigurer localPropertyConfigurer() throws IOException {
        final PropertySourcesPlaceholderConfigurer  props = new PropertySourcesPlaceholderConfigurer ();
        props.setLocations(new ClassPathResource("application-child2.properties"));
        return props;
    }
}