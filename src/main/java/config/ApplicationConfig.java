package config;

import components.GreetingService;
import components.impl.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vitaliy on 28.09.16.
 */
@Configuration
public class ApplicationConfig {
    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
