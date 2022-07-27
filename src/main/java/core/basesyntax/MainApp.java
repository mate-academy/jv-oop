package core.basesyntax;

public class MainApp {
  public static void main(String[] args) {
    Machine[] arrayMachine = new Machine[] {new Excavator(), new Bulldozer(), new Excavator()};
    for (Machine counterMachine : arrayMachine) {
      counterMachine.doWork();
      counterMachine.stopWork();
    }
  }
}
