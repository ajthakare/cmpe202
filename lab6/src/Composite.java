   

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    private PrintStrategy strategy;
       
    public Composite ( String d )
    {
        description = d ;
        strategy = new PrintReceiptSlip();
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
	
	public void setPrintStrategy(PrintStrategy s)
	{
		this.strategy = s;
	}
	
	public void printSlip()
	{
		strategy.printSlip(components);
	}	 
}
 
