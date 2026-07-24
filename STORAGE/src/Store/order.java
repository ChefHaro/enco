/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;

/**
 *
 * @author CSHS-PC105
 */
public abstract class order {

    private  FOOD food;
           private DRINK drink;
           private PAYMENTMETHOD payment;
           private int quantity;
           private int drinkQuantity;
    
    
    
    public order(FOOD food, DRINK drink, PAYMENTMETHOD payment, int quantity, int drinkQuantity){
        this.food = food;
        this.drink = drink;
        this.payment = payment;
        this.quantity = quantity;
        this.drinkQuantity = drinkQuantity;
     
    }
    //getter
    public FOOD getfood(){
        return food;
    }
    
     public DRINK getdrink(){
        return drink;
    }
     
      public PAYMENTMETHOD getpayment(){
        return payment;
    }
      
       public int  getquantity(){
        return quantity;
        
    }
       
       public int getDrinkQuantity() { 
        return drinkQuantity;
    }
       
    //setter
       public void setFood(FOOD food){
               this.food = food;
       }
    
        public void setDrink(DRINK drink){
               this.drink = drink;
       }
        
         public void setPAYMENTMETHOD(PAYMENTMETHOD payment){
               this.payment = payment;
       }
         
          public void setQuantity(int quantity){
               this.quantity = quantity;
       }
          public void setDrinkQuantity(int drinkQuantity) { 
        this.drinkQuantity = drinkQuantity;
    }
    
    //Abstract
    public abstract String displayReceipt();
    
    
    
}
