import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior>{
    List<T> team = new ArrayList<>();
    public Team<T> add(T warriorT){
        team.add(warriorT);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for(T itemT: team){
            warriors.append(itemT);
            warriors.append("\n");
        }
        warriors.append(String.format("heathPoint %s, damage %s, max range %s, max shield %s, shield %s",
                healthPoints(), getDamage(), maxRange(), getShield(), maxShield()));
        return warriors.toString();
    }

    public int healthPoints(){
        int sum = 0;
        for(T itemT: team){
            sum += itemT.getHealthPoint();
        }
        return sum;
    }
    public int getDamage(){
        int sum = 0;
        for(T itemT: team){
            sum += itemT.getWeapon().damage();
        }
        return sum;
    }
    public int getShield(){
        int sum = 0;
        for(T itemT: team){
            sum += itemT.getShield().protection();
        }
        return sum;
    }

    public int maxRange(){
        int max = 0;
        for(T itemT: team){
            if(itemT instanceof Archer){
                if(max < ((Archer)itemT).range()){
                    max = ((Archer)itemT).range();
                }
            }
        }
        return max;
    }
    public int maxShield(){
        int max = 0;
        for(T itemT: team){
            if(itemT instanceof Shield){
                if(max < ((Shield)itemT).protection()){
                    max = ((Shield)itemT).protection();
                }
            }
        }
        return max;
    }

}
