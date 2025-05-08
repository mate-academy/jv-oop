package core.basesyntax;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args){

        Machine[] machines = {new Excavator(), new Truck(), new Bulldozer()};
              for(Machine machine: machines){
                  machine.doWork();
                  machine.stopWork();
              }
    }
}
