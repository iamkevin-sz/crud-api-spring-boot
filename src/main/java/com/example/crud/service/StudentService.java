package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.StudentClass;
import com.example.crud.respository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<StudentClass> getStudentsClass(){
        return studentRepository.findAll();
    }

     public Optional<StudentClass> getStudentClass(Long id){
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(StudentClass studentClass){
        studentRepository.save(studentClass);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
