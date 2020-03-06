package designpattern.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun{
    private boolean isUp;
    private ArrayList<ISunObserver> observers;

    public Sun() {
        observers = new ArrayList<ISunObserver>();
    }

    public boolean registerForSunEvents(ISunObserver obs){
        return observers.add(obs);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;
        for (ISunObserver observer : observers) {
            observer.notifySunSet();
        }
    }

    public void rise() {
        isUp = true;
        for (ISunObserver observer : observers) {
            observer.notifySunRose();
        }
    }
}