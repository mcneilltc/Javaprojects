package com.example.twitter.configuration;
// mvc- model view controller-- the configuration is just the setting for the project
//the model-- same as writing a sql file, the database to make row/colums and make the connections b/w
//the repo-- give the communication b/w db and the
//service--the implementation of the processes for everything--includes the interfaces
//model-repo-service is all in the model category
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
   @Bean
   public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder =
                new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
