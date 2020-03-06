package designpattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractCriteriaEval implements Criteria {
    Criteria original;

    public AbstractCriteriaEval() {
        this(null);
    }

    protected AbstractCriteriaEval(Criteria original) {
        this.original = original;
    }

    public boolean evaluate(Application theApp) {
        return original == null || original.evaluate(theApp);
    }
}
