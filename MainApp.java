package org.example;

public class MainApp {



    public static void main(String[] args) {

        Machine [] machine = { new Truck(), new Bulldozer(), new Excavator()};

        for(int i = 0; i < machine.length; i++){
            Machine machine1 = machine[i];
            machine1.doWork();
            machine1.stopWork();
        }

    }
}