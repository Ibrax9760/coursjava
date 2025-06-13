public class Chat extends Animal {

    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " miaule !");
    }
}
