
import java.util.Arrays;

public class BuildOrder {
	
    private final IStrategy strategy;
    
	public BuildOrder(IStrategy s) 
	{
        this.strategy = s;
    }

    public String getOrder(String[] s)
	{
        return strategy.execute(s);
    }

    public static void main(String[] args){
        String[] items= {"Cheese", "->Tomato", "Lettuce", "->Onion", "Meat"};

        BuildOrder b1 = new BuildOrder((String[] s)  -> {
			
            //String[] out = new String[items.length];
            String out = "";
            
			for (int i = 0; i < items.length; i++) 
			{
                if(items[i].startsWith("->"))
                    out += "\t" + items[i].substring(2) + " on Bottom bun\n";
                else
                    out += "\t" + items[i] + " on Top bun\n";
            }
            
			return out;
        });
		
        BuildOrder b2 = new BuildOrder((String[] s)  -> {
       
			//String[] out = new String[items.length];
			String out = "";
            
			for (int i = 0; i < items.length; i++) 
			{
               if(items[i].contains("Tomato"))
                   out += "\t" + items[i] + " $0.49\n";
               else if(items[i].contains("Onion"))
                   out += "\t" + items[i] + " $0.99\n";
               else
                   out += "\t" + items[i] + " $0.29\n";
            }
            return out;
        });
        
        System.out.println("\n Lambda Function Output\n");
        System.out.println("Package Slip:\n" + (b1.getOrder(items)));
        System.out.println(("Receipt Slip:\n" + b2.getOrder(items)));
    }
}
