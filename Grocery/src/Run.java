/**
 * Created by Samson on 28-09-2016.
 */
import java.util.ArrayList;

public class Run{

    public static void main(String[] args){

        Grocery soda = new Grocery("Fanta", 15);
        Grocery soda1 = new Grocery("Cola", 13);
        Grocery soda2 = new Grocery("Sprite", 18);
        Grocery soda3 = new Grocery("Sprite", 18);
        Grocery soda4 = new Grocery("Sprite", 18);
        Grocery soda5 = new Grocery("Sprite", 18);
        Grocery soda6 = new Grocery("Sprite", 18);
        Grocery soda7 = new Grocery("Sprite", 18);
        Grocery soda8 = new Grocery("Sprite", 18);
        Grocery soda9 = new Grocery("Sprite", 18);
        Grocery soda10 = new Grocery("Sprite", 18);

        GroceryList groceryList = new GroceryList();

        groceryList.addItem(new GroceryItemOrder(soda, 2));
        groceryList.addItem(new GroceryItemOrder(soda1, 5));
        groceryList.addItem(new GroceryItemOrder(soda2, 5));
        groceryList.addItem(new GroceryItemOrder(soda3, 5));
        groceryList.addItem(new GroceryItemOrder(soda4, 5));
        groceryList.addItem(new GroceryItemOrder(soda5, 5));
        groceryList.addItem(new GroceryItemOrder(soda6, 5));
        groceryList.addItem(new GroceryItemOrder(soda7, 5));
        groceryList.addItem(new GroceryItemOrder(soda8, 5));
        groceryList.addItem(new GroceryItemOrder(soda9, 5));
        groceryList.addItem(new GroceryItemOrder(soda10, 5));


        System.out.println(groceryList.getTotalCost());





    }
}