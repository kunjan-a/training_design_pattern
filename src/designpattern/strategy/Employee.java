package designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 1:31:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends GenericEmployee {
    private int maxAllowedLeaves;

    public void setMaxAllowedLeaves(int leaves) {
        ValidationUtil.atLeast(leaves, 1);
        this.maxAllowedLeaves = leaves;
    }
}

