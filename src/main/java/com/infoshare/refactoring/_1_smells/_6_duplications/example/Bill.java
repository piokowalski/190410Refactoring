package com.infoshare.refactoring._1_smells._6_duplications.example;

public class Bill {

    private final Integer value;
    private final boolean isPaid;

    private Bill(Integer value, boolean isPaid) {
        this.value = value;
        this.isPaid = isPaid;
    }

    public static Bill paidBill(Integer value) {
        return new Bill(value, true);
    }

    public static Bill unpaidBill(Integer value) {
        return new Bill(value, false);
    }

    public Integer getValue() {
        return value;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
