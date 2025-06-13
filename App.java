public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenue Ibrahim !");
        
        // Exemple : créer une fraction
        Fraction f = new Fraction(6, 9);
        System.out.println("Fraction simplifiée : " + f);

        // Exemple : créer un joueur avec une arme
        Weapon epee = new Weapon(4, 8);
        Player p = new Player("Ibrahim", epee);

        System.out.println(p.getName() + " est prêt pour le combat !");
     }
}
