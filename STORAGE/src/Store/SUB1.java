/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;



/**
 *
 * @author CSHS-PC105
 */
public class SUB1 extends order {

      public SUB1(FOOD food, DRINK drink, PAYMENTMETHOD payment, int foodQty, int drinkQty) {
        super(food, drink, payment, foodQty, drinkQty);
    }

    @Override
    public String displayReceipt() {

        double price = 0;
        double drinkPrice = 0;

        switch (getfood()) {

            case lugaw:
                price = 50;
                break;

            case adobo:
                price = 120;
                break;

            case tinola:
                price = 100;
                break;

            case kare_kare:
                price = 180;
                break;
        }
        
        switch (getdrink()) {
            case water:
                drinkPrice = 15;
                break;
            case coke:
                drinkPrice = 30;
                break;
            case coffee:
                drinkPrice = 45; // Price para sa coffee
                break;
        }
        
double foodTotal = price * getquantity();
double drinkTotal = drinkPrice * getDrinkQuantity(); 
double total = foodTotal + drinkTotal;

        return "======== FOOD RECEIPT ========\n"
                + "Food: " + getfood() + " (₱" + price + " x " + getquantity() + ") = ₱" + foodTotal + "\n"
                + "Drink: " + getdrink() + " (₱" + drinkPrice + " x " + getDrinkQuantity() + ") = ₱" + drinkTotal + "\n"
                + "Payment Method: " + getpayment() + "\n"
                + "------------------------------\n"
                + "GRAND TOTAL: ₱" + total;
    }
}
