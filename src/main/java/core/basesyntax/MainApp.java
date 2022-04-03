package core.basesyntax;
abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}
class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck start work");
    }
    @Override
    public void stopWork() {
        System.out.println("Truck stop work");
    }

}
class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer start work");
    };
    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop work");
    }
}
class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator start work");

    };
    @Override
    public void stopWork() {
        System.out.println("Excavator stop work");
    }
}


public class MainApp {
    public static void main(String[] args ){
        Machine [] technics = new Machine [] {new Truck(), new Bulldozer(), new Excavator()};
       
        for (int i = 0; i<technics.length; i++) {
            technics[i].doWork();
            technics[i].stopWork();
        }
    }



}