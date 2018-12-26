package com.jnshu.repository;

import com.jnshu.domain.Student;
import com.jnshu.service.Impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    StudentServiceImpl studentService;

    @Test
    public void deleteStudentById() {
        studentService.deleteStudentById(2);
    }

    @Test
    public void findStudentById() {
      studentService.findStudentById(1);
    }

    @Test
    public void findStudentByName() {
        Student student=studentService.findStudentByName("汪天驰");
        System.out.println(student);
    }

    @Test
    public void findAllBy() {
        List<Student> list=studentService.findAll();
        System.out.println(list);
    }

    @Test
    public  void saveStudent(){
        for(int x=1;x<20;x++) {
            Student student = new Student();
            student.setName("汪天驰");
            student.setQq(123);
            student.setLearn_type("java");
            studentService.save(student);
        }
    }

    @Test
    public void findStudent(){
        Pageable pageable=new PageRequest(0,3);
        String name="汪天驰";
        Page students=studentService.findStudentByName(name,pageable);
        System.out.println(students);
    }

    @Test
    public void findStudents(){
        Pageable pageable=new PageRequest(1,3);
        Student student=new Student();
        student.setName("孙悟空");
        Page studentPage=studentService.findStudentByName(Example.of(student),pageable);
        System.out.println(studentPage);
    }

    @Test
    public void findStudentBySchool(){
       String school="修真院";
        Pageable pageable=new PageRequest(0,4);
        List<Student> student=studentService.findStudentBySchool(school,pageable);
        System.out.println(student);
    }
}