package com.mycompany.warship;

public class BattleShip extends Ship {
    
    private int damage;

    public BattleShip() {
    }

    public BattleShip(int health, int speed, int damage) {
        super(health, speed);
        this.damage=damage;
    }

    public BattleShip(int damage, int health, int speed, int shield) {
        super(health, speed, shield);
        this.damage = damage;
    }
    
    public void attackLimitAttacksNumbers(Ship ship, int limit){
        ship.getDamageLimitAttacksNumbers(damage, limit);
    }
    
    public void attackCommandShipLimitAttacksNumbers(Ship ship, int limit){
        ship.getDamageCommandShipLimitAttacksNumbers(damage, limit);
    } 

    public void attack(Ship ship){
        ship.getDamage(damage);
    }
    
    public void attackCommandShip(Ship ship){
        ship.getDamageCommandShip(damage);
    }    
    
    
}
