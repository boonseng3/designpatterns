package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/17/2017.
 */
public class TestAdapter {

    @Test
    public void testAdapter() {
        Rectangle rectangle = new Rectangle(10,5);
        Triangle triangle = new Triangle(10,5);

        Calculator calculator = new Calculator();
        assertThat(calculator.getArea(rectangle)).isEqualTo(50d);
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        assertThat(calculatorAdapter.getArea(triangle)).isEqualTo(25d);
    }
}
