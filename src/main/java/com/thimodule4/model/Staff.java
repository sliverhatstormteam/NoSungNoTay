package com.thimodule4.model;

import javax.persistence.*;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String staffName;
    private Integer age;
    private String departmentName;

    @ManyToOne
    private Department department;

    public Staff() {
    }

    public Staff(int id, String staffName, Integer age, String departmentName, Department department) {
        this.id = id;
        this.staffName = staffName;
        this.age = age;
        this.departmentName = departmentName;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String name) {
        this.staffName = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer content) {
        this.age = content;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String img) {
        this.departmentName = img;
    }

    public Department getCategory() {
        return department;
    }

    public void setCategory(Department department) {
        this.department = department;
    }
}
