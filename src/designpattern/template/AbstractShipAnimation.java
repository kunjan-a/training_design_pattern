package designpattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractShipAnimation implements Animation {
    protected ShipType shipType;
    private Object action;

    public void render(Screen screen) {
        screen.show(shipType+" is "+action+".");
    }
}
