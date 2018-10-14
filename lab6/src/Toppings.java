import java.util.ArrayList;

public class Toppings extends LeafDecorator
{
    protected String[] options ;
    protected ArrayList<String> uptops = new ArrayList<String>()  ;
    protected ArrayList<String> downtops = new ArrayList<String>()  ;
    
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
    
}