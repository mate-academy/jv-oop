package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello, I'm Truck " + this + ". I've started work.");
//        System.out.println("                       _____________________________________________________\n"
//                + "                      |                                                     |\n"
//                + "             _______  |                                                     |\n"
//                + "            / _____ | |                       CHEESE 500                    |\n"
//                + "           / /(__) || |               for every MATE-ACADEMY STUDENT        |\n"
//                + "  ________/ / |OO| || |                                                     |\n"
//                + " |         |-------|| |                                                     |\n"
//                + "(|         |     -.|| |_______________________                              |\n"
//                + " |  ____   \\       ||_________||____________  |             ____      ____  |\n"
//                + "/| / __ \\   |______||     / __ \\   / __ \\   | |            / __ \\    / __ \\ |\\\n"
//                + "\\|| /  \\ |_______________| /  \\ |_| /  \\ |__| |___________| /  \\ |__| /  \\|_|/\n"
//                + "   | () |                 | () |   | () |                  | () |    | () |\n"
//                + "    \\__/                   \\__/     \\__/                    \\__/      \\__/");
    }

    @Override
    public void stopWork() {
        System.out.println("Goodbye. I've just finished. Your " + this + ".");
    }
}
