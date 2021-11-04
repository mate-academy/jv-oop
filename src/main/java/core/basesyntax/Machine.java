package core.basesyntax;

public abstract class Machine {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void doWork();
    public abstract void stopWork();
}
 class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " start work!");
    }
    @Override
    public void stopWork() {
        System.out.println(getName() + " stop work!");
    }
}
 class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " start work!");
    }
    @Override
    public void stopWork() {
        System.out.println(getName() + " stop work!");
    }
}
 class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println(getName() + " start work!");
    }
    @Override
    public void stopWork() {
        System.out.println(getName() + " stop work!");
    }
}



