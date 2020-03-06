package designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    public void execute();
    public void rollBack();
    public boolean wasSuccessful();
}
