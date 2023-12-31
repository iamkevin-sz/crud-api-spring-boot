package com.example.crud.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.crud.entity.StudentClass;
import com.example.crud.service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "api/v1/students")

public class StudentController {
    

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentClass> getAll(){
        return studentService.getStudentsClass();
    }

    @GetMapping("/{studentId}")
    public Optional<StudentClass> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudentClass(studentId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody StudentClass studentClass){
        studentService.saveOrUpdate(studentClass);
    }
 
     @DeleteMapping("/{studentId}")
    public void saveUpdate(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }

    
}
