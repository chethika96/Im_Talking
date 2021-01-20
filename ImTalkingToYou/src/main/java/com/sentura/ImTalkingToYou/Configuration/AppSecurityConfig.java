package com.sentura.ImTalkingToYou.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    @Override
    protected UserDetailService userDetailService(){

List<UserDetails> users = new ArrayList<>();
users.add(user.withDefaultPasswordEncoder).username("User").password("1234").roles("USER").build;
return new InMemoryUserDetailsManager(users);
    }

}
