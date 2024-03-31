package com.Attendance.web.service;

import com.Attendance.web.dto.StudentDto;

import java.util.List;

public interface StudentServices {
    List<StudentDto> findAllStudents();
}
