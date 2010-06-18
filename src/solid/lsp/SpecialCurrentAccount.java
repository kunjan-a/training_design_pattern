package solid.lsp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 18, 2010
 * Time: 2:00:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpecialCurrentAccount extends CurrentAccount {
    private int elapsedDuration;
    private final static int minDuration = 10;


    public SpecialCurrentAccount(double balance, int elapsedDuration) {
        super(balance);
        this.elapsedDuration = elapsedDuration;
    }

    @Override
    public void close() {
        prematureClosureCheck();
        super.close();
    }

    private void prematureClosureCheck() {
        if (elapsedDuration < minDuration)
            throw new PrematureAccountClosureException();
    }
}
