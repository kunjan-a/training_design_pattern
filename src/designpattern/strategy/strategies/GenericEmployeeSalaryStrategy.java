package designpattern.strategy.strategies;

import designpattern.strategy.ValidationUtil;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 1:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericEmployeeSalaryStrategy implements ISalaryStrategy {
    public void checkSalary(int salary) {
        ValidationUtil.atMost(salary, 1000);
    }
}
