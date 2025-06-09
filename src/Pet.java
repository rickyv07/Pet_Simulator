
import java.util.Timer;
import java.util.TimerTask;

public abstract class Pet {
    private String name;
    private int food;
    private int energy;
    private int happiness;
    private int health;
    private Interface gui;
    

    public Pet(String n){
        name = n;
        food = 100;
        health = 100;
        happiness = 100;

        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                gui.updatePetInfo();
                decrease();
            }
        };

        timer.scheduleAtFixedRate(task, 0, 2000);
    }

    public void setInterface(Interface gui){
        this.gui = gui;
    }

    public String feed(){
        food = 100;
        update(gui);
        return name + " is full!\n";
    }

    public void clean(){
        energy += 20;
    }


    public void sleep(){
        energy = 100;
    }

    public void pet(){
        if(happiness < 95){
            happiness += 5;
        } else if (happiness < 100){
            happiness = 100;
        }
        
    }

    

    public boolean getMood(){
        if(happiness>50){
            return true;
        } else {
            return false;
        }
    }

    public int getHappiness(){
        if(happiness < 50){
            gui.updateOutputArea("Play with me! ╥﹏╥\n");
        }
        return happiness;
    }

    public String getName(){
        return name;
    }

    public int getHunger(){
        if(food < 50){
            gui.updateOutputArea("I'm hungry!\n");
        }
        return food;
    }

    public void update(Interface gui){
        gui.updatePetInfo();
    }
    public abstract String getState(); 

    protected void decrease(){
        if (food >0) {
            food -= 4; 
        }
        
        if (happiness >0) {
            happiness -= 5; 
        }

        if (energy > 0){
            energy -=4;
        }
    }
}