package designpattern.strategy.duck;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 1:58:22 PM
 * To change this template use File | Settings | File Templates.
 */

public class DuckC extends AbstractDuck{


    public DuckC() {
        super(new Fly2(), new Quack2(), new Eat1());
    }
}
