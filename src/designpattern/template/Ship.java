package designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 7:59:51 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ship {
    protected final Screen screen;
    protected final Game game;
    protected final ShipType shipType;
    protected double health = 100;

    public Ship(Screen screen, Game game, ShipType shipType) {
        this.screen = screen;
        this.game = game;
        this.shipType = shipType;
    }

    public ShipType getShipType()
    {
        return shipType;
    }

    public abstract void onHit(int impact);
}
