package org.javaacademy.core.lesson7.shouse_factory_ex1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Factory russianFactory = new Factory(CountryEnum.RUSSIA);
        Factory franceFactory = new Factory(CountryEnum.FRANCE);
//        Factory krokoziaFactory = new Factory(null);

        System.out.println(russianFactory);
        System.out.println(franceFactory);
//        System.out.println(krokoziaFactory);
        System.out.println(Arrays.toString(CountryEnum.values()));
        System.out.println(CountryEnum.RUSSIA.getCountPeople());
        System.out.println(CountryEnum.FRANCE.getCountPeople());
    }
}
