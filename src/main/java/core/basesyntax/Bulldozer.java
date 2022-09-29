package core.basesyntax;

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped to work");
    }
}
