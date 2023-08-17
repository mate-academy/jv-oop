package core.basesyntax;

public class Excavator extends Machine {
    private String nameOfMachine3;

    @Override
    public void setName(String nameOfMachine3) {
        super.setName(nameOfMachine3);
    }

    @Override
    public String getNameOfMachine() {
        return super.getNameOfMachine();
    }

    @Override
    public void doWork() {
        System.out.println(getNameOfMachine() + " started work!");
    }

    @Override
    public void stopWork() {
        System.out.println(getNameOfMachine() + " finished work!");
    }
}
