import javax.tools.Tool;
import java.util.Scanner;

public class Game {

    public Player player;
    public Location location;

    private SafeHouse safeHouse;
    private ToolStore toolStore;

    public void start(){
        safeHouse = new SafeHouse();
        toolStore = new ToolStore();
        player = new Player();
        player.selectChar();


    }

    public String locationAskMessages(){
        System.out.printf("Where do you want to go? %n(H)ome %n(T)oolstore %n(C)ave %n(F)orest %n(R)iver %n");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();
        scanner.close();
        return ans;
    }

    public void end(){

    }

    public void updatePlayerLocation(Location location){

    }


}
