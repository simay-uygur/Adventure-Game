public class River extends BattleLoc{

    public River(){
        Bear b = new Bear();
        battleLoc(b);
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setWater(true);
        getPlayer().increaseOrDecreaseMoney(+10);
    }
}
