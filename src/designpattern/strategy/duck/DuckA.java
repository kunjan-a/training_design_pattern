package designpattern.strategy.duck;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 1:55:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class DuckA extends AbstractDuck {
    public DuckA() {
        super(new Fly1(), new Quack1(), new Eat1());
    }
}
