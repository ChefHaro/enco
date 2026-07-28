/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nolasco_johnharold_k.o;

import java.util.Random;

/**
 *
 * @author CSHS-PC105
 */
public class Gordex {
     String name;
    int hp;
    int maxHp;
    int attack;
    int defense;
    int speed;
 
    Move[] moves = new Move[4];
 
    Random rand = new Random();
 
  public Gordex(String name, int hp, int attack, int defense, int speed) {
 
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }
 
    public void addMove(int slot, Move move) {
        moves[slot] = move;
    }
 
    public boolean isAlive() {
        return hp > 0;
    }

     public void delay(int milliseconds) {
    try {
        Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
 
  }
 
    public void attack(Gordex enemy, int moveIndex){
 
        Move move = moves[moveIndex];
        delay(1000);
        System.out.println(name + " used " + move.name);
        delay(1000);
        int hit = rand.nextInt(100) + 1;
 
 
        if(hit > move.accuracy){
            System.out.println("But it missed!");
            return;
        }
        delay(1000);
        double critical = 1;
 
 
        if(rand.nextInt(100) < 10){
            critical = 1.5;
            System.out.println("Critical Hit!");
        }
        delay(1000);
        int damage = (int)(((attack + move.power) - enemy.defense)
                * critical);
 
 
         damage += rand.nextInt(6);
 
        if(damage < 1)
            damage = 1;
 
        enemy.hp -= damage;
          
        if(enemy.hp < 0)
            enemy.hp = 0;

          System.out.println(enemy.name + " lost " + damage + " HP");
    
    }
    public void displayStatus(){
System.out.println(name + " HP: "
+ hp + "/" + maxHp); 
    }
        
    
}
