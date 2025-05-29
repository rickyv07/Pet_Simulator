import java.util.Timer;
import java.util.TimerTask;

public class Pet {
    private String name;
    private int food;
    private int energy;
    private int happiness;
    

    public Pet(String n){
        name = n;
        food = 100;
        health = 100;
        happiness = 100;

        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                decrease();
            }
        };

        timer.scheduleAtFixedRate(task, 2000, 4000);
    }

    public void feed(){
        food = 100;
        System.out.print(name + " is full!");
    }

    public void clean(){
        energy += 20;
    }

    public void sleep(){
        energy = 100;
    }

    public void play(){
        happiness = 100;
    }

    protected void decrease(){
        food -= 2;
        energy -=4;
        happiness -= 3;
    }
}