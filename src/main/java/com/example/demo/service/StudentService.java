package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // class is a spring's component it can work with
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository userRepository){
        this.studentRepository = userRepository;
    }

    public Student findById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllUsers(){return studentRepository.findAll();}

    public Student saveStudent(Student user){
        return studentRepository.save(user);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
