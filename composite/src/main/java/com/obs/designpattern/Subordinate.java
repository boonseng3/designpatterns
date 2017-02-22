package com.obs.designpattern;

import java.util.List;
import java.util.Optional;

/**
 * Created by ongbo on 2/22/2017.
 */
public class Subordinate implements Employee {
    private String name;
    private String department;

    public Subordinate(String name, String department) {
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
        return Optional.empty();
    }

    @Override
    public Employee add(Employee e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Employee remove(Employee e) {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subordinate that = (Subordinate) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return department != null ? department.equals(that.department) : that.department == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}
