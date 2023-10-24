package core.baseclasses; 

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(Excavator.class.getSimpleName() + " now working");
    }

    @Override
    public void stopWork() {
        System.out.println(Excavator.class.getSimpleName() + " now stopped");
    }
}
