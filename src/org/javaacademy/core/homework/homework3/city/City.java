package org.javaacademy.core.homework.homework3.city;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
            House[] housesCopy = new House[houses.length];
            for (int i = 0; i < houses.length; i++) {
                House house = houses[i];
                House houseCopy = new House(house.getStreet(), house.getHouseNumber());
                housesCopy[i] = houseCopy;

            }
            return housesCopy;
    }
}
