package com.infoshare.refactoring._1_smells._6_duplications.example;

import java.util.Arrays;

public class DuplicationExample {

    public static void main(String[] args) {
        BillValidator billValidator = new BillValidator();

        Bill firstBill = Bill.unpaidBill(300);
        Bill secondBill = Bill.paidBill(500);
        Bill thirdBill = Bill.unpaidBill(150);

        User user = new User(500, Arrays.asList(firstBill, secondBill, thirdBill));

        System.out.println(String.format("User needs to pay %s coins.", user.countBillsValue()));
        System.out.println(String.format("Can user pay his bills? %s", billValidator.hasEnoughMoneyToPayBills(user)));
    }
}
