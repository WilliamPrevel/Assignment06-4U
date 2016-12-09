/**
 * The IceCream class is a subclass of DessertItem. 
 * 
 * IceCream has a name, and a cost associated with it.
 * 
 * @author William
 */
public class IceCream extends DessertItem{

    private String name;
    private int cost;
    
    public IceCream(String name, int cost)
    {
        super(name);
        
        this.cost = cost;
    }
    
    @Override
    
    public int getCost(){
        return cost;
    }
    
    @Override
    
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
