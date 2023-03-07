package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        //Polymorphism
        Machine truck = new Truck("Mercedes");

        Machine bulldozer = new Bulldozer("BMW");

        Machine excavator = new Excavator("Volvo");

        Machine[] machines = {truck,bulldozer,excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork(); 
        }
    }
}
