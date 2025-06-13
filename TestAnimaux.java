public class TestAnimaux {
    public static void main(String[] args) {
        Animal[] animaux = new Animal[3];
        animaux[0] = new Animal("Bête", 3);
        animaux[1] = new Chien("Rex", 5);
        animaux[2] = new Chat("Mimi", 2);

        for (Animal a : animaux) {
            a.faireDuBruit();
        }
    }
}
