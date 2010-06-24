package solid.srp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 24, 2010
 * Time: 10:39:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private int empId;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
    }

    public Employee(int empId) {

        FakeDataBase database = new FakeDataBase("org.postgresql.Driver", "jdbc:postgresql://localhost/employees", "postgres", "dfjdsfjewio");
        Record record = database.query("select * from employees where empId = " + empId);
        this.empId = empId;
        this.name = (String) record.get("name");
        this.monthlySalary = (Integer) record.get("monthlySalary");
        this.addressStreet = (String) record.get("addressStreet");
        this.addressCity = (String) record.get("addressCity");
        this.addressCountry = (String) record.get("addressCountry");
    }

    public String generateSalarySlip(int month, int year) {
        return
                "Salary slip for " + month + "/" + year +
                        "\n EmpId=" + empId +
                        "\n monthlySalary=" + monthlySalary +
                        "\n name='" + name + '\'' +
                        "\n addressStreet='" + addressStreet + '\'' +
                        "\n addressCity='" + addressCity + '\'' +
                        "\n addressCountry='" + addressCountry + '\'';

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressCountry='" + addressCountry + '\'' +
                '}';
    }
}
