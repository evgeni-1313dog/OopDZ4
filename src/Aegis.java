public class Aegis implements Shield {

    @Override
    public String toString() {

        return String.format("Aegis, protection %d", protection());
    }


    @Override
    public int protection() {

        return 32;
    }
}
