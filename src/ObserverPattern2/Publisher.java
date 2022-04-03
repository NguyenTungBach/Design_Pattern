package ObserverPattern2;

import java.util.ArrayList;

public class Publisher {

    private ArrayList<Subscriber> subscribers;
    private int mainState;

    public void subscribe(Subscriber subscriber) {
        if (subscribers ==null){
            subscribers = new ArrayList<>();
        }
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        if (subscribers ==null){
            subscribers = new ArrayList<>();
            return;
        }
        subscribers.remove(subscriber);
    }

    public void mainBusinessLogic() {
        mainState ++;
        notifySubscribers();
    }

    public void notifySubscribers() {
        for (Subscriber subscriber: subscribers) {
            subscriber.update("You have message! " + this.mainState);
        }
    }
}
