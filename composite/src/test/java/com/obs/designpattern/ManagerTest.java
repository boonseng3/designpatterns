package com.obs.designpattern;

import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


/**
 * Created by ongbo on 2/22/2017.
 */
public class ManagerTest {
    @Test
    public void testPattern() throws Exception {
        Employee ceo = new Manager("Mark", "Board of director");


        Employee hrManager = new Manager("Jane", "HR");
        Employee hrEmployee1 = new Subordinate("June", "HR");
        Employee hrEmployee2 = new Subordinate("Janet", "HR");

        Employee itManager = new Manager("Evan", "IT");
        Employee itEmployee1 = new Subordinate("Peter", "IT");
        Employee itEmployee2 = new Subordinate("John", "IT");
        Employee itEmployee3 = new Subordinate("Jack", "IT");

        ceo.add(hrManager).add(itManager);
        hrManager.add(hrEmployee1).add(hrEmployee2);
        itManager.add(itEmployee1).add(itEmployee2).add(itEmployee3);
        assertThat(ceo).hasFieldOrPropertyWithValue("name", "Mark").hasFieldOrPropertyWithValue("department", "Board of director")
                .extracting(employee -> employee).flatExtracting(o -> ((Employee) o).getChildren().get()).containsExactly(hrManager, itManager);
        assertThat(hrManager).hasFieldOrPropertyWithValue("name", "Jane").hasFieldOrPropertyWithValue("department", "HR")
                .extracting(employee -> employee).flatExtracting(o -> ((Employee) o).getChildren().get()).containsExactly(hrEmployee1, hrEmployee2);
        assertThat(itManager).hasFieldOrPropertyWithValue("name", "Evan").hasFieldOrPropertyWithValue("department", "IT")
                .extracting(employee -> employee).flatExtracting(o -> ((Employee) o).getChildren().get()).containsExactly(itEmployee1, itEmployee2, itEmployee3);
        assertThat(hrEmployee1).hasFieldOrPropertyWithValue("children", Optional.empty());
        assertThat(hrEmployee2).hasFieldOrPropertyWithValue("children", Optional.empty());

        assertThat(itEmployee1).hasFieldOrPropertyWithValue("children", Optional.empty());
        assertThat(itEmployee2).hasFieldOrPropertyWithValue("children", Optional.empty());
        assertThat(itEmployee3).hasFieldOrPropertyWithValue("children", Optional.empty());
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() -> {
            hrEmployee1.add(null);
        })
                .withNoCause();
    }
}