package org.javaacademy.core.lesson4;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Soldier soldierPeter = new Soldier("Peter", 110);
        Soldier soldierIvan = new Soldier("Ivan", 90);

        System.out.println("Имя солдата: " + soldierPeter.getName());
        System.out.println("Колличество здоровья: " + soldierPeter.getHp());
        System.out.println("Имя солдата: " + soldierIvan.getName());
        System.out.println("Колличество здоровья: " + soldierIvan.getHp());
//        soldierPeter.go();
//        soldierIvan.go();
        System.out.println("________________________________________");
//        soldierPeter.fight(soldierIvan);
         soldierPeter.onFire();

        Soldier soldierMichail = new Soldier("Michail", 100, "Генерал");
        System.out.println("Звание: " + soldierMichail.title + " " + soldierMichail.name);
//        soldierPeter.setHp(10);
//        soldierIvan.setHp(0);
//        System.out.println(soldierPeter.hp);
//        System.out.println(soldierIvan.hp);
        Soldier soldierYriy = new Soldier("Yriy", 100);
        System.out.println("Звание: " + soldierYriy.title + " " + soldierYriy.name);
        System.out.println("________________________________________");

        Soldier soldier1 = new Soldier();
        System.out.println("Значение для солдатика по умолчанию: " + soldier1.name);
        System.out.println("________________________________________");

        String artefact1 = "Меч";
        String artefact2 = "Пистолет";
        soldier1.takeArtefacts(artefact1, artefact2);
        System.out.println(Arrays.toString(soldier1.getArtefacts()));
    }
}
