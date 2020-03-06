package designpattern.state.AsPerSirJi;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstStartedState extends AbstractState {
    private Integer firstOperand;

    public FirstStartedState(Integer number) {
        this.firstOperand=number;
        display=firstOperand.toString();
    }

    public State digitEntered(Integer number) {
        firstOperand=firstOperand*10+number;
        display=firstOperand.toString();
        return this;
    }

    public State operatorEntered(Character operator) {
        return new OperatorState(operator,firstOperand);
    }

    @Override
    public State equalsOperatorEntered() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
