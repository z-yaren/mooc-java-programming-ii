import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debt;
 
    public IOU() {
        this.debt = new HashMap<>();
    }
 
    //saves the amount owed and the person owed to to the IOU.
    public void setSum(String toWhom, double amount) {
        debt.put(toWhom, amount);
    }
 
    //returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        return debt.getOrDefault(toWhom, 0.0);
    }
    
    
}
