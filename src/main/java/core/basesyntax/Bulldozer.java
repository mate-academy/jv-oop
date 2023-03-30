package core.basesyntax;

public class Bulldozer extends Machine {
    public String messageStart() {
        return "Bulldozer started work";
    }

    public String messageStop(){
        return "Bulldozer stopped work";
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
