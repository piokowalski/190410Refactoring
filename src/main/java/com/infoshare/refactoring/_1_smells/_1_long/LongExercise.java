package com.infoshare.refactoring._1_smells._1_long;

import java.time.LocalDateTime;

public class LongExercise {

    public static void main(String... args) {
        printBanner();
        printCurrentDateTime();
        blankSpaces();
        printMenu();
        blankSpaces();
        printCurrentDateTime();
    }

    private static void printCurrentDateTime() {
        System.out.println("Current date is " + LocalDateTime.now());
    }

    private static void blankSpaces() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void printMenu() {
        System.out.println("1. Check available courses");
        System.out.println("2. Enroll to course");
        System.out.println("3. Check my course status");
        System.out.println("4. Exit");
    }

    private static void printBanner() {
        System.out.println("IIIIIIIIII                   ffffffffffffffff                                hhhhhhh");
        System.out.println("I::::::::I                  f::::::::::::::::f                               h:::::h");
        System.out.println("I::::::::I                 f::::::::::::::::::f                              h:::::h");
        System.out.println("II::::::II                 f::::::fffffff:::::f                              h:::::h");
        System.out.println("I::::Innnn  nnnnnnnn     f:::::f       ffffffooooooooooo       ssssssssss   h::::h hhhhh         aaaaaaaaaaaaa  rrrrr   rrrrrrrrr       eeeeeeeeeeee");
        System.out.println("I::::In:::nn::::::::nn   f:::::f           oo:::::::::::oo   ss::::::::::s  h::::hh:::::hhh      a::::::::::::a r::::rrr:::::::::r    ee::::::::::::ee");
        System.out.println("I::::In::::::::::::::nn f:::::::ffffff    o:::::::::::::::oss:::::::::::::s h::::::::::::::hh    aaaaaaaaa:::::ar:::::::::::::::::r  e::::::eeeee:::::ee");
        System.out.println("I::::Inn:::::::::::::::nf::::::::::::f    o:::::ooooo:::::os::::::ssss:::::sh:::::::hhh::::::h            a::::arr::::::rrrrr::::::re::::::e     e:::::e");
        System.out.println("I::::I  n:::::nnnn:::::nf::::::::::::f    o::::o     o::::o s:::::s  ssssss h::::::h   h::::::h    aaaaaaa:::::a r:::::r     r:::::re:::::::eeeee::::::e");
        System.out.println("I::::I  n::::n    n::::nf:::::::ffffff    o::::o     o::::o   s::::::s      h:::::h     h:::::h  aa::::::::::::a r:::::r     rrrrrrre:::::::::::::::::e");
        System.out.println("I::::I  n::::n    n::::n f:::::f          o::::o     o::::o      s::::::s   h:::::h     h:::::h a::::aaaa::::::a r:::::r            e::::::eeeeeeeeeee");
        System.out.println("I::::I  n::::n    n::::n f:::::f          o::::o     o::::ossssss   s:::::s h:::::h     h:::::ha::::a    a:::::a r:::::r            e:::::::e");
        System.out.println("II::::::IIn::::n    n::::nf:::::::f         o:::::ooooo:::::os:::::ssss::::::sh:::::h     h:::::ha::::a    a:::::a r:::::r            e::::::::e");
        System.out.println("I::::::::In::::n    n::::nf:::::::f         o:::::::::::::::os::::::::::::::s h:::::h     h:::::ha:::::aaaa::::::a r:::::r             e::::::::eeeeeeee");
        System.out.println("I::::::::In::::n    n::::nf:::::::f          oo:::::::::::oo  s:::::::::::ss  h:::::h     h:::::h a::::::::::aa:::ar:::::r              ee:::::::::::::e");
        System.out.println("IIIIIIIIIInnnnnn    nnnnnnfffffffff            ooooooooooo     sssssssssss    hhhhhhh     hhhhhhh  aaaaaaaaaa  aaaarrrrrrr                eeeeeeeeeeeeee");
    }
}
