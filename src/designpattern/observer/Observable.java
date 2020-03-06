package designpattern.observer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: kunjan.a
 * Date: 7/9/12
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Observable implements IObserveable {
    ArrayList<IObserver> observers = new ArrayList<IObserver>();
    public boolean register(IObserver obs) {
        return observers.add(obs);
    }

    public void obs_notifyAll() {
        for (IObserver observer : observers) {
            observer.notifyMe();
        }
    }


}
