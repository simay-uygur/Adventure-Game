import java.util.Scanner;

public class Player {

    Inventory inventory;
    int damage;
    int health;
    int money;
    String name;
    int id;
    int currentHealth;
    Armor armor;
    Weapon weapon;

    public Player() {
        armor = null;
        weapon = null;
        Inventory inventory = null; //for now
    }

    public void selectChar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("WHAT CHAR DO YOU WANT TO BE : (S)amurai, (A)rcher, (K)night. (press key and enter)");
        String input = scan.next();
        boolean hasSelectedValid = true;

        do{
            switch (input) {
                case "S":
                    setAllFeatures(1,"Samurai", 5,21, 15 );
                    break;
                case "A":
                    setAllFeatures(2,"Archer", 7,18,20 );
                    break;
                case "K":
                    setAllFeatures(3,"Knight", 8,24,5 );
                    break;
                default:
                    System.out.println("Please enter a valid char.");
                    System.out.println("WHAT CHAR DO YOU WANT TO BE : (S)amurai, (A)rcher, (K)night. (press key and enter)");
                    input = scan.next();
                    hasSelectedValid = false;
                    break;
            }
        } while (!hasSelectedValid);


    }

    private void setAllFeatures(int id, String name, int damage, int health, int money){
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.currentHealth = health;
    }
}
