package core.vaseclasses; 

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(Bulldozer.class.getSimpleName() + " now working");
    }

    @Override
    public void stopWork() {
        System.out.println(Bulldozer.class.getSimpleName() + " now stopped");
    }
}

class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(Excavator.class.getSimpleName() + " now working");
    }

    @Override
    public void stopWork() {
        System.out.println(Excavator.class.getSimpleName() + " now stopped");
    }
}
