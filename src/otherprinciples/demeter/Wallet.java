package otherprinciples.demeter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 11:31:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int availableMoney() {
        return money;
    }

    public void removeMoney(int amount) {
        money -= amount;
    }
}
