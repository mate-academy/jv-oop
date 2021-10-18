package main.java.core.basesyntax;

import java.util.ArrayList;
import java.util.List;

abstract class Machine {

    private static List<Machine> allMachines = new ArrayList<>();

    Machine() {
        allMachines.add(this);
    }

    public abstract void doWork();

    public abstract void stopWork();

    static void startAllMachines() {
        System.out.println("Uahahahaha start all machines");
        allMachines.forEach(machine -> machine.doWork());
    }

    static void stopAllMachines() {
        System.out.println("Ohhh no, all machines will be stop");
        allMachines.forEach(machine -> machine.stopWork());
    }
}

