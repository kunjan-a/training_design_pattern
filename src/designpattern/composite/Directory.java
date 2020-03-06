package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory extends FileSystemEntity{
    private List<FileSystemEntity> fsEntities=new ArrayList<FileSystemEntity>();

    public Directory(String name, List<File> files, List<Directory> directories) {
        this.name = name;
        this.fsEntities.addAll(files);
        this.fsEntities.addAll(directories);

        for (FileSystemEntity fsEntity : fsEntities) {
           fsEntity.setParent(this);
        }
    }

    public int getSize() {
        int sum = 0;

        for (FileSystemEntity fsEntity : fsEntities) {
            sum += fsEntity.getSize();
        }
        return sum;
    }

    public void delete() {
        int size = fsEntities.size();
        for(int i=0;i< size;i++){
            FileSystemEntity fileSystemEntity = fsEntities.get(0);
            fileSystemEntity.delete();
        }
        parent.removeEntry(this);
    }

    public void removeEntry(FileSystemEntity fsEntity) {
        fsEntities.remove(fsEntity);
    }


    public void add(FileSystemEntity fsEntity) {
        fsEntities.add(fsEntity);
    }

    public boolean fileExists(String name) {
        for (FileSystemEntity fsEntity : fsEntities) {
            if(fsEntity.fileExists(name))
                return true;
        }
        return false;
    }

    public boolean directoryExists(String name) {
        if(this.name.equals(name))
            return true;
        for (FileSystemEntity fsEntity : fsEntities) {
            if(fsEntity.directoryExists(name))
                return true;
        }
        return false;
    }

}
