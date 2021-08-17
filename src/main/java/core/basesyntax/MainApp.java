package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine machine = new Machine() {
            @Override
            public void doWork() {

            }

            @Override
            public void stopWork() {

            }
        };

        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();

        excavator.stopWork();
        bulldozer.stopWork();
        truck.stopWork();
    }
}
