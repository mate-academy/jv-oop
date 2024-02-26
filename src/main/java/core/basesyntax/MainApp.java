package core.basesyntax;

public class MainApp {
    public static void main(String [] args){
        Machine [] machin = {
                new Truck("Truck"),
                new Bulldozer("Bulldozer"),
                new Excavator("Excavator")
        };
        for (Machine machines:machin) {
            machines.doWork();
            machines.stopWork();
        }
    }
}
