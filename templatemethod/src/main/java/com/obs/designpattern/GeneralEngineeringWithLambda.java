package com.obs.designpattern;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by ongbo on 2/16/2017.
 * Alternative to the abstract method can use lambda to present each sub class implementation
 */
public class GeneralEngineeringWithLambda {

    // template method
    public List<String> mandatoryPapers(Supplier<String> specialPapers) {

        return Arrays.asList(mathPaper(), softSkillsPaper(), specialPapers.get());
    }

    private String mathPaper() {
        return "math";
    }

    private String softSkillsPaper() {
        return "soft skills";
    }
}
