package com.mindhub.summercourse.models;

import com.mindhub.summercourse.models.subclass.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  @ManyToMany(mappedBy = "enrolledCourses")
  private List<Student> Students;

  public Course(String name){
    this.name=name;
  }
}
