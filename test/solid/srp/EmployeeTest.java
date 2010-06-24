package solid.srp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 24, 2010
 * Time: 10:45:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeTest {
    private int month = 1;
    private int year = 2010;

    @Test
    public void shouldReturnSalarySlip() {
        Employee employee = new Employee(1,1000, "Sherlock Holmes", "Baker Street", "London", "UK");
        String salarySlip = employee.generateSalarySlip(month, year);
        String expectedSalarySlip = "Salary slip for 1/2010\n" +
                " EmpId=1\n" +
                " monthlySalary=1000.0\n" +
                " name='Sherlock Holmes'\n" +
                " addressStreet='Baker Street'\n" +
                " addressCity='London'\n" +
                " addressCountry='UK'";
        assertEquals("Salary slip for " + month +"/"+ year, expectedSalarySlip, salarySlip);
    }

    @Test
    public void shouldFetchAnEmployeeRecordFromDataStore() {
        Employee employee = new Employee(10);
        String expectedEmployee = "Employee{empId=10, monthlySalary=1000.0, name='Sherlock Holmes', addressStreet='Baker Street', addressCity='London', addressCountry='UK'}";
        assertEquals("Should fetch the employee record from database", expectedEmployee,employee.toString());
    }

}
