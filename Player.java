public class Player {
    private final String name;
    private int hp;
    private final Weapon weapon;

    public Player(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.hp = 100;
     }

    public void attack(Player other) {
        int damage = weapon.rollDamage();
        System.out.println(name + " attaque " + other.name + " et inflige " + damage + " dégâts.");
        other.takeDamage(damage);
     }

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) {
            hp = 0;
        }
     }

    public boolean isAlive() {
        return hp > 0;
      }

    public int getHp() {
        return hp;
      }

    public String getName() {
        return name;
      }
}
