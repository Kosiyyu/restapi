package com.proj.restapi.controller;

import com.proj.restapi.model.Student;
import com.proj.restapi.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> getAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable(name = "id") Long id){
        return studentService.findById(id);
    }

    @PostMapping("")
    public void create(@RequestBody  Student student){
        studentService.save(student);
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestBody  Student student){
        studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        studentService.delete(id);
    }

}
