package com.backend.jwt.jwt;

import com.google.common.net.HttpHeaders;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The JwtConfig Class is a configuration of properties that are grouped together.
 * and make use of the @ConfigurationProperties annotation,
 * which will map these property hierarchies into Java objects graphs
 * useful feature for externalized configuration and easy access
 * to properties defined in **properties files**
 **/

@NoArgsConstructor
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpirationAfterDays;

    public String getAuthorizationHeader(){
        return HttpHeaders.AUTHORIZATION;
    }

}

