/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;

/**
 *
 * @author CSHS-PC105
 */
public class SUB2 extends SUB1 {

  
    public SUB2(FOOD food, DRINK drink, PAYMENTMETHOD payment, int quantity, int drinkQuantity) {
        super(food, drink, payment, quantity, drinkQuantity);
    }

   
    public void updateOrder(FOOD food, DRINK drink, PAYMENTMETHOD payment, int quantity, int drinkQuantity) {

        setFood(food);
        setDrink(drink);
        setPAYMENTMETHOD(payment);
        setQuantity(quantity);            
        setDrinkQuantity(drinkQuantity); 
    }
}