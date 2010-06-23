package otherprinciples.demeter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 11:39:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class MilkManTest {
    private Wallet wallet = new Wallet(10);
    private Person someone = new Person(wallet);
    private MilkMan milkMan = new MilkMan();

    @Test
    public void canSellPaperToSomeone() {
        milkMan.deliverTo(someone);
        assertEquals(7, wallet.availableMoney());
    }
}
