package solid.lsp;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 2:01:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpecialCurrentAccountTest {
    private int tenDollars = 10;

    @Test
    public void shouldAllowToCloseAccount() {
        int tenMonths = 10;
        CurrentAccount specialCurrentAccount = new SpecialCurrentAccount(tenDollars, tenMonths);
        specialCurrentAccount.close();
    }

    @Test(expected = PrematureAccountClosureException.class)
    public void shouldNotAllowToCloseSpecialCurrentAccountTooEarly() {
        int fiveMonths = 5;
        CurrentAccount spCurrentAccount = new SpecialCurrentAccount(tenDollars, fiveMonths);
        spCurrentAccount.close();
    }

    @Test
    @Ignore
    public void lspViolation() {
        CurrentAccount currentAccount = new CurrentAccount(10);
        CurrentAccount specialCurrentAccount = new SpecialCurrentAccount(10, 5);
        closeCurrentAccounts(currentAccount, specialCurrentAccount);
    }

    private void closeCurrentAccounts(CurrentAccount... currentAccounts) {
        for (CurrentAccount currentAccount : currentAccounts) {
            currentAccount.close();
        }
    }

}
