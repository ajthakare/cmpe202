

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,"TypeA");
		//GumballMachine gumballMachine = new GumballMachine(5,"TypeB");
		//GumballMachine gumballMachine = new GumballMachine(2,"TypeC");
		
		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		//System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(5);
		gumballMachine.turnCrank();
		
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.ejectCoin();
		gumballMachine.ejectCoin();
		
		
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(15);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
