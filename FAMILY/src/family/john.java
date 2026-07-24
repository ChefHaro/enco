/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author CSHS-PC105
 */
public class john {
    
    String name = "john";
    String food = "raw meet";
    String life = "500";
    String height = "8ft";
    
    UI ui;
    
    public john (UI ui){
        this.ui = ui;
    }
    
    
    public void eat(String name){
         ui.jTextArea1.append("---------------------------------\n");
        ui.jTextArea1.append(name + " is eating "   + food + "\n");
    }
    
        public void life(String name){
      ui.jTextArea1.append(name + " has a Height of  "  + life+ "\n");
    }
        
         public void height(String name){
        ui.jTextArea1.append(name + " has a Height of  "  + height + "\n");
         }
        
}
