public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("I'm a funny truck. I'm starting to work!");
    }

    @Override
    public void stopWork() {
        System.out.println("I'm so tired. I'm going to rest!");
    }
}
