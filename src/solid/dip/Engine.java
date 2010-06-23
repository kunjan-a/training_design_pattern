package solid.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 10:39:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class Engine {
    private Fuel fuel;

    public boolean hasNoFuel() {
        return fuel == null;
    }

    public void addFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}
