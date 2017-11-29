package com.egen.rules;

/**
 * Created by satyajit on 11/28/17.
 */
public interface MetricsRule {

    enum RuleType {OVER_WEIGHT, UNDER_WEIGHT}

//    int baseWeight = Integer.parseInt(System.getProperty("base.value"));

    int baseWeight = 150;

    boolean when();
    void then();
}
