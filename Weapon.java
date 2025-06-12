import java.util.Random;

public class Weapon {
    private final int minDamage;
    private final int maxDamage;
    private final Random random;

    public Weapon(int minDamage, int maxDamage) {
        if (minDamage > maxDamage) {
            throw new IllegalArgumentException("minDamage ne peut pas être plus grand que maxDamage");
        }
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.random = new Random();
    }

    public int rollDamage() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
