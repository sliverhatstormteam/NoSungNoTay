package com.thimodule4.service;


import com.thimodule4.model.Staff;
import com.thimodule4.repository.IStaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffService {
    @Autowired
    IStaffRepo iStaffRepo;

    public List<Staff> getAll( ) {
        return (List<Staff>) iStaffRepo.findAll();
    }

    public Staff save(Staff staff) {
        return iStaffRepo.save(staff);
    }

    public Staff delete(int id) {
        Staff staff = findById(id);
        iStaffRepo.deleteById(id);
        return staff;
    }

    public Staff findById(int id) {
        return iStaffRepo.findById(id).get();
    }

}
