  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "" ) ;

        Burger b = new Burger( "LBB" ) ;
                
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Lettuce", "Tomato", "G Onion", "JALA Grilled" } ;
        t.setOptions( to ) ;
        
        Fries f = new Fries("LTL CAJ");

        order.addChild( b ) ;
        order.addChild( t ) ;
        order.addChild( f ) ;

        return order ;
    }

}