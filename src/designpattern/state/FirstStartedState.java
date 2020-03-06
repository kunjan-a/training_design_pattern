package designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstStartedState implements State {
    public void digitEntered(Integer number, Calculator context) {
        context.setValue(context.getValue()*10+number);
    }

    public void operatorEntered(Character operator, Calculator context) {
        context.firstOperand=context.getValue();
        context.setCurrentState(new OperatorState(operator,context));
    }

    public void clearEntered(Calculator context) {
        context.setCurrentState(new EmptyState(context));
    }

    public void equalsOperatorEntered(Calculator context) {
        return;
    }

}
