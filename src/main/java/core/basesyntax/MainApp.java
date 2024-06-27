package core.basesyntax;

public class MainApp {
    public MainApp(String[] machine) {

        Machine truck = new Truck() {
            @Override

            public void doWork() {
                super.doWork();
            }
        };
        truck.doWork();
        truck.stopWork();
        Machine excavator = new Excavator() {
            @Override

            public void doWork() {
                super.doWork();
            }
        };
        excavator.doWork();
        excavator.stopWork();
        Machine bulldozer = new Bulldozer() {
            @Override
            public void doWork() {
                super.doWork();
            }
        };
        bulldozer.doWork();
        bulldozer.stopWork();

    }
}
