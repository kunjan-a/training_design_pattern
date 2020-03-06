package designpattern.adapter;

import designpattern.adapter.thirdparty.ILeaveRecord;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 5:16:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class FrontDoorRegister {
    private ILeaveRecord leaveRecord;

    public FrontDoorRegister(ILeaveRecord leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public String getDisplayWallOfShame() {
        String name="";

        name = leaveRecord.getMostAbsentEmployee().getName();
        return name+" has been the most absent employee, shame!" ;
    }
}
