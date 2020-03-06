package designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:35:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeniorEmployee extends GenericEmployee {
    private int setMaxBonus;

    public SeniorEmployee() {
/*
        salaryStrategies.add(new SeniorEmployeeSalaryStrategy());
        monthsSpentStrategies.add(new SeniorEmployeeMonthsSpentStrategy());
*/
        salaryValidator.updateLowerLimitIfReq(200);
        monthsSpentValidator.updateLowerLimitIfReq(60);
    }

   public void setMaxBonus(int bonus)
   {
       ValidationUtil.atLeast(bonus, 1);
       this.setMaxBonus = bonus;
   }
}
