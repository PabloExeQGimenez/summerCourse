package com.mindhub.summercourse.services.serviceImpl;

import com.mindhub.summercourse.models.Person;
import com.mindhub.summercourse.repositories.PersonRepo;
import com.mindhub.summercourse.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
  @Autowired
  private PersonRepo personRepo;
  @Override
  public Person findByEmail(String email) {
    return personRepo.findByEmail(email);
  }
}
