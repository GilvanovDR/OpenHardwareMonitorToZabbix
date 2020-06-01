/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.repository;

import java.util.HashMap;
import java.util.Map;

public class embeddedRepo implements RepoInterface {
    private Map<String, Double> values = new HashMap<>();

    public double getValue(String nemeOfValue) {
        return values.getOrDefault(nemeOfValue, -1d);
    }

    public void setValue(String nameOfValue, double value) {
        values.put(nameOfValue, value);
    }
}
