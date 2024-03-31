package com.Attendance.web.controller;

import com.Attendance.web.dto.StudentDto;
import com.Attendance.web.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    private StudentServices studentServices;
    @Autowired
    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }
    @GetMapping("/students")
    public String liststudents(Model model){
        List<StudentDto> students = studentServices.findAllStudents();
        model.addAttribute("students",students);
        return "student-list";
    }
}
