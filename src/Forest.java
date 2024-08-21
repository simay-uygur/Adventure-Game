public class Forest extends BattleLoc{

    public Forest (){
        Vampire v = new Vampire();
        battleLoc(v);
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setFirewood(true);
        getPlayer().increaseOrDecreaseMoney(+40);  //kafama göre verdim
    }

}
