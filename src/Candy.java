/**
 * The Candy class is a subclass of DessertItem. 
 * 
 * A Candy has a name, a weight (in pounds), and a price per pound. 
 * The weight and price per pound are used to calculate the cost of the Candy. 
 * 
 * @author YOURNAMEHERE
 */
public class Candy extends DessertItem{
    

    private String name;
    private double weight;
    private double cost;
    
    public Candy(String name, double weight, int cost)
    {
          super(name);
          
          this.weight = weight;
          
          this.cost = cost;
    }
    
    @Override
    
    public int getCost(){
        double totalCost = weight*cost;
        int realTotalCost = (int) totalCost;
        return realTotalCost;
    }
    
    public String toString()
    {
       String output = super.getName();
       for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH- super.getName().length() - 4; i++){
           output += " ";
       }
       output += DessertShoppe.cents2dollarsAndCents(getCost());
       
       return output;
    }
    
    
    
}
