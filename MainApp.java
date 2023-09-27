package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] array = new Machine []{new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < array.length;i++){
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
