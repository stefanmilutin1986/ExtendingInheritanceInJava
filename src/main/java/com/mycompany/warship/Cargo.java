package com.mycompany.warship;

public class Cargo extends Ship {
    int capacity;

    public Cargo() {
    }

    public Cargo(int capacity, int health, int speed) {
        super(health, speed);
        this.capacity = capacity;
    }
    
     public Cargo(int capacity, int health, int speed, int shield) {
        super(health, speed, shield);
        this.capacity = capacity;
    }
    
//     Ova metoda podize health warship-a koji se popravlja iz cargo broda,
//     koliki je capacity cargo broda za toliko se podigne health warship-a
    public void repairShip(Ship ship){
        ship.repairDamage(capacity);
    }
}
