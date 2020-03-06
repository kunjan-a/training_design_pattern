package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class SecondStarted implements State {
    public State digitEntered(Integer number, Calculator context) {
        context.setValue(context.getValue()*10+number);
    }

    public State operatorEntered(Character operator, Calculator context) {
        calculate(context);
        context.firstOperand=context.getValue();
        context.setCurrentState(new OperatorState(operator,context));

    }

    public State clearEntered(Calculator context) {
        context.setCurrentState(new EmptyState(context));
    }

    public State equalsOperatorEntered(Calculator context) {
        calculate(context);
        context.setCurrentState(new FirstStartedState());
    }
    private void calculate(Calculator context) {
        switch (context.lastOperator) {
            case '+':
                context.setValue(context.firstOperand + context.getValue());
                break;
            case '-':
                context.setValue(context.firstOperand - context.getValue());
                break;
            case '*':
                context.setValue(context.firstOperand * context.getValue());
                break;
            case '/':
                context.setValue(context.firstOperand / context.getValue());
                break;
            case '=':
                break;
        }
    }

}
