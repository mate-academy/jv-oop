package core.basesyntax;

public class Excavator extends Machine{
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void doWork() {
        System.out.println("An excavator " + this.name + " started its work");
    }
    public void stopWork() {
        System.out.println("An excavator " + this.name + " stopped its work");
    }
}
