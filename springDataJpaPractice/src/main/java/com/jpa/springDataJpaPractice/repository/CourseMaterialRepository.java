package com.jpa.springDataJpaPractice.repository;

import com.jpa.springDataJpaPractice.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
