package com.Attendance.web.repository;

import com.Attendance.web.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository  extends JpaRepository<Students,Long> {
    @Override
    Optional<Students> findById(Long aLong);
}
