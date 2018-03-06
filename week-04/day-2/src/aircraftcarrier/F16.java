package aircraftcarrier;

public class F16 extends Aircraft{
  
  public static final String TYPE = "F16";
  public static final int BASE_DAMAGE = 30;
  public static final int MAX_AMMO = 8;
  
  F16() {
    super(TYPE, MAX_AMMO, BASE_DAMAGE);
    
  }
}
