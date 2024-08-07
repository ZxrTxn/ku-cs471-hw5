/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void choose(String flavor) {
        gumballMachine.setFlavor(flavor);
        gumballMachine.setState(gumballMachine.getChosenState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You have to choose the flavor first");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
