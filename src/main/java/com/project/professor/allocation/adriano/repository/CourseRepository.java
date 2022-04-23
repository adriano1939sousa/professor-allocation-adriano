package com.project.professor.allocation.adriano.repository;

import com.project.professor.allocation.adriano.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByNameContaining(String partName);
}