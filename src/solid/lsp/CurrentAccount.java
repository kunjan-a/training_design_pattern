package solid.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 1:45:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentAccount {
    private String currentStatus = OPEN;
    private static final String CLOSED = "closed";
    private static final String OPEN = "open";
    private double balance;


    public CurrentAccount(double balance) {
        this.balance = balance;
        this.currentStatus = OPEN;
    }

    public void close() {
        accountOverdraftCheck();
        currentStatus = CLOSED;
    }

    public void addMoney(int money) {
        if (CLOSED.equals(currentStatus))
            throw new AccountAlreadyClosedException();
    }

    private void accountOverdraftCheck() {
        if (balance < 0)
            throw new AccountOverdraftException();
    }
}
