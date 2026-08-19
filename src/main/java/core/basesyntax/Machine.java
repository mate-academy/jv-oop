package core.basesyntax;

public abstract class Machine {
    private String name;

    public Machine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public String messageDo() {
        return name + " started its work";
    }

    public String messageStop() {
        return name + " stopped working";
    }

    public abstract void doWork();

    public abstract void stopWork();
}
