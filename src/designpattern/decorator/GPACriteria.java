package designpattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPACriteria extends AbstractCriteriaEval{
    protected GPACriteria(Criteria original) {
        super(original);
    }

    public GPACriteria() {
    }

    public boolean evaluate(Application theApp) {
        return super.evaluate(theApp) && theApp.getGpa() > 8;
    }
}
