package com.mindhub.summercourse.models.subclass;

import com.mindhub.summercourse.models.Courses;
import com.mindhub.summercourse.models.Person;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Person {

  private List<Courses> dictatedCourses;
  private LocalDate registrationDate;

  public Teacher(Long id, String name, String lastName, String email, String password, List<Courses> dictatedCourses, LocalDate registrationDate) {
    super(id, name, lastName, email, password);
    this.dictatedCourses = dictatedCourses;
    this.registrationDate = registrationDate;
  }
}
