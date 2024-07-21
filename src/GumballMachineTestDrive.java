/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
