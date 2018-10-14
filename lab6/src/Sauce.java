public class Sauce extends LeafDecorator
{
    private String[] options ;
    
    
    public Sauce( String d )
    {
        super(d) ;
    }
    
    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 1 )
            this.price += (options.length-1) * 0.75 ;
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += "\n\t" + options[i] ;
            else desc = "\t"+options[i] ;
        }        
        return desc ;
    }

	@Override
	public String getPackageSlip() {
		String desc = "" ;
		if(options.length>0 && options[0]!="") 
		{
	        for ( int i = 0; i<options.length; i++ )
	        {
	            if (i>0) desc += "\n\t" + options[i] ;
	            else desc = "\t"+options[i] ;
	        }
	        //desc += "\n" ;
		}
        
        return desc ;
	}
    
}