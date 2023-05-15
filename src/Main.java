public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), 30, new Aegis()))
                .add(new Archer("Bob", new Bow(), 25, new Aegis()));

        Team<Assasin> assasinTeam = new Team<>();
        assasinTeam.add(new Assasin("Ecio",new Knife(), 20, new Protego()))
                .add(new Assasin("Maria", new Knife(), 35, new Protego()));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);

        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), 374, new Aegis()),
                new Assasin("Jonny", new Knife(), 34, new Protego()));
        Warrior winner = placeOfBattle.fight();

        System.out.println(winner);
    }

}