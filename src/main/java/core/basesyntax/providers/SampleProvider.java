package core.basesyntax.providers;

public class SampleProvider {
    public static String getDoWorkSample(String name) {
        return name + " started doing its work";
    }

    public static String getStopWorkSample(String name) {
        return name + " stopped doing its work";
    }
}
