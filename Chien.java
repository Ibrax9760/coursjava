 public class Chien extends Animal {
    private String race;
    public Chien(String nom, int age, String race) {
        super(nom, age);  // Appel du constructeur parent
        this.race = race;
    }
    @Override
    public void faireDuBruit() {
        System.out.println("Wouf !");
    }
 }