package com.prabodha.rentcloud.authserver.authserver.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration  extends GlobalAuthenticationConfigurerAdapter {




    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Prabodha").password(passwordEncoder.encode("Prabodha123")).authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and()
                .withUser("suranga").password(passwordEncoder.encode("surpass")).roles("USER").authorities("CAN_READ","CAN_WRITE");
    }
}
