package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Hello, I'm Bulldozer " + this + ". I've started work.");
        System.out.println("         ______________\n"
                + "        /.----------..-'\n"
                + "     -. ||           \\\\\n"
                + " .----'-||-.          \\\\\n"
                + " |o _   || |           \\\\\n"
                + " | [_]  || |_...-----.._\\\\\n"
                + " | [_]  ||.'            `-._ _\n"
                + " | [_]  '.O)_...-----....._ `.\\\n"
                + " / [_]o .' _ _'''''''''_ _ `. `.     __\n"
                + "|______/.'  _  `.---.'  _  `.\\  `._./  \\\n"
                + "|'''''/, .' _ '. . , .' _ '. .`. .o'|   \\\n"
                + "`---..|; : (_) : ;-; : (_) : ;-'`--.|    \\\n"
                + "       ' '. _ .' ' ' '. _ .' '      /     \\\n"
                + " MATE   `._ _ _,'   `._ _ _,' ACADEMY`._____\\");
    }

    @Override
    public void stopWork() {
        System.out.println("Goodbye. I've just finished. Your " + this + ".");
    }
}
