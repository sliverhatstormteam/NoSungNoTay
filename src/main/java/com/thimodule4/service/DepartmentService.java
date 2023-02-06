package com.thimodule4.service;

import com.thimodule4.model.Department;
import com.thimodule4.repository.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    IDepartmentRepo iDepartmentRepo;

    public List<Department> getAll(){
        return (List<Department>) iDepartmentRepo.findAll();
    }
}
