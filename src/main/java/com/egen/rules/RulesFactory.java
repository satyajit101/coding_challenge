package com.egen.rules;

import com.egen.model.Metric;
import com.egen.rules.MetricsRule.RuleType;

/**
 * Created by Satyajit on 11/27/17.
 */
public class RulesFactory {

    public static MetricsRule getRule (RuleType type, Metric metric) {

        if (type == RuleType.OVER_WEIGHT)
            return new OverweightRule(metric);
        else if (type == RuleType.UNDER_WEIGHT)
            return new UnderweightRule(metric);

        return null;
    }
}
