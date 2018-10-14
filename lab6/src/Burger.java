public class Burger extends LeafDecorator
{
    private String option ;
    private double total ;
    private static int burgerno = 0;


    
    public Burger( String d )
    {
        super(d) ;
        setOptions(d);
        burgerno++;
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
        
        /*
            if ( "HamB".equals(options) ) this.price += 6.39 ;
            if ( "CheeseB".equals(options) ) this.price += 7.19 ;
            if ( "BaconB".equals(options) ) this.price += 7.19 ;
            if ( "BaconCB".equals(options) ) this.price += 7.79 ;
            if ( "LHB".equals(options) ) this.price += 4.59 ;
            if ( "LCB".equals(options) ) this.price += 5.29 ;
            if ( "LBB".equals(options) ) this.price += 5.59 ;
            if ( "LBCB".equals(options) ) this.price += 6.19 ;
            */
        
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        desc += "\n"+burgerno+"\t" + option + "\t\t" +total ;
        desc += "\n\t{{{{ BACON }}}}";
              
        return desc ;
    }
    
    public String getPackageSlip() 
    {
        String desc = "" ;
        desc += "\n"+burgerno+"\t" + option ;
        
              
        return desc ;
    }

	@Override
	public void setOptions(String[] options) {
		// TODO Auto-generated method stub
		
	}
    
}
