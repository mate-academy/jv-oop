package core.basesyntax;

public class Track extends Machine {
    @Override
    public String goWork() {
        return "Track started work";
    }
    @Override
    public String stopWork() {
        return "Track stopped work";
    }
}
