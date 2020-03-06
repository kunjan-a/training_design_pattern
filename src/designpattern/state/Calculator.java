package designpattern.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/12/12
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    State currentState;
    Integer value;
    String display;
    Character lastOperator;
    public Integer firstOperand;


    public Calculator() {
        this.currentState = new EmptyState(this);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
        if(this.value == null)
            setDisplay("");
        else
            setDisplay(this.value.toString());
    }

    public void setDisplay(String value) {
        this.display=value;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }


    public void digitEntered(Character digit) {
        currentState.digitEntered(Integer.valueOf(digit)-48, this);
    }

    public void operatorEntered(Character operator) {
        currentState.operatorEntered(operator, this);
    }

    public void equalsOperatorEntered() {
        currentState.equalsOperatorEntered(this);
    }

    public void clearEntered() {
        currentState.clearEntered(this);
    }



    private List<Character> operators = new ArrayList<Character>() {
        {
            add('+');
            add('-');
            add('*');
            add('/');
        }
    };


    public boolean isDigit(Character c) {
        return c >= 48 && c <= 57;
    }

    public boolean isOperator(Character c) {
        return operators.contains(c);
    }

    public boolean isClear(Character c) {
        return c == null ? false : c.equals('c');
    }

    public boolean isEqualsOperator(Character c) {
        return c == null ? false : c.equals('=');
    }


    public void input(Character c){
        if (isClear(c)) {
            clearEntered();
            return;
        }

        if (isDigit(c)) {
            digitEntered(c);
            return;
        }

        if (isOperator(c)) {
            operatorEntered(c);
            return;
        }

        if (isEqualsOperator(c)) {
            equalsOperatorEntered();
            return;
        }

    }

    public String getDisplay(){
        return display;
    }

}
