package designpattern.composite;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File extends FileSystemEntity{
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean directoryExists(String name) {
        return false;
    }

    @Override
    public boolean fileExists(String name) {
        return this.name.equals(name);
    }

    @Override
    public void delete() {
        parent.removeEntry(this);
    }

}
