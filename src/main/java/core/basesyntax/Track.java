package core.basesyntax;

class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stop working");
    }

}
