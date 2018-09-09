
/*
 * Class to implement the logic for gumball machine of type which accepts two quarters
 * */

public class GumballMachineTypeB implements GumBallInterface 
{
	int num_gumballs;
    private boolean has_2quarters;
    private int quarter_count;
    
    //constructor to initialize machine
    public GumballMachineTypeB( int size )
    {
        this.num_gumballs = size;
        this.has_2quarters = false;
        this.quarter_count = 0;
    }
	
    //insert coin method checks if inserted coins are quarters and accepts the same
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
	//sets has_2quarters depending on whether 2 quarters are feed in the machine
	private void setHas2quarters()
	{
		if(quarter_count == 2)
			this.has_2quarters=true;
		else
			this.has_2quarters=false;
	}
	*/

	//ejects all inserted coin
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

	//ejects gumball if machine has gumballs and 2 quarters are inserted
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
