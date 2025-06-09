
public class Dog extends Pet{



    public Dog(){
        super("Dog");

    }
        public String getState(){
        if(super.getMood()){
           return "DogHappy"; 
        } else {
            return "DogSad";
        }
        
    }

}
