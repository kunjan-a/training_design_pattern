package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public interface State {

    public State digitEntered(Integer number);

    public State operatorEntered(Character operator);

    public State clearEntered();

    public State equalsOperatorEntered();

}
