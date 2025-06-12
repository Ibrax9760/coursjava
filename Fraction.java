package coursjava;
public class Fraction {
    private final int num;
    private final int den;

    public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être 0.");
        }

        // Toujours mettre le signe sur le numérateur
        if (den < 0) {
            num = -num;
            den = -den;
        }

        int pgcd = pgcd(Math.abs(num), den);
        this.num = num / pgcd;
        this.den = den / pgcd;
    }

    private static int pgcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}