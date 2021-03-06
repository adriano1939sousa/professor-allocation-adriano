package com.project.professor.allocation.adriano.service;

import com.project.professor.allocation.adriano.entity.Department;
import com.project.professor.allocation.adriano.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department findById(Long id) {
        if (id != null) {
            Optional<Department> professorOptional = departmentRepository.findById(id);
            Department professor = professorOptional.orElse(null);
            return professor;
        } else {
            return null;
        }
    }

    public List<Department> findAll(String name) {
        if (name == null)
        {
            List<Department> professors = departmentRepository.findAll();
            return professors;
        }
        else
        {
            List<Department> professors = departmentRepository.findByNameContaining(name);
            return professors;
        }
    }

    public Department create(Department professor) {
        professor.setId(null);
        Department professorNew = departmentRepository.save(professor);
        return professorNew;
    }

    public Department update(Department professor) {
        Long id = professor.getId();

        if (id != null && departmentRepository.existsById(id)) {
            Department professorNew = departmentRepository.save(professor);
            return professorNew;
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        if (id != null && departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
        }
    }

    public void deleteAll() {
        departmentRepository.deleteAll();
    }
}
