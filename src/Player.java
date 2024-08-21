import java.util.Scanner;

public class Player {

    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;
    private int id;
    private int currentHealth;
    private final InputHandler inputHandler;

    public Player(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        System.out.println("WHAT CHAR DO YOU WANT TO BE : (S)amurai, (A)rcher, (K)night. (press key and enter)");
        String input =  inputHandler.getInput();
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
                    input = inputHandler.getInput();
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

    public boolean isPlayerDead(){
        return currentHealth <= 0;
    }

    public int calculateDamage(){
        if(inventory.getWeaponDamage() == 0) return damage;
        return this.damage + this.inventory.getWeaponDamage();
    }

    private int calculateDefense(){
        if(inventory.getArmorDefence() == 0) return 0;
        return this.inventory.getArmorDefence();
    }

    public void damagePlayer(int damage){
        int def = calculateDefense();
        damage -= def;
        this.currentHealth -= damage;
    }

    public void increaseOrDecreaseMoney(int amount){
        this.money += amount;
    }

    public void heal(){
        this.currentHealth = this.health;
    }

    public int getMoney() {
        return money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getDamage() {
        return damage;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }


}
