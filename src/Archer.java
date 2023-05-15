import java.util.Random;

public class Archer extends Warrior<Bow, Aegis>{
    public Archer(String name, Bow bow, int healthPoint, Aegis aegis) {
        super(name, bow, healthPoint, aegis);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}