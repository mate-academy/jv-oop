package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public  void doWork(){
        System.out.println(getBrand()+" "+getModel()+" - started digging a ditch!");
    }
    @Override
    public  void stopWork(){
        System.out.println(getBrand()+" "+getModel()+" - stopped work!");
    }
}
