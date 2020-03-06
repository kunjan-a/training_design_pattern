package designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:14:31 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompanyMember {

    private String name;

    protected RangeValidator monthsSpentValidator = new RangeValidator();
    protected RangeValidator salaryValidator = new RangeValidator();

/*
    protected ArrayList<IMonthsSpentStrategy> monthsSpentStrategies =new ArrayList<IMonthsSpentStrategy>();
    protected ArrayList<ISalaryStrategy> salaryStrategies =new ArrayList<ISalaryStrategy>();
*/
    protected String mgrName;
    protected int salary;
    protected int monthsSpent;

    protected CompanyMember() {
//        salaryStrategies.add(new CompanyMemberSalaryStrategy());
        salaryValidator.updateLowerLimitIfReq(1);
    }

    public void setName(String name)
    {
        ValidationUtil.validateLength(name, 50);
        this.name = name;
    }

    public void setSalary(int salary)
    {
/*
        for (ISalaryStrategy iSalaryStrategy : salaryStrategies) {
            iSalaryStrategy.checkSalary(salary);
        }
*/
        salaryValidator.checkRange(salary);
        this.salary = salary;
    }

    public void setManagerName(String name)
    {
        ValidationUtil.validateLength(name, 50);
    }

    public void setMonthsSpent(int months) {
/*
        for (IMonthsSpentStrategy iMonthsSpentStrategy : monthsSpentStrategies) {
            iMonthsSpentStrategy.checkMonthsSpent(months);
        }
*/
        monthsSpentValidator.checkRange(months);
        this.monthsSpent = months;
    }
}
