package com.mindhub.summercourse.repositories;

import com.mindhub.summercourse.models.subclass.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {
}
