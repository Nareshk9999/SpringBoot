package com.pfp.firstproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.pfp.firstproject.entity.StudentModel;


//import com.firstProject.stuEntity.StudentModel;

public interface StudentRepository extends CrudRepository<StudentModel, Long> {

}
