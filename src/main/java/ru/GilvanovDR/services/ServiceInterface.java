/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.services;

public interface ServiceInterface {
    void setValue(String nameOfValue, double value);

    double getValue(String nameOfValue);

    String getJson(String ip);
}
