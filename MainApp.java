package org.example;
public class MainApp {
  public static void main(String[] args) {
      Machine [] machines = { new Truck(), new Bulldozer(), new Excavator()};
        for(int i = 0; i < machines.length; i++){
            Machine machine = machines[i];
            machine.doWork();
            machine.stopWork();
        }
    }
}
