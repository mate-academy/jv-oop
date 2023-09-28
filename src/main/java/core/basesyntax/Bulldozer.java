package core.basesyntax;

public class Bulldozer extends Machine {
    private boolean hasCaterpillar;

    Bulldozer(String model, String fuel, double engineCapacity, boolean hasCaterpillar) {
        super(model, fuel, engineCapacity);
        this.hasCaterpillar = hasCaterpillar;
    }

    public boolean isHasCaterpillar() {
        return hasCaterpillar;
    }

    public void setCaterpillar(boolean hasCaterpillar) {
        hasCaterpillar = hasCaterpillar;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer is started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is stopped its work");
    }
}
