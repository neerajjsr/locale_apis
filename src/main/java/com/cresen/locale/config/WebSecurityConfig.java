package com.cresen.locale.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


/**
 * @Author dolyt
 * @create 18-01-2021 15:10
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers(
                        HttpMethod.GET,

                        "/"

                )
                .permitAll();

        http.csrf().disable(); // Comment this out as this by default enabled by Spring Security - Cross-Domain Misconfiguration

        http.headers().frameOptions().sameOrigin(); // Added for - X-Frame-Options Header Not Set
    }


}
