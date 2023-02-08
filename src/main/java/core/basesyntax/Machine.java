package core.basesyntax;

public abstract class Machine {
 private String wils;
 public String getWils() {
  return wils;
 }

 public void setWils(String wils) {
  this.wils = wils;
 }

 public abstract void doWork();
 public abstract void stopWork();
}
