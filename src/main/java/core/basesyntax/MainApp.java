package core.basesyntax;

public class MainApp {
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        return ((result1 == bet1 && result2 == bet2) ? 2 : ((result1 > result2 && bet1 > bet2) ? 1 : ((result1 < result2 && bet1 < bet2) ? 1 : ((result1 == result2 && bet1 == bet2) ? 1 : 0))));
    }
}
