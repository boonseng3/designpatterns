package com.obs.designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by ongbo on 2/22/2017.
 */
public class Manager implements Employee {
    private String name;
    private String department;
    private List<Employee> children = new ArrayList<>();

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public Optional<List<Employee>> getChildren() {
        return children.isEmpty() ? Optional.empty() : Optional.of(children);
    }

    @Override
    public Employee add(Employee e) {
        children.add(e);
        return this;
    }

    @Override
    public Employee remove(Employee e) {
        children.remove(e);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manager manager = (Manager) o;

        if (name != null ? !name.equals(manager.name) : manager.name != null) return false;
        if (department != null ? !department.equals(manager.department) : manager.department != null) return false;
        return children != null ? children.equals(manager.children) : manager.children == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (children != null ? children.hashCode() : 0);
        return result;
    }
}
