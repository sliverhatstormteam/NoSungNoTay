package com.thimodule4.repository;

import com.thimodule4.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IDepartmentRepo extends PagingAndSortingRepository<Department, Integer> {
}
