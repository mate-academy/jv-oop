package core.basesyntax;

public class Excavator extends Machine{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Excavator(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stopped its work");
    }
}
