public class Fries extends LeafDecorator
{
    private String option ;
    private double total ;
    protected int friesno = 0;


    
    public Fries( String d )
    {
        super(d) ;
        setOptions(d);
        friesno++;
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
    		
    	/*	
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "LTL CAJ".equals(options[i]) ) this.price += 2.79 ;
            if ( "REG CAJ".equals(options[i]) ) this.price += 3.39 ;
            if ( "LAR CAJ".equals(options[i]) ) this.price += 5.59 ;
            if ( "LTL 5G".equals(options[i]) ) this.price += 2.79 ;
            if ( "REG 5G".equals(options[i]) ) this.price += 3.39 ;
            if ( "LAR 5G".equals(options[i]) ) this.price += 5.59 ;
        }
        */
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        desc += "\n"+friesno+"\t" + option + "\t\t" +total ;
               
        return desc ;
    }

	@Override
	public void setOptions(String[] options) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPackageSlip() {
		String desc = "" ;
        desc += "\n"+friesno+"\t" + option ;
               
        return desc ;
	}
    
}
