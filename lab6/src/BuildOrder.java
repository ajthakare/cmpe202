  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "" ) ;        

        CustomBurger customBurger = new CustomBurger( "" ) ;

        Burger b = new Burger( "LBB" ) ;
                
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Lettuce", "G Onion", "JALA Grilled", "Tomato" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( b ) ;
                
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Ketchup","BBQ" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( t ) ;
        
        Fries f = new Fries("LTL CAJ");
        f.wrapDecorator(s);

        customBurger.setDecorator( f ) ;        
        customBurger.addChild( b ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( f ) ;
        
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/