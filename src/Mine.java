public class Mine extends BattleLoc{

    public Mine() {
        Snake s = new Snake();
        battleLoc(s ,5);
    }

    @Override
    public void gift(){
        System.out.println("\nEntered mine is conquered.");
        int randomPercent = (int)(Math.random()*100);
        int randomInside = (int)(Math.random()*100);

        if(randomPercent < 15){
            Weapon weapon;
            if(randomInside < 21){
                //rifle
                weapon = new Rifle();
            } else if (randomInside < 51){
                weapon = new Sword();
            } else {
                weapon = new Revolver();
            }
            getPlayer().getInventory().setWeaponName(weapon.toString());
            getPlayer().getInventory().setWeaponDamage(weapon.getDamage());

        } else if(randomPercent < 31){
            Armor armor;
            if(randomInside < 21){
                armor = new HeavyArmor();
            } else if (randomInside < 51){
                armor = new MediumArmor();
            } else {
                armor = new LightArmor();
            }
            getPlayer().getInventory().setArmorName(armor.toString());
            getPlayer().getInventory().setArmorDefence(armor.getBlocking());
        } else if (randomPercent < 56){
            int money;
            if(randomInside < 21){
                money = 10;
            } else if (randomInside < 51){
                money = 5;
            } else {
                money = 1;
            }
            getPlayer().increaseOrDecreaseMoney(+money);
            System.out.println("You won " + money + " amount of money. ");
        } else {
            System.out.println("\nYou won nothing. :( ");
        }
    }
}



