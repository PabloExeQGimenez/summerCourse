package com.mindhub.summercourse.models.subclass;

import com.mindhub.summercourse.models.Course;
import com.mindhub.summercourse.models.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Student extends Person {
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name ="student_course", joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id")
  )
  private List<Course> enrolledCourses;
  private LocalDate dateOfAdmission;

  public Student(String name, String lastName, String email, String password) {
    super(name, lastName, email, password);
  }
}
