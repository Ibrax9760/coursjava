public class Player {
    private final String name;
    private int hp = 100;
    private Weapon weapon;

    public Player(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
    }

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
        System.out.println(name + " a maintenant " + hp + " points de vie.");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Player other) {
        int damage = weapon.rollDamage();
        System.out.println(name + " attaque " + other.name + " avec " + damage + " dégâts !");
        other.takeDamage(damage);
    }

    public static void main(String[] args) {
        
        Weapon sword = new Weapon(5, 10);
        Player ibrahim = new Player("Ibrahim", sword);
        Player ennemi = new Player("Ennemi", new Weapon(3, 6));

        ibrahim.greet();
        ennemi.greet();

        ibrahim.attack(ennemi);
        System.out.println("Ennemi est-il vivant ? " + ennemi.isAlive());
    }
}
