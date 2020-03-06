package designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommandInvoker {
    public static void invoke(Command cmd) {
        cmd.execute();
        if(!cmd.wasSuccessful())
            cmd.rollBack();
    }
}
