import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class StopWatch {
    private Instant startTime;
    private Instant stopTime;
    private boolean isRunning;

    public void startTimer(){
        startTime=Instant.now();
    }
    public void stopTimer(){
        stopTime=Instant.now();
    }
    public String time(){
        long in=startTime.until(stopTime, ChronoUnit.SECONDS);
        long minutes=in/60;
        long seconds=in-minutes*60;
        String r=String.format("This took %d minutes and %d seconds",minutes,seconds);
        return r;

    }

    public static void main(String... args) throws InterruptedException {
        //StopWatch s=new StopWatch();
        //sw.startTimer();
        //TimeUnit.SECONDS.sleep(15);
        //s.stopTimer();
        //s.time();

    }
}
