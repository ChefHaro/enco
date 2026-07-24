/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author CSHS-PC105
 */
public class mark  extends rick{
    
    public mark(UI ui) {
        super(ui);
          super.name = "Mark";
        super.food = "pastil";
        super.height = "6ft";
        super.life = "85";
    }
    
     public void eat(String name){
         ui.jTextArea1.append("---------------------------------\n");
        ui.jTextArea1.append(name + " is eating "   + food + "\n");
    }
    
        public void life(String name){
        ui.jTextArea1.append(name + " has a lifespan of  "  + life + "\n");
    }
        
         public void height(String name){
        ui.jTextArea1.append(name + " has a Height of  "  + height + "\n");
         }
    
    public void power(String name){
         String power = "Fire";
          ui.jTextArea1.append(name + " has a power of "  + power + "\n");
    }
    
}
