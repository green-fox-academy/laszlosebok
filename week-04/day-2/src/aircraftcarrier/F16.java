package aircraftcarrier;

class F16 extends Aircraft{
  
  private static final String TYPE = "F16";
  private static final int BASE_DAMAGE = 30;
  private static final int MAX_AMMO = 8;
  
  F16() {
    super(TYPE, MAX_AMMO, BASE_DAMAGE);
    
  }
}
