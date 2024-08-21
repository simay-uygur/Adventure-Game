public class Cave extends BattleLoc{
    private Zombie z;

    public Cave() {
        this.z = new Zombie();  // is it logical
        battleLoc(z, 3);
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setFood(true);
        getPlayer().increaseOrDecreaseMoney(getEnemyNumber() * z.getMoney());
        System.out.println("\nEntered cave is conquered.");
    }
}
