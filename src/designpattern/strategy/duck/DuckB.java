package designpattern.strategy.duck;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 1:56:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class DuckB extends AbstractDuck{

    public DuckB() {
        super(new Fly1(), new Quack2(), new Eat2());
    }
}
