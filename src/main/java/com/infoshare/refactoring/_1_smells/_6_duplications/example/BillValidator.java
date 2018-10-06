package com.infoshare.refactoring._1_smells._6_duplications.example;

import java.util.List;

public class BillValidator {

    public boolean hasEnoughMoneyToPayBills(User user) {
        Integer account = user.getAccount();
        List<Bill> bills = user.getBills();

        return account > countAllBillsValue(bills);
    }

    private Integer countAllBillsValue(List<Bill> bills) {
        int sum = 0;

        for (Bill bill : bills) {
            sum += bill.getValue();
        }

        return sum;
    }

}
