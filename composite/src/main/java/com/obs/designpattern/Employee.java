package com.obs.designpattern;

import java.util.List;
import java.util.Optional;

/**
 * Created by ongbo on 2/22/2017.
 */
public interface Employee {
    String getName();

    String getDepartment();

    Optional<List<Employee>> getChildren();

    // allow chaining for add/remove
    Employee add(Employee e);

    Employee remove(Employee e);
}
