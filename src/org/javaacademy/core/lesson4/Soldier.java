package org.javaacademy.core.lesson4;

/**
 *     Класс Солдатик
 */
public class Soldier {
    String name;
    int hp;
    String title = "Рядовой";
    String[] artefacts;

    public Soldier() {
        this.name = "Безымянный солдатик";
        this.hp = 100;
    }
    //Конструктор
    public Soldier(String newName, int newHp) {
        this.name = newName;
        setHp(newHp);
    }
    //Перегрузка - overloading
    public Soldier(String newName, int newHp, String newTitle) {
        this.name = newName;
        setHp(newHp);
        this.title = newTitle;
    }
    //Метод = функция
    public void go() {
        System.out.println("Солдатик " + this.name + " идёт вперёд");
    }

    public void fight(Soldier anotherSoldier) {
        if (this.hp > anotherSoldier.hp) {
            System.out.println("Победил " + this.name);
        } else {
            System.out.println("Победил " + anotherSoldier.name);
        }
    }
    public void takeArtefacts(String... artefacts) {
        this.artefacts = artefacts;
    }

    public String[] getArtefacts() {
        return artefacts;
    }

    public void setHp(int newHp) {
        if (newHp >= 0 && newHp <= 100) {
            this.hp = newHp;
        } else {
            System.out.println("Ошибка, не можем присвоить отрицательное здоровье!Или Ошибка," +
                    "здоровье > 100!");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return this.title + " " + this.name;
    }

    public int getHp() {
        return hp;
    }

    public String getTitle() {
        return title;
    }

    public void onFire() {
        while (true) {
            if (this.hp == 0) {
                return;
            }
            this.setHp(this.hp - 1);
            System.out.println("Горю!");
            System.out.println("*Здоровье солдатика: " + this.hp);
        }
    }
}