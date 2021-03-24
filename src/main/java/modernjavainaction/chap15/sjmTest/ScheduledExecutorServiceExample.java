package modernjavainaction.chap15.sjmTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author sjm5858@126.com
 * @date 2021/2/21 11:00
 */
public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        work1();
        scheduledExecutorService.schedule(ScheduledExecutorServiceExample::work2,4, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();

    }

    public static void work1() {
        System.out.println("Hello from Work1!");
    }

    public static void work2() {
        System.out.println("Hello from Work2!");
    }
}
