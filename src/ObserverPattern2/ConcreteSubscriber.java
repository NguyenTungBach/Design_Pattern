package ObserverPattern2;

public class ConcreteSubscriber implements Subscriber{
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Got message from Publisher: "+ message);
    }
}
