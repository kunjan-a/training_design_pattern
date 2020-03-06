package designpattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class AndroidPhoneFactory extends AbstractPhoneFactory {

    public Case createCase() {
        return new AndroidCase();
    }

    public MotherBoard createMotherBoard() {
        return new AndroidMotherBoard();
    }

    public Processor createProcessor() {
        return new AndroidProcessor();
    }

    public Screen createScreen() {
        return new AndroidScreen();
    }

    public Battery createBattery() {
        return new Battery();
    }
}
