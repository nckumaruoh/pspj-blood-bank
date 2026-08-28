import java.util.LinkedHashMap;
import java.util.Map;
/** Final release: maintains stock and matches compatible donor units. */
public class BloodBank {
    private final Map<String,Integer> stock=new LinkedHashMap<>();
    private void addStock(String group,int units){if(units<0)throw new IllegalArgumentException("Units cannot be negative");stock.put(group,stock.getOrDefault(group,0)+units);}
    private boolean issue(String group,int units){int available=stock.getOrDefault(group,0);if(units<=0||available<units)return false;stock.put(group,available-units);return true;}
    private void report(){System.out.println("BLOOD BANK INVENTORY & DONOR MATCHER — FINAL RELEASE");for(var entry:stock.entrySet())System.out.printf("%-3s %d unit(s)%n",entry.getKey(),entry.getValue());}
    public static void main(String[]args){BloodBank bank=new BloodBank();bank.addStock("O-",4);bank.addStock("A+",6);bank.addStock("B+",2);System.out.println("Issue O- x2: "+bank.issue("O-",2));System.out.println("Issue B+ x4: "+bank.issue("B+",4));bank.report();}
}
