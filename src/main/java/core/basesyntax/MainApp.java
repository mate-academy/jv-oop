package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        //Polymorphism
        Machine truck = new Truck("mercedes");
        Machine bulldozer = new Bulldozer("dozer");
        Machine excavator = new Excavator("cat");
        Machine[] machines = new Machine[] {truck,bulldozer,excavator};
        
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
