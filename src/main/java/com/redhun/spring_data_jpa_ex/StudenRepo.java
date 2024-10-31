package com.redhun.spring_data_jpa_ex;

import com.redhun.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenRepo  extends JpaRepository<Student,Integer> {


}
