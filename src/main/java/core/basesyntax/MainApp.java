package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine[] machines = {excavator, truck, bulldozer};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
    abstract class Machine {
        public abstract void doWork();
        public abstract void stopWork();
    }
    class Excavator extends Machine{
        @Override
        public void doWork() {
    }
        @Override
        public void stopWork() {
    }
}
    class Truck extends Machine{
        @Override
        public void doWork() {
    }
        @Override
        public void stopWork() {
    }
}
    class Bulldozer extends Machine{
        @Override
        public void doWork() {
    }
        @Override
        public void stopWork() {
    }
}
