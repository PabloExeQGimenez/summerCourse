package com.mindhub.summercourse.controllers;

import com.mindhub.summercourse.models.Course;
import com.mindhub.summercourse.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoursesCotroller{
  @Autowired
  private CourseService courseService;

  @GetMapping("/courses")
  public List<Course> getAllCourses(){
    return courseService.getAllCourses();
  }
}
