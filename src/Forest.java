public class Forest extends BattleLoc{
    Vampire v;

    public Forest (){
        this.v = new Vampire();
        battleLoc(v, 3);
    }

    @Override
    public void gift(){
        getPlayer().getInventory().setFirewood(true);
        getPlayer().increaseOrDecreaseMoney(getEnemyNumber() * v.getMoney());
        System.out.println("\nEntered forest is conquered.");
    }

}
