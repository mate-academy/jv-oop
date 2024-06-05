package core.basesyntax;

import com.sun.tools.javac.Main;

public class MainApp {

    Excavator excavator = new Excavator();
    Truck truck = new Truck();
    Bulldozer bulldozer = new Bulldozer();
    Machine[] machines = {excavator, truck, bulldozer};

    public void main() {
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}

