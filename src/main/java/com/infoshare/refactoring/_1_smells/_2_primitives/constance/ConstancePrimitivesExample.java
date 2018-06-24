package com.infoshare.refactoring._1_smells._2_primitives.constance;

public class ConstancePrimitivesExample {

    public static final int ALERT_SITUATION = 1;
    public static final int DANGER_SITUATION = 2;
    public static final int STABLE_SITUATION = 3;

    public static void main(String[] args) {
        printStatus(ALERT_SITUATION);
        // TODO: pokazać jak łatwo zepsuć program
        // TODO: pokazać że można przekazać inne wartości niż te spodziewane przez aplikację
        // TODO: zamienić na enumy
    }

    private static void printStatus(int status) {
        switch (status) {
            case ALERT_SITUATION:
                System.out.println("ALERT!");
                break;
            case DANGER_SITUATION:
                System.out.println("ALERT!");
                break;
            case STABLE_SITUATION:
                System.out.println("ALERT!");
                break;
        }
    }
}
