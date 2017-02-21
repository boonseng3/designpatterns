package com.obs.designpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ongbo on 2/21/2017.
 */
public class SoldierFactory {

    private Map<String, Soldier> soldiers = new HashMap<>();

    public Soldier getSoldier(String type) {
        switch (type) {
            case "marine":
                soldiers.putIfAbsent(type, new Marine());
                return soldiers.get(type);
            case "ranger":
                soldiers.putIfAbsent(type, new Ranger());
                return soldiers.get(type);
            default:
                throw new RuntimeException("Unsupported type");
        }
    }

    public int getSoldiersCount() {
        return soldiers.size();
    }
}
