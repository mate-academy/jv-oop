package core.basesyntax;

public class MainApp {
    public void message (){
        System.out.println("Hello there");
    }
public static void main(String[] args) {
    Machine[] machines = {
            new Truck(),
            new Bulldozer(),
            new Excavator()
    };
    for (Machine machine : machines) {
        machine.doWork();
        machine.stopWork();
    }
}
}
