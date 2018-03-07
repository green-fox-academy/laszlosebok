package reservations;

import printable.Printable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservations, Printable {
  private final String[] DOW_ARRAY = {
      "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"
  };
  private final char[] CODE_CHARS = {
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
      'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
  };
  private final int ID_LENGTH = 8;
  
  private String dow;
  private String reservationId;
  
  private Reservation(){
    this.dow = getDowBooking();
    this.reservationId = getCodeBooking();
  }
  
  @Override
  public String getDowBooking() {
    Random randomDay = new Random();
    return DOW_ARRAY[randomDay.nextInt(7)];
  }
  
  @Override
  public String getCodeBooking() {
    Random randomChar = new Random();
    String id = "";
    
    for (int charIndex = 0; charIndex < ID_LENGTH; charIndex++) {
      id += CODE_CHARS[randomChar.nextInt(36)];
    }
    return id;
  }
  
  @Override
  public void printAllFields() {
    System.out.print("Booking# ");
    System.out.print(this.reservationId);
    System.out.print(" for ");
    System.out.print(this.dow);
    System.out.print("\n");
  }
  
  public static void main(String[] args) {
    List<Reservation> reservationList = generateResList(10);
    
    for (Reservation currRes : reservationList) {
      currRes.printAllFields();
    }
  }
  
  private static List<Reservation> generateResList(int resAmount) {
    List<Reservation> reservationList = new ArrayList<>();
  
    for (int i = 0; i < resAmount; i++) {
      reservationList.add(new Reservation());
    }
    
    return reservationList;
  }
}
