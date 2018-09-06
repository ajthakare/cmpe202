public class Main {

	public static void main(String[] args) 
	{
		//GumballMachine gumballMachine = new GumballMachine(5);
		//GumballMachine gumballMachine = new GumballMachineTypeB(5);
		GumballMachine gumballMachine = new GumballMachineTypeC(5);

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

	}
}