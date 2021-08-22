package core.basesyntax;

public class Bulldozer extends Machine {
    private String buldozer = "Buldozer";
    public String getBuldozer() {
        return buldozer;
    }

    @Override
    public void doWork() {
        System.out.println(getBuldozer() + " started its work");

    }

    @Override
    public void stopWork() {
        System.out.println(getBuldozer() + " stopped its work");

    }
}
