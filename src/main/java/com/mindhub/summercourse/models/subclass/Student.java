package com.mindhub.summercourse.models.subclass;

import com.mindhub.summercourse.models.Courses;
import com.mindhub.summercourse.models.Person;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {

  private List<Courses> enrolledCourses;
  private LocalDate dateOfAdmission;
}
