package com.mindhub.summercourse.repositories;

import com.mindhub.summercourse.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
  Person findByEmail(String email);
}
