package designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {

    public void fixManipulate(final String fileName, final String newPath) {
        CommandInvoker.invoke(new CompositeCommand(new CreateCommand(fileName, "hello world"), new UpdateCommand(fileName, "new hello world"), new MoveCommand(fileName, newPath)));
    }

    public void brokenManipulate(String fileName, String newPath) {
        CommandInvoker.invoke(new CompositeCommand(new CreateCommand(fileName, "hello world"),new UpdateCommand(fileName, "new hello world"),new MoveCommand(fileName, newPath),new CreateCommand(fileName, "hello world"),new CreateCommand(fileName, "hello world")));
    }

}
