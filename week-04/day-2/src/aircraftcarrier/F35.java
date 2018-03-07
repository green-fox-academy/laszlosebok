package aircraftcarrier;

class F35 extends Aircraft {
  
  private static final String TYPE = "F35";
  private static final int BASE_DAMAGE = 50;
  private static final int MAX_AMMO = 12;
  
  F35() {
    super(TYPE, MAX_AMMO, BASE_DAMAGE);
    
  }
}
