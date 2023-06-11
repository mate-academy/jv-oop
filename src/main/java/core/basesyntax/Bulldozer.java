package core.basesyntax;

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer Start to Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer Stop Working");
    }
}
