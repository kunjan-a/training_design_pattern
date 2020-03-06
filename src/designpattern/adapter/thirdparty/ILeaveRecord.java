package designpattern.adapter.thirdparty;

import designpattern.adapter.Employee;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ILeaveRecord {
    int getEmployeeAbsences(Employee employee);

    Employee getMostAbsentEmployee();
}
