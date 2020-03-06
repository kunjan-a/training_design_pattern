package designpattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ExplodeShipAnimation extends AbstractShipAnimation {
    private String action;

    protected ExplodeShipAnimation() {
        action="exploding";
    }
}
