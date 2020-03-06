package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class OperatorState implements State {
    public OperatorState(Character operator,Calculator context) {
        context.lastOperator=operator;
    }

    public State digitEntered(Integer number, Calculator context) {
        context.setValue(number);
        context.setCurrentState(new SecondStarted());
    }

    public State operatorEntered(Character operator, Calculator context) {
            context.setCurrentState(new ErrorState(context));
    }

    public State clearEntered(Calculator context) {
        context.setCurrentState(new EmptyState(context));
    }

    public State equalsOperatorEntered(Calculator context) {
            context.setCurrentState(new ErrorState(context));
    }

}
