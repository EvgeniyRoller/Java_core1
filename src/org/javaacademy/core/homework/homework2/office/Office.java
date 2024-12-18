package org.javaacademy.core.homework.homework2.office;

public class Office {
    private Boss boss;
    private Manager manager;
    private Secretary secretary;
    private Guard guard;

    public Office(Boss boss, Manager manager, Secretary secretary, Guard guard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guard = guard;
    }

    public void workDay() {
        boss.shoutOnManager(manager);
        manager.shout();
        guard.givePayment();
        secretary.toAsk(manager, boss, guard);
    }
}
