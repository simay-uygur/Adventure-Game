public abstract class Armor {

    private int id;
    private int blocking;
    private int money;

    public int getId() {
        return id;
    }

    public int getBlocking() {
        return blocking;
    }

    public int getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBlocking(int blocking) {
        this.blocking = blocking;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Armor{" +this.getClass().toString()+" " +
                "id=" + id +
                ", blocking=" + blocking +
                ", money=" + money +
                '}';
    }
}
