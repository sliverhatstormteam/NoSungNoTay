package com.thimodule4.repository;

import com.thimodule4.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IStaffRepo extends PagingAndSortingRepository<Staff, Integer> {
}
