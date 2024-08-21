public class Cave extends BattleLoc{

    public Cave() {
        Zombie z = new Zombie();  // is it logical
        battleLoc(z);
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setFood(true);
        getPlayer().increaseOrDecreaseMoney(+20);
        System.out.println("\nEntered cave is conquered.");
    }
}
