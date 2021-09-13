package com.dailycodebuffer.departmentservice.service;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method of DepartmentController");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside findDepartmentById method of DepartmentController");
        return departmentRepository.findByDepartmentId(departmentId);
    }

}
