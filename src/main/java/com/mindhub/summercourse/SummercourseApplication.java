package com.mindhub.summercourse;

import com.mindhub.summercourse.models.subclass.Admin;
import com.mindhub.summercourse.models.subclass.Student;
import com.mindhub.summercourse.models.subclass.Teacher;
import com.mindhub.summercourse.repositories.AdminRepo;
import com.mindhub.summercourse.repositories.StudentRepo;
import com.mindhub.summercourse.repositories.TeacherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SummercourseApplication {

	public static void main(String[] args) {

		SpringApplication.run(SummercourseApplication.class, args);


	}

	@Bean
	public CommandLineRunner initData(AdminRepo adminRepo, TeacherRepo teacherRepo, StudentRepo studentRepo) {
		return args -> {
			Admin admin = new Admin("Mirta", "Lozano", "mirta@admin.com", "mirta");
			adminRepo.save(admin);
			Teacher teacher = new Teacher("Maria", "Alavarez", "maria@teacher.com", "maria");
			teacherRepo.save(teacher);
			Student student = new Student("Ludmila", "Ibarra", "Ludmila@student.com","ludmi");
			studentRepo.save(student);
		};
	}
}