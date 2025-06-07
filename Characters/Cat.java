package Characters;
public class Cat extends Pet{

    private String breed;

    public Cat(String n, String b){
        super(n);
        breed = b;
    }
        public String getState(){
        if(super.getMood()){
           return "MattHappy"; 
        } else {
            return "MattSad";
        }
        
    }

}
