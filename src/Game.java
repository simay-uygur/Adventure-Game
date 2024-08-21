import javax.swing.*;
import javax.tools.Tool;
import java.util.Scanner;

public class Game {

    static InputHandler inputHandler = new InputHandler();
    public Player player;

    private SafeHouse safeHouse;
    private ToolStore toolStore;
    private BattleLoc battleLoc;

    public void start(){
        safeHouse = new SafeHouse();
        toolStore = new ToolStore(inputHandler);
        player = new Player(inputHandler);
        player.selectChar();

        while(!player.isPlayerDead()){
            String choice = locationAskMessages().toUpperCase();

            switch (choice){
                case "T":
                    updatePlayerLocation(toolStore);
                break;
                case "H":
                    updatePlayerLocation(safeHouse);
                break;
                case "C":
                    battleLoc = new Cave();
                    updatePlayerLocation(battleLoc);
                break;
                case "F":
                    battleLoc = new Forest();
                    updatePlayerLocation(battleLoc);
                break;
                case "R":
                    battleLoc = new River();
                    updatePlayerLocation(battleLoc);
                break;
                default:
                break;
            }
        }

    }

    public String locationAskMessages(){
        System.out.printf("Where do you want to go? %n(H)ome %n(T)oolstore %n(C)ave %n(F)orest %n(R)iver %n");
        String ans = inputHandler.getInput();
        return ans;
    }

    public void over(){
        System.out.println("The player is dead, and game is over.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again? (Y/N)");
        String ans = inputHandler.getInput();
        scanner.close();
        if(ans.equals("Y")){
            System.out.println("Starting game again... ");
            start();
        } else {
            System.out.println("Game is over.");
        }
    }

    //location is more generic
    public void updatePlayerLocation(Location location){

        if(location instanceof BattleLoc){ //may cause error
            battleLoc.setGame(this);
            battleLoc.setPlayer(player);
            battleLoc.combat();
            battleLoc.setPlayer(null);
        } else if(location instanceof NormalLoc){
            safeHouse.setPlayer(player);
            safeHouse.heal();
            safeHouse.setPlayer(null);
        } else if (location instanceof ToolStore){
            toolStore.setPlayer(player);
            toolStore.menu();
            toolStore.setPlayer(null);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

}
