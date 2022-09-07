package core.basesyntax;

public class MainApp {
	
	public static void main(String[] args) {
		Machine[] machineArray = { new Truck(), new Bulldozer(), new Excavator() };
		for (Machine m : machineArray) {
			m.doWork();
			m.stopWork();
		}
	}
}
