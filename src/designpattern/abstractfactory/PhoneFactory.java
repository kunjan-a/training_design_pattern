package designpattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 5:49 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PhoneFactory {
    public Case createCase();
    public MotherBoard createMotherBoard();
    public Processor createProcessor();
    public Screen createScreen();
    public Battery createBattery();
}
