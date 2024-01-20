import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class ToolStore extends NormalLoc {
    public void weapons(Weapons weapons) {

    }

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    public void menu() {
        System.out.println("Here its the menu");
        Weapons[] weapList = {new Gun(), new Sword(), new Rifle()};
        Armors[] armorList = {new LightArmor(), new MediumArmor(), new HeavyArmor()};
        System.out.println("=============================");
        for (Weapons weapons : weapList) {
            System.out.println("Weapons's name:" + weapons.getWeaponName() + "\n" + "ID:" + weapons.getID() + "\n" + "Damage:" + weapons.getDamage() + "\n" + "Value:" + weapons.getMoney());
        }
        System.out.println("ARMOR");
        for (Armors armors : armorList) {
            System.out.println("Armor's name:" + armors.getName() + "\n" + "ID:" + armors.getID() + "\n" + "Armor's Block:" + armors.getBlock() + "\n" + "Value:" + armors.getMoney());
        }
    }

    @Override
    public boolean onLocation() {
        Weapons[] weapList = {new Gun(), new Sword(), new Rifle()};
        Armors[] armorList = {new LightArmor(), new MediumArmor(), new HeavyArmor()};
        System.out.println("What do you want to buy? \n"
                + "1: Weapons \n" + "2: Armors \n" + "Press 0 for quit");
        int input1 = input.nextInt();
        int balance = 0;
        switch (input1) {
            case 1:
                for (Weapons weapons : weapList) {
                    System.out.println("Weapons's name:" + weapons.getWeaponName() + "\n" + "ID:" + weapons.getID() + "\n" + "Damage:" + weapons.getDamage() + "\n" + "Value:" + weapons.getMoney());
                    System.out.println("Press 0 for quit");
                }
                int input2 = input.nextInt();
                switch (input2) {
                    case 0:
                        return  true;

                    case 1:
                        if (getPlayer().getMoney() >= weapList[0].getMoney()) {
                            System.out.println("You took gun");
                            getPlayer().weaponChoose(new Gun());
                        } else System.out.println("You dont have enough money");
                        break;
                    case 2:
                        if (getPlayer().getMoney() >= weapList[1].getMoney()) {
                            System.out.println("You took sword");
                            getPlayer().weaponChoose(new Sword());
                        } else System.out.println("You dont have enough money");
                        break;
                    case 3:
                        if (getPlayer().getMoney() >= weapList[2].getMoney()) {
                            getPlayer().weaponChoose(new Rifle());
                        } else System.out.println("You dont have enough money");
                        break;

                }
                System.out.println("Your money amount" + getPlayer().getMoney());
                break;
            case 2:
                for (Armors armors : armorList) {
                    System.out.println("Armor's name:" + armors.getName() + "\n" + "ID:" + armors.getID() + "\n" + "Armor's Block:" + armors.getBlock() + "\n" + "Value:" + armors.getMoney());
                    System.out.println("Press 0 for quit");
                }
                int input3 = input.nextInt();
                switch (input3) {
                    case 0:
                        return true;
                    case 1:
                        if (getPlayer().getMoney() >= 15) {
                            getPlayer().armorChoose(new LightArmor());

                        } else System.out.println("You dont have enough money");
                        break;
                    case 2:
                        if (getPlayer().getMoney() >= 25) {
                            getPlayer().armorChoose(new MediumArmor());
                        } else System.out.println("You dont have enough money");
                        break;
                    case 3:
                        if (getPlayer().getMoney() >= 40) {
                            getPlayer().armorChoose(new HeavyArmor());
                        } else System.out.println("You dont have enough money");
                        break;
                }

                break;
            case 0:
                System.out.println("We are waiting for you again");
                return true;
        }
        return true;
    }
}