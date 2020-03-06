package designpattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmptyCriteriaEval implements Criteria {
    public boolean evaluate(Application theApp) {
        return true;
    }
}
