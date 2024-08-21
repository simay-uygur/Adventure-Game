public class Enemy {
    private int id;
    private int damage;
    private int health;
    private int money;

    public Enemy() {
        this.id = 0;
        this.damage = 0;
        this.health = 0;
        this.money = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public void increaseOrDecreaseHealth(int amount){
        this.health += amount;
    }

}
