package core.basesyntax;

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stoped work");
    }
}
