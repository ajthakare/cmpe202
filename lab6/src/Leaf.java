 

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }
    
    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
	
	@Override
	public void setPrintStrategy(PrintStrategy s) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void printSlip() {
		// TODO Auto-generated method stub		
	}
}
 
