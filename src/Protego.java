public class Protego implements Shield{
    @Override
    public int protection() {
        return 25;
    }
    @Override
    public String toString() {
        return String.format("Protego, max protection %d", protection());
    }
}
