package core.basesyntax;

public class Bulldozer extends Machine {
    private String nameOfMachine2;

    @Override
    public void setName(String nameOfMachine2) {
        super.setName(nameOfMachine2);
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
