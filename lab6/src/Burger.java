public class Burger extends LeafDecorator
{
    protected String option ;
    protected double total ;


    
    public Burger( String d )
    {
        super(d) ;
        setOptions(d);
    }
    
    public void setOptions( String option )
    {
        this.option = option ;
        
        switch (option) {
        
        	case "HamB":
        		total = 6.39 ;
        		this.price += total ;
        		break;
        	case "CheeseB":
        		total = 7.19 ;
        		this.price += total ;
        		break;
        	case "LCB":
        		total = 5.29 ;
        		this.price += total ;
        		break;
        	case "LBB":
        		total = 5.59 ;
        		this.price += total ;
        		break;
        	case "LBCB":
        		total = 6.19 ;
        		this.price += total ;
        		break;
        	default:
        		total = 7.19 ;
        		this.price += total ;
        		break;
        }
                
    }

	@Override
	public void setOptions(String[] options) {
		// TODO Auto-generated method stub
		
	}
    
}
