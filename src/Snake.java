import java.util.Random;

public class Snake extends Enemy{

    public Snake() {
        this.setId(4);
        int damageAmount = 3 + (int)(Math.random()* 4); //from 3 to 6
        this.setDamage(damageAmount);
        this.setHealth(12);
        this.setMoney(0);
    }

}
