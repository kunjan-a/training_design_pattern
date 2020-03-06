package designpattern.composite;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 4:23 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class FileSystemEntity {
    String name;
    Directory parent;

    public String getName() {
        return name;
    }

    public void setParent(Directory directory){
        this.parent = directory;
    }

    public abstract int getSize();

    public abstract boolean directoryExists(String name);

    public abstract boolean fileExists(String name);

    public abstract void delete();
}
