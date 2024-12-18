package org.javaacademy.core.lesson7.shouse_factory_ex1;

public class Country {
    private String name;
    public static final Country RUSSIA = new Country("Russia");
    public static final Country FRANCE = new Country("France");

    private Country(String name) {
        this.name = name;
    }

}
