
public class Cat extends Pet{

    private String breed;

    public Cat(){
        super("Nyan");
    }
        public String getState(){
        if(super.getMood()){
           return "CatHappy"; 
        } else {
            return "CatSad";
        }
        
    }

}
