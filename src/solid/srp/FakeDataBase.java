package solid.srp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 24, 2010
 * Time: 1:02:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class FakeDataBase {
    public FakeDataBase(String s, String s1, String s2, String s3) {
        //save all the parameters
    }

    public Record query(String query) {
        Record record = new Record();
        record.put("empid", "1");
        record.put("monthlySalary", 1000);
        record.put("name", "Sherlock Holmes");
        record.put("addressStreet", "Baker Street");
        record.put("addressCity", "London");
        record.put("addressCountry", "UK");
        return record;
    }
}
