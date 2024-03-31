package com.Attendance.web.service.impl;

import com.Attendance.web.dto.StudentDto;
import com.Attendance.web.models.Students;
import com.Attendance.web.repository.StudentRepository;
import com.Attendance.web.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class StudentServicesimpl implements StudentServices {
    private StudentRepository studentRepository;


    @Autowired
    public StudentServicesimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> findAllStudents(){
        List<Students> students= studentRepository.findAll();
        return students.stream().map(this::mapToStudentDto).collect(Collectors.toList());

    }
    private StudentDto mapToStudentDto(Students students){
        StudentDto studentDto = StudentDto.builder()
                .id(students.getId())
                .first_name(students.getFirst_name())
                .last_name(students.getLast_name())
                .roll_number(students.getRoll_number())
                .email(students.getEmail())
                .batch_year(students.getBatch_year())
                .build();
        return studentDto;
    }
}
