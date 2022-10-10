import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GumballMachineTest {

	@Test
	
		void testGumballMachine() {
			GumballMachine machine1 = new GumballMachine(5);
			machine1.insertQuarter(); //HasQuaretr
			machine1.ejectQuarter(); //NoQuaretr
			machine1.turnCrank();//SoldState
			machine1.insertQuarter();
			machine1.turnCrank();
			machine1.insertQuarter();
		}

	}