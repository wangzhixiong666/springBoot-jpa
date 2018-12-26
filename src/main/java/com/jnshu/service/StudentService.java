package com.jnshu.service;

import com.jnshu.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {

    void deleteStudentById(long id);
     void update(Student student);
    void save(Student student);
    Student findStudentById(long id);
    Student findStudentByName(String name);
    List<Student> findStudentBySchool(String school,Pageable pageable);
    List<Student> findAll();
   Page<Student>findStudents(Pageable pageable);

}

