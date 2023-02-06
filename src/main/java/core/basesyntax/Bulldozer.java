package core.baseclasses;

class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(Bulldozer.class.getSimpleName() + " now working");
    }

    @Override
    public void stopWork() {
        System.out.println(Bulldozer.class.getSimpleName() + " now stopped");
    }
}
