package core.basesyntax;

public class Bulldozer extends Machine {
    private int power;

    public Bulldozer(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void doWork() {
        System.out.println("Bulldozer start to work");
    }

    public void endWork() {
        System.out.println("Bulldozer finished work");
    }
}
