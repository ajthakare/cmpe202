
public class GumballMachine implements GumBallInterface
{
	protected int num_gumballs;
    private boolean has_quarter;	
    
    public GumballMachine( int size )
    {
        this.num_gumballs = size;
        this.has_quarter = false;
    }
	
	public void insertCoin(int coin) 
	{
		if ( coin == 25 && this.has_quarter==false )
            this.has_quarter = true ;
		else if(coin == 25 && this.has_quarter==true)
		{
			System.out.println("Quarter already inserted. Can't accept more than one quarter.");
		}
        else
        {
            this.has_quarter = false ;
            System.out.println("Coin ejected. Only quarter is accepted.");
        }
	}

	public void ejectCoin() 
	{
		if(this.has_quarter==true)
		{
			this.has_quarter=false;
			System.out.println("Coin ejected.");
		}
		else
			System.out.println("No coin to eject.");
	}

	public void turnCrank() 
	{
		if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			System.out.println( "Thanks for your quarter. Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
			this.has_quarter = false ;
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter." ) ;
    	} 
	}	
}
