package study.basecamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import study.basecamp.service.NumberGenerator;

@EnableWebMvc
@Configuration
@ComponentScan("study.basecamp")
public class WebConfig {

    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGenerator();
    }
}
