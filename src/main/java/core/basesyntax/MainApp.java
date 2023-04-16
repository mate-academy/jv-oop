package core.basesyntax;

public class MainApp {
    public void makeMachins() {
        Machin[] machins = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machin machin : machins) {
            machin.doWork();
            machin.stopWork();
        }
    }
}
