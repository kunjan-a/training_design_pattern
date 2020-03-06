package designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class ErrorState implements State {
    public ErrorState(Calculator context) {
        context.setValue(null);
        context.setDisplay("Error");
    }

    public void digitEntered(Integer number, Calculator context) {
        return;
    }

    public void operatorEntered(Character operator, Calculator context) {
        return;
    }

    public void clearEntered(Calculator context) {
        context.setCurrentState(new EmptyState(context));
    }

    public void equalsOperatorEntered(Calculator context) {
        return;
    }
}
