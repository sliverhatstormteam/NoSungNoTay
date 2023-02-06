package com.thimodule4.controller;

import com.thimodule4.model.Staff;
import com.thimodule4.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/blogs")
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping
    public List<Staff> getAll(){
        return staffService.getAll();
    }

    @PostMapping
    public Staff create(@RequestBody Staff staff){
        return staffService.save(staff);
    }

    @GetMapping("/{id}")
    public Staff showEdit(@PathVariable int id){
        return staffService.findById(id);
    }

    @PutMapping("/{id}")
    public Staff edit(@RequestBody Staff staff){
        return staffService.save(staff);
    }

//    @DeleteMapping("/{id}")
//    public Blog delete(@PathVariable int id){
//        return blogService.delete(id);
//    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean remove(@PathVariable int id) {
        staffService.delete(id);
        return true;
    }//remove
}
