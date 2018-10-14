import java.util.ArrayList;
import java.util.Date;
import java.text.*;

public class PrintReceiptSlip implements PrintStrategy
{
	ArrayList<Component> components;
	DecimalFormat fmt = new DecimalFormat("0.00");
	Burger b;
	Toppings t;
	Fries f;
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date date = new Date();
	
	@Override
	public void printSlip(ArrayList<Component> componentslist) {
		
		//System.out.println("In Print Receipt Slip Strategy\n\n");
		
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

		System.out.println("\t\tCustomer Receipt Slip");
		System.out.println("----------------------------------------------\n");
		
		System.out.println("\t\t  FIVE GUYS");
		System.out.println("\t      BURGERS AND FRIES");
		System.out.println("\t\tSan Jose, CA\n");

		System.out.println("\t     "+dateFormat.format(date));
		System.out.println("\n\t\t  FIVE GUYS");
		System.out.println("\n  Order Number: 45\n");
		
		
		
		//print choice of burger and bacon
		System.out.println("  1\t"+b.option+"\t\t\t"+b.total);
		System.out.println("\t{{{{ BACON }}}}");
		
		//print all choice of toppings in sequence of order received
		for ( int i = 0; i<t.options.length; i++ )
        {
        	String temp="";
        	
        	if(t.downtops.contains(t.options[i]))
        		temp += "->| " + t.options[i];
        	else
        		temp += t.options[i] ;
        	
            if (i>0) System.out.println("\t" +  temp) ;
            else System.out.println("\t"+temp) ;
        }
		
		//print choice of fries
		System.out.println("\n  1\t"+f.option+"\t\t\t"+f.total);
		
		//calculate total bill and print
		double totalPrice = b.total + f.total;	
		System.out.println("\n\tSub. Total:\t\t"+fmt.format(totalPrice));
		
		System.out.println("\n==============================================");
		
	}

}
