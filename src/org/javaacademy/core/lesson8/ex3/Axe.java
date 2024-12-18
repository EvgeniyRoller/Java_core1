package org.javaacademy.core.lesson8.ex3;

/**
 * Топор
 */
public class Axe {
    private boolean isBroken = false;

    /**
     * Ломаем топор
     */
    public void broke() {
        this.isBroken = true;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
