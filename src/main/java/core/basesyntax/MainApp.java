package core.basesyntax;

public class MainApp {

    public void testing(){
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for ( Machine mash : machines ) {
            mash.doWork();
            mash.stopWork();
        }
    }
}
