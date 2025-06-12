package coursjava;
public class Player {
    private final String name;
    private int hp = 100; // Points de vie

    public Player(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
    }

    public void takeDamage(int amount) {
        hp -= amount;
        System.out.println(name + " a pris " + amount + " points de dégâts.");
        System.out.println("Points de vie restants : " + hp);
    }

    public static void main(String[] args) {
        Player p = new Player("Ibrahim");
        p.greet();
        p.takeDamage(15);  // Test : le joueur prend 15 points de dégâts
    }
}
