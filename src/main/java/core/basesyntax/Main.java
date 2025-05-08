package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machin[] machins = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machin machin : machins) {
            machin.doWork();
            machin.stopWork();
        }
    }
}
