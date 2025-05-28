import java.util.Timer;
import java.util.TimerTask;

public class Pet {
    private String name;
    private int weight;
    private double food;

    public Pet(String n, int w){
        name = n;
        weight = w;
        food = 100.0;

        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                setFood();
            }
        };

        timer.scheduleAtFixedRate(task, 2000, 4000);
    }

    public void feed(){
        food = 100.0;
    }

    protected void setFood(){
        food -= 1;
    }
}