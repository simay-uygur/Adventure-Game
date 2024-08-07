import java.util.Scanner;

public class ToolStore extends Location{

    Armor[] armors = new Armor[3];
    Weapon[] weapons = new Weapon[3];

    public ToolStore(){
        armors[0] = new LightArmor();
        armors[1] = new MediumArmor();
        armors[2] = new HeavyArmor();

        weapons[0] = new Revolver();
        weapons[1] = new Sword();
        weapons[2] = new Rifle();

    }

    void menu(){
        System.out.println("Welcome to the Tool Store!");
        System.out.printf("The armors are : %s%n%s%n%s%n%n", armors[0].toString(), armors[1].toString(), armors[2].toString());
        System.out.printf("The weapons are : %s%n%s%n%s%n", weapons[0].toString(), weapons[1].toString(), weapons[2].toString());

        System.out.printf("%nDo you want to buy or exit the store?%n Press B for buy E for exit. Then press enter. ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(str.equalsIgnoreCase("B")){
            buy();
        } else if(str.equalsIgnoreCase("E")){
        } else {
            //in.close();
            menu();
        }
        in.close();
    }

    void buy(){
        System.out.println("Welcome to the Tool Store!");
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter which category you want to buy from? %nPress A for armor and W for weapon. Then press enter.");
        String category = in.next();
        System.out.println("Please enter the id of the thing you want to buy: ");
        int id = in.nextInt();
        if(id >=2 && id <0) {
            System.out.println("Please enter a valid id.");
            in.close();
            return;
        }

        if(category.equalsIgnoreCase("A")){
            if(getPlayer().money >= armors[id].getMoney()){
                getPlayer().money = getPlayer().money - armors[id].getMoney();
                getPlayer().armor = armors[id];
            } else {
                System.out.println("You don't have enough money to buy this armor.");
            }

        } else if (category.equalsIgnoreCase("W")){
            if(getPlayer().money >= armors[id].getMoney()){
                getPlayer().money = getPlayer().money - armors[id].getMoney();
                getPlayer().armor = armors[id];
            } else {
                System.out.println("You don't have enough money to buy this armor.");
            }
        } else {
            System.out.println("Please enter a valid category. ");
            menu();
        }

        in.close();
    }
}

//another implementation may be with a helper class for all scanner input output operations
