package Characters;
public class MattHong extends Pet {
    
    public MattHong(){
        super("Matt Hong");
    }
    public String getState(){
        if(super.getMood()){
           return "MattHappy"; 
        } else {
            return "MattSad";
        }
        
    }
}
