package org.javaacademy.core.lesson8.ex3;

/**
 * Лесорубка
 */
public class Firm {
    private Worker worker;

    public Firm(Worker worker) {
        this.worker = worker;
    }

    /**
     * Делаем прибыль за счёт рубки деревьев
     */
    public void makeProfit() {
//        try {
//            worker.chop();
//        } catch (AxeIsBrokenException e) {
//            System.out.println("Топор сломан, выдадим новый топор");
//        } catch (WorkerIsDrunkException e) {
//            System.out.println("Лесоруб пьян!Ждём когда протрезвеет");
//        }
        try {
            worker.chop();
        } catch (AxeIsBrokenException | WorkerIsDrunkException e) {
            System.out.println("Проблемы у сотрудника!Толи топор сломан, толи он пьян");
        }
        System.out.println("Заделали много денег!");
    }
}
