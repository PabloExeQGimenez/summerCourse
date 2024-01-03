package com.mindhub.summercourse.services;

import com.mindhub.summercourse.models.Person;

public interface PersonService {
  Person findByEmail(String email);
}
