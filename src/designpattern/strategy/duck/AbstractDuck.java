package designpattern.strategy.duck;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 2:19:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractDuck {
    private Flyable flyable;
    private Quackable quackable;
    private Eatable eatable;

    public AbstractDuck(Flyable flyable, Quackable quackable, Eatable eatable) {
        this.flyable = flyable;
        this.quackable = quackable;
        this.eatable = eatable;
    }

    public void fly() {
        this.flyable.fly();
    }

    public void quack() {
        quackable.quack();
    }

    public void eat() {
        eatable.eat();
    }
}
