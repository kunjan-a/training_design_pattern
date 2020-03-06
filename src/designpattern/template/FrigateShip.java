package designpattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class FrigateShip extends Ship {
    private int armor = 5;
    private int engineHealth = 5;

    public FrigateShip(Screen screen, Game game, ShipType shipType) {
        super(screen, game, shipType);
    }

    @Override
    public void onHit(int impact) {
        health -= (armor > 0 ? 1 : impact * 2.5);
        if (impact > 5 && armor <= 0)
            engineHealth -= 1;
        if (armor > 0)
            armor -= 1;

        Animation animation = null;

        if(health <= 0 || engineHealth <= 0) {
            animation = new SinkFrigateShipAnimation();
            game.notifyShipLost(shipType);
        }
        else {
            animation = new ExplodeFrigateAnimation();
        }

        animation.render(screen);

    }
}
