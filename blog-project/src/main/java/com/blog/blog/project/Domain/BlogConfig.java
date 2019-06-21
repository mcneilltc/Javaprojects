package com.blog.blog.project.Domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BlogConfig {
    @Bean
    public ArrayList<BlogInfo> posts(){
        return new ArrayList<BlogInfo>();
    }
}
