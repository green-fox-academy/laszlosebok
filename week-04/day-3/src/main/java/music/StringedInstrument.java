package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  
  public abstract String sound();
  
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " +
        sound());
  }
}
