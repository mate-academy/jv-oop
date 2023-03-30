package core.basesyntax;

public class Excavator extends Machine {
    public String messageStart() {
        return "Excavator started work";
    }
    public String messageStop(){
        return "Excavator stopped work";
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
