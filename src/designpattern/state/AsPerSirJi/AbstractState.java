package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 4:37 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractState implements State{
    protected String display;

    public abstract State digitEntered(Integer number);

    public abstract State operatorEntered(Character operator);

    public State clearEntered(){
        display="";
        return new EmptyState();
    }

    public abstract State equalsOperatorEntered();

    public String getDisplay(){
        return display;
    }

}
