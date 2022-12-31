package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine volvoT = new Truck();
        Machine volvoB = new Bulldozer();
        Machine volvoE = new Excavator();
        Machine[] technics = {volvoT, volvoB, volvoE};

        for (Machine tech : technics
        ) {
            tech.doWork();
            tech.stopWork();
        }
    }
}
