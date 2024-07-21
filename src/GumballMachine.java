/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State chosenState;

    State state = soldOutState;
    int count = 0;
    String flavor;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        chosenState = new ChosenState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void choose(String flavor) {
        state.choose(flavor);
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setFlavor(String flavor) {
        System.out.println("You have chosen the flavor " + flavor);
        this.flavor = flavor;
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count = count - 1;
        }
    }

    State getSoldOutState() {
        return this.soldOutState;
    }

    State getNoQuarterState() {
        return this.noQuarterState;
    }

    State getHasQuarterState() {
        return this.hasQuarterState;
    }

    State getSoldState() {
        return this.soldState;
    }

    State getWinnerState() {
        return this.winnerState;
    }

    State getChosenState() {
        return this.chosenState;
    }

    int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "\n" +
               "Mighty Gumball, Inc.\n" +
               "Java-enabled Standing Gumball Model #2004\n" +
               "Inventory: " + this.count + " gumball" + ((this.count == 1) ? "" : "s") + "\n" +
               ((this.count > 0) ? "Machine is waiting for quarter" : "Machine is sold out") + "\n";
    }
}
