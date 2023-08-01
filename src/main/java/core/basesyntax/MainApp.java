package core.basesyntax;

public class MainApp {
    Machine[] machine = {new Bulldozer(), new Excavator(), new Truck()};

        {
        for (Machine i : machine)
        {
            i.doWork();
            i.stopWork();
        }
    }
}
