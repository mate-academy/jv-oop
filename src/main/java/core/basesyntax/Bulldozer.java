package core.basesyntax;

public class Bulldozer extends Machine {
    private String name;

    public Bulldozer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " machine stopped its work");

    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "name='" + name + '\''
                + '}';
    }
}
