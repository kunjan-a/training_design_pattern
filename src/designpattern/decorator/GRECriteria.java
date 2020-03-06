package designpattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 7:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class GRECriteria extends AbstractCriteriaEval {
    protected GRECriteria(Criteria original) {
        super(original);
    }

    public GRECriteria() {
    }

    public boolean evaluate(Application theApp) {
        return super.evaluate(theApp) && theApp.getGre() > 1450;
    }
}
