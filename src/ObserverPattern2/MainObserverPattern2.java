package ObserverPattern2;

public class MainObserverPattern2 {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        ConcreteSubscriber someOne1 = new ConcreteSubscriber("someOne1");
        publisher.subscribe(someOne1);

        ConcreteSubscriber someOne2 = new ConcreteSubscriber("someOne2");
        publisher.subscribe(someOne2);

        while (true){
            publisher.mainBusinessLogic();
            try {
                Thread.sleep(3*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
