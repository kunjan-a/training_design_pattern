package designpattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class IphonePhoneFactory extends AbstractPhoneFactory {

    public Case createCase() {
        return new IphoneCase();
    }

    public MotherBoard createMotherBoard() {
        return new IphoneMotherBoard();
    }

    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    public Screen createScreen() {
        return new IphoneScreen();
    }

    public Battery createBattery() {
        return new Battery();
    }


}
