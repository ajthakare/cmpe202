
import java.text.DecimalFormat;


public abstract class LeafDecorator extends Leaf
{  
      
   public LeafDecorator( String d ) {
       super( d ) ;
       }

   public Double getPrice() {
	   return price ;
	   }
   
    abstract public void setOptions( String[] options ) ; 
}
