package core.basesyntax;

public class MainApp {
     Machine machines[] = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};
     for(Machine mashine : machines){
         mashine.doWork();
         mashine.stopWork();
    }
}
