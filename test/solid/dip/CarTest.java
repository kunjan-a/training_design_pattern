package solid.dip;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 10:40:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class CarTest {

    @Test(expected = NotEnoughFuelException.class)
    public void carWithoutFuelShouldNotStart() {
        Car car = new Car();
        car.start();
    }

    @Test
    public void carWithFuelShouldBeAbleToStart() {
        Car car = new Car();
        car.addFuel(new Fuel());
        car.start();
    }

    @Test
    public void dieselCarShouldRunOnDiesel() {
        Car dieselCar = new DieselCar();
        dieselCar.addFuel(new DieselFuel());
        dieselCar.start();
    }

    @Test(expected = WrongFuelException.class)
    public void dieselCarShouldNotRunOnPetrol() {
        Car dieselCar = new DieselCar();
        dieselCar.addFuel(new Fuel());
        dieselCar.start();
    }

    @Test
    @Ignore
    public void liskovSubstitutionViolation() {
        Car car = new DieselCar();
        car.addFuel(new Fuel());
        car.start();
    }
}
