package com.mindhub.summercourse.services.serviceImpl;

import com.mindhub.summercourse.models.Course;
import com.mindhub.summercourse.repositories.CourseRepo;
import com.mindhub.summercourse.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
  @Autowired
  private CourseRepo courseRepo;

  @Override
  public List<Course> getAllCourses() {
    return courseRepo.findAll();
  }
}
