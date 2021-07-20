package com.mycompany.warship;

public class Ship {
    
    private int health;
    private int speed;
    private int shield;
    private int limit;
    
    public Ship(){
    }

    public Ship(int health, int speed){
        this.health = health;
        this.speed = speed;
    }

    public Ship(int health, int speed, int shield){
        this.health = health;
        this.speed = speed;
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public void repairDamage(int capacity){
        this.health=health+capacity;
    }
//    Damage Limit Attacks metode rade operaciju da kad brod napada ne napada drugi brod do unistenja nego da napadnutom brodu ostane neki health, da ostane ziv
    public void getDamageLimitAttacksNumbers(int damage, int limit){
        while(this.getHealth()>limit){
        this.health=health-damage;
        }
        if(this.getHealth()<0){
            System.out.println("Ship is destroyed");
        }            
    }
    
    public void getDamageCommandShipLimitAttacksNumbers(int damage, int limit){
        while(this.getHealth()>limit){
        this.health=health-damage+shield;
        }
        if(this.getHealth()<0){
            System.out.println("Ship is destroyed");
        }
    }
//    Damage metode za razliku od limit attacks idu do konacnog unistenja
    public void getDamage(int damage){
        while(this.getHealth()>=0){
        this.health=health-damage;
        }
            System.out.println("Ship is destroyed");  
    }
    
    public void getDamageCommandShip(int damage){
        while(this.getHealth()>=0){
        this.health=health-damage;
        }
            System.out.println("Ship is destroyed");  
    }

}