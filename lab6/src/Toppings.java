import java.util.ArrayList;

public class Toppings extends LeafDecorator
{
    private String[] options ;
    private ArrayList<String> uptops = new ArrayList<String>()  ;
    private ArrayList<String> downtops = new ArrayList<String>()  ;
    
    public Toppings( String d )
    {
        super(d) ;
    }
    

    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
        	if ( "Lettuce".equals(options[i]) ) uptops.add(options[i]);
        	if ( "Tomato".equals(options[i]) ) uptops.add(options[i]);
        	if ( "Pickles".equals(options[i]) ) uptops.add(options[i]);
        	if ( "G Onion".equals(options[i]) ) downtops.add(options[i]);
        	if ( "JALA Grilled".equals(options[i]) ) downtops.add(options[i]);
        }
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        
        
        for ( int i = 0; i<options.length; i++ )
        {
        	String temp="";
        	
        	if(downtops.contains(options[i]))
        		temp += "->| " + options[i];
        	else
        		temp += options[i] ;
        	
            if (i>0) desc += "\n\t" +  temp ;
            else desc = "\t"+temp ;
        }
        
        return desc ;
    }


	@Override
	public String getPackageSlip() {
		String desc = "" ;
        for (String topping  : uptops)
        {
        	if(uptops.indexOf(topping)==0)desc += "\t" + topping ;
        	else desc += "\n\t" + topping ;
        }        
        for (String topping  : downtops)
        {
        	if(uptops.size()==0 && downtops.indexOf(topping)==0)desc += "\t-> " + topping ;
        	else desc += "\n\t->| " + topping ;
        }
        desc += "\n\t{{{{ BACON }}}}";
        return desc ;
	}
    
}