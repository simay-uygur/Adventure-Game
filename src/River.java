public class River extends BattleLoc{
    private Bear b;

    public River(){
        b = new Bear();
        battleLoc(b, 3);
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setWater(true);
        getPlayer().increaseOrDecreaseMoney(getEnemyNumber() * b.getMoney());
        System.out.println("\nEntered river is conquered.");
    }
}
