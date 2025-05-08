public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator has started working - it's digging a hole.");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator has stopped working - it's finished digging.");
    }
}
