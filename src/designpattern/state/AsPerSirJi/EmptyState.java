package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmptyState extends AbstractState{
    public EmptyState() {
        display="";
    }

    public State digitEntered(Integer number) {
        return new FirstStartedState(number);
    }

    public State operatorEntered(Character operator) {
        return new ErrorState();
    }

    public State equalsOperatorEntered() {
        return this;
    }
}
