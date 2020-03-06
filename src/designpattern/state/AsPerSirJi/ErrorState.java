package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class ErrorState extends AbstractState {
    public ErrorState() {
        display="Error";
    }

    public State digitEntered(Integer number) {
        return this;
    }

    public State operatorEntered(Character operator) {
        return this;
    }

    public State clearEntered() {
        return new EmptyState();
    }

    public State equalsOperatorEntered() {
        return this;
    }
}
