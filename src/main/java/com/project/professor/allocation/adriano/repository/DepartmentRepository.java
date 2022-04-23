package com.project.professor.allocation.adriano.repository;

import com.project.professor.allocation.adriano.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByNameContaining(String partName);
}