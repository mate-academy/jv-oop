//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.basesyntax;

public class MainApp {
    public MainApp() {
    }

    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

        for(Machine machine : machines) {
            machine.doWork();
        }

        for(Machine machine : machines) {
            machine.stopWork();
        }

    }
}
