package org.javaacademy.core.homework.homework4.ex1;

import java.math.BigDecimal;

public enum CarWashingTariff {
    SMALL(BigDecimal.valueOf(2000)),
    BIG(BigDecimal.valueOf(4000));

    private BigDecimal prise;

    CarWashingTariff(BigDecimal prise) {
        this.prise = prise;
    }

    public BigDecimal getPrise() {
        return prise;
    }
}
