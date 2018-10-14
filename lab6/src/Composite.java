   

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    private int orderno = 0;
       
    public Composite ( String d )
    {
        description = d ;
        orderno++;
    }

	public void printReceipt() {
		System.out.println("Receipt:\n");
		System.out.println("\t\tFIVE GUYS");
        System.out.println( "\n\tOrder Number: "+orderno);
        for (Component obj  : components)
        {
            obj.printReceipt();
        }        
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}

	@Override
	public void packageslip() {
		System.out.println("\n======================================");
		System.out.println("\nPackage Slip:\n");
        System.out.println( "\tOrder Number: "+orderno );
		System.out.println("\n\t\tFIVE GUYS");
        for (Component obj  : components)
        {
            obj.packageslip();
        } 
	}
	 
}
 
