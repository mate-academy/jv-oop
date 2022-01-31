package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public  void doWork(){
        System.out.println(getBrand()+" "+getModel()+" - work started!");
    }

    @Override
    public  void stopWork(){
        System.out.println(getBrand()+" "+getModel()+" - finished work!");
    }
}
