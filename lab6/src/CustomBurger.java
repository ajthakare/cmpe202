
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    PriceDecorator decorator = null ;
    
    public CustomBurger ( String d )
    {
        super(d) ;
    }
    
    public void setDecorator( PriceDecorator p )
    {
        this.decorator = p ;
    }
    
    public void printReceipt() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        for (Component obj  : components)
        {
            obj.printReceipt();
        }
        System.out.println( "\n\tSub. Total:\t" + fmt.format(decorator.getPrice()) );
    }
    
    public void packageslip() {
        
        for (Component obj  : components)
        {
            obj.packageslip();
        }
    }
}

       