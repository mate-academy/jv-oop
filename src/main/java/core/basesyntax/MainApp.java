package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine bulldozer = new Bulldozer();

        Machine truck = new Truck();

        Machine excavator = new Excavator();

        Machine[] arr = {bulldozer, truck, excavator};

        for (Machine type:arr) {
            type.doWork();
            type.stopWork();
        }
    }

}
