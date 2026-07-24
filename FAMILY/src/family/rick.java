/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author CSHS-PC105
 */
public class rick extends john {
    
    public rick(UI ui) {
        super(ui);
        super.name = "Rick";
        super.food = "sisig";
        super.height = "5'7ft";
        super.life = "80";
       
        
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
         String power = "no power";
          ui.jTextArea1.append(name + " has "  + power + "\n");
    }
    
    
    
}
