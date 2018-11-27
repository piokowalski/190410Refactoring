package com.infoshare.refactoring._3_exercise;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.welcome();
        menu.loadMenu();
    }
}
