package com.jnshu.controller;

import com.jnshu.domain.Student;
import com.jnshu.service.Impl.StudentServiceImpl;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr_Wang
 */
@Controller
public class StudentController {
    @Resource
    StudentServiceImpl studentService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        List<Student>students= studentService.findAll();
        model.addAttribute("students",students);
        return "list";
    }

    @RequestMapping(value = "/toAdd")
    public String toAdd(){
        return "Add";
    }

    @RequestMapping(value = "add",method =RequestMethod.POST)
    public String add(Student student){
        studentService.save(student);
        return "redirect:/list";

    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public String delete(long id){
        studentService.deleteStudentById(id);
        return "redirect:/list";
    }

    @RequestMapping(value ="toEdit")
    public String toEdit(long id,Model model){
        Student student=studentService.findStudentById(id);
        model.addAttribute("student",student);
        return "Edit";
    }

    @RequestMapping(value = "edit",method = RequestMethod.PUT)
    public String edit(Student student){
        studentService.update(student);
        return "redirect:/list";
    }

    @ResponseBody
    @Transactional()
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Page select(String name,Pageable pageable){
         pageable=new PageRequest(0,5);
//        Student student=new Student();
//        student.setName(name);
//        ExampleMatcher matcher = ExampleMatcher.matching();
//        Example<Student> ex = Example.of(student,matcher);
//        return studentService.findStudentByName(ex,pageable);
        return  studentService.findStudentByName(name,pageable);
    }
}