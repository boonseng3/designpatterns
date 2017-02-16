package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/16/2017.
 */
public class TestTemplate {
    @Test
    public void printPapers() {
        ElectronicEngineering electronic = new ElectronicEngineering();
        assertThat(electronic.mandatoryPapers()).containsExactly("math", "soft skills", "electronic");
        ComputerScienceEngineering compScience = new ComputerScienceEngineering();
        assertThat(compScience.mandatoryPapers()).containsExactly("math", "soft skills", "computer science");
    }

    @Test
    public void printPapersWithLambdas() {
        GeneralEngineeringWithLambda electronic = new GeneralEngineeringWithLambda();
        assertThat(electronic.mandatoryPapers(() -> "electronic")).containsExactly("math", "soft skills", "electronic");
        GeneralEngineeringWithLambda compScience = new GeneralEngineeringWithLambda();
        assertThat(compScience.mandatoryPapers(() -> "computer science")).containsExactly("math", "soft skills", "computer science");
    }
}
