package designpattern.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class RangeValidator {
    private int lowerLimit = Integer.MIN_VALUE;
    private int upperLimit = Integer.MAX_VALUE;

    public void updateLowerLimitIfReq(int newLower){
        if(newLower > lowerLimit)
            lowerLimit = newLower;
    }

    public void updateUpperLimitIfReq(int newUpper){
        if(newUpper < upperLimit)
            upperLimit = newUpper;
    }

    public void checkRange(int valueToCheck){
        ValidationUtil.atLeast(valueToCheck, lowerLimit);
        ValidationUtil.atMost(valueToCheck, upperLimit);
    }


}
