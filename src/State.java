/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public interface State {
    public void insertQuarter();
    public void ejectQuarter();

    public void choose(String flavor);

    public void turnCrank();

    public void dispense();
}
