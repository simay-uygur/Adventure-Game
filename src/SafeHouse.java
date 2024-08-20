public class SafeHouse extends Location{

    public SafeHouse() {
    }

    public void heal(){
        if(!getPlayer().isPlayerDead()){
            System.out.println("The player is healed");
            getPlayer().heal(); //not sure  do the tests.
        } else {
            System.out.println("The player is dead");
        }
    }
}
