package core.basesyntax;

public class MainApp {
  Track newTrack = new Track();
  Bulldozer newBulldozer = new Bulldozer() ;
  Excavator newExcavator = new Excavator();

  Machines[] machines = {  newTrack, newBulldozer, newExcavator };

  for (Machines machine : machines) {
    machine.doWork();
    machine.stopWork();
  }
}
