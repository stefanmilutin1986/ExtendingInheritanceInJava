package com.mycompany.warship;

public class MainClass {

    public static void main(String[] args) {
       
        BattleShip smallShip = new BattleShip(300, 800, 50);
        BattleShip bigShip = new BattleShip(500, 900, 100);
        BattleShip commandShip = new BattleShip(150, 1000, 1000, 20);
        Cargo smallCargo = new Cargo(1000, 100, 100);
        Cargo bigCargo = new Cargo(5000, 200, 500, 10);

//        SmallShip napada BigShip sve dok BigShip-u ne ostane 150 health-a. Zatim small cargo puni health BigShip-a 
//        pri cemu je capacitet cargo broda jednak health-u koji dobije BigShip. Racunao sam da je capacity od cargo broda
//        koliko on moze da nadomesti health-a drugom brodu. isto je i za druga dva primera samo sto su razliciti brodovi i cifre
                
        smallShip.attackLimitAttacksNumbers(bigShip, 150);
        System.out.println(bigShip.getHealth());
        smallCargo.repairShip(bigShip);
        System.out.println(bigShip.getHealth());            

        smallShip.attackCommandShipLimitAttacksNumbers(commandShip, 900);
        System.out.println(commandShip.getHealth());
        bigCargo.repairShip(commandShip);
        System.out.println(commandShip.getHealth());

        smallShip.attackLimitAttacksNumbers(bigCargo, 50);
        System.out.println(bigCargo.getHealth());
        smallCargo.repairShip(bigCargo);
        System.out.println(bigCargo.getHealth());

//        Ide se do potpunog unistenja u 4 metode dole
        
        smallShip.attack(bigShip);
        smallShip.attackCommandShip(commandShip);
        smallShip.attack(smallCargo);
        smallShip.attack(bigCargo);
        
    }
    
}
