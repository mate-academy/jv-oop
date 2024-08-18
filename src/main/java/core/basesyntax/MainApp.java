package core.basesyntax;

public class MainApp {
    Machine[] transport = {new Truck(), new Bulldozer(), new Excavator()};

   for(Machine machine : transport) {
       machine.doWork();
       machine.stopWork();
    }


}
