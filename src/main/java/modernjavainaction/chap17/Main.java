package modernjavainaction.chap17;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Publisher;

public class Main {

    public static void main(String[] args) {
        getTemperatures("New York").subscribe(new TempSubscriber());
    }

    private static Publisher<TempInfo> getTemperatures(String town) {
//        return subscriber -> subscriber.onSubscribe(new TempSubscription(subscriber, town));

        return new Publisher<TempInfo>() {
            @Override
            public void subscribe(Flow.Subscriber<? super TempInfo> subscriber) {
                subscriber.onSubscribe(new TempSubscription(subscriber,town));
            }
        };
    }

}
