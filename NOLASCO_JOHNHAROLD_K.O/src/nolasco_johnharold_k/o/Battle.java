/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nolasco_johnharold_k.o;

import java.util.Scanner;

/**
 *
 * @author CSHS-PC105
 */
public class Battle {
    
    
  
      public void fight(){
         Scanner sc = new Scanner(System.in);
 
        Gordex arley =  new Gordex("arley",100,20,10,30);
 
        arley.addMove(0,new Move("Global Shock",50,95));
        arley.addMove(1,new Move("Quick Sleep",55,100));
        arley.addMove(2,new Move("Iron phone",45,85));
        arley.addMove(3,new Move("DELETE",100,100));
 
        Gordex nolan =
                new Gordex("nolan",1000,18,12,20);
 
        nolan.addMove(0,new Move("VOID",80,100));
        nolan.addMove(1,new Move("UNIVERS",50,95));
        nolan.addMove(2,new Move("BLACK HOLE",50,100));
        nolan.addMove(3,new Move("NOVA Beam",35,85));
       
 
        while(arley.isAlive() && nolan.isAlive()){
 
            arley.displayStatus();
            nolan.displayStatus();
 
            System.out.println("\nChoose Move:");
 
            for(int i=0;i<4;i++){
                System.out.println((i+1)+"." + arley.moves[i].name);
                  }
 
            int choice = sc.nextInt()-1;
 
            if(arley.speed >= nolan.speed){
 
                arley.attack(nolan,choice);
 
                if(nolan.isAlive()){
 
                    int enemyMove =
                            (int)(Math.random()*4);
 
                    nolan.attack(arley,enemyMove);
 
                }
 
            }else{
 
                int enemyMove =
                        (int)(Math.random()*4);
 
                nolan.attack(arley,enemyMove);
 
                if(arley.isAlive()){
 
                    arley.attack(nolan,choice);
 
                }
 
            }
 
            System.out.println("-------------------");
            
            
 
        }
 
        if(arley.isAlive())
            System.out.println("You Win!");
        else
            System.out.println("You Lose!");
      }
       
      
      
                
}
        
 
