package com.internship.prime.security;


import com.internship.prime.domain.enums.Role;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfig {

    @Autowired
    UserRepoDetailService userRepoDetailService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.POST, "/employee").hasAnyAuthority(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.PUT, "/employee/{employeeID}").hasAnyAuthority(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.DELETE, "/employee/{employeeID}").hasAnyAuthority(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.DELETE, "/task/{taskID}").hasAnyAuthority(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.POST, "/task/{taskID}").hasAnyAuthority(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.PUT, "/task/{taskID}").hasAnyAuthority(Role.ADMIN.name())
                        .anyRequest().authenticated()
                )
                .userDetailsService(userRepoDetailService)
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
