package com.raghu.examples.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration 
@ComponentScan("com.raghu") 
@EnableWebMvc 
@Import({ WebConfig.class })
public class AppConfig {
    
    

}
