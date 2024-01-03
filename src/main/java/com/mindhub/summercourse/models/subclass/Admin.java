package com.mindhub.summercourse.models.subclass;

import com.mindhub.summercourse.models.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Admin extends Person {


  public Admin(String name, String lastName, String email, String password) {
    super(name, lastName, email, password);
  }
}
