package main.java.music;

public class BassGuitar extends StringedInstrument {
  
  private String sound;
  
  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;
    sound = "Duum-duum-duum";
  }
  
  public BassGuitar(int numberOfStrings) {
    name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
    this.sound = "Duum-duum-duum";
  }
  
  @Override
  public String sound() {
    return sound;
  }
  
  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " +
        sound());
  }
}
