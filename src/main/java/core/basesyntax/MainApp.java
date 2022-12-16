package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineTechniks = {new Truck(),new Bulldozer(),new Excavator()};
        for (Machine item : machineTechniks) {
            item.doWork();
            item.stopWork();
        }
    }
}
