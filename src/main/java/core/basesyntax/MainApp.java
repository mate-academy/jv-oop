package core.basesyntax;

public class MainApp {
    Machine [] machines = new Machine[2];

    for (int i = 0; i < 2; i++) {
        machines[i].doWork();
    }

    for (int i = 0; i < 2; i++) {
        machines[i].stopWork();
    }
}
