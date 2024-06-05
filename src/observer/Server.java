
package observer;
import java.util.ArrayList;
import java.util.List;

public class Server{
    private final List<Client> subscribers = new ArrayList<Client>();

    public void setSubscriber(Client subscriber) {
        this.subscribers.add(subscriber);
    }

    public void setValue(int value) {
        this.notify(value);
    }

    public void notify(int value){
        for(Client subscriber : subscribers){
            subscriber.updateValue(value);
        }
    }
}