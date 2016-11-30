import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/**
 * Created by Samson on 14-09-2016.
 */
public class GroceryList {

    private GroceryItemOrder[] list = new GroceryItemOrder[10];

    private int count = 0;

    public GroceryList() {

    }


    public void addItem(GroceryItemOrder item){
        if(count >=10){
            System.out.println("List is full");
        } else {
            list[count] = item;
            count++;
        }
    }

    public String getTotalCost() {
        String total = "";
        double sum = 0;
        for (int i = 0; i < list.length; i++) {

            if (list[i] != null) {
                sum += list[i].getItem().getPrise();
                total +=  "Nr. " + (i + 1)  + " " + list[i].getItem().getName() + " " + list[i].getQuantity() + " * " + list[i].getItem().getPrise() + "\n";
            }

        }

        total += "Total Price: " + sum;

        return total;

    }

}