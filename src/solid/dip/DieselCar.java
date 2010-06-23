package solid.dip;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 10:49:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class DieselCar extends Car {
    @Override
    public void addFuel(Fuel fuel) {
        if(fuel.getClass() != DieselFuel.class)
            throw new WrongFuelException();
        
        super.addFuel(fuel);
    }
}
