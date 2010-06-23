package otherprinciples.demeter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 11:31:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private Wallet wallet;

    public Person(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
