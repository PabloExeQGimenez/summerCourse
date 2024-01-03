package com.mindhub.summercourse.configuration;

import com.mindhub.summercourse.models.Person;
import com.mindhub.summercourse.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebAuthentication extends GlobalAuthenticationConfigurerAdapter {

  @Autowired
  private PersonRepo personRepo;
  @Bean
  public PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }

  @Override
  public void init(AuthenticationManagerBuilder auth) throws Exception {
   /* auth.userDetailsService(inputName -> {
      Person person = personRepo.findByEmail(inputName);



    });*/
  }
}