package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer() {
            @Override
                public void doWork() {
                    super.doWork();
                }

            @Override
                public void stopWork() {
                    super.stopWork();
                }
        };
        Machine truck = new Truck() {
            @Override
                public void doWork() {
                    super.doWork();
                }

            @Override
                public void stopWork() {
                    super.stopWork();
                }
        };
        Machine excavator = new Excavator() {
            @Override
                public void doWork() {
                    super.doWork();
                }

            @Override
                public void stopWork() {
                    super.stopWork();
                }
        };
        Machine[] machines = {bulldozer, truck, excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
