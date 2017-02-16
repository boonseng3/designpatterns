package com.obs.designpattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ongbo on 2/16/2017.
 */
public abstract class GeneralEngineering {

    // template method
    public List<String> mandatoryPapers() {

        return Arrays.asList(mathPaper(), softSkillsPaper(), specialPaper());
    }

    private String mathPaper() {
        return "math";
    }

    private String softSkillsPaper() {
        return "soft skills";
    }

    // subclass define its own implementation
    public abstract String specialPaper();
}
