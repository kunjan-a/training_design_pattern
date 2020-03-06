package designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        PhoneFactory pf = AbstractPhoneFactory.getPhoneFactory(phoneType);
        MotherBoard motherBoard = pf.createMotherBoard();
        motherBoard.attachBattery(pf.createBattery());
        motherBoard.attachProcessor(pf.createProcessor());

        Screen screen = pf.createScreen();

        Case phoneCase = pf.createCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
