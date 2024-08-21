public class BattleLoc extends Location{

    private Enemy[] enemy = new Enemy[3];
    private int enemyNumber;
    private Game game;

    public void battleLoc(Enemy e )
    {
        String typeEnemy = (e.getClass().toString());
        int randomAmount = (int) (Math.random() * 3) + 1;
        if(randomAmount <= 0 || randomAmount >3) randomAmount = 1;
        enemyNumber = randomAmount;

        switch (typeEnemy){
            case "class Zombie":
                for(int i =0; i < enemyNumber; i++){
                    enemy[i] = new Zombie();
                }
                System.out.println(enemyNumber+" Zombie/s are created");
            break;
            case "class Vampire":
                for(int i =0; i < enemyNumber; i++){
                    enemy[i] = new Vampire();
                }
                System.out.println(enemyNumber+ " Vampire/s are created");
            break;
            case "class Bear":
                for(int i =0; i < enemyNumber; i++){
                    enemy[i] = new Bear();
                }
                System.out.println(enemyNumber+" Bear/s are created");
            break;
            default:
            break;
        }
    }
//onlocation method (does id have to be implemented again?)   i wont use it
    public void combat(){
        int playerDamage = getPlayer().getDamage();
        int enemyDamage = enemy[0].getDamage();
        System.out.println("Battle starts... ");
        while (!getPlayer().isPlayerDead() && !isAllEnemiesDead()){
            System.out.println("Player attacks " + playerDamage );
            attackEnemy(-playerDamage);
            for(int s=0; s<enemyNumber; s++){
                System.out.println("Enemy attacks " + enemyDamage);
                getPlayer().damagePlayer(enemyDamage);
                if(getPlayer().isPlayerDead()){
                    System.out.println("Player dead");  //game over
                    game.over();
                    return;
                }
            }
        }

        if(isAllEnemiesDead()){
            System.out.println("All enemies dead. You got the gift.");
            gift();
        } else if(getPlayer().isPlayerDead()){
            game.over();
        }
    }

    private boolean isAllEnemiesDead(){
        if (enemyNumber == 0) return true;
        for(int a =0; a < enemyNumber; a++){
            if(!enemy[a].isDead()) return false;
        }
        return true;
    }

    private void attackEnemy(int amount){
        int index = 0; //may be out of bounds
        for(int i=0; i < enemyNumber; i++){
            index = i;
            if(!enemy[i].isDead()) break;
        }
        System.out.println("enemy with index" + index +" got damage");
        enemy[index].increaseOrDecreaseHealth(amount);
    }

    public void gift(){
        System.out.println("Nothing happens here.");
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
