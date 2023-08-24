package com.example.Question.service;

import com.example.Question.model.Student;
import com.example.Question.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;
    public String addStudentData(Student student) {
        iStudentRepository.save(student);
        return "Data dded successfully";
    }

    public Student getStudentData(int id) {
        Student student=iStudentRepository.findById(id).get();
        return student;
    }

    public String updateStudentData(Student student, int id) {
        Student student1=iStudentRepository.findById(id).get();
        student1.setPhy(student.getPhy());
        student1.setChem(student.getChem());
        student1.setMaths(student.getMaths());
        student1.setBiology(student.getBiology());
        iStudentRepository.save(student1);
        return "data of student with id "+id+" updated successfully";
    }

    public String deleteStudentData(int id) {
        iStudentRepository.deleteById(id);
        return "data of student with id "+id+" deleted successfully";
    }
}
