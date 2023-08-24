package com.example.Question.controller;

import com.example.Question.model.Student;
import com.example.Question.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addData")
    public String addData(@RequestBody Student student){
        return studentService.addStudentData(student);
    }

    @GetMapping("/getData/{id}")
    public Student getData(@PathVariable int id){
        return studentService.getStudentData(id);
    }

    @PutMapping("/updateData/{id}")
    public String updateData(@RequestBody Student student,@PathVariable int id){
        return studentService.updateStudentData(student,id);
    }

    @DeleteMapping("deleteData/{id}")
    public String deleteData(@PathVariable int id){
        return studentService.deleteStudentData(id);
    }
}
