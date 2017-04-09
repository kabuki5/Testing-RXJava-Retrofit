package com.kabuki5.testingrxjava.models;

/**
 * Created by Kabuki on 09/04/2017.
 * Optimus Mobile Engineering
 */

public class ModelExample {
    private int id;
    private String name;
    private String icon;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return "ModelExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
