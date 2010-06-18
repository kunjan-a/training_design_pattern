package solid.lsp;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 1:45:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentAccountTest {

    @Test(expected = AccountAlreadyClosedException.class)
    public void shouldNotAllowToAddMoneyToAClosedCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount(10);
        currentAccount.close();
        currentAccount.addMoney(10);
    }

    @Test(expected = AccountOverdraftException.class)
    public void shouldNotAllowToCloseOverdraftCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount(-10);
        currentAccount.close();
    }
}