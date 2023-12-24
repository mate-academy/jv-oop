package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        String[] machines = {
                "Truck",
                "Bulldozer",
                "Excavator"
        };

        for (String typeOfMachine : machines) {
            Machine machine = createInstance(typeOfMachine);
            machine.doWork();
            machine.stopWork();
        }
    }

    public static Machine createInstance(String typeOfMachine) {
        switch (typeOfMachine) {
            case "Truck":
                return new Truck();
            case "Bulldozer":
                return new Bulldozer();
            case "Excavator":
                return new Excavator();
            default:
                return null;
        }
    }
}

