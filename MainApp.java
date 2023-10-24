package org.example;
import java.util.Arrays;
public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}