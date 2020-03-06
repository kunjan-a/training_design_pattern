package designpattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/10/12
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class TOEFLCriteria extends AbstractCriteriaEval {
    protected TOEFLCriteria(Criteria original) {
        super(original);
    }

    public TOEFLCriteria() {
    }

    public boolean evaluate(Application theApp) {
        return  super.evaluate(theApp)&& theApp.getToefl() > 100;
    }
}
