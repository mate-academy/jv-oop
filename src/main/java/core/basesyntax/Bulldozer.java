package core.basesyntax;

public class Bulldozer extends Machine {
    String name;
    int year;
    String colour;

    public Bulldozer(String name,int year,String colour) {
        super(name,year);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work");

    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped its work");

    }
}



