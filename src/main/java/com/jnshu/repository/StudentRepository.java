package com.jnshu.repository;

import com.jnshu.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student,Long> {
    Student findStudentById(long id);
    Student findStudentByName(String name);
    Page<Student> findStudentsByName(String name, Pageable pageable);

    @Transactional(timeout = 10)
    @Query(value = "select * FROM student s where s.school= ?1 ",nativeQuery = true)
    List<Student> findStudentBySchool(String school,Pageable pageable);

}