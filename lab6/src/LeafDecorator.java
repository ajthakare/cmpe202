
import java.text.DecimalFormat;


public abstract class LeafDecorator extends Leaf implements PriceDecorator
{  
   PriceDecorator wrapped ;
   
   public LeafDecorator( String d ) {
       super( d ) ;
       this.wrapped = null ;
    }

   public void wrapDecorator( PriceDecorator w ) 
   {
       this.wrapped = w ;
   }
    
   public Double getPrice() {
        if (wrapped == null )
        {
            return price ;
        }
        else 
        {
            return price + wrapped.getPrice() ;
        }
    }

    abstract public void setOptions( String[] options ) ; 
    abstract public String getDescription() ;
    abstract public String getPackageSlip();
        
    @Override
    public void printReceipt() {
        System.out.println( "" + getDescription() ) ;
    }
    
    @Override
    public void packageslip() {
        System.out.println( "" + getPackageSlip() ) ;
    }
    
    
}
