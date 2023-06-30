package core.basesyntax;

public class Truck extends Machine{
    public Truck(String machineName) {
        super(machineName);
    }

    @Override
    public void doWork(){
        System.out.println("Machine " + this.machineName + " started its work");;
    }

    @Override
    public void stopWork(){
        System.out.println("Machine " + this.machineName + " stopped its work");;
    }
}
