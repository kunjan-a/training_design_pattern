package designpattern.command;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/11/12
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCommand implements Command {
    private String fileName;
    private File file = null;
    private String content;
    boolean successful = false;

    public CreateCommand(String filename, String content) {
        this.fileName = filename;
        this.content = content;
    }

    public void execute() {
        file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exist");
        FileUtil.writeToFile(file,content);
        successful = true;
    }

    public void rollBack() {
        file.delete();

        successful = false;
    }

    public boolean wasSuccessful() {
        return successful;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
