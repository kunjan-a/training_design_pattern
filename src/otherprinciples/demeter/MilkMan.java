package otherprinciples.demeter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jun 23, 2010
 * Time: 11:39:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class MilkMan {
    public void deliverTo(Person person) {
        person.getWallet().removeMoney(3);
    }
}
