package com.example.crud.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entity.StudentClass;

@Repository 
// estamos extendiendo jpa y el la entidad stuedentclass que creamos 
public interface StudentRepository extends JpaRepository<StudentClass, Long> {
    
}
