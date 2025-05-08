package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Don`t you bother me, I`m busy now. =)");
    }

    @Override
    public void stopWork() {
        System.out.println("Let us stop.");
    }
}
