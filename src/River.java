public class River extends BattleLoc{

    public River(){
        Bear b = new Bear();
        battleLoc(b); //may be done with strings
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setWater(true);
        getPlayer().increaseOrDecreaseMoney(+10);
    }
}
