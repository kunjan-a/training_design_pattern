package designpattern.adapter;

import designpattern.adapter.thirdparty.ILeaveRecord;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class LeaveRecordAdapter implements ILeaveRecord{

    private ILeaveRecord leaveRecord;

    public LeaveRecordAdapter(ILeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public int getEmployeeAbsences(Employee employee) {
        String firstFirst = employee.getName();
        int beginLastName = firstFirst.lastIndexOf(' ')+1;
        StringBuilder lastFirst = new StringBuilder();
        lastFirst.append(firstFirst.substring(beginLastName)+',');
        lastFirst.append(' '+firstFirst.substring(0,beginLastName-1));

        return leaveRecord.getEmployeeAbsences(new Employee(lastFirst.toString()));
    }

    public Employee getMostAbsentEmployee() {
        String lastFirst = leaveRecord.getMostAbsentEmployee().getName();
        int endLastName = lastFirst.lastIndexOf(',');
        StringBuilder firstFirst = new StringBuilder();
        firstFirst.append(lastFirst.substring(endLastName+2,lastFirst.length())+' ');
        firstFirst.append(lastFirst.substring(0,endLastName));

        return new Employee(firstFirst.toString());
    }
}
