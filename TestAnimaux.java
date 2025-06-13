public class TestAnimaux {
    public static void main(String[] args) {
        Animal a = new Animal("Bête", 3);
        Chien c = new Chien("Rex", 5);
        Chat ch = new Chat("Mimi", 2);

        a.faireDuBruit();   // L'animal fait un bruit.
        c.faireDuBruit();   // Rex aboie !
        ch.faireDuBruit();  // Mimi miaule !
    }
}
