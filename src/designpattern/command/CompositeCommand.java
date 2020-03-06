package designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompositeCommand implements Command {
    private Command[] cmds;
    private boolean successful=false;
    int successfulTill;

    public CompositeCommand(Command... cmds) {
        this.cmds=cmds;
    }

    public void execute() {
        for(successfulTill = 0; successfulTill <cmds.length; successfulTill++)
        {
            cmds[successfulTill].execute();
            if(!cmds[successfulTill].wasSuccessful())
                break;
        }

        if(successfulTill ==cmds.length)
            successful=true;

    }

    public void rollBack() {
        for(; successfulTill >=0; successfulTill--){
            cmds[successfulTill].rollBack();
        }
    }

    public boolean wasSuccessful() {
        return successful;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
