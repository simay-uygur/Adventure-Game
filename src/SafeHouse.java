public class SafeHouse extends Location{

    public SafeHouse() {
    }

    public void heal(){
        if(!(getPlayer().health <= 0)){
            System.out.println("The player is healed");

        }
    }
}
