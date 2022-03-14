package com.chil.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);// once my server response, whether json will be proceded through javascript
        config.addAllowedOrigin("*");// will response all IP
        config.addAllowedHeader("*");// will response all header
        config.addAllowedMethod("*");// allow all post,get,put,delete,patch requests
        source.registerCorsConfiguration("/api/**",config);
        return new CorsFilter(source);
    }
}
