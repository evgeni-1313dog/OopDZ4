import java.util.Random;

public abstract class Warrior<T extends Weapon, Y extends Shield> {
    private String name;

    protected T weapon;
    protected Y shield;

    public Y getShield() {
        return shield;
    }

    public void setShield(Y shield) {
        this.shield = shield;
    }



    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Warrior(String name, T weapon, int healthPoint, Y shield) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, healthPoint %d, shield %s", name, weapon, healthPoint, shield);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

}