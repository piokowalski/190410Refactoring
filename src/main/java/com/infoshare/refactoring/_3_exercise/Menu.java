package com.infoshare.refactoring._3_exercise;

import com.infoshare.refactoring._3_exercise.data.Data;
import com.infoshare.refactoring._3_exercise.data.NewTransactionCreator;
import com.infoshare.refactoring._3_exercise.data.Transaction;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Menu {

    private ConsoleReader consoleReader = new ConsoleReader();
    private Data data = new Data();
    private NewTransactionCreator newTransactionCreator = new NewTransactionCreator(data, consoleReader);
    private Path pathToUserFile = Paths.get("test.txt");

    public void welcome() {
        System.out.println("Witaj! Tu wycenisz swoje mieszkanie w kilku szybkich krokach." + "\n" + "\n" +
                "Wpisz odpowiedni numer by poruszać się po menu" + "\n");
    }

    public void loadMenu() throws FileNotFoundException {
        System.out.println("\n" + "          M E N U" + "\n");
        System.out.println("1 - Wprowadź nowe mieszkanie" + "\n" +
                "2 - Wypisz dostepne miasta" + "\n" +
                "3 - Wpisz mieszkanie do bazy" + "\n" +
                "4 - Wpisz mieszkania" + "\n" +
                "5 - Wyjście" + "\n" + "podaj numer...");
        int menuChoise = consoleReader.readInt(1, 4);
        switch (menuChoise) {
            case 1: {
                System.out.println("Będziesz poproszony o podanie kilku podstawowych informacji odnośnie twojego mieszkania" + "\n");
                newTransactionCreator.loadNewTransaction();
                loadMenu();
                break;
            }
            case 2: {
                data.cityList(data.getTransactionsBase()).forEach(System.out::println);
                loadMenu();
                break;
            }
            case 3: {
                if (newTransactionCreator.getNewTransaction().getCity() == null) {
                    System.out.println("Najpierw utworz transakcje");
                } else {
                    data.addTransactionToData(newTransactionCreator.getNewTransaction());
                }


                loadMenu();
                break;
            }
            case 4: {
                for (Transaction path : data.getTransactionsBase()) {
                    System.out.println(path);
                }

                break;
            }
            case 5: {
                exit();
                break;
            }
        }
    }


    public void exit() {
        System.out.println("Zapraszamy ponownie");
    }

    public ConsoleReader getConsoleReader() {
        return consoleReader;
    }

    public Path getPathToUserFile() {
        return pathToUserFile;
    }
}
