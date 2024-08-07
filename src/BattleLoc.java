import java.util.Random;

public class BattleLoc extends Location{

    public Enemy[] enemy;

    public void battleLoc(Enemy e )
    {
        String typeEnemy = (e.getClass().toString());
        int randomAmount = (int) (Math.random() * 3) + 1;

        switch (typeEnemy){
            case "Zombie":
                enemy = new Zombie[randomAmount];
                System.out.println("Zombie/s are created");
                break;
            case "Vampire":
                enemy = new Vampire[randomAmount];
                System.out.println("Vampire/s are created");
                break;
            case "Bear":
                enemy = new Bear[randomAmount];
                System.out.println("Bear/s are created");
                break;
            default:
                break;
        }
    }
//onlocation method (does id have to be implemented again?)
    public void combat(){

    }
}
