package com.project.professor.allocation.adriano.repository;

import com.project.professor.allocation.adriano.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findByNameContaining(String partName);

    List<Professor> findByDepartmentId(Long departmentId);
}