package designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:27:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericEmployee extends CompanyMember {
    protected GenericEmployee() {
//        salaryStrategies.add(new GenericEmployeeSalaryStrategy());
//        monthsSpentStrategies.add(new GenericEmployeeMonthsSpentStrategy());
        salaryValidator.updateUpperLimitIfReq(1000);
        monthsSpentValidator.updateLowerLimitIfReq(0);
    }

    public void setManagerName(String name) {
        super.setManagerName(name);
        ValidationUtil.notEmpty(name);
        this.mgrName = name;
    }

}
