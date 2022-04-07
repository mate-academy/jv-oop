package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] technics = new Machine [] {new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < technics.length; i++) {
            technics[i].doWork();
            technics[i].stopWork();
        }
    }
}
