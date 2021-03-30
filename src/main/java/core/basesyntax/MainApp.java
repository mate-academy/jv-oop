package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine bulldozer = new Bulldozer();
          bulldozer.doWork();

        Machine track = new Track();
          track.doWork();

        Machine excavator = new Excavator();
          excavator.doWork();

          bulldozer.stopWork();

          track.stopWork();

          excavator.stopWork();


    }

}
