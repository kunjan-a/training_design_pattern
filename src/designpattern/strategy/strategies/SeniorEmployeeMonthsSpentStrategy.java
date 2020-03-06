package designpattern.strategy.strategies;

import designpattern.strategy.ValidationUtil;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployeeMonthsSpentStrategy implements IMonthsSpentStrategy {
    public void checkMonthsSpent(int months) {
        ValidationUtil.atLeast(months, 60);
    }
}
