package com.infoshare.refactoring._1_smells._6_duplications.example;

import java.util.List;

public class User {

    private final Integer account;
    private final List<Bill> bills;

    public User(Integer account, List<Bill> bills) {
        this.account = account;
        this.bills = bills;
    }

    public Integer getAccount() {
        return account;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public Integer countBillsValue() {
        return bills.stream()
                .mapToInt(Bill::getValue)
                .sum();
    }
}
