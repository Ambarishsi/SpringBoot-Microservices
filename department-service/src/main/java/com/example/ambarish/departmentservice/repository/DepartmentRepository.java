package com.example.ambarish.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ambarish.departmentservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{


	Department findByDepartmentId(Long departmentId);



}
