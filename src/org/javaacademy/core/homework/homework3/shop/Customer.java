package org.javaacademy.core.homework.homework3.shop;
/**
 * Покупатель
 */
public class Customer {
    private final static int COUNT_RULES_FOR_SUCCESS_CHECK = 2;
       private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
              //ПОМЕНЯТЬ ЗДЕСЬ ВЫРАЖЕНИЕ
        int countSuccessRules = 0;// Успешно пройденные условия
        countSuccessRules += shop.isClearFloor() ? 1 : 0;
        countSuccessRules += shop.isWorkersHasBadge() ? 1 : 0;
        countSuccessRules += shop.getCountWorkers() > 2 ? 1 : 0;

            if (countSuccessRules >= COUNT_RULES_FOR_SUCCESS_CHECK) {
                     System.out.println(name + ": Магазин прошел проверку!");
            } else {
                     System.out.println(name + ": Магазин не прошел проверку!");
            }
        }
    }
