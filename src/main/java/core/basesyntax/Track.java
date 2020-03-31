package core.basesyntax;

public class Track extends Machine {

    String name;
    int year;
    String colour;

    public Track(String name, int year, String colour) {
        super(name, year);
    }

    @Override
    public void doWork() {
        System.out.println("Track started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stopped its work");
    }
}
