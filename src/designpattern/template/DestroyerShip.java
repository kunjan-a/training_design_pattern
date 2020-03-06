package designpattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class DestroyerShip extends Ship {
    private int reactorHealth = 5;

    public DestroyerShip(Screen screen, Game game, ShipType shipType) {
        super(screen, game, shipType);
    }

    @Override
    public void onHit(int impact) {
        health -= impact * 1.2;
        if (impact > 15)
            reactorHealth -= 1;

        Animation animation = null;

        if (health <= 0 || reactorHealth <= 0) {
            animation = new SinkDestroyerShipAnimation();
            game.notifyShipLost(shipType);
        }
        else {
            animation = new ExplodeDestroyerShipAnimation();
        }

        animation.render(screen);
    }
}
