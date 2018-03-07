package main.java.music;

public class Violin extends StringedInstrument{
  
  private String sound;
  
  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
    sound = "Screech";
  }
  
  public Violin(int numberOfStrings) {
    name = "Violin";
    this.numberOfStrings = numberOfStrings;
    this.sound = "Screech";
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
