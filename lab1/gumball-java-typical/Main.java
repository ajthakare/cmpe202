public class Main {

	public static void main(String[] args) 
	{
		//initialization of three types of gumball machines. Only one machine can be used at a time. Uncomment out the machine object you want
		//to use here and comment in the other machine objects you don't want to use.
		
		GumballMachine gumballMachine = new GumballMachine(5); 
		//GumballMachineTypeB gumballMachine = new GumballMachineTypeB(5); 
		//GumballMachineTypeC gumballMachine = new GumballMachineTypeC(5); 

		gumballMachine.insertCoin( 5 );
		gumballMachine.insertCoin( 10 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 10 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.ejectCoin();
		
		
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();


		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.ejectCoin();
		gumballMachine.ejectCoin();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 10 );
		gumballMachine.insertCoin( 10 );
		gumballMachine.insertCoin( 10 );
		gumballMachine.turnCrank();
		
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin( 25 );
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

	}
}