public class Fries extends LeafDecorator
{
	protected String option ;
	protected double total ;


    
    public Fries( String d )
    {
        super(d) ;
        setOptions(d);
    }
    
    public void setOptions( String option )
    {
        this.option = option ;
        
        switch (option) {
        
    	case "LTL CAJ":
    		total = 2.79 ;
    		this.price += total ;
    		break;
    	case "REG CAJ":
    		total = 3.39 ;
    		this.price += total ;
    		break;
    	case "LAR CAJ":
    		total = 5.59 ;
    		this.price += total ;
    		break;
    	case "LTL 5G":
    		total = 2.79 ;
    		this.price += total ;
    		break;
    	case "REG 5G":
    		total = 3.39 ;
    		this.price += total ;
    		break;
    	case "LAR 5G":
    		total = 5.59 ;
    		this.price += total ;
    		break;
    	default:
    		total = 5.59 ;
    		this.price += total ;
    		break;
        }
    }

	@Override
	public void setOptions(String[] options) {
		// TODO Auto-generated method stub
	}

    
}
