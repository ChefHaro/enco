/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import javax.swing.JTextArea;

/**
 *
 * @author CSHS-PC105
 */
public class sub {
     private Burger burger;
    private Drink drink;
    private Size size;
    private Payment payment;
    
    public sub(Burger Burger,Drink Drink,Size Size,Payment Payment){
        this.burger = Burger;
        this.drink = Drink;
        this.size = Size;
        this.payment = Payment;
        
   }

    
     public void  DisplayResult(JTextArea container){
     container.setText(container.getText()+ ("=======MENU============="+"\n"
                                             +"Food: " + burger + "\n"
                                               + "Drink: " + drink + "\n"
                                                + "Size: " + size + "\n"
                                                 +"Payment: " + payment + "\n"));
     
     }
         
         

    
    
}
