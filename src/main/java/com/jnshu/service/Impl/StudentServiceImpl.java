package com.jnshu.service.Impl;

import com.jnshu.domain.Student;
import com.jnshu.repository.StudentRepository;
import com.jnshu.service.StudentService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr_Wang
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
       studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }


   @Override
   public void update(Student student){
        studentRepository.save(student);
   }

    @Override
    public Student findStudentById(long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public Student findStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }

    @Override
    public  List<Student> findStudentBySchool(String school,Pageable pageable) {
        return studentRepository.findStudentBySchool(school,pageable);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Page<Student> findStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public Page findStudentByName(Example <Student> example, Pageable pageable) {
        return studentRepository.findAll(example,pageable);
    }

    public Page findStudentByName(String name,Pageable pageable){
        return studentRepository.findStudentsByName(name,pageable);
    }

}