package com.sammie.studentcourses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sammie.studentcourses.domain.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
