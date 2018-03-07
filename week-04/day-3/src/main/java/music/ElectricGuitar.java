package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  
  private String sound;
  
  public ElectricGuitar(){
    name = "Electric Guitar";
    numberOfStrings = 6;
    sound = "Twang";
  }
  
  public ElectricGuitar(int numberOfStrings) {
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
    this.sound = "Twang";
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
