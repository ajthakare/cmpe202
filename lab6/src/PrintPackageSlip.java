import java.util.ArrayList;
import java.util.Date;
import java.text.*;

public class PrintPackageSlip implements PrintStrategy{
	
	ArrayList<Component> components;
	DecimalFormat fmt = new DecimalFormat("0.00");
	Burger b;
	Toppings t;
	Fries f;
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date date = new Date();	

	@Override
	public void printSlip(ArrayList<Component> componentslist) {
		
		//System.out.println("In Print Package Slip Strategy\n\n");
		
		components = componentslist;
		
		//store all components of order in local objects
		for (Component obj  : components)
        {
            if(obj.getClass().getName()=="Burger")
            	b=(Burger) obj;
            if(obj.getClass().getName()=="Toppings")
            	t=(Toppings) obj;
            if(obj.getClass().getName()=="Fries")
            	f=(Fries) obj;
        }

		System.out.println("\t\tPackaging Slip");
		System.out.println("----------------------------------------------\n");
		
		System.out.println("  Patties - 1");
		System.out.println("\n  Order Number: 45");
		System.out.println("\n\t"+dateFormat.format(date));
		System.out.println("\n\tFIVE GUYS\n");
		
		//print choice of burger				
		System.out.println("  1\t"+b.option);
		
		//print all toppings on top bun
		for (String topping  : t.uptops)
        {
        	System.out.println("\t" + topping );
        }        
		
		//print all toppings on lower bun
        for (String topping  : t.downtops)
        {
        	System.out.println("\t->| " + topping );
        }
		
        //print bacon
		System.out.println("\t{{{{ BACON }}}}");
		
		//print choice of fries
		System.out.println("\n  1\t"+f.option);
		
		System.out.println("\n==============================================");
		
	}

}
