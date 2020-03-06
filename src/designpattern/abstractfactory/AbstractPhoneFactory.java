package designpattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractPhoneFactory implements PhoneFactory {
    public static PhoneFactory getPhoneFactory(String phoneType){
        if (phoneType.equals("Android")) {
           return new AndroidPhoneFactory();
        }else
            return new IphonePhoneFactory();
    }


}
