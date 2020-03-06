package designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public interface State {

    public void digitEntered(Integer number, Calculator context);

    public void operatorEntered(Character operator, Calculator context);

    public void clearEntered(Calculator context);

    public void equalsOperatorEntered(Calculator context);



}
