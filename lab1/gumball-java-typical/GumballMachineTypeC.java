
/*
 * Class to implement the logic for gumball machine of type which accepts quarters, dimes and nickels 
 * */

public class GumballMachineTypeC implements GumBallInterface
{
	private int num_gumballs;
    private boolean has_50cents;
    private int quarter_count;
    private int dime_count;
    private int nickel_count;
    private int coins_worth;
    
    //constructor to initialize machine
    public GumballMachineTypeC( int size )
    {
        this.num_gumballs = size;
        this.has_50cents = false;
        this.quarter_count = 0;
        this.dime_count = 0;
        this.nickel_count = 0;
        this.coins_worth = 0;
    }
	
    //insert coin method checks if inserted coins are quarters, dimes or nickels and accepts the same
	public void insertCoin(int coin)
	{
		if(has_50cents==false)
		{
			switch(coin)
			{
			case 25:
				quarter_count++;
				break;
			case 10:
				dime_count++;
				break;
			case 5:
				nickel_count++;
				break;
			default:
				System.out.println("");
				break;				
			}
			setHas50Cents();			
		}
		else
			System.out.println("Coins worth 50 Cents inserted. Can't accept more coins.");		
	}
	
	//sets has_50cents depending on whether coins worth 50 cents are feed in the machine
	private void setHas50Cents()
	{
		this.coins_worth= (25 * this.quarter_count) + (10 * this.dime_count) + (5 * this.nickel_count);
		
		if(this.coins_worth>=50)
			this.has_50cents=true;
		else
			this.has_50cents=false;
	}
	
	//ejects all inserted coin
	public void ejectCoin()
	{
		if(this.coins_worth>0)
		{
			System.out.println("Ejected "+ this.quarter_count +" quarter, " + this.dime_count +" dime and " + this.nickel_count + " nickel coins.");
			this.quarter_count = 0;
	        this.dime_count = 0;
	        this.nickel_count = 0;
	        this.coins_worth = 0;
	        this.has_50cents = false;
		}
		else
			System.out.println("No coins to eject.");
	}
	
	//ejects gumball if machine has gumballs and coins worth 50 cents are inserted
	public void turnCrank()
	{
		if ( this.has_50cents )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			System.out.println( "Thanks for your 50 Cents. Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your 50 cents." ) ;
    		}
			this.has_50cents = false ;
			this.quarter_count =0;
			this.dime_count = 0;
	        this.nickel_count = 0;
	        this.coins_worth = 0;
    	}
    	else 
    	{
    		System.out.println( "Please insert coins worth 50 Cents." ) ;
    	}
		
	}

}
