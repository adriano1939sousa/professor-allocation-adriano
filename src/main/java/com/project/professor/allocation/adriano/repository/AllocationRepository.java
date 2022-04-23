package com.project.professor.allocation.adriano.repository;

import com.project.professor.allocation.adriano.entity.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AllocationRepository extends JpaRepository<Allocation, Long> {
    List<Allocation> findByProfessorId(Long professorId);

    List<Allocation> findByCourseId(Long courseId);
}