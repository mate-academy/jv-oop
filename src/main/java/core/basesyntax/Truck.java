package core.basesyntax;

public class Truck extends Machine {
    private String nameOfMachine1;

    @Override
    public void setName(String nameOfMachine1) {
        super.setName(nameOfMachine1);
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
