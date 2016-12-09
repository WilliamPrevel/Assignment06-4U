/**
 * A Sundae is a type of IceCream. 
 * 
 * A Sundae needs the name of the ice cream being used, 
 * the cost of that ice cream, the name of the topping, and 
 * the cost for the topping. 
 * The cost is determined by adding the cost of the ice cream with 
 * the price of the topping.
 * 
 * Remember, we can use IceCream to do some of the heavy lifting for us!
 * 
 * @author William
 */
public class Sundae extends IceCream{
    
    private String name;
    private int cost;
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String name, int cost, String toppingName, int toppingCost)
    {
       super(name, cost);
       
       this.toppingName = toppingName;
       
       this.toppingCost = toppingCost;
       
    }
    
    public int getCost(){
        int totalCost = cost + toppingCost;
        return totalCost;
    }
    
    
    public String toString()
    {
       String output = super.getName() + "\n" + " with " + toppingName;
       for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH- super.getName().length() - 4; i++){
           output += " ";
       }
       for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH- toppingName.length() - 4; i++){
           output += " ";
       }
       output += DessertShoppe.cents2dollarsAndCents(getCost());
       
       return output;
    }
    
    
    
    
    
}
