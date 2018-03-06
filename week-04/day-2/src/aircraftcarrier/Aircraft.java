package aircraftcarrier;

public class Aircraft {

  private String type;
  private int maxAmmo;
  private int currentAmmo;
  private int baseDamage;
  
  Aircraft(String type, int maxAmmo, int baseDamage) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    currentAmmo = 0;
  }
  
  int fight() {
    int damage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return damage;
  }
  
  int refill(int ammo) {
    if (ammo <= maxAmmo - currentAmmo) {
      currentAmmo += ammo;
      ammo = 0;
    } else {
      ammo -= maxAmmo - currentAmmo;
      currentAmmo = maxAmmo;
    }
    return ammo;
  }
  
  String getType() {
    return type;
  }
  
  String getStatus() {
    return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All " +
        "Damage: " + (currentAmmo * baseDamage);
  }
  
  int getTotalDamage() {
    return currentAmmo * baseDamage;
  }
}
