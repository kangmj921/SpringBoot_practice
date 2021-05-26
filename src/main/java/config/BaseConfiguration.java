package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("real")
@Configuration
public class BaseConfiguration {

    @Bean
    public String hello() {
        return "hello base";
    }
}
