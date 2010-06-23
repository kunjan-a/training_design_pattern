package solid.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 10:40:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        if(engine.hasNoFuel())
            throw new NotEnoughFuelException();
    }

    public void addFuel(Fuel fuel) {
        engine.addFuel(fuel);
    }
}
