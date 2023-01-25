package com.avengers.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();

    // get information
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("admnNo") int admnNo){
        return db.get(admnNo);
    }

    // adding the information
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        int admnNo = student.getAdmnNo();
        db.put(admnNo,student);
        return "Student added successfully";
    }
}
