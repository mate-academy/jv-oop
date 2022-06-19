package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.setNameMachine("Excavator");
        Machine bulldozer = new Bulldozer();
        bulldozer.setNameMachine("Bulldozer");
        Machine truck = new Truck();
        truck.setNameMachine("Truck");
        String[] machine = new String[] {"Truck", "Bulldozer", "Excavator"};
        for (String machineNow : machine) {
            if (machineNow.equals(truck.getNemeMachine())) {
                truck.doWork();
                truck.stopWork();
            } else if (machineNow.equals(bulldozer.getNemeMachine())) {
                bulldozer.doWork();
                bulldozer.stopWork();
            } else if (machineNow.equals(excavator.getNemeMachine())) {
                excavator.doWork();
                excavator.stopWork();
            }
        }
    }
}
