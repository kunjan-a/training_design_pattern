package designpattern.strategy.strategies;

import designpattern.strategy.ValidationUtil;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployeeSalaryStrategy implements ISalaryStrategy {
    public void checkSalary(int salary) {
        ValidationUtil.atLeast(salary, 200);
    }
}
