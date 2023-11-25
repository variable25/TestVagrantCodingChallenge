
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Cart1{
    String prod;
    double unitPrice;
    double GST;
    double quantity;
    Cart1(String prod, double unitPrice, double GST, double quantity){
        this.prod = prod;
        this.unitPrice = unitPrice;
        this. GST = GST;
        this.quantity = quantity;
    }

    


    double Operations(){
        
        if(this.unitPrice>500){
            this.unitPrice = this.unitPrice - (0.05 * this.unitPrice);
        }

        double totalamt = this.unitPrice * (this.GST/100) * this.quantity;
        return totalamt;
        
    }

    void GST(){
        
    }
        

}

public class Cart {

    public static void main(String[] args){
        Cart1 c1 = new Cart1("Leather wallet", 1100.0, 18, 1);
    Cart1 c2 = new Cart1("Umbrella", 900.0, 12.0, 4);
    Cart1 c3 = new Cart1("Cigarette", 900.0, 28.0, 3);
    Cart1 c4 = new Cart1("Honey",100.0,0,2);

    ArrayList<Double> list = new ArrayList<>();
    list.add(c1.GST*c1.unitPrice);
    list.add(c2.GST*c2.unitPrice);
    list.add(c3.GST*c3.unitPrice);
    list.add(c4.GST*c4.unitPrice);

    Collections.sort(list);
    System.out.println("Maximum GST="+(list.size()-1));

    
    double totalamt1 = c1.Operations();
    double totalamt2 = c2.Operations();
    double totalamt3 = c3.Operations();
    double totalamt4 = c4.Operations();
    double total = totalamt1 + totalamt2 + totalamt3 + totalamt4;


    System.out.println("totalamt = " + total); 
    }
    

    
}
