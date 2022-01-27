package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello, I'm Excavator " + this + ". I've started work.");

//        System.out.println("                                                     .-.\n"
//                + "                                                    /   \\\n"
//                + "                                     _____.....-----|(o) |\n"
//                + "                               _..--'          _..--|  .''\n"
//                + "                             .'  o      _..--''     |  | |\n"
//                + "                            /  _/_..--''            |  | |\n"
//                + "                   ________/  / /                   |  | |\n"
//                + "                  | _  ____\\ / /                    |  | |\n"
//                + " _.-----._________|| ||    \\\\ /                     |  | |\n"
//                + "|=================||=||_____\\\\                      |__|-'\n"
//                + "|    MATE-STUDENT ||_||_____//                      (o\\ |\n"
//                + "|_________________|_________/                        |-\\|\n"
//                + " `-------------._______.----'                $       /  `.\n"
//                + "    .,.,.,.,.,.,.,.,.,.,.,.,.,              $$$     /     \\\n"
//                + "   ((O) o o o o ======= o o(O))              $  ._.'      /\n"
//                + "    `-.,.,.,.,.,.,.,.,.,.,.,-'                   `.......'");


    }

    @Override
    public void stopWork() {
        System.out.println("Goodbye. I've just finished. Your " + this + ".");
    }
}
