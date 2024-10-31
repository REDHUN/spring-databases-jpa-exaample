package com.redhun.spring_data_jpa_ex;

import com.redhun.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {


	ApplicationContext context= SpringApplication.run(SpringDataJpaExApplication.class, args);

StudenRepo repo=context.getBean(StudenRepo.class);

//		Student s1=context.getBean(Student.class);
//		Student s2=context.getBean(Student.class);
//		Student s3=context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(80);
//
//		s2.setRollNo(102);
//		s2.setName("kiran");
//		s2.setMarks(75);
//
//		s3.setRollNo(103);
//		s3.setName("Harsh");
//		s3.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);


		System.out.println(repo.findById(103));
	}



}
