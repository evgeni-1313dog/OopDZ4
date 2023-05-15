public class Assasin extends Warrior<Knife, Protego>{

    public Assasin(String name, Knife knife, int healthPoint, Protego protego) {
        super(name, knife, healthPoint, protego);
    }

    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
}