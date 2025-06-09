
import java.util.Timer;
import java.util.TimerTask;

public abstract class Pet {
    private String name;
    private int food;
    private int energy;
    private int happiness;
    private int health;
    private int age;
    private Interface gui;
    

    public Pet(String n){
        name = n;
        food = 100;
        health = 100;
        happiness = 100;
        age = 0;

        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                gui.updatePetInfo();
                decrease();
            }
        };

        timer.scheduleAtFixedRate(task, 2000, 2000);
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

    public void play(){
        happiness = 100;
    }

    public boolean getMood(){
        if(happiness>50){
            return true;
        } else {
            return false;
        }
    }

    public int getHappiness(){
        return happiness;
    }

    public String getName(){
        return name;
    }

    public int getHunger(){
        return food;
    }

    public int getAge(){
        return age;
    }
    public void update(Interface gui){
        gui.updatePetInfo();
    }
    public abstract String getState(); 

    protected void decrease(){
        food -= 2;
        if(food < 50){
            System.out.print("I'm hungry!");
        }
        energy -=4;
        happiness -= 3;
    }
}