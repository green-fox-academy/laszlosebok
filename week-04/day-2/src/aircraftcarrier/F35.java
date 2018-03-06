package aircraftcarrier;

public class F35 extends Aircraft {
  
  public static final String TYPE = "F35";
  public static final int BASE_DAMAGE = 50;
  public static final int MAX_AMMO = 12;
  
  F35() {
    super(TYPE, MAX_AMMO, BASE_DAMAGE);
    
  }
}
