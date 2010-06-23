package otherprinciples.demeter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 11:28:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaperboyTest {
    private Paperboy paperboy = new Paperboy();
    private Wallet wallet = new Wallet(10);
    private Person someone = new Person(wallet);

    @Test
    public void canSellPaperToSomeone() {
        paperboy.deliverTo(someone);
        assertEquals(8, wallet.availableMoney());
    }
}
