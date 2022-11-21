package core.basesyntax;

public class Bulldozer extends Machine {

    private String bulldozerName;

    public Bulldozer(String bulldozerName) {
        this.bulldozerName = bulldozerName;
    }


    @Override
    public void doWork() {
        System.out.println(bulldozerName + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(bulldozerName + " has stopped working");
    }
}
