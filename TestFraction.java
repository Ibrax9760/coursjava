public class TestFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(1, 6);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        Fraction somme = f1.add(f2);
        System.out.println("f1 + f2 = " + somme);

        Fraction produit = f1.multiply(f2);
        System.out.println("f1 * f2 = " + produit);

        System.out.println("f1 en décimal = " + f1.toDouble());
    }
}
