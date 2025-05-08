package core.basesyntax;

class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("The bulldozer starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer has stopped working");
    }
}
