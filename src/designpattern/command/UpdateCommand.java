package designpattern.command;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class UpdateCommand implements Command{
    private String fileName;
    private String originalContent;
    private String newContent;
    private boolean successful=false;

    public UpdateCommand(String fileName, String newContent) {
        this.fileName = fileName;
        this.newContent = newContent;
    }

    public void execute() {
        File file = FileUtil.getFileOject(fileName);

        originalContent = FileUtil.readFile(file);

        FileUtil.writeToFile(file, newContent);
        successful=true;
    }


    public void rollBack() {
        FileUtil.writeToFile(FileUtil.getFileOject(fileName), originalContent);
        successful=false;
    }

    public boolean wasSuccessful() {
        return successful;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
