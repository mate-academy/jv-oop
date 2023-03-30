package core.basesyntax;

public class Truck extends Machine{
    public String messageStart(){
        return "Truck started work";
    }

    public String messageStop(){
        return "Truck stopped work";
    }

    @Override
    public void doWork() {
        System.out.println(messageStart());
    }

    @Override
    public void stopWork() {
        System.out.println(messageStop());
    }
}

