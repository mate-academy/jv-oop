package core.basesyntax;

public class Track extends Machine {
    public void doWork() {
        System.out.println("Track " + name + " start working");
    }

    public void stopWork() {
        System.out.println("Track " + name + " stop working");
    }

    Track(String s) {
        this.name = s;
    }
}
