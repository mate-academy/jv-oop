package core.basesyntax;

public class Bulldozer extends Machine{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void doWork() {
        System.out.println("A bulldozer " + this.name + " started its work");
    }
    public void stopWork() {
        System.out.println("A bulldozer " + this.name + " stopped its work");
    }
}
