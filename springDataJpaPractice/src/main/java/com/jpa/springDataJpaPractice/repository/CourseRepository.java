package com.jpa.springDataJpaPractice.repository;

import com.jpa.springDataJpaPractice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
