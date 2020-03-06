package designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmptyState implements State {
    public EmptyState(Calculator context) {
        context.setValue(null);
    }

    public void digitEntered(Integer number, Calculator context) {
        context.setValue(number);
        context.lastOperator=null;
        context.setCurrentState(new FirstStartedState());
    }

    public void operatorEntered(Character operator, Calculator context) {
        context.setCurrentState(new ErrorState(context));
    }

    public void clearEntered(Calculator context) {
        return;
    }

    public void equalsOperatorEntered(Calculator context) {
        return;
    }
}
