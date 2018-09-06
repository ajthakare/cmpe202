
public class GumballMachineTypeB extends GumballMachine implements GumBallInterface 
{
	//private int num_gumballs;
    private boolean has_2quarters;
    private int quarter_count;
    
    public GumballMachineTypeB( int size )
    {
    	super(size);
        this.num_gumballs = size;
        this.has_2quarters = false;
        this.quarter_count = 0;
    }
	
	public void insertCoin(int coin)
	{
		if(this.has_2quarters==false)
		{
			if ( coin == 25 )
			{
				this.quarter_count++;
				if(quarter_count == 2)
					this.has_2quarters=true;
			}
			else
	            System.out.println("Coin ejected. Only quarters are accepted.");
		}
		else
		{
			System.out.println("2 quarters already inserted. Can't accept more quarters.");
		}
	}
	
	/*
	private void setHas2quarters()
	{
		if(quarter_count == 2)
			this.has_2quarters=true;
		else
			this.has_2quarters=false;
	}
	*/

	public void ejectCoin()
	{
		if(this.quarter_count>0)
		{
			System.out.println("Ejected " + this.quarter_count + " quarter coin.");
			this.quarter_count=0;
			this.has_2quarters=false;
		}
		else
			System.out.println("No coin to eject.");		
	}

	public void turnCrank()
	{
		if ( this.has_2quarters )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			System.out.println( "Thanks for your quarters. Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
    		}
			this.has_2quarters = false ;
			this.quarter_count =0;
    	}
    	else 
    	{
    		System.out.println( "Please insert 2 quarters." ) ;
    	}		
	}

}
