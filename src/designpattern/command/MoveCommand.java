package designpattern.command;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoveCommand implements Command{
    private String src,dest;
    private boolean successful=false;

    public MoveCommand(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }

    public void execute() {
        moveFile(src, dest);
        successful=true;
    }

    private void moveFile(String src, String dest) {
        File file = FileUtil.getFileOject(src);
        if (!file.renameTo(new File(dest)))
            throw new RuntimeException("Rename failed");
    }

    public void rollBack() {
        moveFile(dest, src);

        successful=false;
    }

    public boolean wasSuccessful() {
        return successful;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
