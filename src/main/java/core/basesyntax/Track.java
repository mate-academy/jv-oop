package core.basesyntax;

class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track started to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Track finished work.");
    }
}
