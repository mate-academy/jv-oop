package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        String[] machines = {
                "Truck",
                "Bulldozer",
                "Excavator"
        };

        for (String typeOfMachine : machines) {
            switch (typeOfMachine) {
                case "Truck" : Truck truck = new Truck();
                              truck.doWork();
                              truck.stopWork();
                              break;
                case "Bulldozer" : Bulldozer bulldozer = new Bulldozer();
                              bulldozer.doWork();
                              bulldozer.stopWork();
                              break;
                case "Excavator" : Excavator excavator = new Excavator();
                              excavator.doWork();
                              excavator.stopWork();
                              break;
                default : break;
            }
        }
    }
}
