package com.spring.core.chap02_4.controller;

// 저장소에서 조회한 학생 정보를 출력

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentMemoryRepository;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
    private StudentRepository repository;
//@Autowired
//    public StudentController(StudentRepository repository) {
//        this.repository = repository;
//    }

    public void printStudentInfo(){
        Student student = repository.findByStudentId("ID");
        System.out.println("student = " + student);

    }
}
