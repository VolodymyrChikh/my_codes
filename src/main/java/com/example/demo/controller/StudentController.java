package com.example.demo.controller;

import ch.qos.logback.core.model.Model;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;


    @Autowired //
    public StudentController(StudentService userService) {
        this.studentService = userService;
    }

    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable Long id){
        Student student = studentService.findById(id);
        if(student == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Students Found");
        }
        return student;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = studentService.findAll();
        return students;
    }

    /*@GetMapping("/user-create")
    public String createStudentForm(Student student){
        return "student-create";
    }*/

    @PostMapping
    public Student createStudent(Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/user-delete/{id}")
    public void deleteStudents(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }

    @PostMapping("/student-update/{id}")
    public void studentsUpdate(@PathVariable("id")Long id, Student student){
        studentService.findById(id);
        studentService.saveStudent(student);
    }


}
// TODO return
// TODO json views
// TODO return MODEL of students
// TODO RestController
