package burger.it.de.dairy.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        http.csrf().disable();
        http.authorizeHttpRequests((requests) -> requests.requestMatchers(HttpMethod.OPTIONS).permitAll()
                        .requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().permitAll())
                .httpBasic(withDefaults());

        return http.build();
    }
}
